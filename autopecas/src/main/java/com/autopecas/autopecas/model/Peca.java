package com.autopecas.autopecas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name= "peca")

public class Peca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer Id;
    private String discricao;
    private String marca;
    private String aplicacao;
    private double valorCompra;
    private double valorVenda;
  
}
