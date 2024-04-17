package com.meteeshop.payment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/api/v1/payments")
public class PaymentController {

    @PostMapping()
    public ResponseEntity<String> createOrder(){
        return ResponseEntity.ok("in payments post path");
    }

    @GetMapping()
    public ResponseEntity<String> getOrder(){
        return ResponseEntity.ok("in payments get path");
    }


}
