package Interfaz;

import Dominio.Sistema;
import Persistencia.ArchivoExcel;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaRanking extends javax.swing.JFrame {

    
    private final Sistema objSistema;

    public VentanaRanking(Sistema modelo) {
        objSistema = modelo;
        initComponents();
        this.nombreExcel.setText("");
    }   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPartidas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreExcel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        Refresh = new java.awt.Button();

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
        btnGenerar.setBounds(300, 340, 130, 40);

        listaPartidas.setBackground(new java.awt.Color(3, 5, 27));
        listaPartidas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaPartidas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 150, 450, 180);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Para generar un archivo Excel con el ranking de los jugadores, presione \"Generar\".");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 460, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText(" Para volver al menu principal, presione \"Volver\".");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 300, 30);
        jPanel1.add(nombreExcel);
        nombreExcel.setBounds(140, 350, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre del archivo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 354, 140, 20);

        btnVolver1.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnVolver1.setText("Volver");
        btnVolver1.setBorderPainted(false);
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver1);
        btnVolver1.setBounds(410, 340, 90, 40);

        Refresh.setLabel("Refrescar");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh);
        Refresh.setBounds(400, 120, 70, 24);

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
        if (this.nombreExcel.getText().equals("") == false) {
            ArchivoExcel archExcel = new ArchivoExcel();
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Selecciona la carpeta destino");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //
            // disable the "All files" option.
            //
            chooser.setAcceptAllFileFilterUsed(false);
            //    
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                String pathElegido = chooser.getCurrentDirectory().toString();
                String fileElegido = chooser.getSelectedFile().toString();             
                archExcel.crearExcel(objSistema, nombreExcel.getText(), fileElegido);
            } else {
                JOptionPane.showMessageDialog(this, "No se selecciono un destino correcto. ", "Ranking de Jugadores", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono el nombre del archivo a guardar.", "Ranking de Jugadores", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "El Archivo Excel (" + nombreExcel.getText() + ".xls) ha sido generado correctamente. ", "Ranking de Jugadores", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        actualizar();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Refresh;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaPartidas;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JTextField nombreExcel;
    // End of variables declaration//GEN-END:variables

    public void actualizar() {
        Collections.sort(objSistema.getListaJugadores());
        listaPartidas.setListData(objSistema.getListaJugadores().toArray());
    } 
}
