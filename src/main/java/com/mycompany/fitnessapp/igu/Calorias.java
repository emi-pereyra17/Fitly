package com.mycompany.fitnessapp.igu;

import com.mycompany.fitnessapp.logica.Controladora;
import com.mycompany.fitnessapp.logica.Usuario;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Calorias extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public Calorias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        cbxActividad = new javax.swing.JComboBox<>();
        cbxSexo = new javax.swing.JComboBox<>();
        btnCalcularCalorias = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxObjetivo = new javax.swing.JComboBox<>();
        btnCalcularGuardarCalorias = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setText("Edad:");

        jLabel2.setText("Peso (Kg):");

        jLabel3.setText("Estatura (Cm):");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Actividad:");

        cbxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poco o nada de ejercicio", "Poco ejercicio (1 a 3 dias por semana)", "Promedio (3 a 5 dias por semana)", "Mucho ejercicio (6 a 7 dias por semana)" }));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        btnCalcularCalorias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalcularCalorias.setText("Solo calcular");
        btnCalcularCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCaloriasActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel6.setText("Objetivo:");

        cbxObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantener peso", "Bajar de peso", "Aumentar masa muscular" }));

        btnCalcularGuardarCalorias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalcularGuardarCalorias.setText("Calcular y guardar");
        btnCalcularGuardarCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularGuardarCaloriasActionPerformed(evt);
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
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxActividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxObjetivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCalcularCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcularGuardarCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnVolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnCalcularGuardarCalorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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


    private void btnCalcularCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCaloriasActionPerformed
        if (txtEdad.getText().equals("") || txtPeso.getText().equals("") || txtEstatura.getText().equals("")) {
            mostrarMensaje("Debe rellenar todos los campos", "Error", "Advertencia");
        } else {
            double tmb = 88.362 + (13.397 * Integer.parseInt(txtPeso.getText())) + (4.799 * Integer.parseInt(txtEstatura.getText()) - (5.677 * Integer.parseInt(txtEdad.getText())));
            double tmbM = 447.593 + (9.247 * Integer.parseInt(txtPeso.getText())) + (3.098 * Integer.parseInt(txtEstatura.getText()) - (4.330 * Integer.parseInt(txtEdad.getText())));
            String Calorias = "Calorias";

            if (cbxSexo.getSelectedItem().equals("Hombre")) {
                if (cbxActividad.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmb = (tmb - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }

                } else if (cbxActividad.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmb = (tmb - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                } else if (cbxActividad.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmb = (tmb - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                } else if (cbxActividad.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmb = (tmb - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    String resultado = df.format(tmb);
                    txtArea.setText(resultado + " " + Calorias);
                }
            } else {
                if (cbxActividad.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmbM = (tmbM - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                } else if (cbxActividad.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                } else if (cbxActividad.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                } else if (cbxActividad.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnCalcularCaloriasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtEstatura.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalcularGuardarCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularGuardarCaloriasActionPerformed
        List<Usuario> listaUsu = control.traerUsuarios();
        boolean enList = false;
        String calorias = "";
        if (listaUsu.isEmpty()) {
            enList = false;
        } else {
            for (Usuario usu : listaUsu) {
                if (usu.getNombre().equals(txtNombre.getText())) {
                    enList = true;
                }
            }
        }
        if (txtEdad.getText().equals("") || txtPeso.getText().equals("") || txtEstatura.getText().equals("") || txtNombre.getText().equals("")) {
            mostrarMensaje("Debe rellenar todos los campos", "Error", "Advertencia");
        } else if (enList == true) {
            mostrarMensaje("Ese nombre de usuario ya esta registrado", "Error", "Advertencia");
        } else {
            double tmb = 88.362 + (13.397 * Integer.parseInt(txtPeso.getText())) + (4.799 * Integer.parseInt(txtEstatura.getText()) - (5.677 * Integer.parseInt(txtEdad.getText())));
            double tmbM = 447.593 + (9.247 * Integer.parseInt(txtPeso.getText())) + (3.098 * Integer.parseInt(txtEstatura.getText()) - (4.330 * Integer.parseInt(txtEdad.getText())));
            String Calorias = "Calorias";
            Usuario usu = new Usuario();

            if (cbxSexo.getSelectedItem().equals("Hombre")) {
                if (cbxActividad.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmb = (tmb - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }

                } else if (cbxActividad.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmb = (tmb - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividad.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmb = (tmb - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividad.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmb = (tmb - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    String resultado = df.format(tmb);
                    txtArea.setText(resultado + " " + Calorias);
                    calorias = resultado;
                }
            } else {
                if (cbxActividad.getSelectedItem().equals("Poco o nada de ejercicio")) {
                    tmbM = (tmbM - 100) * 1.2;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividad.getSelectedItem().equals("Poco ejercicio (1 a 3 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.375;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividad.getSelectedItem().equals("Promedio (3 a 5 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.55;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                } else if (cbxActividad.getSelectedItem().equals("Mucho ejercicio (6 a 7 dias por semana)")) {
                    tmbM = (tmbM - 100) * 1.725;
                    DecimalFormat df = new DecimalFormat("#");  // Muestra solo dos decimales
                    if (cbxObjetivo.getSelectedItem().equals("Bajar de peso")) {
                        tmb = tmb * 0.80;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else if (cbxObjetivo.getSelectedItem().equals("Aumentar masa muscular")) {
                        tmb = tmb * 1.15;
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    } else {
                        String resultado = df.format(tmb);
                        txtArea.setText(resultado + " " + Calorias);
                        calorias = resultado;
                    }
                }
            }

            double mc = Double.parseDouble(txtPeso.getText()) / ((Double.parseDouble(txtEstatura.getText()) / 100) * (Double.parseDouble(txtEstatura.getText()) / 100));
            DecimalFormat df = new DecimalFormat("#.#");  // Muestra solo dos decimales
            String res = df.format(mc);

            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            int estatura = Integer.parseInt(txtEstatura.getText());
            int peso = Integer.parseInt(txtPeso.getText());
            String sexo = cbxSexo.getSelectedItem().toString();
            String actividad = cbxActividad.getSelectedItem().toString();
            String objetivo = cbxObjetivo.getSelectedItem().toString();
            String imc = res;

            control.agregarUsuario(usu, nombre, edad, estatura, peso, sexo, actividad, objetivo, calorias, imc);
            JOptionPane.showMessageDialog(null, "Usuario guardado en el historial correctamente!", "Guardado", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnCalcularGuardarCaloriasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCalorias;
    private javax.swing.JButton btnCalcularGuardarCalorias;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JComboBox<String> cbxActividad;
    private javax.swing.JComboBox<String> cbxObjetivo;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
