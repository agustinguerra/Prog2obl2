package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDialog;

public class VentanaMenuPrincipal extends JFrame {

    private final Sistema sistema;

    public VentanaMenuPrincipal(Sistema modelo) {
        sistema = modelo;
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
        BotonCargarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(101, 136, 194));
        jPanel1.setLayout(null);

        BotonRegistrarJugador.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BotonRegistrarJugador.setText("Registrar Jugador");
        BotonRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrarJugador);
        BotonRegistrarJugador.setBounds(20, 210, 210, 40);

        BotonJugar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BotonJugar.setText("Jugar");
        BotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonJugar);
        BotonJugar.setBounds(130, 130, 210, 41);

        BotonRanking.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BotonRanking.setText("Ranking");
        BotonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRankingActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRanking);
        BotonRanking.setBounds(250, 210, 210, 41);

        BotonSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir);
        BotonSalir.setBounds(250, 280, 210, 40);

        txtTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("ESQUINAS");
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(60, 10, 370, 101);

        BotonCargarPartida.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BotonCargarPartida.setText("Cargar Partida");
        BotonCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCargarPartida);
        BotonCargarPartida.setBounds(20, 280, 210, 40);

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
        VentanaRegistrarJugador registroJugador = new VentanaRegistrarJugador(sistema);       
        final JDialog frame = new JDialog(registroJugador, "Esquinas", true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(registroJugador.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_BotonRegistrarJugadorActionPerformed

    private void BotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarActionPerformed
        VentanaJuego ventanaJuego = new VentanaJuego(sistema);
        final JDialog frame = new JDialog(ventanaJuego, "Esquinas", true);
        frame.getContentPane().add(ventanaJuego.getContentPane());
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_BotonJugarActionPerformed

    private void BotonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRankingActionPerformed
        VentanaRanking ranking = new VentanaRanking(sistema);
        final JDialog frame = new JDialog(ranking, "Esquinas", true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(ranking.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_BotonRankingActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void BotonCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarPartidaActionPerformed
        VentanaCargarPartida cargarPartida = new VentanaCargarPartida(sistema);
        final JDialog frame = new JDialog(cargarPartida, "Esquinas", true);
        frame.getContentPane().add(cargarPartida.getContentPane());
        frame.setLocationRelativeTo(null);
        frame.pack();
        //frame.setSize(frame.getPreferredSize().width * 34, frame.getPreferredSize().height * 12);
        frame.setVisible(true);
    }//GEN-LAST:event_BotonCargarPartidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargarPartida;
    private javax.swing.JButton BotonJugar;
    private javax.swing.JButton BotonRanking;
    private javax.swing.JButton BotonRegistrarJugador;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
