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
@Table(name= "usuario")

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    
    private Integer Id;
    private String nomeUsuario;
    private String cpfUsuario;
    private String cargo;
    private String login;
    private String senha;
}
