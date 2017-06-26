package Dominio;

import java.util.ArrayList;
import java.util.Observable;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable {

    //VARIABLES PRIVADAS DE LA CLASE SISTEMA
    private Partida partida;
    private ArrayList<Jugador> listaJugadores;
    public Reglas libroDeReglas;
    private PartidasPausadas partidasSuspendidas;

    //METODOS DE ACCESO Y MODIFICACION DE LA CLASE SISTEMA
    public PartidasPausadas getPartidasSuspendidas() {
        return partidasSuspendidas;
    }

    public Partida getPartida() {
        return partida;
    }

    public PartidasPausadas getPartidasPausadas() {
        return partidasSuspendidas;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getJugadorPorAlias(String al) {
        int ret = 0;
        for (int i = 0; i < this.listaJugadores.size(); i++) {
            if (this.listaJugadores.get(i).getAlias().equals(al)) {
                ret = i;
            }
        }
        return ret;
    }

    public int cantidadJugadores() {
        return this.listaJugadores.size();
    }

    //CONSTRUCTOR CON PARAMETROS DE LA CLASE SISTEMA
    public Sistema(Partida partida, ArrayList<Jugador> listaJugadores) {
        this.partida = partida;
        this.listaJugadores = listaJugadores;
    }

    //CONSTRUCTOR VACIO DE LA CLASE SISTEMA
    public Sistema() {
        this.listaJugadores = new ArrayList<>();
        this.libroDeReglas = new Reglas();
        this.partidasSuspendidas = new PartidasPausadas();
    }

    //METODOS QUE CREAN UNA PARTIDA DEPENDIENDO DEL TIPO DE JUEGO.
    public void crearPartidaNormal(int uno, int dos, String fechaCreada, int timer) {
        this.partida = new Partida();
        this.partida.setTimer(timer);
        this.partida.setFechaCreada(fechaCreada);
        this.partida.setJugadorUno(this.listaJugadores.get(uno));
        this.partida.setJugadorDos(this.listaJugadores.get(dos));
    }

    public void crearPartidaPC(int uno, String fechaCreada, int timer) {
        this.partida = new Partida();
        this.partida.setFechaCreada(fechaCreada);
        this.partida.setTimer(timer);
        this.partida.setJugadorUno(this.listaJugadores.get(uno));
    }

    public void reanudarPartida(Partida partidaReanudada, String fechaCreada) {
        //Partida p = new Partida();
        this.partida=partidaReanudada;
        //p.setFechaCreada(fechaCreada);
        //p = partidaReanudada;
        //this.partida=p;
    }

    //ESTE METODO AGREGA UN JUGADOR DESDE LA INTERFAZ A LA LISTA DE JUGADORES
    public void agregarUnJugador(Jugador unJugador) {
        getListaJugadores().add(unJugador);
        setChanged();
    }
}
