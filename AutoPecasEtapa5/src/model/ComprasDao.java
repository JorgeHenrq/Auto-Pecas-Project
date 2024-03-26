package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComprasDao {
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
    public int salvar(Compras comp){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO compras VALUES(?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2,comp.getDescricaoItemCompras());
            st.setInt(3,comp.getQuantidadeCompra());
            st.setDouble(4,comp.getValorCompra());
            st.setString(5,comp.getDataCompra());
          
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
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
                pec.setValorCompra(rs.getDouble("valor_compra"));
                
                return pec;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar: " + ex.getMessage());
            return null;
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
