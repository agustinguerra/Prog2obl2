package Dominio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PartidasPausadas implements Serializable {

    //VARIABLE PRIVADA MAPA DE LA CLASE PARTIDAS PAUSADAS
    private Map<String, Partida> partidasSuspendidas = new HashMap<>();

    //METODO GET PARA OBTENER EL MAPA DE PARTIDAS SUSPENDIDAS
    public Map<String, Partida> getPartidasSuspendidas() {
        return partidasSuspendidas;
    }

    //CONSTRUCTOR SIN PARAMETROS DE LA CLASE PARTIDAPAUSADAS
    public PartidasPausadas() {
        this.partidasSuspendidas = new HashMap<String, Partida>();
    }

    //CUANDO SE TERMINA LA PARTIDA, CHEQUEO SI EXISTE EN EL MAP PARA VER SI LO TENGO QUE SACAR
    public void seTerminoPartida(String fecha) {
        if (this.partidasSuspendidas.containsKey(fecha)) {
            this.partidasSuspendidas.remove(fecha);
        }
    }

    //CUANDO SE PAUSA UNA PARTIDA LLAMAMOS A ESTE METODO. SI NO EXISTE LA AGREGA, Y SI EXSITE BORRA LA ANTERIOR Y AGREGA LA QUE VIENE
    public void agregarPartida(Partida partida) {
        if (this.partidasSuspendidas.containsKey(partida.getFechaCreada())) {
            this.partidasSuspendidas.remove(partida.getFechaCreada());
            this.partidasSuspendidas.put(partida.getFechaCreada(), partida);
        } else {
            this.partidasSuspendidas.put(partida.getFechaCreada(), partida);
        }
    }

    //BUSCA UNA PARTIDA POR FECHA EN EL MAPA
    public Partida buscarPartida(String fecha) {
        return this.partidasSuspendidas.get(fecha);
    }
}
