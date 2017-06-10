package Interfaz;

import Dominio.Sistema;

public class Esquinas {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaMenuPrincipal v = new VentanaMenuPrincipal(sistema);
        v.setVisible(true);
    }   
}
