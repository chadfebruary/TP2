package com.chad.app;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AppTest
{
    App obj = new App();

    @Test
    public void testFloatingPoint() throws Exception {
        Assert.assertEquals(obj.floatingPoint(), (float)1.5);
    }

    @Test
    public void testInteger() throws Exception {
        Assert.assertEquals(obj.integer(), 1);
    }

    @Test
    public void testEquality() throws Exception {
        Assert.assertEquals(obj.objectEquality(), obj);
    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(obj.truth() == 1);
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(obj.falseTest() == 2);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNull(obj.nullTest());
    }

    @Test
    public void testNonNull() throws Exception {
        Assert.assertNotNull(obj.nonNull());
    }

    @Test
    public void testFailingTest() throws Exception {

    }

    @Test
    public void testArray() throws Exception {
        int[] array = {1, 2, 3};

        //assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        assertArrayEquals(obj.array(), array);
    }

    @Test(timeout=1)
    public void testTimeout() throws Exception {
        obj.timeout();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionTest() throws Exception {
        obj.exceptionTest();
    }
}
