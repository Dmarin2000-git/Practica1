
package proyecte1;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Proyecte1 {

  
    public static void main(String[] args) {
       //metodo para meter en un array los dos valores para calcular el imc
       double peso = IntroducirPeso();
       //System.out.println(peso);
       
       double altura = IntroducirAltura();
       //System.out.println(altura);
        
        //metodo para calcular el IMC
        calcularIMC(peso, altura);
        
    }
    
    public static double IntroducirPeso(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Introduce tu peso: ");
        String p = sc.nextLine();
        double peso = Double.parseDouble(p);
 
    return peso;
    }
    
    public static double IntroducirAltura(){
     Scanner sc = new Scanner(System.in);   
        System.out.println("Introduce tu altura: ");
        String p = sc.nextLine();
        double altura = Double.parseDouble(p);
 
    return altura;
    }
    
    public static void calcularIMC(double peso, double altura){
        //formula para calcular el IMC
        System.out.println("IMC:  " + String.format("%.2f",peso/(altura*altura)));
    }
}
