
package com.autopecas.autopecas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Peca {
    private Integer Id;
    private String discricao;
    private String marca;
    private String aplicacao;
    private double valorCompra;
    private double valorVenda;
    
}
