package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Protector {
    /*
    *
    *
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
        double vx0 = 0.003 * Math.random();
        double vy0 = 0.003 * Math.random();

        double vx1 = 0.003 * Math.random();
        double vy1 = 0.003 * Math.random();


        
        int i;
        int a = 0;

        while (true) {
            if (Math.abs(x0 + vx0) > 1.0) {
                vx0 = -vx0;
                a = 0;
            }
            if (Math.abs(y0 + vy0) > 1.0) {
                vy0 = -vy0;
                a = 0;
            }
            if (Math.abs(x1 + vx1) > 1.0) {
                vx1 = -vx1;
                a = 0;
            }
            if (Math.abs(y1 + vy1) > 1.0) {
                vy1 = -vy1;
                a = 0;
            }

            x0 += vx0;
            y0 += vy0;
            x1 += vx1;
            y1 += vy1;

            x2 = x0 - (a*2) * vx0;
            y2 = y0 - (a*2) * vy0;
            x3 = x1 - (a*2) * vx1;
            y3 = y1 - (a*2) * vy1;

            x4 = x0 - (a*4) * vx0;
            y4 = y0 - (a*4) * vy0;
            x5 = x1 - (a*4) * vx1;
            y5 = y1 - (a*4) * vy1;

            x6 = x0 - (a*6) * vx0;
            y6 = y0 - (a*6) * vy0;
            x7 = x1 - (a*6) * vx1;
            y7 = y1 - (a*6) * vy1;

            x8 = x0 - (a*8) * vx0;
            y8 = y0 - (a*8) * vy0;
            x9 = x1 - (a*8) * vx1;
            y9 = y1 - (a*8) * vy1;

            x11 = x0 - (a*10) * vx0;
            y11 = y0 - (a*10) * vy0;
            x12 = x1 - (a*10) * vx1;
            y12 = y1 - (a*10) * vy1;

            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x0, y0 ,x1, y1);
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x2, y2 ,x3, y3);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x4, y4 ,x5, y5);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(x6, y6 ,x7, y7);
            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.line(x8, y8 ,x9, y9);
            StdDraw.setPenColor(Color.ORANGE);
            StdDraw.line(x8, y8 ,x9, y9);
            StdDraw.setPenColor(Color.PINK);
            StdDraw.line(x11, y11 ,x12, y12);

            StdDraw.show();
            StdDraw.clear();
            a = 10;

        }
    }
}

