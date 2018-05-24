package estacionamento.v1.pkg2;

public class EstacionamentoV12 {
    private final Andar []andar;
   
    public EstacionamentoV12(int cap1, int cap2, int cap3){//capacidade do primeiro
        this.andar = new Andar[3];                         //segundo e terceiro andar
        this.andar[0] = new Andar(cap1);
        this.andar[1] = new Andar(cap2);
        this.andar[2] = new Andar(cap3);
    }
    
    public void entrar(int andar, int vaga, Carros c){
        if(andar < 1 || andar > 3){
            System.out.println("Andar invalido!");
        }else{
            this.andar[andar-1].entrar(vaga, c);
        }
    }
    
    public void sair(int andar, int vaga){
        if(andar < 1 || andar > 3){
            System.out.println("Andar invalido!");
        }else{
            this.andar[andar-1].sair(vaga);
        }
    }
    
    @Override
    public String toString(){
        return "Andar 1: " + this.andar[0].toString() + "\nAndar 2: " +
                this.andar[1].toString() + "\nAndar 3: " + this.andar[2].toString();
    }
    
    public static void main(String[] args) {
        EstacionamentoV12 Est = new EstacionamentoV12( 30, 30, 30);
        Carros A = new Carros("txt-1234");
        Carros B = new Carros("abc-4321");
        Carros C = new Carros("jdk-2014");
        
        Est.entrar(2, 4, A);
        Est.entrar(2, 4, C);
        Est.entrar(2, 5, C);
        System.out.println(Est.toString());
        Est.sair(2,4);
        System.out.println(Est.toString());
        Est.entrar(1,8,B);
        Est.entrar(1,5,A);
        System.out.println(Est.toString());
        
    }
    
}
