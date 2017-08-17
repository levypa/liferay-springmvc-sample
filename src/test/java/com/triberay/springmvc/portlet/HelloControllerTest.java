package com.triberay.springmvc.portlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HelloController.class })
@WebAppConfiguration
public class HelloControllerTest {

    @Mock
    private RenderRequest mockRequest;
    @Mock
    private RenderResponse mockResponse;

    @Autowired
    private HelloController helloController;

    @Test
    public void testHelloControllerBean() {
        assertNotNull(helloController);
        assertEquals(
                "class com.triberay.springmvc.portlet.HelloController",
                this.helloController.getClass().toString());
    }

    @Test
    public void testView() {

        String result = helloController.view(mockRequest, mockResponse);
        assertNotNull(result);
        assertEquals("view", result);
    }
}
