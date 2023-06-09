package Clase5;

import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de Propinas. ");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa el total de la cuenta: ");
        float _billAmount = _keyboard.nextFloat();
        System.out.print("Ingresa el porcentaje de propina: ");
        float _tipRate = _keyboard.nextFloat();
        System.out.println("Con base en el porcentaje " + _tipRate + " del total de la cuenta, que es " + _billAmount + ", la propina para el mesero es " + (_billAmount * _tipRate / 100));
    }
}
