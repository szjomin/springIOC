package com.fw.ioc.test;

import com.fw.ioc.ApplicationContext;
import com.fw.ioc.annotation.Autowire;
import com.fw.ioc.annotation.Controller;
import com.fw.ioc.support.AnnotationApplicationContext;

@Controller
public class TestController {

    @Autowire("testService")
    private TestService service;

    public void testService(){
        service.say("test success.");
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationApplicationContext("applicationContext.properties");
        TestController controller = context.getBean("com.fw.ioc.test.TestController", TestController.class);
        controller.testService();
    }

}
