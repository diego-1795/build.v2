/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.build.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import javax.validation.constraints.Pattern;

/**
 *
 * @author diego
 */

@Entity
@Data
public class Build implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @NotEmpty 
    @Pattern(regexp="^[A-Za-z]*$",message = "Invalid Input")
    private String name;

    @NotEmpty 
    @Pattern(regexp="^[a-z\\d]+(?:\\/[a-z\\d]+)+$",message = "Invalid Input")
    private String pathRepo;
    
    @NotEmpty 
    @Pattern(regexp="\\d+(?:\\.\\d+)+",message = "Invalid Input")
    private String version;
}
