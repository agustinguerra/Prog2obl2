package Dominio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PartidasPausadas implements Serializable {

    private Map<String, Partida> partidasSuspendidas = new HashMap<>();

    public Map<String, Partida> getPartidasSuspendidas() {
        return partidasSuspendidas;
    }

    public PartidasPausadas() {
        this.partidasSuspendidas = new HashMap<String,Partida>();
    }
    //LO UNICO HECHO DE ESTO, ES ESTA CLASE Y LA INSTANCIACION AL PRINCIPIO CUANDO SE CREA SISTEMA Y AHORA LA ACCION DEL BOTON
    //FALTA QUE CUANDO CREES LA PARTIDA SE SETEE LA FECHA DE CREACION
    //FALTA QUE CUANDO SE TERMINE LA PARTIDA CHEQUEAR QUE EXISTE PARA BORRARLA DEL LISTADO
    
    public void seTerminoPartida (String fecha){
        if (this.partidasSuspendidas.containsKey(fecha)){ //CUANDO SE TERMINA LA PARTIDA, CHEQUEO SI EXISTE EN EL MAP PARA VER SI LO TENGO QUE SACAR
            this.partidasSuspendidas.remove(fecha);
        }
    }
    
    public void agregarPartida (Partida partida){ //CUANDO SE PAUSA UNA PARTIDA LLAMAMOS A ESTE METODO. SI NO EXISTE LA AGREGA, Y SI EXSITE BORRA LA ANTERIOR Y AGREGA LA QUE VIENE
        if (this.partidasSuspendidas.containsKey(partida.getFechaCreada())){
            this.partidasSuspendidas.remove(partida.getFechaCreada());
            this.partidasSuspendidas.put(partida.getFechaCreada(), partida);
        }
        else {
            this.partidasSuspendidas.put(partida.getFechaCreada(), partida);
        }
    }

    public Partida buscarPartida(String fecha) {
        return this.partidasSuspendidas.get(fecha);
    }
}
        