package com.fw.ioc.test;

import com.fw.ioc.annotation.Component;

@Component("testService")
public class TestService {

    public void say(String s){
        System.out.println(s);
    }

}
