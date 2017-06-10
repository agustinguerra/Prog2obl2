
package Interfaz;

import Dominio.Ficha;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {

    public Serializador() {
    }

    
    public void serializeFicha(Ficha fich) {
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fich);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public Ficha deserializeFicha() {
        Ficha fich = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            fich = (Ficha) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(fich.getValor());
            return fich;       
        } catch (IOException i) {
            return fich;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            return fich;
        }

    }
}
