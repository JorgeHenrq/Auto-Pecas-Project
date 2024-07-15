package com.autopecas.autopecas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Cliente {
    private Integer Id;
    private String nomeCliente;
    private String cpfCliente;
    private String endereco;
    private String cidade;
    private String bairro;
    private String numero;
    private String contato;
}
