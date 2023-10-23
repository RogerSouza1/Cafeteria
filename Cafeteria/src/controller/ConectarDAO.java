package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDAO {

    String[] sql = new String[3];

    public Connection con = null;
    public PreparedStatement ps = null;

    public ConectarDAO() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria", "root",
                    "");
            criarBanco();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o MySQL ... \n" + err.getMessage());
        }
    }

    public void criarBanco() {

        sql[0] = "CREATE TABLE IF NOT EXISTS PEDIDO ("
                + "id_Pedido INT AUTO_INCREMENT NOT NULL,"
                + "comanda INT NOT NULL,"
                + "produto VARCHAR(100) NOT NULL,"
                + "quantidade INT NOT NULL,"
                + "preco DECIMAL(7,2) NOT NULL,"
                + "PRIMARY KEY (id_Pedido)"
                + ")";

        sql[1] = "CREATE TABLE IF NOT EXISTS PAGAMENTO ("
                + "id_Pagamento INT AUTO_INCREMENT NOT NULL,"
                + "comanda INT NOT NULL,"
                + "total DOUBLE NOT NULL,"
                + "forma_Pagamento varchar(100) NOT NULL,"
                + "pedidoFechado varchar(1) NOT NULL,"
                + "PRIMARY KEY (id_Pagamento)"
                + ")";

        sql[2] = "CREATE TABLE IF NOT EXISTS USUARIO ("
                + "id_Nivel_Admin INT NOT NULL,"
                + "cpf VARCHAR(100) NOT NULL,"
                + "nome VARCHAR(100) NOT NULL,"
                + "telefone VARCHAR(100) NOT NULL,"
                + "email VARCHAR(50) NOT NULL,"
                + "senha VARCHAR(20) NOT NULL,"
                + "PRIMARY KEY (cpf)"
                + ")";

        for (int i = 0; i < sql.length; i++) {

            try {
                ps = con.prepareStatement(sql[i]);
                ps.execute();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + (i + 1) + " " + err.getMessage());
            }

        }
    }
}
