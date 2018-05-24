package paciente;

import java.util.Random;

/**
 *
 * @author Vanessa Dantas
 */
public class Main {
    
    public static void main(String[] args) {
        CentralAtendimento C=new CentralAtendimento();
        int TPP=0,cont=0;
        Paciente nextPerson,P;
        Random R=new Random();
    
        for(int i=0;i<50;i++){
            if(TPP==0){//hora de sortear uma nova pessoa
                //sorteio
               nextPerson=new Paciente(1 + R.nextInt(10000),"FUlANO "+i,R.nextInt(100),1 + R.nextInt(2),1+R.nextInt(10));
               C.inserir(nextPerson);
               TPP=1+ R.nextInt(5);
            }else{
                TPP--;
            }
            if(cont==0 && !C.empty()){
                //Chamar pessoa
                P=C.proximoPaciente();
                cont=P.getAtendimento();
                //System.out.println(P);
            }
            if(cont>0)
                cont--;
            System.out.println(cont+" "+C);
            
        }   
    }
}
