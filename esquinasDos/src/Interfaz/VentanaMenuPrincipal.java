package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDialog;

public class VentanaMenuPrincipal extends JFrame {

    //VARIABLE PRIVADA DE LA CLASE VENTANAMENUPRINCIPAL
    private final Sistema sistema;

    //CONSTRUCTOR DE LA CLASE VETANAMENUPRINCIPAL
    public VentanaMenuPrincipal(Sistema modelo) {
        sistema = modelo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonRegistrarJugador = new javax.swing.JButton();
        buttonBotonJugar = new javax.swing.JButton();
        buttonRanking = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        buttonCargarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(101, 136, 194));
        jPanel1.setLayout(null);

        buttonRegistrarJugador.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonRegistrarJugador.setText("Registrar Jugador");
        buttonRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegistrarJugador);
        buttonRegistrarJugador.setBounds(20, 220, 200, 50);

        buttonBotonJugar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonBotonJugar.setText("Jugar");
        buttonBotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBotonJugarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBotonJugar);
        buttonBotonJugar.setBounds(20, 110, 200, 90);

        buttonRanking.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonRanking.setText("Ranking");
        buttonRanking.setPreferredSize(new java.awt.Dimension(179, 33));
        buttonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRankingActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRanking);
        buttonRanking.setBounds(250, 220, 200, 50);

        buttonSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalir);
        buttonSalir.setBounds(170, 300, 140, 40);

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ESQUINAS");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 10, 370, 101);

        buttonCargarPartida.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonCargarPartida.setText("Reanudar Partida");
        buttonCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCargarPartida);
        buttonCargarPartida.setBounds(250, 110, 200, 90);

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

    //ESTE BOTON SAOLE DEL PROGRAMA Y SERIALIZA DATOS
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "AVISO", JOptionPane.OK_OPTION, JOptionPane.CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            Serializador serializer = new Serializador();
            serializer.serializeSistema(this.sistema);
            dispose();
        }
    }//GEN-LAST:event_buttonSalirActionPerformed

    //ESTE BOTON ABRE LA VENTANA PARA REGISTRAR JUGADORES
    private void buttonRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarJugadorActionPerformed
        VentanaRegistrarJugador registroJugador = new VentanaRegistrarJugador(sistema);
        final JDialog frame = new JDialog(registroJugador, "Esquinas", true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(registroJugador.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_buttonRegistrarJugadorActionPerformed

    //ESTE BOTON ABRE LA VENTANA DE ELEGIR JUGADORES PARA PODER SELECCIONAR CONFIGURACIONES Y MODOS DE JUEGOS
    private void buttonBotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBotonJugarActionPerformed
        if (sistema.getListaJugadores().size() > 0) {
            VentanaElegirJugadores elegirJugadores = new VentanaElegirJugadores(sistema);
            final JDialog frame = new JDialog(elegirJugadores, "Esquinas", true);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(elegirJugadores.getContentPane());
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay jugadores registrados. ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonBotonJugarActionPerformed

    //ESTE BOTON ABRE LA VENTANA DEL RANKING
    private void buttonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRankingActionPerformed
        VentanaRanking ranking = new VentanaRanking(sistema);
        final JDialog frame = new JDialog(ranking, "Esquinas", true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(ranking.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_buttonRankingActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    //ESTE BOTON ABRE LA VENTANA DE CARGAR PARTIDA
    private void buttonCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarPartidaActionPerformed
        VentanaReanudarPartida cargarPartida = new VentanaReanudarPartida(sistema);
        final JDialog frame = new JDialog(cargarPartida, "Esquinas", true);
        frame.getContentPane().add(cargarPartida.getContentPane());
        frame.setLocationRelativeTo(null);
        frame.pack();
        //frame.setSize(frame.getPreferredSize().width * 34, frame.getPreferredSize().height * 12);
        frame.setVisible(true);
    }//GEN-LAST:event_buttonCargarPartidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBotonJugar;
    private javax.swing.JButton buttonCargarPartida;
    private javax.swing.JButton buttonRanking;
    private javax.swing.JButton buttonRegistrarJugador;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
