package com.autopecas.autopecas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Compra {
    private Integer Id;
    private String discricaoCompra;
    private double quantidade;
    private double valorCompra;
    private String dataCompra;   
}
