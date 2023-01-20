/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package radiohojat1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class RadioFTest {
    
    public RadioFTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of power method, of class RadioF.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        RadioF instance = new RadioF();
        boolean expResult = true;
        boolean result = instance.power();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of frecuencia method, of class RadioF.
     */
    @Test
    public void testFrecuencia() {
        System.out.println("frecuencia");
        RadioF instance = new RadioF();
        boolean expResult = true;
        boolean result = instance.frecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of cambiarEmisora method, of class RadioF.
     */
    @Test
    public void testCambiarEmisora() {
        System.out.println("cambiarEmisora");
        boolean subirBajar = false;
        RadioF instance = new RadioF();
        instance.cambiarEmisora(subirBajar);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of emisoraActual method, of class RadioF.
     */
    @Test
    public void testEmisoraActual() {
        System.out.println("emisoraActual");
        RadioF instance = new RadioF();
        double expResult = 0.0;
        double result = instance.emisoraActual();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of guardarEmisora method, of class RadioF.
     */
    @Test
    public void testGuardarEmisora() {
        System.out.println("guardarEmisora");
        double emisora = 0.0;
        RadioF instance = new RadioF();
        instance.guardarEmisora(emisora);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    
}
