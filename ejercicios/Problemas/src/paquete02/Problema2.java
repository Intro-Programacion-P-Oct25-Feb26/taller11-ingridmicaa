/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {
 static Scanner entrada = new Scanner(System.in);
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        String vivienda[] = nombresVivienda();
        double gastoMensual[][] = gastoMensual(vivienda);
        double gastoAnual[] = gastoAnual(gastoMensual);
        reporte(vivienda, gastoAnual);

    }

    public static String[] nombresVivienda() {
        
        String nombre;
        String m[] = new String[10];
        for (int i = 0; i < m.length; i++) {
            System.out.println("El número de viviendas es:");
            nombre = entrada.nextLine();
            m[i] = nombre;
        }
        return m;
    }

    public static double[][] gastoMensual(String[] vivienda) {
       
        double m[][] = new double[10][12];

        for (int i = 0; i < m.length; i++) {
            System.out.println("Registro de consumos para la vivienda: " + vivienda[i]);
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Ingrese gasto del mes " + (j + 1) + ": ");
                m[i][j] = entrada.nextDouble();
            }
        }
        return m;
    }

    public static double[] gastoAnual(double[][] gasto) {
        double[] m = new double[gasto.length];
        for (int i = 0; i < gasto.length; i++) {
            double suma = 0;
            for (int j = 0; j < gasto[i].length; j++) {
                suma += gasto[i][j];
            }
            m[i] = suma;
        }
        return m;
    }

    public static void reporte(String[] vivienda, double[] gasto) {
       
        String cadena = "";

        for (int i = 0; i < vivienda.length; i++) {
            
cadena = String.format("%sVivienda %s\nGasto Anual:%.2f\n", cadena,
                    vivienda[i], gasto[i]);
        }
        System.out.printf(cadena);
    }
}
