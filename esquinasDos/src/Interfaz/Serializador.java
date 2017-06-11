
package Interfaz;


import Dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    public Serializador() {
    }

    
    public void serializeSistema(Sistema sis) {
        try {
            FileOutputStream fileOut = new FileOutputStream("sistema.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sis);
            out.close();
            fileOut.close();
            //System.out.printf("Serialized data is saved in sistema.ser");
        } catch (IOException i) {
            System.out.println(i);
        }
    }

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
