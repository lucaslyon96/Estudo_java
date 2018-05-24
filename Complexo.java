package projeto1;

//import static java.lang.Math.pow;
//import static java.lang.Math.sqrt;
import java.util.*;

public class Complexo {
    private float real, imag;

    public Complexo(float real, float imag){
        this.real = real;
        this.imag = imag;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }
    
    public double modulo(){
        double m = 0 ;//pq colocar um m =0 se m vai receber valor(pensamento: em java toda variavel precisa ser inicializada em com algum valor)
        m = sqrt( pow(this.real,2) + pow(this.imag, 2) );
        return m; 
    }
    
    public void reset(){
        this.imag = 0;
        this.real = 0;
    }
    
    public void incrementar(){
        this.real += 1; 
    }
    
    public String Conjugado(){
        //String conj = "" ;
        return (this.real + " - " + this.imag + "i");
    }

}
