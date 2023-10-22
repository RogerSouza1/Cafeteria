package controller;

import java.math.BigDecimal;
import java.sql.Statement;
import model.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PedidoDAO extends ConectarDAO {

    private String sql;
    private String sql2;
    private PreparedStatement ps;

    public PedidoDAO() {
        super();
    }

    public void excluir(String id) {

        sql = "DELETE FROM PEDIDO WHERE id_Pedido = '" + id + "'";

        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "ID Excluido com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir ID!" + err.getMessage());
        }
    }

    public ResultSet buscarPedidos(Pedido ped) {
        sql = "SELECT * FROM PEDIDO WHERE mesa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ped.getMesa());
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedidos!" + err.getMessage());
            return null;
        }
    }

    public ResultSet buscarTodos() {
        sql = "SELECT * FROM PEDIDO ORDER BY id_Pedido";

        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usiário!" + err.getMessage());
            return null;
        }
    }

    public void inclur(Pedido ped) {
        sql = "INSERT INTO PEDIDO (mesa, produto, quantidade, preco) VALUES (?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ped.getMesa());
            ps.setString(2, ped.getProduto());
            ps.setInt(3, ped.getQuantidade());
            ps.setBigDecimal(4, BigDecimal.valueOf(ped.getValor()));
            
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int lastInsertId = generatedKeys.getInt(1);
                    JOptionPane.showMessageDialog(null, "Pedido adicionado com ID " + lastInsertId);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao recuperar a chave gerada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o pedido.");
            }

            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar " + err.getMessage());
        }
    }
}
