package Interfaz;

import Dominio.Sistema;
import Persistencia.ArchivoExcel;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class VentanaRanking extends JFrame {

    //VARIABLE PRIVADA DE LA CLASE VENTANARANKING
    private final Sistema sistema;

    //CONSTRUCTOR DE LA CLASE VENTANARANKING
    public VentanaRanking(Sistema modelo) {
        sistema = modelo;
        initComponents();
        this.nombreExcel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        buttonGenerar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPartidas = new javax.swing.JList();
        labelInfoUno = new javax.swing.JLabel();
        labelInfoDos = new javax.swing.JLabel();
        nombreExcel = new javax.swing.JTextField();
        labelNombreArchivo = new javax.swing.JLabel();
        buttonVolver = new javax.swing.JButton();
        buttonRefresh = new java.awt.Button();

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

        jPanel1.setBackground(new java.awt.Color(255, 133, 124));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 1, 40)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("RANKING");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(110, 0, 290, 70);

        buttonGenerar.setBackground(new java.awt.Color(0, 0, 0));
        buttonGenerar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        buttonGenerar.setText("Generar");
        buttonGenerar.setBorderPainted(false);
        buttonGenerar.setContentAreaFilled(false);
        buttonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGenerar);
        buttonGenerar.setBounds(300, 340, 130, 40);

        listaPartidas.setBackground(new java.awt.Color(3, 5, 27));
        listaPartidas.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaPartidas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 150, 450, 180);

        labelInfoUno.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        labelInfoUno.setText("Para generar un archivo Excel con el ranking de los jugadores, presione \"Generar\".");
        jPanel1.add(labelInfoUno);
        labelInfoUno.setBounds(20, 70, 460, 30);

        labelInfoDos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        labelInfoDos.setText(" Para volver al menu principal, presione \"Volver\".");
        jPanel1.add(labelInfoDos);
        labelInfoDos.setBounds(20, 110, 300, 30);
        jPanel1.add(nombreExcel);
        nombreExcel.setBounds(140, 350, 130, 30);

        labelNombreArchivo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        labelNombreArchivo.setText("Nombre del archivo");
        jPanel1.add(labelNombreArchivo);
        labelNombreArchivo.setBounds(20, 354, 140, 20);

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
        buttonVolver.setBounds(410, 340, 90, 40);

        buttonRefresh.setActionCommand("Mostrar");
        buttonRefresh.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        buttonRefresh.setLabel("Mostrar");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRefresh);
        buttonRefresh.setBounds(400, 120, 63, 27);

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

    //ESTE BOTON GENERA EL EXCEL UNA VEZ QUE SE IGNRESA EL NOMBRE
    private void buttonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarActionPerformed
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
                archExcel.crearExcel(sistema, nombreExcel.getText(), fileElegido);
            } else {
                JOptionPane.showMessageDialog(this, "No se selecciono un destino correcto. ", "Ranking de Jugadores", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se selecciono el nombre del archivo a guardar.", "Ranking de Jugadores", JOptionPane.ERROR_MESSAGE);
        }
        //ESTO SE VA A HACER UNQUE DE ERROR, ARREGLAR
        //JOptionPane.showMessageDialog(this, "El Archivo Excel (" + nombreExcel.getText() + ".xls) ha sido generado correctamente. ", "Ranking de Jugadores", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_buttonGenerarActionPerformed

    //ESTE BOTON VUELVE
    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    //ESTE BOTON ACTUALIZA EL RANKING EN LA VENTANA MISMO
    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        actualizar();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerar;
    private java.awt.Button buttonRefresh;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelInfoDos;
    private javax.swing.JLabel labelInfoUno;
    private javax.swing.JLabel labelNombreArchivo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList listaPartidas;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JTextField nombreExcel;
    // End of variables declaration//GEN-END:variables

    //ESTE METODO ACTUALIZA LA LISTA DE PARTIDAS Y LAS ORDENA POR JUGADOR CON MAS PARTIDAS GANADAS
    public void actualizar() {
        Collections.sort(sistema.getListaJugadores());
        listaPartidas.setListData(sistema.getListaJugadores().toArray());
    }
}
