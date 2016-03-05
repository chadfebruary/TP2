package com.chad.app;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AppTest
{
    App obj1 = new App();

    @Test
    public void testFloatingPoint() throws Exception {
        Assert.assertEquals(obj1.floatingPoint(), (float)3.0);
    }

    @Test
    public void testInteger() throws Exception {
        Assert.assertEquals(obj1.integer(), 2);
    }

    @Test
    public void testObjectEquality() throws Exception {
        AppTest obj2 = new AppTest();

        Assert.assertEquals(obj1.objectEquality(), obj1);
    }

    @Test
    public void testObjectIdentity() throws Exception {

    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(obj1.truth());
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(obj1.falseTest());
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNull(obj1.nullTest());
    }

    @Test
    public void testNonNull() throws Exception {
        Assert.assertNotNull(obj1.nonNull());
    }


    @Test
    public void testFailingTest() throws Exception {

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionTest() throws Exception {
        obj1.exceptionTest();
    }

    @Test(timeout=100000)
    public void testTimeout() throws Exception {
        //obj1.timeout();
        Thread.sleep(10000);
    }

    @Test
    @Ignore
    public void testDisablingTest(){

        obj1.integer();
    }

    @Test
    public void testArraysContent() throws Exception {
        int[] array = {1, 2, 3};

        assertArrayEquals(obj1.array(), array);
    }


}
