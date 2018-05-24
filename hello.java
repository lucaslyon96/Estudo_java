package hello;
import java.util.*;// biblioteca que serão usadas 
import java.io.*; // biblioteca para leitura e eescrita de arquivos
public class Hello {
	
	public static void main(String[] args){
		// endereço do arquivo onde encontramos os filmes series etc  
		String filmes = "filmes.tsv"; 
		String notas = "notas_scores.tsv";
		String diretores = "diretores_crew.tsv";
		String atores = "atores_principals.tsv";
		String pessoas = "pessoas_principals.tsv";
		// base de leitura
		BufferedReader br = null; 
		BufferedReader Bnotas = null;
		BufferedReader Bdiretores = null;
		BufferedReader Batores = null;
		BufferedReader Bpessoas = null;	
		String line = "";
		
		PrintWriter database = null;
		
		try{
			database = new PrintWriter("database.tsv","UTF-8");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		try{
			//Iniciando leitura do arquivo
			br = new BufferedReader(new FileReader(filmes));
			Bnotas = new BufferedReader(new FileReader(notas));
			Bdiretores = new BufferedReader(new FileReader(diretores));
			Batores = new BufferedReader(new FileReader(atores));
			Bpessoas = new BufferedReader(new FileReader(pessoas));
			
			String lineF = null;
			String lineN = Bnotas.readLine();
			String lineD = Bdiretores.readLine();
			int i = 0;
			while((lineF = br.readLine()) != null){
				String[] temp = lineF.split("\t");
				String[] filme = {"cod","nom","gen","dir","ato","not"};
				filme[0] = temp[0];filme[1] = temp[2];filme[2] = temp[8];
				while((lineN = Bnotas.readLine()) != null && i < 1050){
					String[] nota = lineN.split("\t");
					//System.out.println(nota[0] + " " + filme[0] + " "+nota[0].compareTo(filme[0])  );
					if(nota[0].compareTo(filme[0]) == 0){
						if(Float.parseFloat(nota[1]) > 7 && Integer.parseInt(nota[2]) > 1000){
							filme[5] = nota[1];
							i++;
							database.println(filme[0] +"\t"+filme[1]+"\t"+filme[2]+"\t"+ filme[5]);
							//Procurando diretores
							while((lineD = Bdiretores.readLine()) != null){
								String[] diretor = lineD.split("\t");
								if(diretor[0].compareTo(filme[0]) == 0){
									filme[3] = diretor[1];
									database.println(filme[0] +"\t"+filme[1]+"\t"+filme[2]+"\t"+ filme[5]);
									i++;
								}
							}
			
							break;
						}
						break;
					}
					
					if(nota[0].compareTo(filme[0]) > 0)
						break;
					
					
				}	
			}
		
		}
		catch(FileNotFoundException e){
			
			//emite um erro
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		// finaliza 
		finally{
			if(br != null){
				try{
					// fecha o arquivo
					
					br.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}		
}	