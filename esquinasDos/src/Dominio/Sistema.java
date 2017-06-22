package Dominio;

import java.util.ArrayList;
import java.util.Observable;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable{

    //VARIABLES PRIVADAS DE LA CLASE SISTEMA
    private Partida partida;
    private ArrayList<Jugador> listaJugadores;
    public Reglas libroDeReglas;
    private PartidasPausadas partidasSuspendidas;

    public PartidasPausadas getPartidasSuspendidas() {
        return partidasSuspendidas;
    }
    //METODOS DE ACCESO Y MODIFICACION DE LA CLASE SISTEMA
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }
    
    public int getJugadorPorAlias(String al){
        int ret = 0;
        for (int i=0;i<this.listaJugadores.size();i++){
            if(this.listaJugadores.get(i).getAlias().equals(al)){
                ret=i;
            }
        }
        return ret;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
    public int cantidadJugadores (){
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

    //ESTE METODO VALIDA LA PRIMER COORDENADA DEL MOVIMIENTO, PUEDE NO SER NECESARIO
    public int primerCoordenadaMovimiento(String x) { //EXTRAIGO LA PRIMER COORDENADA DE LA FICHA A PONER
        int devolver = 0;
        switch (x.charAt(0)) {
            case 'A':
                devolver = 0;
                break;
            case 'B':
                devolver = 1;
                break;
            case 'C':
                devolver = 2;
                break;
            case 'D':
                devolver = 3;
                break;
            case 'E':
                devolver = 4;
                break;
            case 'F':
                devolver = 5;
                break;
            default:
                break;
        }
        return devolver;
    }

    //ESTE METODO VALIDA LA SEGUNDA COORDENADA DEL MOVIMIENTO, PUEDE NO SER NECESARIO
    public int segundaCoordenadaMovimiento(String x) { //EXTRAIGO LA SEGUNDA COORDENADA DE LA FICHA A PONER
        int devolver;
        devolver = Character.getNumericValue(x.charAt(1)) - 1;
        return devolver;
    }

    public void crearPartida(int uno, int dos,String fechaCreada){
        this.partida = new Partida();
        this.partida.setFechaCreada(fechaCreada);
        this.partida.setJugadorUno(this.listaJugadores.get(uno));
        this.partida.setJugadorDos(this.listaJugadores.get(dos));
    }
    
    //ESTE METODO AGREGA UN JUGADOR DESDE LA INTERFAZ A LA LISTA DE JUGADORES
    public void agregarUnJugador(Jugador unJugador) {
        getListaJugadores().add(unJugador);
        setChanged();
    }
}
