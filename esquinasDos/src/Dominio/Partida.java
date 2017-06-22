package Dominio;

import java.io.Serializable;

public class Partida implements Serializable {

    //VARIABLES PRIVADAS DE LA CLASE TABLERO
    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private Tablero tablero;
    private String fechaCreada;

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

    //CONSTRUCTOR CON PARAMETROS DE LA CLASE TABLERO
    public Partida(Jugador jugadorUno, Jugador jugadorDos, Tablero tablero) {
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        this.tablero = tablero;
    }

    //CONSTRUCTOR VACIO DE LA CLASE TABLERO
    public Partida() {
        this.tablero = new Tablero();
    }
}
