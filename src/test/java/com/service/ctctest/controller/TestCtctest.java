package com.service.ctctest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCtctest {

        CtctestDelegate ctctestDelegate = new CtctestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ctctestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}