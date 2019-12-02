
package proyecte1;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class TestProyecte1 {

   
    
public class aTest {
    @Test
    public void Intr_Peso() {
        Proyecte1 instance = new Proyecte1();
        double peso = 70.2;
        double result = instance.IntroducirPeso(peso);
        
    }
    
     @Test
    public void Intr_Altura() {
      Proyecte1 instance = new Proyecte1();
        double altura = 80.2;
        double result = instance.IntroducirAltura(altura);
    }
    
     @Test
    public void IMC() {
        
    }
}

}

