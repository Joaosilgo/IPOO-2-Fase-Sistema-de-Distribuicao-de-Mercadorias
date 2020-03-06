

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteEstacoes.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TesteEstacoes
{
    /**
     * Default constructor for test class TesteEstacoes
     */
    public TesteEstacoes()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        EstacoesAbastecedoras estacoes = new EstacoesAbastecedoras(10, 10, 10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
