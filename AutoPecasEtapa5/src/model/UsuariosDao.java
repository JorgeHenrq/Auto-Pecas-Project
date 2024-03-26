package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDao {
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
    public int salvar(Usuarios usu){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO usuarios VALUES(?,?,?,?,?,?)");
            st.setInt(1, 0);
            st.setString(2,usu.getNomeUsuario());
            st.setString(3,usu.getCpfUsuario());
            st.setString(4,usu.getCargo());
            st.setString(5, usu.getLogin());
            st.setString(6,usu.getSenha());
          
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
