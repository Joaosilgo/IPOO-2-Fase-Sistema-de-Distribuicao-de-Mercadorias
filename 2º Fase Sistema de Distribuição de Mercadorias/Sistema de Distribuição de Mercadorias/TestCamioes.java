

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test the methods of the Camioes class.
 *
 * @author  (Gonaçlo Marques, Joao Gomes)
 * @version (1-2-2017)
 */
public class TestCamioes
{
    /**
     * Construtor default para a classe de teste TestCamioes
     */
    public TestCamioes()
    {
    }

    /**
     * Method called always before the test.
     *
     
     */
    @Before
    public void setUp()
    {
        Camioes camiao1 = new Camioes(2, "Audi");
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
     * Method to get the number of the truck.
     */
    @Test
    public void testGetIdCamiao()
    {
        Camioes camioes1 = new Camioes(1, "d");
        assertEquals(1, camioes1.getIdCamiao());
    }

    /**
     * Method to get the designation of the truck.
     */@Test
    public void testGetDesignaçao()
    {
        Camioes camioes1 = new Camioes(1, "d");
        assertEquals("d", camioes1.getDesignacao());
    }


    /**
     * Method to get the number of kilometers travelled.
     */@Test
    public void testGetQuilometrosPercorridos()
    {
        Camioes camioes1 = new Camioes(1, "d");
        assertEquals(0, camioes1.getQuilometrosPercorridos(), 0.1);
    }

    /**
     * Method to get the number of kilometers traveled after the inspection.
     */
    @Test
    public void testGetQuilometrosPecorridosInspecao()
    {
        Camioes camioes1 = new Camioes(1, "d");
        assertEquals(0, camioes1.getQuilometrosPecorridosInspecao(), 0.1);
    }

    
    
    

    /**
     * Method to test if the container in the truck is null or not.
     */
    @Test
    public void testGetContentor()
    {
        Camioes camioes1 = new Camioes(1, "d");
        assertEquals(null, camioes1.getContentor());
    }

    /**
     * Method to test if the container was placed in the truck or not.
     */
    @Test
    public void testCarregarContentor()
    {
        Camioes camioes1 = new Camioes(1, "d");
        Contentor contento1 = new Contentor(2);
        assertEquals(true, camioes1.carregarCamiao(contento1));
    }
}