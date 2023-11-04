package controller;

import java.sql.PreparedStatement;
import model.Pagamento;
import model.Pedido;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class PagamentoDAO extends ConectarDAO {

    private String sql;
    private PreparedStatement ps;

    public PagamentoDAO() {
        super();
    }
    
    public ResultSet buscarPedidos(int comanda) {
        sql = "SELECT * FROM PEDIDO WHERE comanda = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, comanda);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedidos!" + err.getMessage());
            return null;
        }
    }

    public void realizarPag(int id, String formaPag) {

        sql = "SELECT forma_Pagamento, pedidoFechado FROM PAGAMENTO WHERE id_Pagamento = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                String formaPagamento = resultSet.getString("forma_Pagamento");
                String pedidoFechado = resultSet.getString("pedidoFechado");

                if (pedidoFechado.equals("N") && formaPag.isBlank() == false) {

                    String novoValorFormaPagamento = formaPag;
                    String novoValorPedidoFechado = "S";

                    sql = "UPDATE PAGAMENTO SET forma_Pagamento = ?, pedidoFechado = ? WHERE id_Pagamento = ?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, novoValorFormaPagamento);
                    ps.setString(2, novoValorPedidoFechado);
                    ps.setInt(3, id);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                } else {
                    if (formaPag.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Forma de Pagamento Inválida!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Comanda já foi paga!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado para o ID fornecido");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar a consulta e/ou atualização: " + err.getMessage());
        }
    }
    

    public ResultSet buscarTodosPag() {
        sql = "SELECT * FROM PAGAMENTO ORDER BY id_Pagamento";

        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usiário!" + err.getMessage());
            return null;
        }
    }
    
    public ResultSet buscarComandaPag(int comanda) {
        sql = "SELECT * FROM PAGAMENTO WHERE comanda = ? AND pedidoFechado = 'N'";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, comanda);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar comanda! " + err.getMessage());
            return null;
        }
    }

    public ResultSet buscarComandaTodas(String s) {
        sql = "SELECT * FROM PAGAMENTO WHERE pedidoFechado = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, s);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedidos pendentes! " + err.getMessage());
            return null;
        }
    }

    public void limparComanda(int comanda) {
        sql = "DELETE FROM PEDIDO WHERE comanda = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, comanda);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Comanda fechada com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar comanda!" + err.getMessage());
        }

    }

    public void incluir(Pagamento pag) {
        sql = "INSERT INTO PAGAMENTO (comanda, total, forma_Pagamento, pedidoFechado) VALUES (?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pag.getComanda());
            ps.setDouble(2, pag.getTotal());
            ps.setString(3, pag.getFormaPagamento());
            ps.setString(4, pag.isPedidoFechado());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int lastInsertId = generatedKeys.getInt(1);
                    JOptionPane.showMessageDialog(null, "Número para pagamento: " + lastInsertId);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no ID do pedido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum pedido adicionado.");
            }

            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar " + err.getMessage());
        }

    }
}
