package Clase5;

import java.util.Scanner;
public class DogAgeCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de edad de tu perro. ");
        System.out.print("Ingresa la edad de tu perro en años: ");
        Scanner _keyboard = new Scanner(System.in);
        Integer _dogAge = _keyboard.nextInt();
        System.out.println("La edad de tu perro en años humanos es: " + _dogAge * 7 + " años.");
    }

}
