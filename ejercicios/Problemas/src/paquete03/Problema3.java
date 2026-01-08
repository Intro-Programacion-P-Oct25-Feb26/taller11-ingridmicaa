/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        String respuesta;

        System.out.println("Ingrese el área a calcular 1:cuadrado, 2:triangulo"
                + " 3:rectángulo");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Inválida");
        }
    }

    public static void obtenerAreaCuadrado() {
        double lado;
        double area;
        System.out.println("Ingrese la longuitud del lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El área es:%s\n", area);

    }

    public static void obtenerAreaTriangulo() {
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del Triángulo");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del Triángulo");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;
        System.out.printf("El área es:%s\n", area);

    }

    public static void obtenerAreaRectangulo() {
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del Rectángulo");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del Rectángulo");
        altura = entrada.nextDouble();

        area = base * altura;
        System.out.printf("El área es:%s\n", area);

    }
}

