package controller;

import java.sql.PreparedStatement;
import model.Pagamento;
import model.Pedido;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class PagamentoDAO extends ConectarDAO{
    
    private String sql;
    private PreparedStatement ps;
    
    public PagamentoDAO() {
        super();
    }
    
    public ResultSet buscarPedidos(int mesa) {
        sql = "SELECT * FROM PEDIDO WHERE mesa = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedidos!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet buscarTodos() {
        sql = "SELECT * FROM PAGAMENTO ORDER BY id_Pagamento";
        
        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usiário!" + err.getMessage());
            return null;
        }
    }
    
    
    
    
}


