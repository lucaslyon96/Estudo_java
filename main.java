package builder;// pacode que criamos

import java.util.*;// biblioteca que ser�o usadas 
import java.io.*; // biblioteca para leitura e eescrita de arquivos
import java.io.FileReader;

public class main {
	

public static void main(){
		// endere�o do arquivo onde encontramos os filmes series etc  
		String filmes = "C:\\Users\\lucas\\Documents\\title.basics.tsv\\movies.tsv"; 
		// base de leitura
		BufferedReader br = null; 
		
		// line � a linha que ser� lida
		String line = ""; 
		
		//o \t representa a tabula��o em java, portanto essa variavel � justamente 
		// para serparar a leitura
		String tsvSplitBy = "\t"; 
		
		// iniciaizando a escrita do arquivo apenas com os filmes
		PrintWriter filmesSemBaboseira = null; 
		
		// try e catch s�o os tratamentos para caso o arquivo n�o abra, n�o exista etc ..,
		try {  
			filmesSemBaboseira = new PrintWriter("filmes.tsv","UTF-8");
		}
		
		// arquivo n�o encontrado
		catch (FileNotFoundException e1) {
			// emite um erro ...
			e1.printStackTrace();
			
		}
		
		catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try{
			//inicializando a leitura do arquivo
			br = new BufferedReader(new FileReader(filmes));
			
			//S� para mostrar quando come�a a ler
			System.out.println("Leitura e escrita de arquivo");
			line = br.readLine();
			while(( line = br.readLine()) != null){
				// leitura da linha
				
				
				//Divide a linha em vetor separados pelo tab
				String[] info = line.split(tsvSplitBy);
				
				//separa o arquivo apenas na parte que queremos
				//apenas os fimes 
				if(info[1].equalsIgnoreCase("movie") ){
					
					//armazena no arquivo a linha escolida
					//a linha com as informa��es do filme
					filmesSemBaboseira.println(line);
				}
			}
			
			//S� para mostrar que finalizou a leitura
			System.out.println("acabou a escrita" );
			
		}
		
		// tratamento para saber se abriu e se existe o arquivo
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