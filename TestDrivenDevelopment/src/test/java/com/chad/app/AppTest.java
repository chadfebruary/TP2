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
    public void testObjectEquality() throws Exception {
        Assert.assertSame(obj.objectEquality(), obj);
    }

    @Test
    public void testObjectIdentity() throws Exception {

    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(obj.truth());
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(obj.falseTest());
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionTest() throws Exception {
        obj.exceptionTest();
    }

    @Test(timeout=1)
    public void testTimeout() throws Exception {
        obj.timeout();
    }

    @Test
    public void testDisablingTest(){

    }

    @Test
    public void testArraysContent() throws Exception {
        int[] array = {1, 2, 3};

        assertArrayEquals(obj.array(), array);
    }


}
