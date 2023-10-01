package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDAO {


    String[] sql = new String[5];

    int ult = sql.length - 1;
    Connection con;
    PreparedStatement ps;

    public ConectarDAO() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria", "root",
                    "");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o MySQL ... \n" + err.getMessage());
        }
    }

    public void criarBanco() {

        sql[0] = "CREATE TABLE IF NOT EXISTS ITENS("
                + "id_Item int (100) not null,"
                + "quantidade int (100) not null,"
                + "preco decimal (7,2) not null,"
                + "primary key (id_Item))";

        sql[1] = "CREATE TABLE IF NOT EXISTS NIVEIS_ADMIN("
                + "id_Niveis_Admin int (3) not null,"
                + "nivel varchar(10) not null,"
                + "primary key (id_Niveis_Admin))";

        sql[2] = "CREATE TABLE IF NOT EXISTS PAGAMENTO("
                + "id_Pagamento int (100) not null,"
                + "id_Pedido int (100) not null,"
                + "data_Hora datetime not null,"
                + "forma_Pagamento varchar(100) not null,"
                + "primary key (id_Pagamento))";

        sql[3] = "CREATE TABLE IF NOT EXISTS PEDIDO("
                + "id_Pedido int (100) not null,"
                + "id_Usuario int (100) not null,"
                + "id_Item int (100) not null,"
                + "pedido_Fechado varchar(1) not null,"
                + "primary key (id_Pedido))";

        sql[4] = "CREATE TABLE IF NOT EXISTS USUARIO("
                + "id_Usuario int (100) not null,"
                + "id_Nivel_Admin int (3) not null,"
                + "login varchar(50) not null,"
                + "senha varchar(20) not null,"
                + "primary key (id_Usuario))";

        for (int i = 0; i < sql.length; i++) {

            try {
                ps = con.prepareStatement(sql[i]);
                ps.execute();

                JOptionPane.showMessageDialog(null, "Banco criado " + (i + 1) + " com sucesso...");
                if (i == ult) {
                    ps.close();
                    con.close();
                }
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + (i + 1) + " " + err.getMessage());
            }

        }
    }
}

  