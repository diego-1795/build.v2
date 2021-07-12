/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.build.controller;

import com.example.build.entities.Build;
import com.example.build.repository.buildRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping("/build")
public class buildRestController {
    
    @Autowired
    buildRepository buildRepository;
    
    @GetMapping()
    public List<Build> list() {
        return buildRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Build get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Build input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody @Valid Build input) {
        Build save = buildRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
