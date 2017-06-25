package Interfaz;

import Dominio.Sistema;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;


public class VentanaReanudarPartida extends JFrame {

    private final Sistema sistema;

    public VentanaReanudarPartida(Sistema modelo) {
        sistema = modelo;
        initComponents();
        contText.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        this.comboBoxPartidas.removeAllItems();
        Iterator it = this.sistema.getPartidasPausadas().getPartidasSuspendidas().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            this.comboBoxPartidas.addItem(pair.getKey().toString());          
            //it.remove(); // avoids a ConcurrentModificationException
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        buttonCargarPartida = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        comboBoxPartidas = new javax.swing.JComboBox<>();
        contText = new javax.swing.JScrollPane();
        textAreaInfoPartida = new javax.swing.JTextArea();

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
        buttonCargarPartida.setBounds(20, 220, 230, 40);

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
        buttonVolver.setBounds(280, 220, 130, 40);

        labelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Reanudar Partida");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(-50, 10, 550, 70);

        comboBoxPartidas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        comboBoxPartidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPartidasActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxPartidas);
        comboBoxPartidas.setBounds(50, 100, 360, 21);

        textAreaInfoPartida.setColumns(20);
        textAreaInfoPartida.setRows(5);
        contText.setViewportView(textAreaInfoPartida);

        jPanel1.add(contText);
        contText.setBounds(50, 160, 360, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(470, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarPartidaActionPerformed
        if (this.sistema.getListaJugadores().size() > 1) {
            VentanaJuegoNormal ventanaJuegoNormal = new VentanaJuegoNormal(sistema, 2);
            sistema.reanudarPartida(this.sistema.getPartidasPausadas().getPartidasSuspendidas().get(this.comboBoxPartidas.getSelectedIndex()), new Date().toString());
            final JDialog frame = new JDialog(ventanaJuegoNormal, "Esquinas", true);
            frame.getContentPane().add(ventanaJuegoNormal.getContentPane());
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay dos o mas jugadores registrados. ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCargarPartidaActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void comboBoxPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPartidasActionPerformed
        int itemAt = this.comboBoxPartidas.getSelectedIndex();
        Iterator it = this.sistema.getPartidasPausadas().getPartidasSuspendidas().entrySet().iterator();
        int care = 0;
        String fecha = "";
        while (it.hasNext() && care <= itemAt) {
            Map.Entry pair = (Map.Entry) it.next();
            fecha = pair.getKey().toString();
            care++;
            //it.remove(); // avoids a ConcurrentModificationException
        }
        if (!fecha.equals("")) {
            this.textAreaInfoPartida.setText(this.sistema.getPartidasPausadas().buscarPartida(fecha).getJugadorUno().getAlias() +" VS "+ this.sistema.getPartidasPausadas().buscarPartida(fecha).getJugadorDos().getAlias());
        }
    }//GEN-LAST:event_comboBoxPartidasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCargarPartida;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxPartidas;
    private javax.swing.JScrollPane contText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JTextArea textAreaInfoPartida;
    // End of variables declaration//GEN-END:variables

}
