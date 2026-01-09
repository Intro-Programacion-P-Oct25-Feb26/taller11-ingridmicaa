/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

public class Problema7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ciudades = obtenerArregloCiudades();
        obtenerCiudades4y5(ciudades);

    }

    public static String[] obtenerArregloCiudades() {
        int n;

        System.out.println("Ingrese el número de ciudades:");
        n = entrada.nextInt();
        entrada.nextLine();
        String[] ciudades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese ciudad #" + (i + 1) + ":");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static String[] obtenerCiudades4y5(String[] arreglo) {
        System.out.println("Ciudades con 4 o 5 caracteres");
        for (String ciudad : arreglo) {
            if (ciudad.length() == 4 || ciudad.length() == 5) {
                System.out.println(ciudad);
            }
        }
    
    
