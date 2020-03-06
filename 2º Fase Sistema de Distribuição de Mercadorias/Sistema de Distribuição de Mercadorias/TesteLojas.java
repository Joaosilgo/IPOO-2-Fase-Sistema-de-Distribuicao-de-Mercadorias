

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteLojas.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TesteLojas
{
    /**
     * Default constructor for test class TesteLojas
     */
    public TesteLojas()
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
       Lojas loja= new Lojas(3, 2, "CrazyStore");
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

    @Test
    public void StateOfContainers()
    {
        Lojas lojas1 = new Lojas(2, 2, "CrazyStore");
        PacksDeBens packsDeB1 = new PacksDeBens("beans", 10, 00001, 0.1, 0.5);
        lojas1.adicionarBensAoArmazem(packsDeB1);
    }
}

