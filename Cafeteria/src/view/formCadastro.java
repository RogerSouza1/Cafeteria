package view;

import java.sql.ResultSet;
import controller.UsuarioDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class formCadastro extends javax.swing.JFrame {

    public formCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        comboxAdm = new javax.swing.JComboBox<>();
        btnAdd1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(102, 73, 52));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(217, 179, 132));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 427));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 73, 52));
        jLabel1.setText("Nível Adm");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 73, 52));
        jLabel2.setText("Nome");

        txtNome.setForeground(new java.awt.Color(51, 51, 51));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 73, 52));
        jLabel3.setText("E-mail");

        txtEmail.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 73, 52));
        jLabel4.setText("Telefone");

        txtTelefone.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 73, 52));
        jLabel6.setText("Senha");

        txtSenha.setForeground(new java.awt.Color(51, 51, 51));

        comboxAdm.setForeground(new java.awt.Color(51, 51, 51));
        comboxAdm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Usuário", "Administrador" }));
        comboxAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxAdmActionPerformed(evt);
            }
        });

        btnAdd1.setBackground(new java.awt.Color(102, 73, 52));
        btnAdd1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdd1.setForeground(new java.awt.Color(217, 179, 132));
        btnAdd1.setText("Incluir");
        btnAdd1.setBorderPainted(false);
        btnAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd1MouseClicked(evt);
            }
        });
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 73, 52));
        btnBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(217, 179, 132));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loupe.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(102, 73, 52));
        btnExcluir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(217, 179, 132));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 73, 52));
        jLabel5.setText("CPF");

        btnVoltar.setBackground(new java.awt.Color(102, 73, 52));
        btnVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(217, 179, 132));
        btnVoltar.setText("Voltar ao Login");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(217, 179, 132));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Gerente Coffee.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 73, 52));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 39));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCPF)
                    .addComponent(txtNome)
                    .addComponent(txtEmail)
                    .addComponent(txtTelefone)
                    .addComponent(txtSenha)
                    .addComponent(comboxAdm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btnAdd1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboxAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnAdd1))
                .addGap(21, 21, 21))
        );

        tableUser.setBackground(new java.awt.Color(217, 179, 132));
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nível", "CPF", "Nome", "Tel.", "E-mail", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setResizable(false);
            tableUser.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd1MouseClicked


    }//GEN-LAST:event_btnAdd1MouseClicked

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed

        Usuario Lu = new Usuario();

        String cpf = txtCPF.getText();

        boolean camposValidos = validarCampos();

        if (camposValidos == true) {
            Lu.setId_nivelAdm((int) comboxAdm.getSelectedIndex());
            Lu.setCPF(this.txtCPF.getText());
            Lu.setNome(this.txtNome.getText());
            Lu.setTelefone(this.txtTelefone.getText());
            Lu.setEmail(this.txtEmail.getText());
            Lu.setSenha(this.txtSenha.getText());

            UsuarioDAO u1 = new UsuarioDAO();
            ResultSet resul = u1.buscar(Lu);
            try {
                if (resul.next()) { // caso exista o cpf então chama u1.alterar()
                    u1.alterar(Lu);
                } else {
                    u1.incluir(Lu);// caseo não exista o cpf chama u1.incluir()
                }
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null,
                        err.getMessage());
            }

            this.txtNome.setText("");
            this.txtCPF.setText("");
            this.txtEmail.setText("");
            this.txtTelefone.setText("");
            this.txtSenha.setText("");
        }

        this.carregar_usuarios();
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);

        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel mymodel = (DefaultComboBoxModel) this.comboxAdm.getModel();
        mymodel.removeAllElements();
        mymodel.addElement("Caixa");
        mymodel.addElement("Funcionario");
        mymodel.addElement("Gerente");

        this.carregar_usuarios();
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Usuario obj = new Usuario();

        obj.setCPF(this.txtCPF.getText());

        UsuarioDAO u1 = new UsuarioDAO();
        ResultSet resul = u1.buscar(obj);

        try {
            if (resul.next()) {
                this.txtNome.setText(resul.getString("nome"));
                this.txtEmail.setText(resul.getString("email"));
                this.txtTelefone.setText(resul.getString("telefone"));
                this.comboxAdm.setSelectedIndex(resul.getInt("id_Nivel_Admin"));
                this.txtSenha.setText(resul.getString("senha"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
                this.txtCPF.grabFocus();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        UsuarioDAO u = new UsuarioDAO();

        u.excluir(this.txtCPF.getText());
        this.carregar_usuarios();

        this.txtNome.setText("");
        this.txtCPF.setText("");
        this.txtEmail.setText("");
        this.txtTelefone.setText("");
        this.txtSenha.setText("");

    }//GEN-LAST:event_btnExcluirMouseClicked

    private void comboxAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxAdmActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int linhasel = this.tableUser.getSelectedRow();
        int colunachave = 1;
        Object chave = this.tableUser.getModel().getValueAt(linhasel, colunachave);
        Usuario obj = new Usuario();
        obj.setCPF((String) chave);
        UsuarioDAO u1 = new UsuarioDAO();
        ResultSet resul = u1.buscar(obj);

        try {
            if (resul.next()) {
                this.txtCPF.setText(resul.getString("cpf"));
                this.txtNome.setText(resul.getString("nome"));
                this.txtEmail.setText(resul.getString("email"));
                this.txtTelefone.setText(resul.getString("telefone"));
                this.comboxAdm.setSelectedIndex(resul.getInt("id_Nivel_Admin"));
                this.txtSenha.setText(resul.getString("senha"));
            } else {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!");
                this.txtCPF.grabFocus();
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao navegar na Jtable!");
        }
    }//GEN-LAST:event_tableUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastro().setVisible(true);
            }
        });
    }

    private void carregar_usuarios() {
        UsuarioDAO u1 = new UsuarioDAO();
        while (tableUser.getModel().getRowCount() > 0) {
            ((DefaultTableModel) tableUser.getModel()).removeRow(0);
        }

        try {
            ResultSet todos = u1.buscartodos();
            DefaultTableModel tab = (DefaultTableModel) this.tableUser.getModel();
            while (todos.next()) {
                Object[] linha = {
                    todos.getString("id_Nivel_Admin"),
                    todos.getString("cpf"),
                    todos.getString("nome"),
                    todos.getString("telefone"),
                    todos.getString("email"),
                    todos.getString("senha")};
                tab.addRow(linha);
            }
            todos.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    private boolean validarCampos() {

        // Validação do CPF
        String cpf = txtCPF.getText().replaceAll("\\D", ""); // Remove caracteres não numéricos
        if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(this, "Erro: CPF deve conter 11 dígitos.");
            this.txtCPF.setText("");
            return false;
        }

        // Validação do Nome
        String nome = txtNome.getText();
        if (nome.length() > 50) {
            JOptionPane.showMessageDialog(this, "Erro: Nome deve conter no máximo 50 caracteres.");
            this.txtNome.setText("");
            return false;
        }

        // Validação do Telefone
        String telefone = txtTelefone.getText().replaceAll("\\D", ""); // Remove caracteres não numéricos
        if (telefone.length() < 10 || telefone.length() > 11) {
            JOptionPane.showMessageDialog(this, "Erro: Telefone deve conter 10 ou 11 dígitos.");
            this.txtTelefone.setText("");
            return false;
        }

        // Validação do Email
        String email = txtEmail.getText();
        if (!email.contains("@")) {
            this.txtEmail.setText("");
            JOptionPane.showMessageDialog(this, "Erro: Email deve conter '@'.");
            return false;
        }

        // Validação da Senha
        String senha = txtSenha.getText();
        if (senha.length() < 8 || !senha.matches(".*[A-Z].*") || !senha.matches(".*\\d.*")) {
            this.txtSenha.setText("");
            JOptionPane.showMessageDialog(this, "Erro: Senha deve conter no mínimo 8 caracteres, incluindo pelo menos uma letra maiúscula e um número.");
            return false;
        }

        // Todos os campos estão válidos
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboxAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
