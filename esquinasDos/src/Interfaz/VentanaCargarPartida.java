package Interfaz;

import Dominio.Sistema;

public class VentanaCargarPartida extends javax.swing.JFrame {

    private final Sistema sistema;
   
    public VentanaCargarPartida(Sistema modelo) {
        sistema = modelo;
        initComponents();     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnCargarPartida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(580, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(580, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 450));
        jPanel1.setLayout(null);

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cargar Partida");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(10, 0, 550, 70);

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
        btnVolver.setBounds(440, 370, 130, 40);

        btnCargarPartida.setBackground(new java.awt.Color(0, 0, 0));
        btnCargarPartida.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnCargarPartida.setText("Cargar Partida");
        btnCargarPartida.setBorderPainted(false);
        btnCargarPartida.setContentAreaFilled(false);
        btnCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarPartida);
        btnCargarPartida.setBounds(220, 370, 230, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("dddddddddddddddddddddddddddddddddddd\ndddddddddddddddddddddddddddddddddddd\ndddddddddddd\ndddddddddddd\ndddddddddddddddddddddddddddddddddddddddddddddddd\n\ndddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd\n\n\n\ndddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd\n\ndddddddddddddddddddddddddddddddddddddddddddddddd");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 70, 490, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 440);

        setSize(new java.awt.Dimension(588, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPartidaActionPerformed
       dispose();
    }//GEN-LAST:event_btnCargarPartidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarPartida;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
