
package com.mycompany.fitnessapp.igu;

import com.mycompany.fitnessapp.logica.Controladora;
import com.mycompany.fitnessapp.logica.Usuario;
import static java.awt.SystemColor.control;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JFrame {
Controladora control = null;
Usuario usu = new Usuario();
    
    public Modificar(int idUsu) {
        control = new Controladora();
        usu.setId(idUsu);
        initComponents();
        cargarDatosUsuario(idUsu);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaM = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEdadM = new javax.swing.JTextField();
        txtPesoM = new javax.swing.JTextField();
        txtEstaturaM = new javax.swing.JTextField();
        cbxActividadM = new javax.swing.JComboBox<>();
        cbxSexoM = new javax.swing.JComboBox<>();
        btnLimpiarM = new javax.swing.JButton();
        btnVolverM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxObjetivoM = new javax.swing.JComboBox<>();
        btnCalcularModificarCalorias = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaM.setColumns(20);
        txtAreaM.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtAreaM.setRows(5);
        jScrollPane1.setViewportView(txtAreaM);

        jLabel1.setText("Edad:");

        jLabel2.setText("Peso (Kg) :");

        jLabel3.setText("Estatura (Cm):");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Actividad:");

        txtEdadM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMActionPerformed(evt);
            }
        });

        cbxActividadM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poco o nada de ejercicio", "Poco ejercicio (1 a 3 dias por semana)", "Promedio (3 a 5 dias por semana)", "Mucho ejercicio (6 a 7 dias por semana)" }));

        cbxSexoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        btnLimpiarM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLimpiarM.setText("Limpiar");
        btnLimpiarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarMActionPerformed(evt);
            }
        });

        btnVolverM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnVolverM.setText("Volver");
        btnVolverM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMActionPerformed(evt);
            }
        });

        jLabel6.setText("Objetivo:");

        cbxObjetivoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantener peso", "Bajar de peso", "Aumentar masa muscular" }));

        btnCalcularModificarCalorias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalcularModificarCalorias.setText("Calcular y modificar");
        btnCalcularModificarCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularModificarCaloriasActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolverM, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarM, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxSexoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxActividadM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxObjetivoM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstaturaM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(btnCalcularModificarCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstaturaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSexoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarM))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnVolverM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxActividadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxObjetivoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnCalcularModificarCalorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMActionPerformed
        txtNombreM.setText("");
        txtEdadM.setText("");
        txtPesoM.setText("");
        txtEstaturaM.setText("");
        txtAreaM.setText("");
    }//GEN-LAST:event_btnLimpiarMActionPerformed

    private void btnVolverMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverMActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void btnCalcularModificarCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularModificarCaloriasActionPerformed

        String calorias = ""; 
        if (txtEdadM.getText().equals("") || txtPesoM.getText().equals("") || txtEstaturaM.getText().equals("") || txtNombreM.getText().equals("")) {
            mostrarMensaje("Debe rellenar todos los campos", "Error", "Advertencia");
        }else {
            double tmb = 88.362 + (13.397 * Integer.parseInt(txtPesoM.getText())) + (4.799 * Integer.parseInt(txtEstaturaM.getText()) - (5.677 * Integer.parseInt(txtEdadM.getText())));
            double tmbM = 447.593 + (9.247 * Integer.parseInt(txtPesoM.getText())) + (3.098 * Integer.parseInt(txtEstaturaM.getText()) - (4.330 * Integer.parseInt(txtEdadM.getText())));
            String Calorias = "Calorias"; 

            if (cbxSexoM.getSelectedItem().equals("Hombre")) {
                if (cbxActividadM.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmb = (tmb - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }

                } else if (cbxActividadM.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmb = (tmb - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividadM.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmb = (tmb - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividadM.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmb = (tmb - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    String resultado = df.format(tmb);
                    txtAreaM.setText(resultado + " " + Calorias);
                    calorias = resultado;
                }
            } else {
                if (cbxActividadM.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmbM = (tmbM - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividadM.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividadM.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividadM.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivoM.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivoM.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtAreaM.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                }
            }

            double mc = Double.parseDouble(txtPesoM.getText()) / ((Double.parseDouble(txtEstaturaM.getText()) / 100) * (Double.parseDouble(txtEstaturaM.getText()) / 100));
            DecimalFormat df = new DecimalFormat("#.#");  // Muestra solo dos decimales
            String res = df.format(mc);

            String nombre = txtNombreM.getText();
            int edad = Integer.parseInt(txtEdadM.getText());
            int estatura = Integer.parseInt(txtEstaturaM.getText());
             int peso = Integer.parseInt(txtPesoM.getText());
            String sexo = cbxSexoM.getSelectedItem().toString();
            String actividad = cbxActividadM.getSelectedItem().toString();
            String objetivo = cbxObjetivoM.getSelectedItem().toString();
            String imc = res;

            control.modificarUsuario(usu, nombre, edad, estatura, peso, sexo, actividad, objetivo, calorias, imc);
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente!", "Editar", JOptionPane.INFORMATION_MESSAGE);
            Historial histo = new Historial();
            histo.setVisible(true);
            histo.setLocationRelativeTo(null);
            
            this.dispose();
        }
    }//GEN-LAST:event_btnCalcularModificarCaloriasActionPerformed

    private void txtEdadMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularModificarCalorias;
    private javax.swing.JButton btnLimpiarM;
    private javax.swing.JButton btnVolverM;
    private javax.swing.JComboBox<String> cbxActividadM;
    private javax.swing.JComboBox<String> cbxObjetivoM;
    private javax.swing.JComboBox<String> cbxSexoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaM;
    private javax.swing.JTextField txtEdadM;
    private javax.swing.JTextField txtEstaturaM;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPesoM;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosUsuario(int idUsu) {
        usu = control.traerUsuario(idUsu);
        txtNombreM.setText(usu.getNombre());
        txtEdadM.setText(String.valueOf(usu.getEdad()));
        txtPesoM.setText(String.valueOf(usu.getPeso()));
        txtEstaturaM.setText(String.valueOf(usu.getEstatura()));
        cbxSexoM.setSelectedItem(usu.getSexo());
        cbxActividadM.setSelectedItem(usu.getActividad());
        cbxObjetivoM.setSelectedItem(usu.getObjetivo());
        txtAreaM.setText(usu.getCalorias());
    }

   
}
