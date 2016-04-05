package com.chad.app;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class SingleResponsibilityPrincipleTest {
    @Test
    public void testSubtract() throws Exception {
        SingleResponsibilityPrinciple obj = new SingleResponsibilityPrinciple();

        Assert.assertEquals(obj.subtract(5, 4), 1);
    }
}
