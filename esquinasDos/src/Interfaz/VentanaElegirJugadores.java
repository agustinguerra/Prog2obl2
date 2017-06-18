package Interfaz;

import Dominio.Sistema;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class VentanaElegirJugadores extends JFrame {

    private final Sistema sistema;
    
    public VentanaElegirJugadores(Sistema modelo) {
        sistema = modelo;
        this.setTitle("Esquinas");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonJugarEntreJugadores = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(buttonJugarEntreJugadores)
                .addGap(18, 18, 18)
                .addComponent(buttonVolver)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonJugarEntreJugadores)
                    .addComponent(buttonVolver))
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
        VentanaJuego ventanaJuego = new VentanaJuego(sistema);
        
        //ESTO ES TEMP
        sistema.crearPartida(0,1);
        
        
        final JDialog frame = new JDialog(ventanaJuego, "Esquinas", true);
        frame.getContentPane().add(ventanaJuego.getContentPane());
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_buttonJugarEntreJugadoresActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJugarEntreJugadores;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

