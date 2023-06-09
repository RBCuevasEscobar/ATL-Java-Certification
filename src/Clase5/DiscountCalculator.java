package Clase5;

import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de Descuento. ");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa el precio del producto: ");
        float _productPrice = _keyboard.nextFloat();
        System.out.print("Ingresa el porcentaje de descuento: ");
        float _discountRate = _keyboard.nextFloat();
        System.out.println("El precio final del producto, con el descuento de " + _discountRate + " aplicado, es: " + (_productPrice - (_productPrice * _discountRate / 100)));
    }
}
