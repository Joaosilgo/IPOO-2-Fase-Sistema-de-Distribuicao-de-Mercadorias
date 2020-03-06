

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test the methods of the CentralProdutos class.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class TestCentralProdutos
{
    /**
     * Construtor default para a classe de teste TestCentralProdutos
     */
    public TestCentralProdutos()
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
        CentralProdutos central1 = new CentralProdutos("d",2,1);
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
     * Method to test if the product was, or not, registed.
     */@Test
    public void testRegistarProduto()
    {
        CentralProdutos centralP1 = new CentralProdutos("d", 0, 0);
        PacksDeBens packsDeB1 = new PacksDeBens("d", 0, 0, 0, 0);
        assertEquals(true, centralP1.registarProduto("d", 0, 0, 0, 0));
    }
}