package com.meteeshop.order.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop/api/v1/orders")
public class OrderController {
    @GetMapping()
    public ResponseEntity<String> getOrder(){
        return ResponseEntity.ok("in create get path");
    }

}
