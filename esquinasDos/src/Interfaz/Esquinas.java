package Interfaz;

import Dominio.Sistema;
import java.io.File;

public class Esquinas {

    //PUNTO DE ENTRADA DEL PROGRAMA
    public static void main(String[] args) {
        boolean existeSistema = new File("sistema.ser").isFile();
        Sistema sistema;
        if (!existeSistema) {
            sistema = new Sistema();
        } else {
            Serializador serializer = new Serializador();
            sistema = serializer.deserializeSistema();
        }
        VentanaMenuPrincipal v = new VentanaMenuPrincipal(sistema);
        v.setTitle("Esquinas");
        v.setVisible(true);
    }
}
