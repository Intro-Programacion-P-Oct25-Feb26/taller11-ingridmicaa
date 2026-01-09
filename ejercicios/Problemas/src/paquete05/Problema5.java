/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

public class Problema5 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] suma = sumaMatrices(informacion, informacion2);
        String cadena = "";
        System.out.println("El resultado de la suma de las matrices es:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                cadena = cadena + String.format("%d\t", suma[i][j]);
            }
            cadena = cadena + "\n";
        }
        System.out.printf(cadena);
    }

    public static int[][] sumaMatrices(int[][] a, int[][] b) {

        int[][] resultado = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
}
