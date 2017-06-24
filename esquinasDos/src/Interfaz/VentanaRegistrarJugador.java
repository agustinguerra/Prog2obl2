package Interfaz;

import Dominio.Jugador;
import Dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class VentanaRegistrarJugador extends JFrame {

    private final Sistema sistema;

    public VentanaRegistrarJugador(Sistema modelo) {
        sistema = modelo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelSubTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelAlias = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldAlias = new javax.swing.JTextField();
        comboBoxEdad = new javax.swing.JComboBox<>();
        buttonRegistrar = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        labelErrorNombre = new javax.swing.JLabel();
        labelInfoEdad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 163, 154));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 33)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("REGISTRO ");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(6, 6, 440, 54);

        labelSubTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        labelSubTitulo.setForeground(new java.awt.Color(0, 51, 51));
        labelSubTitulo.setText("Ingrese los datos:");
        jPanel1.add(labelSubTitulo);
        labelSubTitulo.setBounds(18, 78, 188, 33);

        labelNombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        labelNombre.setText("Nombre:");
        jPanel1.add(labelNombre);
        labelNombre.setBounds(19, 138, 70, 19);

        labelAlias.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        labelAlias.setText("Alias:");
        jPanel1.add(labelAlias);
        labelAlias.setBounds(20, 190, 50, 19);

        labelEdad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        labelEdad.setText("Edad:");
        jPanel1.add(labelEdad);
        labelEdad.setBounds(20, 260, 37, 19);

        textFieldNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textFieldNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        textFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNombreMouseClicked(evt);
            }
        });
        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });
        textFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreKeyTyped(evt);
            }
        });
        jPanel1.add(textFieldNombre);
        textFieldNombre.setBounds(100, 140, 156, 20);

        textFieldAlias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldAliasMouseClicked(evt);
            }
        });
        textFieldAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAliasActionPerformed(evt);
            }
        });
        textFieldAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldAliasKeyTyped(evt);
            }
        });
        jPanel1.add(textFieldAlias);
        textFieldAlias.setBounds(100, 190, 156, 20);

        comboBoxEdad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        comboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edad", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));
        comboBoxEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEdadActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxEdad);
        comboBoxEdad.setBounds(100, 260, 90, 21);

        buttonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        buttonRegistrar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.setBorder(null);
        buttonRegistrar.setContentAreaFilled(false);
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegistrar);
        buttonRegistrar.setBounds(227, 333, 111, 57);

        buttonVolver.setBackground(new java.awt.Color(51, 51, 51));
        buttonVolver.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonVolver.setText("Volver");
        buttonVolver.setBorder(null);
        buttonVolver.setBorderPainted(false);
        buttonVolver.setContentAreaFilled(false);
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVolver);
        buttonVolver.setBounds(344, 331, 128, 61);

        labelErrorNombre.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jPanel1.add(labelErrorNombre);
        labelErrorNombre.setBounds(281, 134, 185, 28);

        labelInfoEdad.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        labelInfoEdad.setText("Esquinas esta pensado para personas de 12 años o mas.");
        jPanel1.add(labelInfoEdad);
        labelInfoEdad.setBounds(30, 230, 380, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(477, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAliasActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void textFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreKeyTyped
        if ('0' <= evt.getKeyChar() && evt.getKeyChar() <= '9') {
            labelErrorNombre.setText("INGRESE SOLAMENTE LETRAS");
            evt.consume();
        } else {
            labelErrorNombre.setText("");
        }
        if (evt.getKeyChar() == 10) {
            registrarJugador();
        }
    }//GEN-LAST:event_textFieldNombreKeyTyped

    private void textFieldAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAliasKeyTyped
        if (evt.getKeyChar() == 10) {
        }
    }//GEN-LAST:event_textFieldAliasKeyTyped

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        registrarJugador();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void textFieldAliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldAliasMouseClicked
        labelErrorNombre.setText("");
    }//GEN-LAST:event_textFieldAliasMouseClicked

    private void textFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNombreMouseClicked
        labelErrorNombre.setText("");
    }//GEN-LAST:event_textFieldNombreMouseClicked

    private void comboBoxEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEdadActionPerformed

    }//GEN-LAST:event_comboBoxEdadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxEdad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAlias;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelErrorNombre;
    private javax.swing.JLabel labelInfoEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldAlias;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables

    public boolean verificarCampoVacio(String texto, String nombreCampo) {
        boolean estaVacio = false;
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, nombreCampo + " no puede estar vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
            estaVacio = true;
        }
        return estaVacio;
    }

    public boolean verificarRegistro() {
        boolean registroOk = false;
        boolean nombreOk = true;
        boolean aliasOk = true;
        if (!verificarCampoVacio(textFieldNombre.getText(), "Nombre")
                && !verificarCampoVacio(textFieldAlias.getText(), "Alias")) {
            if (nombreOk) {
                for (int i = 0; i < sistema.getListaJugadores().size(); i++) {
                    if (textFieldAlias.getText().equals(sistema.getListaJugadores().get(i).getAlias())) {
                        JOptionPane.showMessageDialog(this, "Ya hay un jugador con ese alias", "ERROR", JOptionPane.ERROR_MESSAGE);
                        aliasOk = false;
                    }
                }
            }
            if (aliasOk) {
                if (comboBoxEdad.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Debes seleccionar una edad", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else {
                    registroOk = true;
                }
            }
        }
        return registroOk;
    }

    public void registrarJugador() {
        if (verificarRegistro()) {
            String nombre = textFieldNombre.getText();
            int edad = comboBoxEdad.getSelectedIndex();
            String alias = textFieldAlias.getText();
            Jugador nuevoJugador = new Jugador();
            nuevoJugador.setNombre(nombre);
            nuevoJugador.setAlias(alias);
            nuevoJugador.setEdad(edad);
            sistema.getListaJugadores().add(nuevoJugador);
            JOptionPane.showMessageDialog(this, "Jugador registrado exitosamente", "Registro de jugador", JOptionPane.PLAIN_MESSAGE);
            textFieldNombre.setText("");
            textFieldAlias.setText("");
            comboBoxEdad.setSelectedIndex(0);

        }
    }
}
