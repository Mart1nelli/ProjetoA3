/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quiz.telas;

/**
 *
 * @author mathe
 */
import com.mycompany.quiz.models.Usuario;
import com.mycompany.quiz.daos.UsuarioDAO;
import javax.swing.JOptionPane;

public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTela
     */
    public CadastroTela() {
        super("Squizz");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txf_nome = new javax.swing.JTextField();
        txf_email = new javax.swing.JTextField();
        pwf_senha = new javax.swing.JPasswordField();
        btn_menu = new javax.swing.JButton();
        btn_criaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        txf_nome.setBackground(new java.awt.Color(51, 51, 51));
        txf_nome.setForeground(new java.awt.Color(255, 255, 255));
        txf_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite seu nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txf_email.setBackground(new java.awt.Color(51, 51, 51));
        txf_email.setForeground(new java.awt.Color(255, 255, 255));
        txf_email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite seu email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        pwf_senha.setBackground(new java.awt.Color(51, 51, 51));
        pwf_senha.setForeground(new java.awt.Color(255, 255, 255));
        pwf_senha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_menu.setBackground(new java.awt.Color(51, 0, 204));
        btn_menu.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("Voltar ao Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_criaCadastro.setBackground(new java.awt.Color(51, 0, 204));
        btn_criaCadastro.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        btn_criaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btn_criaCadastro.setText("Criar Cadastro");
        btn_criaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_criaCadastro))
                    .addComponent(pwf_senha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txf_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txf_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_criaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        MenuInicial mi = new MenuInicial();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_criaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criaCadastroActionPerformed
        // TODO add your handling code here:
        Usuario usuarios = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        String nome = txf_nome.getText();
        String email = txf_email.getText();
        String senha = new String(pwf_senha.getPassword());
       
        try {
            usuarios.setNome(nome);
            usuarios.setEmail(email);
            usuarios.setSenha(senha);
            if(nome.equals("") || email.equals("") || senha.equals("")){
                JOptionPane.showMessageDialog(null, "Nome, email, ou senha inválidos");
            }else{
                if(dao.existeNomeUser(usuarios)){
                    JOptionPane.showMessageDialog(null, "Usuario ja existênte");
                    txf_nome.setText("");
                }
                if(dao.existeEmailUser(usuarios)){
                    if(email.equals("administrador@squizz.com") && !dao.existeNomeUser(usuarios)){
                        dao.adicionaUser(usuarios);
                        JOptionPane.showMessageDialog(null,"Cadastro de Administrador realizado!");
                        txf_nome.setText("");
                        txf_email.setText("");
                        pwf_senha.setText("");
                    }else if(email.equals("administrador@squizz.com") && dao.existeNomeUser(usuarios)){
                        JOptionPane.showMessageDialog(null, "Por favor insira outro nome para se cadastrar como administrador");
                        txf_nome.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null,"Email já existente");
                        txf_email.setText("");
                    }
                }
                if(!dao.existeNomeUser(usuarios) && !dao.existeEmailUser(usuarios)){
                    dao.adicionaUser(usuarios);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    txf_nome.setText("");
                    txf_email.setText("");
                    pwf_senha.setText("");
                }
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_criaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_criaCadastro;
    private javax.swing.JButton btn_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwf_senha;
    private javax.swing.JTextField txf_email;
    private javax.swing.JTextField txf_nome;
    // End of variables declaration//GEN-END:variables
}
