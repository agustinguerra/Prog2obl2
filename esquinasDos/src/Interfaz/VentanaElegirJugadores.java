package Interfaz;

import Dominio.Sistema;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaElegirJugadores extends JFrame {

    //VARIABLE PRIVADA DE LA CLASE VENTANAELEGIRJGUADORES
    private final Sistema sistema;

    //CONSTRUCTOR DE LA CLASE VENTANAELEGIRJUGADORES
    public VentanaElegirJugadores(Sistema modelo) {
        sistema = modelo;
        initComponents();
        this.comboBoxUnoJugadores.removeAllItems();
        this.comboBoxDosJugadores.removeAllItems();
        this.textAreaInfoTimer.setEditable(false);
        for (int i = 0; i < this.sistema.getListaJugadores().size(); i++) {
            this.comboBoxUnoJugadores.addItem(this.sistema.getListaJugadores().get(i).getAlias());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonJugarEntreJugadores = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        comboBoxUnoJugadores = new javax.swing.JComboBox<>();
        comboBoxDosJugadores = new javax.swing.JComboBox<>();
        buttonJugarContraPC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timerComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaInfoTimer = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        buttonJugarEntreJugadores.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        buttonJugarEntreJugadores.setText("JUGAR");
        buttonJugarEntreJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarEntreJugadoresActionPerformed(evt);
            }
        });

        buttonVolver.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        buttonVolver.setText("VOLVER");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        comboBoxUnoJugadores.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        comboBoxUnoJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxUnoJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUnoJugadoresActionPerformed(evt);
            }
        });

        comboBoxDosJugadores.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        comboBoxDosJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDosJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDosJugadoresActionPerformed(evt);
            }
        });

        buttonJugarContraPC.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        buttonJugarContraPC.setText("JUGAR CONTRA PC");
        buttonJugarContraPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarContraPCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setText("Jugador UNO");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Jugador DOS");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("TIMER");

        timerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        timerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerComboBoxActionPerformed(evt);
            }
        });

        textAreaInfoTimer.setColumns(20);
        textAreaInfoTimer.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        textAreaInfoTimer.setRows(5);
        textAreaInfoTimer.setText("El timer indica cuanto tiempo tiene el jugador para realizar el \nmovimiento de su turno. Si elige \"1\" sera un minuto.\nModos de timer: 1 min, 2 min, 3 min, 4 min y 5 min.\nEl Primer movimiento tiene un tiempo limite de 5 minutos. Si no se \nrealiza dicho movimiento el jugador 1 pierde la partida!");
        jScrollPane1.setViewportView(textAreaInfoTimer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(buttonJugarContraPC))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(comboBoxUnoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(buttonJugarEntreJugadores)
                                    .addGap(32, 32, 32)
                                    .addComponent(buttonVolver))
                                .addComponent(comboBoxDosJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxUnoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDosJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonJugarEntreJugadores)
                    .addComponent(buttonVolver)
                    .addComponent(buttonJugarContraPC))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ESTE METODO GENERA EL CODIGO Y LA VENTANA PARA PODER JUGAR ENTRE JUGADORES
    private void buttonJugarEntreJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarEntreJugadoresActionPerformed
        if (this.sistema.getListaJugadores().size() > 1) {
            VentanaJuegoNormal ventanaJuegoNormal = new VentanaJuegoNormal(sistema, 1);
            sistema.crearPartidaNormal(this.sistema.getJugadorPorAlias(this.comboBoxUnoJugadores.getSelectedItem().toString()), this.sistema.getJugadorPorAlias(this.comboBoxDosJugadores.getSelectedItem().toString()), new Date().toString(), this.timerComboBox.getSelectedIndex() + 1);
            final JDialog frame = new JDialog(ventanaJuegoNormal, "Esquinas", true);
            frame.getContentPane().add(ventanaJuegoNormal.getContentPane());
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay dos o mas jugadores registrados. ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_buttonJugarEntreJugadoresActionPerformed

    //ESTE BOTON VUELVE HACIA ATRAS
    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    //ESTE METODO GENERA EL CODIGO Y LA VENTANA PARA PODER JUGAR CONTRA LA PC
    private void buttonJugarContraPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarContraPCActionPerformed
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "En este modo de juego solo jugara el jugador elegido en la casilla de Jugador 1. Desea Jugar? ", "CONFIRMAR", JOptionPane.OK_OPTION, JOptionPane.CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            //SI EL JUGADOR ELIGE OK PASA A EVALUAR SI HAY MAS DE UN JUGADOR
            if (this.sistema.getListaJugadores().size() > 0) {
                //ACA AGREGAMOS EL INICIO DE LA VENTANA DE PC IGUAL QUE EL DE JUGADOR
                VentanaJuegoPC ventanaJuegoPC = new VentanaJuegoPC(sistema);
                sistema.crearPartidaPC(this.sistema.getJugadorPorAlias(this.comboBoxUnoJugadores.getSelectedItem().toString()), new Date().toString(), this.timerComboBox.getSelectedIndex() + 1);
                final JDialog frame = new JDialog(ventanaJuegoPC, "Esquinas", true);
                frame.getContentPane().add(ventanaJuegoPC.getContentPane());
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            } else {
                //SINO AVISAMOS
                JOptionPane.showMessageDialog(this, "No hay jugadores registrados. ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        dispose();
    }//GEN-LAST:event_buttonJugarContraPCActionPerformed

    //ESTE METODO COMPRUEBA QUE NUNCA HAYA EL MISMO JUGADOR EN EL COMBO BOX 2 SI YA ESTA EN EL 1
    private void comboBoxUnoJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUnoJugadoresActionPerformed
        this.comboBoxDosJugadores.removeAllItems();
        for (int i = 0; i < this.sistema.getListaJugadores().size(); i++) {
            if (i != this.comboBoxUnoJugadores.getSelectedIndex()) {
                this.comboBoxDosJugadores.addItem(this.sistema.getListaJugadores().get(i).getAlias());
            }
        }
    }//GEN-LAST:event_comboBoxUnoJugadoresActionPerformed

    private void comboBoxDosJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDosJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDosJugadoresActionPerformed

    private void timerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timerComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJugarContraPC;
    private javax.swing.JButton buttonJugarEntreJugadores;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxDosJugadores;
    private javax.swing.JComboBox<String> comboBoxUnoJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaInfoTimer;
    private javax.swing.JComboBox<String> timerComboBox;
    // End of variables declaration//GEN-END:variables
}
