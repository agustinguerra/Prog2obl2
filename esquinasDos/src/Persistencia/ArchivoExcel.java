package Persistencia;

import Dominio.Sistema;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ArchivoExcel {

    //ESTE METODO CREA UN EXCEL A PARTIR DEL RANKING
    public void crearExcel(Sistema sis, String nombreArchivo, String path) {
        try {
            //PARA HACER LA PARTE DEL NOMBRE Y LA UBICACION, TENGO QUE HACERLO CUANDO ESTEN LAS VENTANAS HECHAS, SI LO HAGO ACA ES CODIGO QUE DESPUES NO SIRVE
            String filename = nombreArchivo + ".xls";
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Ranking");
            int cantidad; //ACA ME FIJO CUANTAS PERSONAS HAY PARA VER CUANTAS COLUMNAS TENGO QUE CREAR EN EL EXCEL.
            cantidad = sis.cantidadJugadores();
            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell(0).setCellValue("Nombre");
            rowhead.createCell(1).setCellValue("Edad");
            rowhead.createCell(2).setCellValue("Cantidad de partidas ganadas");

            for (int i = 0; i < cantidad; i++) {
                HSSFRow row = sheet.createRow((short) i + 1);
                row.createCell(0).setCellValue((sis.getListaJugadores().get(i)).getNombre());
                row.createCell(1).setCellValue((sis.getListaJugadores().get(i)).getEdad());
                row.createCell(2).setCellValue((sis.getListaJugadores().get(i)).getJuegosGanados());
            }

            FileOutputStream fileOut = new FileOutputStream(path + "\\" + filename);
            System.out.println(path);
            System.out.println(filename);
            workbook.write(fileOut);
            fileOut.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //CONSTRUCTOR DE LA CLASE ARCHIVO EXCEL
    public ArchivoExcel() {

    }
}
