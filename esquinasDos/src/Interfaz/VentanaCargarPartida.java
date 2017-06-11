package Interfaz;

import Dominio.Sistema;
import javax.swing.JFrame;

public class VentanaCargarPartida extends JFrame {

    private final Sistema sistema;

    public VentanaCargarPartida(Sistema modelo) {
        sistema = modelo;
        initComponents();
    }   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btnCargarPartida = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

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

        btnCargarPartida.setBackground(new java.awt.Color(0, 0, 0));
        btnCargarPartida.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnCargarPartida.setText("Cargar Partida");
        btnCargarPartida.setBorderPainted(false);
        btnCargarPartida.setContentAreaFilled(false);
        btnCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarPartida);
        btnCargarPartida.setBounds(160, 340, 230, 40);

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);
        btnVolver.setBounds(370, 340, 130, 40);

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cargar Partida");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(-30, 10, 550, 70);

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

    private void btnCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPartidaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCargarPartidaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarPartida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDialog noHayNombre;
    // End of variables declaration//GEN-END:variables

}
