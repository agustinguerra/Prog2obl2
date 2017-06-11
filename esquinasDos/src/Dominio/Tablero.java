package Dominio;

import java.io.Serializable;

public class Tablero implements Serializable {

    //VARIABLE PRIVADA DE LA CLASE TABLERO
    private Ficha[][] matriz;

    //METODOS DE ACCESO Y MODIFICACION DE LA CLASE TABLERO
    public Ficha[][] getMatriz() {
        return matriz;
    }

    //METODO QUE COPIA EL TABLERO
    public Tablero copiarTablero() {
        Tablero tabCopia = new Tablero();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tabCopia.getFicha(i, j).setValor(this.getFicha(i, j).getValor());
                switch (this.getFicha(i, j).getColor()) {
                    case Ficha.ANSI_BLUE:
                        tabCopia.getFicha(i, j).setColor(2);
                        break;
                    case Ficha.ANSI_RED:
                        tabCopia.getFicha(i, j).setColor(1);
                        break;
                    default:
                        tabCopia.getFicha(i, j).setColor(0);
                        break;
                }
            }
        }
        return tabCopia;
    }

    //METODO DE MODIFICACION DE MATRIZ
    public void setMatriz(Ficha[][] matriz) {
        this.matriz = matriz;
    }

    //METODO QUE PERMITE OBETENER UNA FICHA DEL TABLERO
    public Ficha getFicha(int i, int j) {
        return this.matriz[i][j];
    }

    //CONSTRUCTOR CON PARAMETROS DE LA CLASE TABLERO
    public Tablero(Ficha[][] matriz) {
        this.matriz = matriz;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = new Ficha(Ficha.ANSI_BLACK, 0);
            }
        }
    }

    //LE DAS LA FICHA, Y TE DEVUELVE LA STRING CON EL VALOR YA PINTADO DEL COLOR CORRECTO
    public String stringFicha(Ficha fich) {
        String fichaParaImprimir = " ";
        if (fich.getValor() > 0) {
            fichaParaImprimir = fich.getColor() + fich.getValor() /*+ ANSI_RESET*/;
        }
        return fichaParaImprimir;
    }
    
    //CONSTRUCTOR VACIO DE LA CLASE TABLERO
    public Tablero() {
        this.matriz = new Ficha[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = new Ficha(Ficha.ANSI_BLACK, 0);
            }
        }
    }
}
