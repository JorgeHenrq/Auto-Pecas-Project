package com.autopecas.autopecas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Usuario {
    private Integer Id;
    private String nomeUsuario;
    private String cpfUsuario;
    private String cargo;
    private String login;
    private String senha;
}
