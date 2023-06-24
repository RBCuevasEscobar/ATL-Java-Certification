package Clase8;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {

        System.out.println("Funciones Ejemplo 2 - Calculo del Area de un Triangulo.");
        System.out.println(" ");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base del triangulo: ");
        Float _triangleBaseLong = _keyboard.nextFloat();
        System.out.print("Ingrese la altura del triangulo: ");
        System.out.println(" ");
        Float _triangleHeightLong = _keyboard.nextFloat();
        Float _triangleArea = _getTriangleArea(_triangleBaseLong, _triangleHeightLong);
        System.out.print("El area del triangulo es: " + _triangleArea);
    }

    static private Float _getTriangleArea(Float _triangleBaseLongParm, Float _triangleHeightLongParm) {
        return (_triangleBaseLongParm * _triangleHeightLongParm) / 2;
    }
}
