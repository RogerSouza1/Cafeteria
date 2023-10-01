package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConectarDAO {
    
    String sql;
    Connection con;
    PreparedStatement ps;
    
    public ConectarDAO () {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjCad", "root" ,
"");
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,"Erro de Conexão com o MySQL ... \n" + err.getMessage());
        }
    }
    
    public void criarBanco () {
        
        sql = "CREATE TABLE IF NOT EXISTS ITENS("
                + "id_Item int (100) not null,"
                + "quantidade int (100) not null,"
                + "preco decimal (7,2) not null,"
                + "primaty key (id_Item))";

        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            
            ps.close();
            con.close();
            
           JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
            } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
            }
    
    
    }
}
