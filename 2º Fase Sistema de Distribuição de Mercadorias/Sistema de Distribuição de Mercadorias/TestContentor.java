

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test the methods of the Contntor class.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class TestContentor
{
    /**
     * Construtor default para a classe de teste TestContentor
     */
    public TestContentor()
    {
    }

    /**
     *  Method called always before the test.
     *
     
     */
    @Before
    public void setUp()
    {
        Contentor contentor1 = new Contentor(2);
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Method to test if the container id is well returned.
     */
    @Test
    public void testGetIdContentor()
    {
        Contentor contento1 = new Contentor(7);
        assertEquals(7, contento1.getIdContentor());
    }

    /**
     * Method to test if a container can be carryed.
     */
    @Test
    public void testIsCanCarry()
    {
        Contentor contento1 = new Contentor(5);
        assertEquals(true, contento1.isCanCarry());
    }

    /**
     * Method to test if the product is recived or not.
     */@Test
    public void testReceberBem()
    {
        Contentor contento1 = new Contentor(3);
        PacksDeBens packsDeB1 = new PacksDeBens("d", 0, 0, 0, 0);
        assertEquals(true, contento1.receberBem(packsDeB1));
    }
}