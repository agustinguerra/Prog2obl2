package Interfaz;

import Dominio.Sistema;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VentanaJuego extends JFrame {
    private JButton[][] botones;
    private final Sistema sistema;

    public VentanaJuego(Sistema modelo) {
        sistema = modelo;
        initComponents();
        jPanel1.setLayout(null);
        panelJuego.setLayout(new GridLayout(6, 7));
        letras.setLayout(new GridLayout (6,1));
        letras.setOpaque(false);
        letras.add(new JLabel("F"), 5 , 0);
        letras.add(new JLabel("E"), 1 , 0);
        letras.add(new JLabel("D"), 1 , 0);
        letras.add(new JLabel("C"), 1 , 0);
        letras.add(new JLabel("B"), 1 , 0);
        letras.add(new JLabel("A"), 1 , 0);
        numeros.setLayout(new GridLayout(1,7));
        numeros.setOpaque(false);
        JLabel jl1 = new JLabel("1");
        jl1.setHorizontalAlignment(JLabel.CENTER);
        JLabel jl2 = new JLabel("2");
        jl2.setHorizontalAlignment(JLabel.CENTER);
        JLabel jl3 = new JLabel("3");
        jl3.setHorizontalAlignment(JLabel.CENTER);
        JLabel jl4 = new JLabel("4");
        jl4.setHorizontalAlignment(JLabel.CENTER);
        JLabel jl5 = new JLabel("5");
        jl5.setHorizontalAlignment(JLabel.CENTER);
        JLabel jl6 = new JLabel("6");
        jl6.setHorizontalAlignment(JLabel.CENTER);
        numeros.add(jl6, 5 , 0);
        numeros.add(jl5, 1 , 0);
        numeros.add(jl4, 1 , 0);
        numeros.add(jl3, 1 , 0);
        numeros.add(jl2, 1 , 0);
        numeros.add(jl1, 1 , 0);
        botones = new JButton[7][7];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new ListenerBoton(i, j));
                panelJuego.add(jButton);
                botones[i][j] = jButton;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noHayNombre = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        panelJuego = new javax.swing.JPanel();
        letras = new javax.swing.JPanel();
        numeros = new javax.swing.JPanel();

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

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        panelJuego.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(panelJuego);
        panelJuego.setBounds(60, 50, 300, 300);

        javax.swing.GroupLayout letrasLayout = new javax.swing.GroupLayout(letras);
        letras.setLayout(letrasLayout);
        letrasLayout.setHorizontalGroup(
            letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        letrasLayout.setVerticalGroup(
            letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(letras);
        letras.setBounds(30, 50, 30, 300);

        javax.swing.GroupLayout numerosLayout = new javax.swing.GroupLayout(numeros);
        numeros.setLayout(numerosLayout);
        numerosLayout.setHorizontalGroup(
            numerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        numerosLayout.setVerticalGroup(
            numerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(numeros);
        numeros.setBounds(60, 20, 300, 30);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel letras;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JPanel numeros;
    private javax.swing.JPanel panelJuego;
    // End of variables declaration//GEN-END:variables

    private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            // en el constructor se almacena la fila y columna que se presionó
            x = i;
            y = j;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // cuando se presiona un botón, se ejecutará este método
            clickBoton(x, y);
        }
    }

    private void clickBoton(int fila, int columna) {
        // Método a completar!.
        // En fila y columna se reciben las coordenas donde presionó el usuario, relativas al comienzo de la grilla
        // fila 1 y columna 1 corresponden a la posición de arriba a la izquierda.
        // Debe indicarse cómo responder al click de ese botón.
    }

}
