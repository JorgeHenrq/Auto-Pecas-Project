package model;


public class Usuarios {
    String nomeUsuarios;
    String cpfUsuarios;
    String cargo;
    String login;
    String senha;

    public String getNomeUsuario() {
        return nomeUsuarios;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuarios = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuarios;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuarios = cpfUsuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
