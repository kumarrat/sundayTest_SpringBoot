package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {


    // @Autowired
    Car carObj;

    @GetMapping("api/v1/Spring")
    public String api1()
    {

        return "SpringBoot";
    }

    @GetMapping("api/v1/car")
    public Car getCar()
    {

        return carObj;
    }

    @PutMapping("api/v1/change/model")
    public String setModel()
    {
        carObj.setModel("INNOVA");
        return "model changed";
    }
}
