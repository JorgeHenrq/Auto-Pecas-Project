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
@Table(name= "venda")

public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    
    private Integer Id;
    private String discricaoVenda;
    private String cpfCliente;
    private double quantidade;
    private double valorVenda;
    private String dataVenda;   
}
