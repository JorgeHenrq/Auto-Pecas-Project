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
@Table(name= "cliente")

public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    
    private Integer Id;
    private String nomeCliente;
    private String cpfCliente;
    private String endereco;
    private String cidade;
    private String bairro;
    private String numero;
    private String contato;
}
