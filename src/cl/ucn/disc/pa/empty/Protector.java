package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Protector {
    /*
     *Protector de pantalla.
     *
     *@author Fabian Fernandez Rodriguez
     */
    public static void main(String[] args) {

        //Rango de dibujo
        double min = -1.0;
        double max = 1.0;

        //Escala del lienzo
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        //Posición inicial
        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();
        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        //Variables para el resto de lineas
        double x2 = 0;
        double y2 = 0;
        double x3 = 0;
        double y3 = 0;

        double x4 = 0;
        double y4 = 0;
        double x5 = 0;
        double y5 = 0;

        double x6 = 0;
        double y6 = 0;
        double x7 = 0;
        double y7 = 0;

        double x8 = 0;
        double y8 = 0;
        double x9 = 0;
        double y9 = 0;

        double x11 = 0;
        double y11 = 0;
        double x12 = 0;
        double y12 = 0;

        //Velocidad inicial
        double vx0 = 0.004 * Math.random();
        double vy0 = 0.004 * Math.random();

        double vx1 = 0.004 * Math.random();
        double vy1 = 0.004 * Math.random();

        //color random
        Color[] colores = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.pink, Color.MAGENTA, Color.ORANGE, Color.BLACK, Color.WHITE};

        int i = 0;
        while (true) {
            //Ciclo para cambio el color del fondo
            for (i=0;i<=300;i++) {
                //Colosion
                if (Math.abs(x0 + vx0) > 1.0) {
                    vx0 = -vx0;
                }
                if (Math.abs(y0 + vy0) > 1.0) {
                    vy0 = -vy0;
                }
                if (Math.abs(x1 + vx1) > 1.0) {
                    vx1 = -vx1;
                }
                if (Math.abs(y1 + vy1) > 1.0) {
                    vy1 = -vy1;
                }
                //Posicion de X Y de la linea principal
                x0 += vx0;
                y0 += vy0;
                x1 += vx1;
                y1 += vy1;

                //Posicion de X Y de el resto de lineas
                x2 = x0 - 20 * vx0;
                y2 = y0 - 20 * vy0;
                x3 = x1 - 20 * vx1;
                y3 = y1 - 20 * vy1;

                x4 = x0 - 40 * vx0;
                y4 = y0 - 40 * vy0;
                x5 = x1 - 40 * vx1;
                y5 = y1 - 40 * vy1;

                x6 = x0 - 60 * vx0;
                y6 = y0 - 60 * vy0;
                x7 = x1 - 60 * vx1;
                y7 = y1 - 60 * vy1;

                x8 = x0 - 80 * vx0;
                y8 = y0 - 80 * vy0;
                x9 = x1 - 80 * vx1;
                y9 = y1 - 80 * vy1;

                x11 = x0 - 100 * vx0;
                y11 = y0 - 100 * vy0;
                x12 = x1 - 100 * vx1;
                y12 = y1 - 100 * vy1;

                //Color de la linea ; forma de la linea
                StdDraw.setPenColor(Color.BLUE);
                StdDraw.line(x0, y0, x1, y1);
                StdDraw.setPenColor(Color.RED);
                StdDraw.line(x2, y2, x3, y3);
                StdDraw.setPenColor(Color.GREEN);
                StdDraw.line(x4, y4, x5, y5);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.line(x6, y6, x7, y7);
                StdDraw.setPenColor(Color.MAGENTA);
                StdDraw.line(x8, y8, x9, y9);
                StdDraw.setPenColor(Color.ORANGE);
                StdDraw.line(x8, y8, x9, y9);
                StdDraw.setPenColor(Color.PINK);
                StdDraw.line(x11, y11, x12, y12);

                StdDraw.show();

                //Cambio de color de fondo
                if (i+1 <= 100) {
                    StdDraw.clear(Color.yellow);
                }
                else if (i+1 <= 200){
                    StdDraw.clear(Color.CYAN);
                }
                else if (i+1 <= 300){
                    StdDraw.clear(Color.DARK_GRAY);
                }
            }
        }
    }
}

