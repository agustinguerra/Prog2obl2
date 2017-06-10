package Interfaz;

import Dominio.Sistema;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

public class Excel {

    public void crearExcel(Sistema sis) {
        try {
            //PARA HACER LA PARTE DEL NOMBRE Y LA UBICACION, TENGO QUE HACERLO CUANDO ESTEN LAS VENTANAS HECHAS, SI LO HAGO ACA ES CODIGO QUE DESPUES NO SIRVE
            String filename = "testfile.xls";
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Ranking");
            int cantidad = 0; //ACA ME FIJO CUANTAS PERSONAS HAY PARA VER CUANTAS COLUMNAS TENGO QUE CREAR EN EL EXCEL.
            cantidad = sis.cantidadJugadores();
            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell(0).setCellValue("Nombre");
            rowhead.createCell(1).setCellValue("Edad");
            rowhead.createCell(2).setCellValue("Cantidad de partidas ganadas");

            for (int i = 0; i < cantidad; i++) {
                HSSFRow row = sheet.createRow((short) i+1);
                row.createCell(0).setCellValue((sis.getListaJugadores().get(i)).getNombre());
                row.createCell(1).setCellValue((sis.getListaJugadores().get(i)).getEdad());
                row.createCell(2).setCellValue((sis.getListaJugadores().get(i)).getJuegosGanados());
            }

            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("El archivo de excel fue correctamente creado.");

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public Excel() {
    }
}
