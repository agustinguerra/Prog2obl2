package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaMenuPrincipal extends javax.swing.JFrame {

    private final Sistema objSistema;

    public VentanaMenuPrincipal(Sistema modelo) {
        objSistema = modelo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegistrarJugador = new javax.swing.JButton();
        BotonJugar = new javax.swing.JButton();
        BotonRanking = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        btnCargaJugadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        BotonRegistrarJugador.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BotonRegistrarJugador.setText("Registrar Jugador");
        BotonRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrarJugador);
        BotonRegistrarJugador.setBounds(20, 210, 210, 40);

        BotonJugar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BotonJugar.setText("Jugar");
        BotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonJugar);
        BotonJugar.setBounds(130, 130, 210, 41);

        BotonRanking.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BotonRanking.setText("Ranking");
        BotonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRankingActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRanking);
        BotonRanking.setBounds(250, 210, 210, 41);

        BotonSalir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir);
        BotonSalir.setBounds(250, 280, 210, 40);

        txtTitulo.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("ESQUINAS");
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(100, 10, 280, 101);

        btnCargaJugadores.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCargaJugadores.setText("Cargar Partida");
        btnCargaJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaJugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargaJugadores);
        btnCargaJugadores.setBounds(20, 280, 210, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(490, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "AVISO", JOptionPane.OK_OPTION, JOptionPane.CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            //AGREGAR METODO GUARDAR ACA LUEGO DE QUE AGUS LO TERMINE, Y CREAR METODO GUARDAR
            dispose();
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarJugadorActionPerformed
        VentanaRegistrarJugador vJugador = new VentanaRegistrarJugador(objSistema);
        vJugador.setVisible(true);
    }//GEN-LAST:event_BotonRegistrarJugadorActionPerformed

    private void BotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarActionPerformed
        //AGREGAR AQUI VENTANA JUGAR
    }//GEN-LAST:event_BotonJugarActionPerformed

    private void BotonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRankingActionPerformed
        VentanaRanking ranking = new VentanaRanking(objSistema);
        ranking.setVisible(true);
    }//GEN-LAST:event_BotonRankingActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnCargaJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaJugadoresActionPerformed
        VentanaCargarPartida cargarPartida = new VentanaCargarPartida(objSistema);
        cargarPartida.setVisible(true);
    }//GEN-LAST:event_btnCargaJugadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugar;
    private javax.swing.JButton BotonRanking;
    private javax.swing.JButton BotonRegistrarJugador;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton btnCargaJugadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
