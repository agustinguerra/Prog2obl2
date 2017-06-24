package Dominio;

import java.io.Serializable;

public class Partida implements Serializable {

    //VARIABLES PRIVADAS DE LA CLASE TABLERO
    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private Tablero tablero;
    private String fechaCreada;
    private int fJUno; //ESTAS TRES VARIABLES SON UTILIZADAS AL MOMENTO DE GUARDAR LA PARTIDA
    private int fJDos;
    private boolean tDeCheck;
    private String tipo; //SI ES "NORMAL" la partida es jugador vs jugador si es "PC" la partida es jugador vs PC.

    public int getfJUno() {
        return fJUno;
    }

    public void setfJUno(int fJUno) {
        this.fJUno = fJUno;
    }

    public int getfJDos() {
        return fJDos;
    }

    public void setfJDos(int fJDos) {
        this.fJDos = fJDos;
    }

    public boolean istDeCheck() {
        return tDeCheck;
    }

    public void settDeCheck(boolean tDeCheck) {
        this.tDeCheck = tDeCheck;
    }
    

    //METODOS DE ACCESO Y MODIFICACION DE LA CLASE TABLERO
    public Jugador getJugadorUno() {
        return jugadorUno;
    }

    public void setJugadorUno(Jugador jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public void setFechaCreada(String fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public String getFechaCreada() {
        return fechaCreada;
    }

    public Jugador getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(Jugador jugadorDos) {
        this.jugadorDos = jugadorDos;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //CONSTRUCTOR CON PARAMETROS DE LA CLASE TABLERO
    public Partida(Jugador jugadorUno, Jugador jugadorDos, Tablero tablero, String tipo) {
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        this.tablero = tablero;
        this.tipo = tipo;
    }

    //CONSTRUCTOR VACIO DE LA CLASE TABLERO
    public Partida() {
        this.tablero = new Tablero();
    }
}
