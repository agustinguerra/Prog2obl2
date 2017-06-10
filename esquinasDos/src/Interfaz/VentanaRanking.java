package Interfaz;

import Dominio.Sistema;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

public class VentanaRanking extends javax.swing.JFrame implements Observer {

    
    private final Sistema objSistema;

    public VentanaRanking(Sistema modelo) {
        objSistema = modelo;
        initComponents();
        objSistema.addObserver(this);
        actualizar();
    }   
        
    @Override
    public void update(Observable o, Object arg) {
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPartidas = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RANKING");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 0, 220, 70);

        btnGenerar.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerar.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar);
        btnGenerar.setBounds(380, 200, 140, 40);

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);
        btnVolver.setBounds(400, 290, 100, 40);

        jTextField1.setText("Para Generar un archivo Excel con el ranking de los jugadores presione \"Generar\". ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 70, 480, 40);

        jTextField2.setText("Para volver al menu principal, presione \"Volver\".");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(10, 110, 480, 40);

        listaPartidas.setBackground(new java.awt.Color(3, 5, 27));
        listaPartidas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaPartidas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 180, 380, 190);

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

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        //ACA CUANDO SE APRETA EL BOTON GENERAR, GENERAR EXCEL
        dispose();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList listaPartidas;
    // End of variables declaration//GEN-END:variables

    public void actualizar() {
        Collections.sort(objSistema.getListaJugadores());
        listaPartidas.setListData(objSistema.getListaJugadores().toArray());
    } 
}
