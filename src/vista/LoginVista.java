/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAdministrador;
import controlador.ControladorLogin;
import javax.swing.JOptionPane;
import modelo.Login;
import modelo.Tipo_Usuarios;

/**
 *
 * @author GerardoG
 */
public class LoginVista extends javax.swing.JFrame {

    /**
     * Creates new form LoginVista
     */
    
    private VentanaEmpleado vtnEmpleado;
    private VentanaAdministrador vtnAdministrador;
    
    
    private ControladorLogin controladorlogin;
    private ControladorAdministrador controladorAdministrador;
    
    
    public LoginVista() {
        initComponents();
        controladorlogin = new ControladorLogin();
        controladorAdministrador = new ControladorAdministrador();
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jbuttonIngresar = new javax.swing.JButton();
        jtxtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesion");
        setBackground(new java.awt.Color(0, 255, 153));
        setForeground(new java.awt.Color(102, 255, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 0));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Ususario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 255, 0));
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jtxtUsuario.setBackground(new java.awt.Color(153, 255, 0));
        jtxtUsuario.setForeground(new java.awt.Color(102, 102, 255));
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 186, -1));

        jbuttonIngresar.setBackground(new java.awt.Color(153, 255, 0));
        jbuttonIngresar.setForeground(new java.awt.Color(102, 102, 255));
        jbuttonIngresar.setText("Ingresar");
        jbuttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jtxtPassword.setBackground(new java.awt.Color(153, 255, 0));
        jtxtPassword.setForeground(new java.awt.Color(102, 102, 255));
        jtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPasswordActionPerformed(evt);
            }
        });
        jtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 186, -1));

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jtxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyPressed
        //System.out.println("ss" + evt.getKeyCode());
        int codigo = evt.getKeyCode();
        if(codigo==27){
            System.exit(0);
        }
    }//GEN-LAST:event_jtxtUsuarioKeyPressed

    private void jtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPasswordActionPerformed

    private void jtxtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyPressed
        int codigo=evt.getKeyCode();
        if(codigo==10){
            ingreso();
        }else if(codigo==27){
            System.exit(0);
        }
    }//GEN-LAST:event_jtxtPasswordKeyPressed

    private void jbuttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonIngresarActionPerformed
        ingreso();
    }//GEN-LAST:event_jbuttonIngresarActionPerformed

    
    private void ingreso(){
        
        Login login = new Login();
        Tipo_Usuarios tip_usu = new Tipo_Usuarios();
        String nomSuc;
        
        String pasS=new String(jtxtPassword.getPassword());
        
        if(jtxtUsuario.getText().equals("") || pasS.equals("")){ 
            JOptionPane.showMessageDialog(null,"Escriba en todas las casillas", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }else if(controladorlogin.buscar(jtxtUsuario.getText(), pasS)==true){
            
            System.out.println("Datos Validos");
            login=controladorlogin.buscarLogin(jtxtUsuario.getText(), pasS);
            System.out.println("sd"+ login.getUsername());
            
            tip_usu=controladorAdministrador.buscar(login.getUsername());
            nomSuc=controladorAdministrador.buscarSucursal(tip_usu.getSuc_id());
            
            if(tip_usu.getTip_usuario()==1){
                vtnAdministrador = new VentanaAdministrador(login.getUsername(),nomSuc);  
                vtnAdministrador.setVisible(true);
                setVisible(false);
            }else if(tip_usu.getTip_usuario()==2){
                vtnEmpleado = new VentanaEmpleado(login.getUsername(),nomSuc);  
                vtnEmpleado.setVisible(true);
                setVisible(false);
            }else{
                System.out.println("Datos no validos");
                JOptionPane.showMessageDialog(null,"No existe los Datos", "Error!!", JOptionPane.ERROR_MESSAGE);
                } 
        //} else{
            //JOptionPane.showMessageDialog(null,"No existe los Datos", "Error!!", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Datos incorrectos", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbuttonIngresar;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
