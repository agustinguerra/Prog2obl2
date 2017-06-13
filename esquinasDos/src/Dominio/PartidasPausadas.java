package Dominio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PartidasPausadas implements Serializable {

    private Map<Partida, String> partidasSuspendidas = new HashMap<>();

    public PartidasPausadas() {
        this.partidasSuspendidas = new HashMap<Partida,String>();
    }
    
}
        