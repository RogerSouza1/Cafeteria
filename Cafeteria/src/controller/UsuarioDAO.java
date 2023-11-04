package controller;

import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO extends ConectarDAO {
    
    private String sql;
    private PreparedStatement ps;
    
    public UsuarioDAO() {
        super();
    }
    
    public void excluir (String cpf) {
        sql = "DELETE FROM USUARIO WHERE CPF = '" + cpf + "'";
        
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário!" + err.getMessage());
        }
    }
    
    public ResultSet buscar (Usuario obj){
        sql = "SELECT * FROM USUARIO WHERE CPF = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getCPF());
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar usuário!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet buscartodos() {
        sql = "SELECT * FROM USUARIO ORDER BY nome ";
        
        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet validarLogin(String login, String senha) {
        
        sql = "Select * from usuario where binary email = ? and binary senha = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet resul = ps.executeQuery();
            return resul;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
        
    }
    
    public void incluir(Usuario user) {
        sql = "INSERT INTO USUARIO VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId_nivelAdm());
            ps.setString(2, user.getCPF());
            ps.setString(3, user.getNome());
            ps.setString(4, user.getTelefone());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getSenha());
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário!" + err.getMessage());
        }
    }
    
    public void alterar(Usuario user) {
        sql = "UPDATE usuario SET id_Nivel_Admin = ?, nome = ?, telefone = ?, email = ?, senha = ? WHERE cpf = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId_nivelAdm());
            ps.setString(2, user.getNome());
            ps.setString(3, user.getTelefone());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getSenha());
            ps.setString(6, user.getCPF());
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!" + err.getMessage());
        }
    }
    
}
