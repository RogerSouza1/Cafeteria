package model;

public class Usuario {
    private int id_nivelAdm;
    private String CPF;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId_nivelAdm() {
        return id_nivelAdm;
    }

    public void setId_nivelAdm(int id_nivelAdm) {
        this.id_nivelAdm = id_nivelAdm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
