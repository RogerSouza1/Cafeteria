package controller;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO extends ConectarDAO {
    
    private String sql;
    private PreparedStatement ps;
    
    public UsuarioDAO() {
        super();
    }
    
    public ResultSet validarLogin(String login, String senha) {
        
        sql = "Select * from usuario where email ='" + login + "' and senha ='" + senha + "'";
        
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
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
    
}
