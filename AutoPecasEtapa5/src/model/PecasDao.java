package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PecasDao {
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
     public int salvar(Pecas pec){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO pecas VALUES(?,?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2,pec.getDescricaoItem());
            st.setString(3,pec.getMarca());
            st.setString(4,pec.getAplicacao());
            st.setDouble(5, pec.getValorCompra());
            st.setDouble(6,pec.getValorVenda());
            
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
