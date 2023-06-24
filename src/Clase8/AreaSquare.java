package Clase8;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {

        System.out.println("Funciones Ejemplo 1 - Calculo del Area de un Cuadrado.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        Float _squareSideLong = _keyboard.nextFloat();
        Float _squareArea = _getSquareArea(_squareSideLong);
        System.out.print("El area del cuadrado es: " + _squareArea);
    }

    static private Float _getSquareArea(Float _squareSideLongParm) {
        return _squareSideLongParm * _squareSideLongParm;
    }
}
