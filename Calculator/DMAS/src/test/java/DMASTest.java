import junit.framework.Assert;
import org.junit.Test;

public class DMASTest {

    DMAS obj = new DMAS();

    @Test
    public void testAddition() throws Exception{

        Assert.assertEquals(obj.addition(), (float) 3);
    }

    @Test
    public void testSubtraction() throws Exception {

        Assert.assertEquals(obj.subtraction(), (float) -1);
    }

    @Test
    public void testMultiplication() throws Exception {

        Assert.assertEquals(obj.multiplication(), (float) 2);
    }

    @Test
    public void testDivision() throws Exception {

        Assert.assertEquals(obj.division(), (float) 0.5);
    }
}
