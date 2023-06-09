package Clase5;

import java.util.Scanner;
public class MilesToKilometersConverter {
    public static void main(String[] args) {
        System.out.println("Convertidor de Millas a Kilometros. ");
        System.out.print("Ingresa la distancia en Millas: ");
        Scanner _keyboard = new Scanner(System.in);
        Integer _dogAge = _keyboard.nextInt();
        System.out.println("La distancia en Kilometros es: " + _dogAge * 1.60934);
    }
}
