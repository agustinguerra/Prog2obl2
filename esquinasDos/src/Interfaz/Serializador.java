package Interfaz;

import Dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    //CONSTRUCTOR SIN PARAMETROS DE LA CLAZE SERIALIZADOR
    public Serializador() {

    }

    //ESTE METODO SERIALIZA
    public void serializeSistema(Sistema sis) {
        try {
            FileOutputStream fileOut = new FileOutputStream("sistema.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sis);
            out.close();
            fileOut.close();
            //LOS DATOS SON GUARDADOS EN SISTEMA.SER
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    //ESTE METODO DESERIALIZA
    public Sistema deserializeSistema() {
        Sistema sis = null;
        try {
            FileInputStream fileIn = new FileInputStream("sistema.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            sis = (Sistema) in.readObject();
            in.close();
            fileIn.close();
            return sis;
        } catch (IOException | ClassNotFoundException i) {
            return sis;
        }
    }
}
