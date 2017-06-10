package Interfaz;

import Dominio.Jugador;
import Dominio.Sistema;

public class Esquinas {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Jugador j3 = new Jugador();
        j1.setNombre("juanchi1");
        j1.setAlias("juanchi1");
        j1.setEdad(23);
        j1.setJuegosGanados(2);
        
        j2.setNombre("juanchi2");
        j2.setAlias("juanchi2");
        j2.setEdad(23);
        j2.setJuegosGanados(1);
        
        j3.setNombre("juanchi3");
        j3.setAlias("juanchi3");
        j3.setEdad(23);
        j3.setJuegosGanados(3);
        
        sistema.getListaJugadores().add(j1);
        sistema.getListaJugadores().add(j2);
        sistema.getListaJugadores().add(j3);
        
        VentanaMenuPrincipal v = new VentanaMenuPrincipal(sistema);
        v.setVisible(true);
    }   
}