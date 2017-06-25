package Interfaz;

import java.util.Timer;
import java.util.TimerTask;
import Dominio.Sistema;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import javax.swing.JOptionPane;

public class VentanaJuegoNormal extends JFrame {

    //VARIABLES PRIVADAS DE LA CLASE VENTANAJUEGO NORMAL
    private final JButton[][] botones;
    private final Sistema sistema;
    private int jugadorUnoFichas;
    private int jugadorDosFichas;
    private boolean movimientoValido;
    private boolean esPrimerTurno;
    private int turnoDe;
    private boolean turnoDeCheck;
    private Reminder timer;

    //CONSTRUCTOR DE LA CLASE VENTANAJUEGONORMAL
    public VentanaJuegoNormal(Sistema modelo, int modo) {
        sistema = modelo;
        initComponents();
        this.timer = new Reminder(300);
        textAreaInfo.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        textAreaInfo.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        textAreaLogueo.setText("Bienvenido al juego!" + "\n");
        textAreaLogueo.setEditable(false);
        jPanel1.setLayout(null);
        panelJuego.setLayout(new GridLayout(6, 7));
        letras.setLayout(new GridLayout(6, 1));
        letras.setOpaque(false);
        letras.add(new JLabel("F"), 5, 0);
        letras.add(new JLabel("E"), 1, 0);
        letras.add(new JLabel("D"), 1, 0);
        letras.add(new JLabel("C"), 1, 0);
        letras.add(new JLabel("B"), 1, 0);
        letras.add(new JLabel("A"), 1, 0);
        numeros.setLayout(new GridLayout(1, 7));
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
        numeros.add(jl6, 5, 0);
        numeros.add(jl5, 1, 0);
        numeros.add(jl4, 1, 0);
        numeros.add(jl3, 1, 0);
        numeros.add(jl2, 1, 0);
        numeros.add(jl1, 1, 0);
        botones = new JButton[7][7];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new ListenerBoton(i, j));
                jButton.setHorizontalAlignment(JLabel.CENTER);
                jButton.setText("0");
                panelJuego.add(jButton);
                botones[i][j] = jButton;
            }
        }
        switch (modo) {
            case 1:
                this.jugadorUnoFichas = 25;
                this.jugadorDosFichas = 25;

                this.esPrimerTurno = true;

                this.turnoDeCheck = true;
                this.turnoDe = 1;
                break;
            case 2:
                this.jugadorUnoFichas = this.sistema.getPartida().getfJUno();
                this.jugadorDosFichas = this.sistema.getPartida().getfJDos();

                if (this.jugadorDosFichas == 25 && this.jugadorDosFichas == 25) {
                    this.esPrimerTurno = true;
                }

                this.turnoDeCheck = this.sistema.getPartida().istDeCheck();
                if (this.turnoDeCheck) {
                    this.turnoDe = 1;
                } else {
                    this.turnoDe = 2;
                }
                this.refrescarMatriz();
                break;
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
        buttonRendirse = new javax.swing.JButton();
        textAreaInfo = new javax.swing.JScrollPane();
        textAreaLogueo = new javax.swing.JTextArea();
        buttonGuardar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();

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

        buttonRendirse.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        buttonRendirse.setText("Rendirse");
        buttonRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRendirseActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRendirse);
        buttonRendirse.setBounds(230, 380, 120, 33);

        textAreaLogueo.setColumns(20);
        textAreaLogueo.setRows(5);
        textAreaInfo.setViewportView(textAreaLogueo);

        jPanel1.add(textAreaInfo);
        textAreaInfo.setBounds(420, 20, 350, 430);

        buttonGuardar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGuardar);
        buttonGuardar.setBounds(60, 380, 120, 33);

        buttonSalir.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalir);
        buttonSalir.setBounds(153, 430, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(812, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ESTE BOTON AL CLICKEARSE GUARDA LA PARTIDA PARA SER RETOMADA DESPUES
    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        this.sistema.getPartida().setfJUno(jugadorUnoFichas);
        this.sistema.getPartida().setfJDos(jugadorDosFichas);
        this.sistema.getPartida().settDeCheck(turnoDeCheck);
        this.sistema.getPartidasSuspendidas().agregarPartida(this.sistema.getPartida());
        JOptionPane.showMessageDialog(this, "La partida se guardo correctamente", "Exito", JOptionPane.PLAIN_MESSAGE);
        this.timer.timer.cancel();
        dispose();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    //BOTON RENDIRSE, ESTE BOTON HACE LA FUNCION RENDIRSE CONTRA JUGADOR
    private void buttonRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRendirseActionPerformed
        if (turnoDe == 1) {
            int jGanados = this.sistema.getPartida().getJugadorUno().getJuegosGanados();
            this.sistema.getPartida().getJugadorUno().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "El jugador 2 se rindio. Gano el jugador 1. Se le ha sumado 1 a su historial de juegos Ganados! ", "ERROR", JOptionPane.PLAIN_MESSAGE);
        } else if (turnoDe == 2) {
            int jGanados = this.sistema.getPartida().getJugadorDos().getJuegosGanados();
            this.sistema.getPartida().getJugadorDos().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "El jugador 1 se rindio. Gano el jugador 2. Se le ha sumado 1 a su historial de juegos Ganados! ", "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
        this.sistema.getPartidasSuspendidas().seTerminoPartida(this.sistema.getPartida().getFechaCreada()); //CUANDO SE TERMINA LA PARTIDA, CHEQUEO SI LA TENGO QUE ELIMINAR DE LA LISTA DE PARTIDAS
        this.timer.timer.cancel();
        dispose();
    }//GEN-LAST:event_buttonRendirseActionPerformed

    //ESTE SALIR, SALE DEL JUEGO
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Al salir de la partida, si la misma estaba guardada se perdera toda la informacion.", "INFO", JOptionPane.PLAIN_MESSAGE);
        this.sistema.getPartidasSuspendidas().seTerminoPartida(this.sistema.getPartida().getFechaCreada());
        this.timer.timer.cancel();
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonRendirse;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel letras;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JPanel numeros;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JScrollPane textAreaInfo;
    private javax.swing.JTextArea textAreaLogueo;
    // End of variables declaration//GEN-END:variables

    //ESTA CLASE ESCUCHA AL CLICK DEL BOTON Y GUARDA EL X e Y QUE SE CLICKEO EN LA MATRIZ DE BOTONES
    private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            //En el constructor se almacena la fila y columna que se presionó.
            x = i;
            y = j;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //Cuando se presiona un botón, se ejecutará este método.
            clickBoton(x, y);
        }
    }

    //ESTA CLASE SE ENCARGA DE MANEJAR AL TIMER
    private class Reminder {

        Timer timer;

        public Reminder(int seconds) {
            timer = new Timer();
            timer.schedule(new RemindTask(), seconds * 1000);
        }

        class RemindTask extends TimerTask {

            @Override
            public void run() {
                timer.cancel(); //Terminate the timer thread
                seTerminoTimer();
                dispose();
            }
        }
    }

    //ESTE METODO CHEQUEA SI SE TERMINO EL TIMER
    private void seTerminoTimer() {
        if (turnoDe == 1) {
            int jGanados = this.sistema.getPartida().getJugadorUno().getJuegosGanados();
            this.sistema.getPartida().getJugadorUno().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "Se le termino el tiempo al jugador 2! Ha perdido. Se le ha sumado 1 a su historial de juegos Ganados! ", "ERROR", JOptionPane.PLAIN_MESSAGE);
        } else if (turnoDe == 2) {
            int jGanados = this.sistema.getPartida().getJugadorDos().getJuegosGanados();
            this.sistema.getPartida().getJugadorDos().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "Se le termino el tiempo al jugador 1! Ha perdido. Se le ha sumado 1 a su historial de juegos Ganados! ", "ERROR", JOptionPane.PLAIN_MESSAGE);
        }
        this.sistema.getPartidasSuspendidas().seTerminoPartida(this.sistema.getPartida().getFechaCreada()); //CUANDO SE TERMINA LA PARTIDA, CHEQUEO SI LA TENGO QUE ELIMINAR DE LA LISTA DE PARTIDAS
    }

    //ESTE METODO MANEJA EL JUEGO JUGADOR VS JUGADOR
    private void clickBoton(int fila, int columna) {
        //CHEQUEAR QUE EL MOVIMINEOT ES VALIDO
        //SI ES VALIDO, CHEQUEAR QUE JUGADOR ES EL TURNO Y PONER LA FICHA EN EL ARRAY DE LA PARTIDA
        //CAMBIAR TURNO DE JUGADOR(VARIABLE DE CLASE)
        //LLAMAR A REFRESCAR MATRIZ

        movimientoValido = false;

        if (turnoDeCheck) { //DEPENDE DE QUIEN SEA EL TURNO, A QUIEN LE DOY LA BIENVENIDA
            turnoDe = 1;
        } else {
            turnoDe = 2;
        }

        int fichaI;
        fichaI = fila - 1;
        int fichaJ;
        fichaJ = columna - 1;

        if (!sistema.libroDeReglas.formaCuadrado(fichaI, fichaJ, this.sistema.getPartida().getTablero())) { //ACA PONGO TODOS LOS METODOS QUE VALIDAN EL MOVIMIENTO, 
            if (esPrimerTurno == true || sistema.libroDeReglas.tieneAdyacente(fichaI, fichaJ, this.sistema.getPartida().getTablero())) {
                esPrimerTurno = false; //SI ES EL PRIMER TURNO, NUNCA VA A TENER ADYACENTE, POR ESO ESTE CONTROL ESPECIAL
                movimientoValido = true; //CONFIRMO QUE ES MOVIMIENTO VALIDO, SALE DEL WHILE Y SIGUE LA JUGADA.
                this.timer.timer.cancel();
                this.timer = new Reminder(this.sistema.getPartida().getTimer() * 60);
            }
        }

        if (movimientoValido) {
            //AQUI YA SE A DONDE EL JUGADOR QUIERE MOVER LA FICHA, Y SE QUE EL MOVIMIENTO ES VALIDO. PROCEDO A HACER LA JUGADA
            if (turnoDe == 1) {
                jugadorUnoFichas = sistema.libroDeReglas.seFormoEsquina(fichaI, fichaJ, this.sistema.getPartida().getTablero(), turnoDe, jugadorUnoFichas, textAreaLogueo);
                jugadorUnoFichas = sistema.libroDeReglas.seExtendioEsquina(fichaI, fichaJ, this.sistema.getPartida().getTablero(), turnoDe, jugadorUnoFichas, textAreaLogueo);

                //ACA VA EL METODO DE EXTENDERLAS
            } else if (turnoDe == 2) {
                jugadorDosFichas = sistema.libroDeReglas.seFormoEsquina(fichaI, fichaJ, this.sistema.getPartida().getTablero(), turnoDe, jugadorDosFichas, textAreaLogueo);
                jugadorDosFichas = sistema.libroDeReglas.seExtendioEsquina(fichaI, fichaJ, this.sistema.getPartida().getTablero(), turnoDe, jugadorDosFichas, textAreaLogueo);

                //ACA VA EL METODO DE EXTENDERLAS
            }
        }

        //SI EL MOVIMIENTO FUE VALIDO CAMBIO DE JUGADOR, SINO VUELVO AL MISMO JUGADOR
        if (movimientoValido) {
            turnoDeCheck = !turnoDeCheck;
        }
        refrescarMatriz();

        // Método a completar!.
        // En fila y columna se reciben las coordenas donde presionó el usuario, relativas al comienzo de la grilla
        // fila 1 y columna 1 corresponden a la posición de arriba a la izquierda.
        // Debe indicarse cómo responder al click de ese botón.
    }

    //ESTE METODO REFRESCA LA MATRIZ DE BOTONES, YA QUE NOSOTROS TRABAJAMOS EN LA MATRIZ DE FICHAS!
    private void refrescarMatriz() {
        //CHEQUEAR QUE LA PARTIDA NO TERMINO
        //SI NO TERMINO, REFRESCO LA MATRIZ EN PANTALLA
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                int valor;
                valor = this.sistema.getPartida().getTablero().getFicha(i - 1, j - 1).getValor();
                botones[i][j].setText(String.valueOf(valor));
                if (this.sistema.getPartida().getTablero().getFicha(i - 1, j - 1).getColor().equals("\u001B[34m")) {
                    switch (valor) {
                        case 1:
                            botones[i][j].setBackground(new Color(172, 203, 255));
                            break;
                        case 2:
                            botones[i][j].setBackground(new Color(146, 187, 255));
                            break;
                        case 3:
                            botones[i][j].setBackground(new Color(120, 170, 255));
                            break;
                        case 4:
                            botones[i][j].setBackground(new Color(100, 158, 255));
                            break;
                        case 5:
                            botones[i][j].setBackground(new Color(65, 136, 255));
                            break;
                        default:
                            break;
                    }
                } else if (this.sistema.getPartida().getTablero().getFicha(i - 1, j - 1).getColor().equals("\u001B[31m")) {
                    switch (valor) {
                        case 1:
                            botones[i][j].setBackground(new Color(229, 154, 152));
                            break;
                        case 2:
                            botones[i][j].setBackground(new Color(224, 134, 132));
                            break;
                        case 3:
                            botones[i][j].setBackground(new Color(219, 114, 112));
                            break;
                        case 4:
                            botones[i][j].setBackground(new Color(224, 134, 132));
                            break;
                        case 5:
                            botones[i][j].setBackground(new Color(229, 154, 152));
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if ((jugadorUnoFichas == 0) || (jugadorDosFichas == 0)) { //CHEQUEO AL FINAL DE CADA TURNO PARA VER SI SE TERMINO LA PARTIDA
            chequearPuntajes();
            this.timer.timer.cancel();
            dispose();
        }
    }

    //ESTE METODO ES EL QUE CHEQUEA LOS PUNTAJES UNA VEZ FINALIZADA LA PARTIDA
    public void chequearPuntajes() {
        if (sistema.libroDeReglas.calcularPuntaje(1, this.sistema.getPartida().getTablero()) > sistema.libroDeReglas.calcularPuntaje(2, this.sistema.getPartida().getTablero())) {
            int jGanados = this.sistema.getPartida().getJugadorUno().getJuegosGanados();
            this.sistema.getPartida().getJugadorUno().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "FIN DEL JUEGO! \n" + "Puntajes \n" + "Jugador 1: " + sistema.libroDeReglas.calcularPuntaje(1, this.sistema.getPartida().getTablero()) + "\nJugador 2: " + sistema.libroDeReglas.calcularPuntaje(2, this.sistema.getPartida().getTablero()) + "\nEl jugador 1 ha ganado la partida. Se actualizara el ranking. ", "Info", JOptionPane.PLAIN_MESSAGE);
        } else if (sistema.libroDeReglas.calcularPuntaje(1, this.sistema.getPartida().getTablero()) < sistema.libroDeReglas.calcularPuntaje(2, this.sistema.getPartida().getTablero())) {
            int jGanados = this.sistema.getPartida().getJugadorDos().getJuegosGanados();
            this.sistema.getPartida().getJugadorDos().setJuegosGanados(jGanados + 1);
            JOptionPane.showMessageDialog(this, "FIN DEL JUEGO! \n" + "Puntajes \n" + "Jugador 1: " + sistema.libroDeReglas.calcularPuntaje(1, this.sistema.getPartida().getTablero()) + "\nJugador 2: " + sistema.libroDeReglas.calcularPuntaje(2, this.sistema.getPartida().getTablero()) + "\nEl jugador 2 ha ganado la partida. Se actualizara el ranking. ", "Info", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El juego ha terminado en empate.", "Info", JOptionPane.PLAIN_MESSAGE);
        }
        System.out.println(sistema.libroDeReglas.calcularPuntaje(1, this.sistema.getPartida().getTablero()));
        System.out.println(sistema.libroDeReglas.calcularPuntaje(2, this.sistema.getPartida().getTablero()));
        this.sistema.getPartidasSuspendidas().seTerminoPartida(this.sistema.getPartida().getFechaCreada());
    }
}
