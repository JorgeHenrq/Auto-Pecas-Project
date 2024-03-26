
package model;

public class Vendas {
    String descricaoItemVenda;
    int quantidadeVenda;
    double valorVenda;
    String cpfCliente;
    String dataVenda;

    public String getDescricaoItemVenda() {
        return descricaoItemVenda;
    }

    public void setDescricaoItemVenda(String descricaoItemVenda) {
        this.descricaoItemVenda = descricaoItemVenda;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    
}
