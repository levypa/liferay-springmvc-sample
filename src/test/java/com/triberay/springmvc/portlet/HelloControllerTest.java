package com.triberay.springmvc.portlet;

import com.triberay.sprinmvc.testconfig.TestContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestContext.class, HelloController.class })
@WebAppConfiguration
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void testHelloControllerBean() {
        assertNotNull(helloController);
        assertEquals(
                "class com.triberay.springmvc.portlet.HelloController",
                this.helloController.getClass().toString());
    }
}
