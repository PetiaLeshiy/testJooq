package org.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.test.dto.PetRq;
import org.test.model.TypeAnimal;
import org.test.utils.ResponseBuilder;

@RestController
public class Controller {

    private ResponseBuilder responseBuilder;

    @Autowired
    public void setResponseBuilder(ResponseBuilder responseBuilder) {
        this.responseBuilder = responseBuilder;
    }

    @PostMapping(value = "/jooqTest", consumes = "application/json")
    public void testJooq(@RequestBody PetRq rq) {
//        System.out.println("///////////START/////////////");
//        responseBuilder.insert();
//
//        System.out.println("///////////1/////////////");
//        responseBuilder.soutPet1();
//
//        System.out.println("///////////2/////////////")
        responseBuilder.soutPet(rq.getId());


//        System.out.println("///////////2/////////////");
//        responseBuilder.printEnum();

        System.out.println("///////////3/////////////");
        System.out.println(responseBuilder.getPet(rq.getId()));
    }
}
