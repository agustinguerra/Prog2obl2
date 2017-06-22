package Interfaz;

import Dominio.Sistema;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaElegirJugadores extends JFrame {

    private final Sistema sistema;
    
    public VentanaElegirJugadores(Sistema modelo) {
        sistema = modelo;
        this.setTitle("Esquinas");
        initComponents();
        this.comboBoxUnoJugadores.removeAllItems();
        this.comboBoxDosJugadores.removeAllItems();
        for (int i=0;i<this.sistema.getListaJugadores().size();i++){
            this.comboBoxUnoJugadores.addItem(this.sistema.getListaJugadores().get(i).getAlias());
        }
        System.out.println(this.comboBoxUnoJugadores.getSelectedIndex());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        buttonJugarEntreJugadores.setText("JUGAR");
        buttonJugarEntreJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarEntreJugadoresActionPerformed(evt);
            }
        });

        buttonVolver.setText("VOLVER");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        comboBoxUnoJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxUnoJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUnoJugadoresActionPerformed(evt);
            }
        });

        comboBoxDosJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDosJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDosJugadoresActionPerformed(evt);
            }
        });

        buttonJugarContraPC.setText("JUGAR CONTRA PC");
        buttonJugarContraPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugarContraPCActionPerformed(evt);
            }
        });

        jLabel1.setText("Jugador UNO");

        jLabel2.setText("Jugador DOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonJugarContraPC)
                    .addComponent(comboBoxUnoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxDosJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonJugarEntreJugadores)
                        .addGap(32, 32, 32)
                        .addComponent(buttonVolver)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxUnoJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDosJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
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

    private void buttonJugarEntreJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarEntreJugadoresActionPerformed
        if (this.sistema.getListaJugadores().size() > 1) {
            VentanaJuego ventanaJuego = new VentanaJuego(sistema);
            //ESTO ES TEMP           
            sistema.crearPartida(this.sistema.getJugadorPorAlias(this.comboBoxUnoJugadores.getSelectedItem().toString()), this.sistema.getJugadorPorAlias(this.comboBoxDosJugadores.getSelectedItem().toString()),new Date().toString());
            final JDialog frame = new JDialog(ventanaJuego, "Esquinas", true);
            frame.getContentPane().add(ventanaJuego.getContentPane());
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay dos o mas jugadores registrados. ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttonJugarEntreJugadoresActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void buttonJugarContraPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugarContraPCActionPerformed
        
    }//GEN-LAST:event_buttonJugarContraPCActionPerformed

    private void comboBoxUnoJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUnoJugadoresActionPerformed
        this.comboBoxDosJugadores.removeAllItems();
        for (int i=0;i<this.sistema.getListaJugadores().size();i++){
            if (i!=this.comboBoxUnoJugadores.getSelectedIndex()){
            this.comboBoxDosJugadores.addItem(this.sistema.getListaJugadores().get(i).getAlias());
            }
        }
    }//GEN-LAST:event_comboBoxUnoJugadoresActionPerformed

    private void comboBoxDosJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDosJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDosJugadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJugarContraPC;
    private javax.swing.JButton buttonJugarEntreJugadores;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxDosJugadores;
    private javax.swing.JComboBox<String> comboBoxUnoJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

