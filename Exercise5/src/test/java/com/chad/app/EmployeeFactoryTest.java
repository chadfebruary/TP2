package com.chad.app;

import com.chad.app.domain.Employee;
import com.chad.app.factories.EmployeeFactory;
import com.chad.app.factories.EmployeeFactoryImpl;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * Created by student on 2016/04/07.
 */
public class EmployeeFactoryTest extends TestCase{

    private EmployeeFactory factory;

    @Test
    public void setup() throws Exception {
        factory = EmployeeFactoryImpl.getInstance();
    }

    @Test
    public void testCreateEmployee() throws Exception {

        Employee employee = factory.createEmployee("A", "B", 01, 1000);
        Assert.assertEquals(employee.getName(), "A");
    }
}
