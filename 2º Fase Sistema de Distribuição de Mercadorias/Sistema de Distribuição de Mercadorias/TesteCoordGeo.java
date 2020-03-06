

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TesteCoordGeo.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class TesteCoordGeo
{
    /**
     * Construtor default para a classe de teste TesteCoordGeo
     */
    public TesteCoordGeo()
    {
    }

    /**
     * Method called always before the test.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
        CoordenadasGeograficas cg1 = new CoordenadasGeograficas(70,120);
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
     * Method to test if the latitude is well returned. If the latitude is invalid it returns 0.
     */
    @Test
    public void testGetLatitude()
    {
        CoordenadasGeograficas coordena1 = new CoordenadasGeograficas(120, 70);
        assertEquals(70, coordena1.getLatitude(), 0.1);
    }

    /**
     * Method to test if the longitude is well returned. If the longitude is invalid it returns 0.
     */
    @Test
    public void testGetLongitude()
    {
        CoordenadasGeograficas coordena1 = new CoordenadasGeograficas(10, 10);
        assertEquals(10, coordena1.getLongitude(), 0.1);
    }

    /**
     * Method to test the polar coordenad.
     */@Test
    public void testCoordenadaPolarLatitude()
    {
        CoordenadasGeograficas coordena1 = new CoordenadasGeograficas(10, 10);
        assertEquals("Norte", coordena1.coordenadaPolarLatitude());
    }

    /**
     * Method to test the polar coordenad.
     */@Test
    public void testCoordenadaPolarLongitude()
    {
        CoordenadasGeograficas coordena1 = new CoordenadasGeograficas(10, 10);
        assertEquals("Este", coordena1.coordenadaPolarLongitude());
    }
}