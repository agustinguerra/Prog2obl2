package Interfaz;

import Dominio.Partida;
import Dominio.Sistema;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class VentanaJuego extends JFrame {
    private final JButton[][] botones;
    private final Sistema sistema;

    public VentanaJuego(Sistema modelo) {
        sistema = modelo;
        initComponents();
        textAreaInfo.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        textAreaInfo.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
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
                jButton.setHorizontalAlignment(JLabel.CENTER);
                jButton.setText("0");
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
        buttonRendirse = new javax.swing.JButton();
        textAreaInfo = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGuardar = new javax.swing.JButton();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        textAreaInfo.setViewportView(jTextArea1);

        jPanel1.add(textAreaInfo);
        textAreaInfo.setBounds(420, 20, 350, 410);

        buttonGuardar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGuardar);
        buttonGuardar.setBounds(80, 380, 120, 33);

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

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        //if (sistema.getPartidasPausadas().)
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRendirseActionPerformed
        // ACA VA EL TEMA DE RENDIRSE
    }//GEN-LAST:event_buttonRendirseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonRendirse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel letras;
    private javax.swing.JDialog noHayNombre;
    private javax.swing.JPanel numeros;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JScrollPane textAreaInfo;
    // End of variables declaration//GEN-END:variables

    private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            // en el constructor se almacena la fila y columna que se presionó
            x = i;
            y = j;
        }

        public int getX(int x) {
            return x - 1;
        }

        public int getY(int y) {
            return y - 1;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // cuando se presiona un botón, se ejecutará este método
            clickBoton(x, y);
            System.out.println(getX(x));
            System.out.println(getY(y));
        }
    }

    private void clickBoton(int fila, int columna) {
                
        // Método a completar!.
        // En fila y columna se reciben las coordenas donde presionó el usuario, relativas al comienzo de la grilla
        // fila 1 y columna 1 corresponden a la posición de arriba a la izquierda.
        // Debe indicarse cómo responder al click de ese botón.
    }

    private void refrescarMatriz() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                //ACA ES DONDE REFRESCAMOS LA MATRIZ UNA VEZ QUE YA TRABAJAMOS EN ESE TURNO Y EVALUAMOS TODAS LAS REGLAS
            }
        }
    }

    //ESTE METODO ES EL QUE SE ENCARGA DE REALIZAR EL JUEGO JUGADOR VS JUGADOR
    public void jugarEntreJugadores() {
        int jugadorUnoFichas;
        jugadorUnoFichas = 25;
        int jugadorDosFichas;
        jugadorDosFichas = 25;
        boolean movimientoValido;
        boolean esPrimerTurno = true;
        Partida partida = new Partida();

        int fichaI = 0;
        int fichaJ = 0;

        //SETEA AMBOS JUGADORES DE LA PARTIDA
        sistema.getPartida().setJugadorUno(sistema.getListaJugadores().get(0));
        sistema.getPartida().setJugadorDos(sistema.getListaJugadores().get(1));

        boolean cond;
        cond = false;

        boolean turnoDe; //BOOLEANO PARA SABER DE QUIEN ES EL TURNO, SI ES TRUE jUNO SI ES FALSE jDOS
        turnoDe = true;

        int intTurnoDe;

        while (!cond) {
            movimientoValido = false;
            if (turnoDe) { //DEPENDE DE QUIEN SEA EL TURNO, A QUIEN LE DOY LA BIENVENIDA
                intTurnoDe = 1;
            } else {
                intTurnoDe = 2;
            }
            while (!movimientoValido) {  //SALE DEL WHILE CUANDO SE COMPROBO QUE EL LUGAR DONDE LA PERSONA QUIERE PONER LA FICHA ES VALIDO
                fichaI = this.getX();
                fichaJ = this.getY();
                
                //ACA ES DONDE SE COMPUREBA SI EL JUGADOR EN CUSTION APRETO EL BOTON ABANDONAR
                if (this.buttonRendirse.isSelected()) {   //SI SE DA A ABANDONAR, SE TERMINA EL JUEGO Y GANA EL JUGADOR CONTRARIO AL QUE ABANDONO
                    if (intTurnoDe == 2) {
                        int jGanados = partida.getJugadorUno().getJuegosGanados();
                        partida.getJugadorUno().setJuegosGanados(jGanados + 1);
                    } 
                    else {
                        int jGanados = partida.getJugadorDos().getJuegosGanados();
                        partida.getJugadorDos().setJuegosGanados(jGanados + 1);                       
                    }
                    return;
                }
                
                if (!sistema.libroDeReglas.formaCuadrado(fichaI, fichaJ, partida.getTablero())) { //ACA PONGO TODOS LOS METODOS QUE VALIDAN EL MOVIMIENTO, 
                    if (esPrimerTurno == true || sistema.libroDeReglas.tieneAdyacente(fichaI, fichaJ, partida.getTablero())) {
                        esPrimerTurno = false; //SI ES EL PRIMER TURNO, NUNCA VA A TENER ADYACENTE, POR ESO ESTE CONTROL ESPECIAL
                        movimientoValido = true; //CONFIRMO QUE ES MOVIMIENTO VALIDO, SALE DEL WHILE Y SIGUE LA JUGADA.
                    }
                }
            }
            //AQUI YA SE A DONDE EL JUGADOR QUIERE MOVER LA FICHA, Y SE QUE EL MOVIMIENTO ES VALIDO. PROCEDO A HACER LA JUGADA
            if (intTurnoDe == 1) {
                jugadorUnoFichas = sistema.libroDeReglas.seFormoEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorUnoFichas);
                jugadorUnoFichas = sistema.libroDeReglas.seExtendioEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorUnoFichas);
                //ACA VA EL METODO DE EXTENDERLAS
            } else {
                jugadorDosFichas = sistema.libroDeReglas.seFormoEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorDosFichas);
                jugadorDosFichas = sistema.libroDeReglas.seExtendioEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorDosFichas);
                //ACA VA EL METODO DE EXTENDERLAS
            }
            //CUANTAS FICHAS LE QUEDAN AL JUGADOR?
            if ((jugadorUnoFichas == 0) || (jugadorDosFichas == 0)) { //CHEQUEO AL FINAL DE CADA TURNO PARA VER SI SE TERMINO LA PARTIDA
                cond = true;
            } else {
                turnoDe = !turnoDe; //SI LA PARTIDA NO TERMINO, CAMBIO EL TURNO AL OTRO JUGADOR
            }
            //ACA LLAMAMOS AL METODO REFRESCAR MATRIZ UNA VEZ QUE TERMINAMOS EL TURNO.
            refrescarMatriz();
        }
    

        //UNA VEZ QUE SE TERMINO LA PARTIDA, ACTUALIZO EL RANKING, ES DECIR LE SUMO UNA PARTIDA GANADA AL QUE GANO
        //SI EMPATAN NO LE SUMO NADA A NADIE
        if (sistema.libroDeReglas.calcularPuntaje(1, partida.getTablero()) > sistema.libroDeReglas.calcularPuntaje(2, partida.getTablero())) {
            int jGanados = partida.getJugadorUno().getJuegosGanados();
            partida.getJugadorUno().setJuegosGanados(jGanados + 1);
            
        } else if (sistema.libroDeReglas.calcularPuntaje(1, partida.getTablero()) < sistema.libroDeReglas.calcularPuntaje(2, partida.getTablero())) {
            int jGanados = partida.getJugadorDos().getJuegosGanados();
            partida.getJugadorDos().setJuegosGanados(jGanados + 1);
        } else {
            //EL JUEGO TERMINO EN EMPATE
        }
    }
        
     //ESTE METODO ES EL QUE SE ENCARGA DE REALIZAR EL JUEGO JUGADOR VS PC
    public void jugarContraPC() {
        int jugadorUnoFichas;
        jugadorUnoFichas = 25;
        int jugadorDosPC;
        jugadorDosPC = 25;
        boolean movimientoValido;
        boolean esPrimerTurno = true;
        Partida partida = new Partida();
        
        int fichaI;
        int fichaJ;
        
        //SETEO AL JUGADOR DE LA PARTIDA        
        sistema.getPartida().setJugadorUno(sistema.getListaJugadores().get(0));
        
        boolean cond;
        cond = false;
        
        boolean turnoDe; //BOOLEANO PARA SABER DE QUIEN ES EL TURNO, SI ES TRUE jUNO SI ES FALSE JUEGA PC
        turnoDe = true;
        
        int intTurnoDe;
        
        while (!cond) {
            movimientoValido = false;
            if (turnoDe) { //DEPENDE DE QUIEN SEA EL TURNO, A QUIEN LE DOY LA BIENVENIDA
                intTurnoDe = 1;
            } else {
                intTurnoDe = 2;
            }
            while (!movimientoValido) {  //SALE DEL WHILE CUANDO SE COMPROBO QUE EL LUGAR DONDE LA PERSONA QUIERE PONER LA FICHA ES VALIDO
                if (intTurnoDe == 1) { //FLUJO NORMAL, JUEGA EL JUGADOR
                    
                    if (this.buttonRendirse.isSelected()) {   //SI SE DA A ABANDONAR, SE TERMINA EL JUEGO Y GANA EL JUGADOR PC, PORQUE LA PC NO PUEDE ABANDONAR
                        return;
                    }
                    fichaI = this.getX();
                    fichaJ = this.getY();
                    if (!sistema.libroDeReglas.formaCuadrado(fichaI, fichaJ, partida.getTablero())) { //ACA PONGO TODOS LOS METODOS QUE VALIDAN EL MOVIMIENTO, 
                        if (esPrimerTurno == true || sistema.libroDeReglas.tieneAdyacente(fichaI, fichaJ, partida.getTablero())) {
                            esPrimerTurno = false; //SI ES EL PRIMER TURNO, NUNCA VA A TENER ADYACENTE, POR ESO ESTE CONTROL ESPECIAL
                            movimientoValido = true; //CONFIRMO QUE ES MOVIMIENTO VALIDO, SALE DEL WHILE Y SIGUE LA JUGADA.
                        }
                    }
                    if (movimientoValido) { 
                        //AQUI YA SE A DONDE EL JUGADOR UNO QUIERE MOVER LA FICHA, Y SE QUE EL MOVIMIENTO ES VALIDO. PROCEDO A HACER LA JUGADA
                        jugadorUnoFichas = sistema.libroDeReglas.seFormoEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorUnoFichas);
                        jugadorUnoFichas = sistema.libroDeReglas.seExtendioEsquina(fichaI, fichaJ, partida.getTablero(), intTurnoDe, jugadorUnoFichas);
                        if ((jugadorUnoFichas == 0)) { //CHEQUEO AL FINAL DE CADA TURNO PARA VER SI SE TERMINO LA PARTIDA
                            cond = true;
                        } else {
                            turnoDe = !turnoDe; //SI LA PARTIDA NO TERMINO, CAMBIO EL TURNO A LA PC
                        }
                    }
                } else { //JUEGA LA PC                    
                    jugadorDosPC = inteligenciaArtificial(jugadorDosPC, partida);
                    //ESTO VA AL FINAL EL ESE JUEGA LA PC, LUEGO DEL MOVIMIENTO Y TODO
                    movimientoValido = true; // AL FINAL VALIDO EL MOVIMIENTO DE LA PC PARA SALIR DEL WHILE
                    if ((jugadorDosPC == 0)) { //CHEQUEO AL FINAL DE CADA TURNO PARA VER SI SE TERMINO LA PARTIDA
                        cond = true;
                    } else {
                        turnoDe = !turnoDe; //SI LA PARTIDA NO TERMINO, CAMBIO EL TURNO A LA PC
                    }
                }
            }
        }

        //UNA VEZ QUE SE TERMINO LA PARTIDA, ACTUALIZO EL RANKING, ES DECIR LE SUMO UNA PARTIDA GANADA AL QUE GANO
        //SI EMPATAN NO LE SUMO NADA A NADIE
        if (sistema.libroDeReglas.calcularPuntaje(1, partida.getTablero()) > sistema.libroDeReglas.calcularPuntaje(2, partida.getTablero())) {
            int jGanados = partida.getJugadorUno().getJuegosGanados();
            partida.getJugadorUno().setJuegosGanados(jGanados + 1);
        } 
        else if (sistema.libroDeReglas.calcularPuntaje(1, partida.getTablero()) < sistema.libroDeReglas.calcularPuntaje(2, partida.getTablero())) {
            //GANO LA PC
        } else {
            //EL JUEGO TERMINO EN EMPATE
        }
    }
    
    //ESTE METODO SE ENCARGA DE SIMULAR LA IA DE LA PC (NIVEL: 9999 (INVENCIBLE))
    public int inteligenciaArtificial(int fichasDisponibles, Partida partida) {
        //METODO ENCARGADO DE TODO LO RELACIONADO CON EL JUEGO DE LA PC, DEVUELVE LAS FICHAS QUE QUEDARON LUEGO DEL MOVIMIENTO
        fichasDisponibles = sistema.libroDeReglas.mejorJugadaPC(partida.getTablero(), fichasDisponibles); 
        return fichasDisponibles;
    }

}
