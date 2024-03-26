package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendasDao {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AUTO_PECAS","root", "Jorge3036*");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    
    public Pecas consultarPecas (String descricaoItem){
         
        try {
            Pecas pec = new Pecas();
            st = conn.prepareStatement("SELECT * from pecas WHERE descricao_item = ?");
            st.setString(1,descricaoItem);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                pec.setDescricaoItem(rs.getString("descricao_item"));
                pec.setValorVenda(rs.getDouble("valor_venda"));
                
                return pec;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar: " + ex.getMessage());
            return null;
        }
    } 
    public Cliente consultarClientes (String cpfCliente){
         
        try {
            Cliente clin = new Cliente();
            st = conn.prepareStatement("SELECT * from clientes WHERE cpf = ?");
            st.setString(1,cpfCliente);
            rs = st.executeQuery();
            
            if(rs.next()){ 
                clin.setCpfCliente(rs.getString("cpf"));
                
                
                return clin;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar: " + ex.getMessage());
            return null;
        }
    } 
    
    public int salvar(Vendas ven){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO vendas VALUES(?,?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2,ven.getDescricaoItemVenda());
            st.setInt(3,ven.getQuantidadeVenda());
            st.setDouble(4,ven.getValorVenda());
            st.setString(5, ven.getCpfCliente());
            st.setString(6,ven.getDataVenda());
          
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
}
