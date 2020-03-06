

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TestGaragens.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class TestGaragens
{
    /**
     * Construtor default para a classe de teste TestGaragens
     */
    public TestGaragens()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
        Garagens garagem1 = new Garagens("G",20,20,10);
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
     * Method to test if the number of max places is well returned.
     */@Test
    public void testGetMaximoLugares()
    {
        Garagens garagens1 = new Garagens("d", 0, 0, 0);
        assertEquals(0, garagens1.getMaximoLugares());
    }

    /**
     * Method to test if the truck is on the right place to be inspected.
     */@Test
    public void testInspecionarCamiaoLugar()
    {
        Garagens garagens1 = new Garagens("d", 0, 0, 0);
        assertEquals(false, garagens1.inspecionarCamiaoLugar("SD"));
    }

    /**
     * Method to test if the truck was placed.
     */@Test
    public void testEstacionarCamiao()
    {
        Garagens garagens1 = new Garagens("d", 0, 0, 0);
        Camioes camioes1 = new Camioes(42, "d");
        assertEquals(false, garagens1.estacionarCamiao(camioes1));
    }
}



