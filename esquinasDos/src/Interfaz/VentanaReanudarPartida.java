package Interfaz;

import Dominio.Sistema;
import javax.swing.JFrame;

public class VentanaReanudarPartida extends JFrame {

    private final Sistema sistema;

    public VentanaReanudarPartida(Sistema modelo) {
        sistema = modelo;
        initComponents();
    }   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        buttonCargarPartida = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        javax.swing.GroupLayout noHayNombreLayout = new javax.swing.GroupLayout(noHayNombre.getContentPane());
        noHayNombre.getContentPane().setLayout(noHayNombreLayout);
        noHayNombreLayout.setHorizontalGroup(
            noHayNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        noHayNombreLayout.setVerticalGroup(
            noHayNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 206, 128));
        jPanel1.setLayout(null);

        buttonCargarPartida.setBackground(new java.awt.Color(0, 0, 0));
        buttonCargarPartida.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonCargarPartida.setText("Cargar Partida");
        buttonCargarPartida.setBorderPainted(false);
        buttonCargarPartida.setContentAreaFilled(false);
        buttonCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCargarPartida);
        buttonCargarPartida.setBounds(160, 340, 230, 40);

        buttonVolver.setBackground(new java.awt.Color(0, 0, 0));
        buttonVolver.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonVolver.setText("Volver");
        buttonVolver.setBorderPainted(false);
        buttonVolver.setContentAreaFilled(false);
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVolver);
        buttonVolver.setBounds(370, 340, 130, 40);

        labelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Reanudar Partida");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(-30, 10, 550, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(519, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarPartidaActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCargarPartidaActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCargarPartida;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JDialog noHayNombre;
    // End of variables declaration//GEN-END:variables

}
