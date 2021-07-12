 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.build.repository;

import com.example.build.entities.Build;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author diego
 */
public interface buildRepository extends JpaRepository<Build, Long> {
    
}
