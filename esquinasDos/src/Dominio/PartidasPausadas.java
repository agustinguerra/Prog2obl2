package Dominio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PartidasPausadas implements Serializable {

    private Map<Partida, String> partidasSuspendidas = new HashMap<>();

    public PartidasPausadas() {
        this.partidasSuspendidas = new HashMap<Partida,String>();
    }
    //LO UNICO HECHO DE ESTO, ES ESTA CLASE Y LA INSTANCIACION AL PRINCIPIO CUANDO SE CREA SISTEMA Y AHORA LA ACCION DEL BOTON
    //FALTA QUE CUANDO CREES LA PARTIDA SE SETEE LA FECHA DE CREACION
    //FALTA QUE CUANDO SE TERMINE LA PARTIDA CHEQUEAR QUE EXISTE PARA BORRARLA DEL LISTADO
    
    public void seTerminoPartida (){
        
    }
}
        