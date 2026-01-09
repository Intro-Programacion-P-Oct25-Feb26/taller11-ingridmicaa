/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.util.Locale;
import java.util.Scanner;

public class Problema6 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = mediaAritmetica(informacion);
        double desviacion = desviacionEstandar(informacion, media);

        System.out.printf("Media aritmética:\n %.2f\nDesviación estándar:\n "
                + "%.2f\n ",media, desviacion);
    }

    public static double mediaAritmetica(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i] ;
        }
        return suma/ arreglo.length;
    }

    public static double desviacionEstandar(int[] arreglo, double media) {
        double sumaCuadrados = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaCuadrados = sumaCuadrados + Math.pow(arreglo[i] - media, 2);
        }
        return Math.sqrt(sumaCuadrados / arreglo.length);
    }
}
