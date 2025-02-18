package com.pr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @GetMapping("/{id}")
    public ResponseEntity<String> showEmpDetails(Integer id){

        Integer i = id;
        return new ResponseEntity<String>("The employee id is "+i, HttpStatus.OK);
    }
}
