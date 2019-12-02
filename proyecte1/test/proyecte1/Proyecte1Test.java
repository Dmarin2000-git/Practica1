/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecte1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani
 */
public class Proyecte1Test {
    
    public Proyecte1Test() {
    }

//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Proyecte1.main(args);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testIntroducirPeso() {
        System.out.println("IntroducirPeso");
        double pes = 2.3;
        double expResult = 2.3;
        double result = Proyecte1.IntroducirPeso(pes);
        assertEquals(expResult, result, 0.0);
        
    }

   /* @Test
    public void testIntroducirAltura() {
        System.out.println("IntroducirAltura");
        double alt = 0.0;
        double expResult = 0.0;
        double result = Proyecte1.IntroducirAltura(alt);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }*/

    /*@Test
    public void testCalcularIMC() {
        System.out.println("calcularIMC");
        double peso = 0.0;
        double altura = 0.0;
        Proyecte1.calcularIMC(peso, altura);
        fail("The test case is a prototype.");
    }*/
    
}
