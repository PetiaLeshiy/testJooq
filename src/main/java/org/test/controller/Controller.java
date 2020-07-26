package org.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

@PostMapping(value = "/jooqTest", consumes = "application/json")
    public void testJooq(@RequestBody String id)
{
    System.out.println("123");
}
}
