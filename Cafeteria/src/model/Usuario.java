package model;

public class Usuario {
    private int id_usuario;
    private int id_nivelAdm;
    private String login;
    private String senha;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_nivelAdm() {
        return id_nivelAdm;
    }

    public void setId_nivelAdm(int id_nivelAdm) {
        this.id_nivelAdm = id_nivelAdm;
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
