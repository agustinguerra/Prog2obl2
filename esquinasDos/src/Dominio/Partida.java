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
    private int timer;

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

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    //CONSTRUCTOR CON PARAMETROS DE LA CLASE TABLERO
    public Partida(Jugador jugadorUno, Jugador jugadorDos, Tablero tablero, int timer) {
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        this.tablero = tablero;
        this.timer = timer;
    }

    //CONSTRUCTOR VACIO DE LA CLASE TABLERO
    public Partida() {
        this.tablero = new Tablero();
    }
}
