package Clase6;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Integer _totalSumNumbers = 0;
        float _averageNumber = 0;
        System.out.println("Uso de Tipos de Datos Ejemplo 5 - Promedio de numeros.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa numero 1: ");
        Integer _enteredNumber = _keyboard.nextInt();
        _totalSumNumbers = _totalSumNumbers + _enteredNumber;
        System.out.print("Ingresa numero 2: ");
        _enteredNumber = _keyboard.nextInt();
        _totalSumNumbers = _totalSumNumbers + _enteredNumber;
        System.out.print("Ingresa numero 3: ");
        _enteredNumber = _keyboard.nextInt();
        _totalSumNumbers = _totalSumNumbers + _enteredNumber;
        _averageNumber = (float)_totalSumNumbers / 3;
        System.out.print("El promedio de los numeros ingresados es: " + _averageNumber);
    }
}
