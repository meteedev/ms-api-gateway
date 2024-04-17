package com.meteeshop.inventory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/api/v1/inventories")
public class InventoryController {

    @PostMapping()
    public ResponseEntity<String> createOrder(){
        return ResponseEntity.ok("in inventory post path");
    }

    @GetMapping()
    public ResponseEntity<String> getOrder(){
        return ResponseEntity.ok("in inventory get path");
    }

}
