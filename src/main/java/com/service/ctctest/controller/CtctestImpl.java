package com.service.ctctest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-10T06:37:49.276Z")

@RestSchema(schemaId = "ctctest")
@RequestMapping(path = "/ctctest", produces = MediaType.APPLICATION_JSON)
public class CtctestImpl {

    @Autowired
    private CtctestDelegate userCtctestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCtctestDelegate.helloworld(name);
    }

}
