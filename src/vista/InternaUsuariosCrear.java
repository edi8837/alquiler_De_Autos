/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorUsuario;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author GerardoG
 */
public class InternaUsuariosCrear extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternaUsuariosCrear
     */
    
    ControladorUsuario controladorUsuario;
    
    String opcionComboBuscarSucursal;
    int opcion_tip_us;
    
    public InternaUsuariosCrear() {
        initComponents();
        setTitle("Crear Usuarios");
        
        controladorUsuario = new ControladorUsuario();  
        
        //Cargamos el ComboBox
        if(controladorUsuario.llenarComboBoxNombre(jComboBoxSucursales)==false){
            JOptionPane.showMessageDialog(null,"Cargado valores", "Informacion", JOptionPane.INFORMATION_MESSAGE); 
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTip_Usuario = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxSucursales = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Email:");

        jLabel7.setText("Dirección:");

        jLabel8.setText("Username:");

        jLabel9.setText("Contraseña:");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jLabel10.setText("Tipo de Usuario:");

        jComboBoxTip_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opciones.....", "Administrador", "Empleado" }));
        jComboBoxTip_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTip_UsuarioActionPerformed(evt);
            }
        });

        jLabel11.setText("Sucursal:");

        jComboBoxSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSucursalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txt_username)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTip_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellido)
                    .addComponent(txt_contrasenia)
                    .addComponent(txt_direccion)
                    .addComponent(txt_celular)
                    .addComponent(jComboBoxSucursales, 0, 155, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxTip_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCrear)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void jComboBoxSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSucursalesActionPerformed
        opcionComboBuscarSucursal=jComboBoxSucursales.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBoxSucursalesActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        if((txt_cedula.equals(""))||(txt_nombre.equals(""))||
           (txt_apellido.equals(""))||(txt_celular.equals(""))||
           (txt_email.equals(""))||(txt_direccion.equals(""))||
           (txt_username.equals(""))||(txt_contrasenia.equals(""))){
           
            JOptionPane.showMessageDialog(null,"Llenar todos los Campos", "Error!!", JOptionPane.ERROR_MESSAGE); 
            
        }else{
            llenarDatos();
            
        }
        
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jComboBoxTip_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTip_UsuarioActionPerformed
        //Saber que numero va a poner 1 o 2 (1. Administrador o 2.Empleado)
        opcion_tip_us=jComboBoxTip_Usuario.getSelectedIndex();
    }//GEN-LAST:event_jComboBoxTip_UsuarioActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed


    private void llenarDatos(){
        Usuario usu = new Usuario();
        
        usu.setUsu_cedula(txt_cedula.getText());
        usu.setUsu_nombre(txt_nombre.getText());
        usu.setUsu_apellido(txt_apellido.getText());
        usu.setUsu_telf_con(txt_telefono.getText());
        usu.setUsu_telf(txt_celular.getText());
        usu.setUsu_email(txt_email.getText());
        usu.setUsu_direccion(txt_direccion.getText());
        usu.setUsu_username(txt_username.getText());
        usu.setUsu_password(txt_contrasenia.getText());
        usu.setTip_usuario(opcion_tip_us);
        usu.setSuc_id(controladorUsuario.buscarSucursalNumero(opcionComboBuscarSucursal));
        
        if(controladorUsuario.anadirUsuario(usu)==true){
           JOptionPane.showMessageDialog(null,"Guardado", "Informacion", JOptionPane.INFORMATION_MESSAGE);  
           dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Datos Duplicados", "Informacion", JOptionPane.INFORMATION_MESSAGE); 
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JComboBox<String> jComboBoxSucursales;
    private javax.swing.JComboBox<String> jComboBoxTip_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_contrasenia;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
