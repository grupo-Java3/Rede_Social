/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redesocial.telas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import redesocial.classes.Empresa;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;
/**
 *
 * @author cliente
 */
public class Login extends javax.swing.JFrame {
    public Usuario admL = new Usuario();
    /**
     * Creates new form NewJFrame
     */
    public Login() {
     
        initComponents();
        
    }
    
    public String pEmail;
    public String pSenha;
    public String pNome;
    
    public void exportarPessoa(Usuario admCP){
          pNome = admCP.getNomeUsuario();
          pEmail = admCP.getEmail();
          pSenha = admCP.getSenha();
         
    }
    
  
   
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrarP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnEntrarE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        btnEntrarP.setText("Entrar(Pessoa)");
        btnEntrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarPActionPerformed(evt);
            }
        });

        jLabel4.setText("Não possui conta?");

        btnCadastro.setText("Cadastre-se");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnEntrarE.setText("Entrar(Empresa)");
        btnEntrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEntrarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnCadastro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEntrarP)
                        .addGap(28, 28, 28)
                        .addComponent(btnEntrarE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean temEmPessoaEmail(String validar){
        for (Pessoa i : admL.getListaPessoa())
            if (validar.equals(i.getEmail())){
                return true;
            }
        return false;
    }
    public boolean temEmPessoaSenha(String validar){
        for (Pessoa i : admL.getListaPessoa())
            if (validar.equals(validar)){
                return true;
            }
        return false;
    }
    
    public boolean temEmEmpresaEmail(String validar){
        for (Empresa i : admL.getListaEmpresa())
            if (validar.equals(i.getEmail())){
                return true;
            }
        return false;
    }
    public boolean temEmEmpresaSenha(String validar){
        for (Empresa i : admL.getListaEmpresa())
            if (validar.equals(validar)){
                return true;
            }
        return false;
    }
    
    private void btnEntrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarPActionPerformed
        if (temEmPessoaSenha(String.valueOf(txtSenha.getPassword())) || temEmPessoaEmail(txtEmail.getText()) ){ 
            RedeSocial redesocial = new RedeSocial();
           
            redesocial.admRS = admL;
            redesocial.lblEmail.setText(txtEmail.getText());
            redesocial.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Email ou Senha incorretos");
            limparCampos();
        }
       
            
    }//GEN-LAST:event_btnEntrarPActionPerformed

    public void limparCampos(){
        txtEmail.setText("");
        txtSenha.setText("");
        
    }
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        Cadastro c = new Cadastro();
        c.admC = admL;
        this.dispose();
        c.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEntrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarEActionPerformed
        if (temEmEmpresaSenha(String.valueOf(txtSenha.getPassword())) || temEmEmpresaEmail(txtEmail.getText()) ){ 
            RedeSocial redesocial = new RedeSocial();
            redesocial.admRS = admL;
            redesocial.lblEmail.setText(txtEmail.getText());
            redesocial.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Email ou Senha incorretos");
            limparCampos();
        }
       
    }//GEN-LAST:event_btnEntrarEActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (admL.getPessoaIndex("Joselito") != 1){
            admL.adicionarPessoa("a", "b", "c");
        admL.adicionarPessoa("Joselito", "Junior@gmail", "jun10r");
        admL.adicionarEmpresa("123233", "Bar_do_ze", "zezinBar", "barze@gmail", "casshaa");
        String[] produtos = {"cerveja", "cafe", "espetinho", "casah"};
        admL.adicionarProduto("bar_do_ze", produtos);
        }
        admL.listar();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

   

//Os botões diferentes são solucões temporarias ate eu achar uma condiçao que se encaixe
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrarE;
    private javax.swing.JButton btnEntrarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
