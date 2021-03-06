package unittest.model.genetic.tree.functions;

import junit.framework.TestCase;
import model.genetic.tree.IFunction;
import model.genetic.tree.functions.Sub;
import model.genetic.tree.functions.Sum;

/**
 * Created by saruman on 2.07.2017.
 */
public class SumTest extends TestCase {
    public void testExecute() throws Exception {
        Sum mySum = new Sum();
        assertEquals(12.0, mySum.execute(10.0, 2.0));
    }

    public void testGetSymbol() throws Exception {
        Sum mySum = new Sum();
        assertEquals("Sum", mySum.getSymbol());
    }

    public void testClone() throws Exception {
        Sum mySum = new Sum();
        assertTrue(mySum.clone() instanceof Sum);
    }

}