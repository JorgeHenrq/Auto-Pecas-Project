package com.autopecas.autopecas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Venda {
    private Integer Id;
    private String discricaoVenda;
    private String cpfCliente;
    private double quantidade;
    private double valorVenda;
    private String dataVenda;   
}
