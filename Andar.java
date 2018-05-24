package estacionamento.v1.pkg2;

public class Andar {
    private final int capacidade;
    private final Carros []carros; //as vagas vao receber os carros
    private int vagas;
    
    public Andar(int capacidade){
        this.capacidade = capacidade;
        carros = new Carros[capacidade];
        vagas = capacidade;
    }
        
    public boolean entrar(int vaga,Carros c){
        if(this.carros[vaga] == null){
            this.carros[vaga] = c;
            vagas--;
            return true;
        }else{
            System.out.println("Vaga ocupada");
            return false;
        }
    }
    
    public boolean sair(int vaga){
        if(this.carros[vaga] != null){
            System.out.println(carros[vaga]);
            carros[vaga] = null;
            vagas++;
            return true;
        }else{
            System.out.println("Vaga sem carro!");
            return false;
        }
    }
   
    public int vagas_restantes(){
        return this.vagas;
    }
    
    public boolean ha_vagas(){
        return (this.vagas > 0); 
    }
    
    public int qnt_carros(){
        return (this.capacidade - this.vagas);
    }
    
    public boolean ha_carros(){
        return (this.vagas != this.capacidade);
    }
    
    @Override
    public String toString(){
        String placas = new String();
        
        for(int i = 0; i < this.carros.length; i++){
            if(this.carros[i] != null){
                placas += this.carros[i].toString();
            }
        }
        
        return "Vagas restantes: " + vagas_restantes() + " / Carros estacionados: " +
                qnt_carros() + " / Placas: " + placas;
    }
}
