

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class. It tests the methods of a class.
 *
 * @author  (Gonçalo Marques, Joao Gomes)
 * @version (1-2-2017)
 */
public class TestPackDeBens
{
   
    /**
     * Construtor default para a classe de teste TestPackDeBens
     */
    public TestPackDeBens()
    {
    }

    /**
     * Method called always before all tests.
     *
     * 
     */
    @Before
    public void setUp()
    { PacksDeBens pack1 = new PacksDeBens("Batatas",10,000,0.7, 0.2);
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
    

    @Test
    /** 
     * tests if the product code is well returned.
     */
    public void testGetCodigoProduto()
    {
        PacksDeBens packsDeB1 = new PacksDeBens("w", 0, 0, 0, 0);
        assertEquals(0, packsDeB1.getCodigoDoProduto());
    }

    /**
     * tests if the quantity is well returned.
     */@Test
    public void testGetQuantity()
    {
        PacksDeBens packsDeB1 = new PacksDeBens("e", 2, 0, 0, 0);
        assertEquals(2, packsDeB1.getQuantity());
    }

    /**
     * tests if the name is well returned.
     */@Test
    public void testGetName()
    {
        PacksDeBens packsDeB1 = new PacksDeBens("e", 0, 0, 0, 0);
        assertEquals("e", packsDeB1.getName());
    }

    

    /**
     * tests if the unitary weight is well returned.
     */@Test
    public void testGetUnitaryWeight()
    {
        PacksDeBens packsDeB1 = new PacksDeBens("e", 0, 0, 0, 0);
        assertEquals(0, packsDeB1.getUnitaryWeight(), 0.1);
    }

    /**
     * tests if the unitary volume is well returned.
     */@Test
    public void testGetUnitaryVolume()
    {
        PacksDeBens packsDeB1 = new PacksDeBens("e", 0, 0, 0, 0);
        assertEquals(0, packsDeB1.getUnitaryVolume(), 0.1);
    }
}