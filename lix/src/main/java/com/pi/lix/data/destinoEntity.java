
package com.pi.lix.data;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
import lombok.Data; 
@Data 
@Entity 
@Table(name="destino") 
public class destinoEntity { 
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id;
    private String nome,endereco,data; 
    private int unidades;   
} 