import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The test class EulerTest.
 *
 * @author  John Coronite
 * @version 1
 */
public class EulerTest
{
    @Test public void testProblem1(){ assertEquals("233168", new Problem1().run());}
    @Test public void testProblem2(){ assertEquals("4613732", new Problem2().run());}
    @Test public void testProblem3(){ assertEquals("6857", new Problem3().run());}
}
