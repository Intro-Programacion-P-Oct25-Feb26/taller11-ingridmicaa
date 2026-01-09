/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import java.util.Locale;
import static paquete03.Problema3.obtenerAreaCuadrado;
import static paquete03.Problema3.obtenerAreaRectangulo;
import static paquete03.Problema3.obtenerAreaTriangulo;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        String cedula;
        int opcion;
        String respuesta;

        System.out.println("Ingrese su primer nombre y primer apellido");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su cédula");
        cedula = entrada.nextLine();

        System.out.println("Ingrese 1: Calcular Valor Luz, 2: Calcular Predio");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;

            default:
                System.out.println("Inválida");

        }
    }

    public static void calcularValorLuz(String a, String b) {
        double kilowatio;
        double kilowatio_m;
        double total;
        System.out.println("Ingrese valor del kilowatio");
        kilowatio = entrada.nextDouble();

        System.out.println("Ingrese el número de kilowatios del mes");
        kilowatio_m = entrada.nextDouble();

        total = kilowatio * kilowatio_m;

        System.out.println("Cliente " + a + ""
                + " con cédula " + b + " " + "debe cancelar el valor de $"
                + total);

    }

    public static void calcularPredio(String a, String b) {

        double inmueble;
        double total;
        System.out.println("Ingrese valor del inmueble para el predio");
        inmueble = entrada.nextDouble();

        total = inmueble * 0.02;

        System.out.println("Cliente " + a + ""
                + " con cédula " + b + " " + "tiene un bien inmueble "
                + "valorado en $ "
                + inmueble + " y tiene que pagar de predio $" + total);

    }

}
