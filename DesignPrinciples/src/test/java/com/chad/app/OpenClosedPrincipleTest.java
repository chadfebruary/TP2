package com.chad.app;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class OpenClosedPrincipleTest {

    @Test
    public void testAdd() throws Exception {

        OpenClosedPrinciple obj = new OpenClosedPrinciple();

        Assert.assertEquals(obj.add(1, 1), 2);
    }

}
