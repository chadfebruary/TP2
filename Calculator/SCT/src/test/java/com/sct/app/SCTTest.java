package com.sct.app;

import junit.framework.Assert;
import org.junit.Test;

public class SCTTest {

    SCT obj = new SCT();

    @Test
    public void testSin() throws Exception {
        Assert.assertEquals(obj.sin(), "0.57");
    }

    @Test
    public void testCos() throws Exception {
        Assert.assertEquals(obj.cos(), "0.82");
    }

    @Test
    public void testTan() throws Exception {
        Assert.assertEquals(obj.tan(), "0.70");
    }
}
