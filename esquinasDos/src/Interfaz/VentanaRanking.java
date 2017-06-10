package Interfaz;

import Dominio.Sistema;
import Persistencia.ArchivoExcel;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaRanking extends javax.swing.JFrame implements Observer {

    
    private final Sistema objSistema;

    public VentanaRanking(Sistema modelo) {
        objSistema = modelo;
        initComponents();
        objSistema.addObserver(this);
        this.nombreExcel.setText("");
        actualizar();   
    }   
        
    @Override
    public void update(Observable o, Object arg) {
        actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPartidas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreExcel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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
        btnGenerar.setBounds(240, 330, 130, 40);

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
        btnVolver.setBounds(380, 330, 90, 40);

        listaPartidas.setBackground(new java.awt.Color(3, 5, 27));
        listaPartidas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaPartidas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 150, 450, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Para generar un archivo Excel con el ranking de los jugadores, presione \"Generar\".");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 460, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText(" Para volver al menu principal, presione \"Volver\".");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 300, 30);
        jPanel1.add(nombreExcel);
        nombreExcel.setBounds(120, 330, 130, 30);

        jLabel4.setText("Nombre del archivo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 340, 100, 14);

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
                JOptionPane.showMessageDialog(null, "No se selecciono un destino correcto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono el nombre del archivo a guardar.");
        }
        //dispose(); NO ES NECESARIO HACER ESTE DISPOSE PORQUE SE TE CIERRA LA VENTANA ENTERA Y ESTO ES SOLO PARA CREAR EL EXCEL
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver;
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
