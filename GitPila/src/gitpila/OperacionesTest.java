
package gitpila;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AntonioJose
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int x = 2;
        int y = 3;
        Operaciones instance = new Operaciones();
        int expResult = 5;
        int result = instance.Suma(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int x = 9;
        int y = 1;
        Operaciones instance = new Operaciones();
        int expResult = 8;
        int result = instance.Resta(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int x =10;
        int y = 5;
        Operaciones instance = new Operaciones();
        int expResult = 2;
        int result = instance.Division(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int x = 2;
        int y = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.Multiplicacion(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}