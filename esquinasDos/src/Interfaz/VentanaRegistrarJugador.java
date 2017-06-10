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
        txtTitulo = new javax.swing.JLabel();
        txtTitulo2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtAlias = new javax.swing.JLabel();
        txtEdad = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldAlias = new javax.swing.JTextField();
        comboBoxEdad = new javax.swing.JComboBox<>();
        BotonRegistrar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        txtErrorNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setLayout(null);

        txtTitulo.setFont(new java.awt.Font("Showcard Gothic", 1, 33)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("REGISTRO DE JUGADOR");
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(6, 6, 460, 54);

        txtTitulo2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtTitulo2.setForeground(new java.awt.Color(0, 51, 51));
        txtTitulo2.setText("Ingrese los datos:");
        jPanel1.add(txtTitulo2);
        txtTitulo2.setBounds(18, 78, 205, 32);

        txtNombre.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtNombre.setText("Nombre:");
        jPanel1.add(txtNombre);
        txtNombre.setBounds(30, 138, 59, 19);

        txtAlias.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtAlias.setText("Alias:");
        jPanel1.add(txtAlias);
        txtAlias.setBounds(30, 195, 37, 19);

        txtEdad.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtEdad.setText("Edad:");
        jPanel1.add(txtEdad);
        txtEdad.setBounds(30, 260, 39, 19);

        TextFieldNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TextFieldNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldNombreMouseClicked(evt);
            }
        });
        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        TextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TextFieldNombre);
        TextFieldNombre.setBounds(107, 134, 156, 20);

        TextFieldAlias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldAliasMouseClicked(evt);
            }
        });
        TextFieldAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAliasActionPerformed(evt);
            }
        });
        TextFieldAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldAliasKeyTyped(evt);
            }
        });
        jPanel1.add(TextFieldAlias);
        TextFieldAlias.setBounds(107, 195, 156, 20);

        comboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edad", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", " " }));
        comboBoxEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEdadActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxEdad);
        comboBoxEdad.setBounds(110, 260, 90, 20);

        BotonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        BotonRegistrar.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.setContentAreaFilled(false);
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrar);
        BotonRegistrar.setBounds(227, 333, 111, 57);

        BotonVolver.setBackground(new java.awt.Color(51, 51, 51));
        BotonVolver.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.setBorder(null);
        BotonVolver.setBorderPainted(false);
        BotonVolver.setContentAreaFilled(false);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver);
        BotonVolver.setBounds(344, 331, 128, 61);

        txtErrorNombre.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jPanel1.add(txtErrorNombre);
        txtErrorNombre.setBounds(281, 134, 185, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Esquinas esta pensado para personas de 12 años o mas.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 230, 380, 30);

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

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void TextFieldAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAliasActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void TextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNombreKeyTyped
        if ('0' <= evt.getKeyChar() && evt.getKeyChar() <= '9') {
            txtErrorNombre.setText("INGRESE SOLAMENTE LETRAS");
            evt.consume();
        } else {
            txtErrorNombre.setText("");
        }
        if (evt.getKeyChar() == 10) {
            registrarJugador();
        }
    }//GEN-LAST:event_TextFieldNombreKeyTyped

    private void TextFieldAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldAliasKeyTyped
        if (evt.getKeyChar() == 10) {
        }
    }//GEN-LAST:event_TextFieldAliasKeyTyped

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        registrarJugador();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void TextFieldAliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldAliasMouseClicked
        txtErrorNombre.setText("");
    }//GEN-LAST:event_TextFieldAliasMouseClicked

    private void TextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNombreMouseClicked
        txtErrorNombre.setText("");
    }//GEN-LAST:event_TextFieldNombreMouseClicked

    private void comboBoxEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEdadActionPerformed

    }//GEN-LAST:event_comboBoxEdadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField TextFieldAlias;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JComboBox<String> comboBoxEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAlias;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtErrorNombre;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo2;
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
        if (!verificarCampoVacio(TextFieldNombre.getText(), "Nombre")
                && !verificarCampoVacio(TextFieldAlias.getText(), "Alias")) {
            if (nombreOk) {
                for (int i = 0; i < sistema.getListaJugadores().size(); i++) {
                    if (TextFieldAlias.getText().equals(sistema.getListaJugadores().get(i).getAlias())) {
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
            String nombre = TextFieldNombre.getText();
            int edad = comboBoxEdad.getSelectedIndex();
            String alias = TextFieldAlias.getText();
            Jugador nuevoJugador = new Jugador();
            nuevoJugador.setNombre(nombre);
            nuevoJugador.setAlias(alias);
            nuevoJugador.setEdad(edad);
            sistema.getListaJugadores().add(nuevoJugador);
            JOptionPane.showMessageDialog(this, "Jugador registrado exitosamente", "Registro de jugador", JOptionPane.PLAIN_MESSAGE);
            TextFieldNombre.setText("");
            TextFieldAlias.setText("");
            comboBoxEdad.setSelectedIndex(0);

        }
    }
}
