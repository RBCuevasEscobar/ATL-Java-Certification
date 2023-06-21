package Clase6;

import java.util.Scanner;

public class HigherAndLowerNumbers {
    public static void main(String[] args) {
        System.out.println("Uso de Tipos de Datos Ejemplo 6 - Numeros mayor y menor.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa numero entero 1: ");
        Integer _enteredNumber = _keyboard.nextInt();
        Integer _higherNumber = _enteredNumber;;
        Integer _lowerNumber = _enteredNumber;;
        System.out.print("Ingresa numero entero 2: ");
        _enteredNumber = _keyboard.nextInt();
        if (_enteredNumber > _higherNumber) _higherNumber = _enteredNumber;
        if (_enteredNumber < _lowerNumber) _lowerNumber = _enteredNumber;
        System.out.print("Ingresa numero entero 3: ");
        _enteredNumber = _keyboard.nextInt();
        if (_enteredNumber > _higherNumber) _higherNumber = _enteredNumber;
        if (_enteredNumber < _lowerNumber) _lowerNumber = _enteredNumber;
        System.out.print("El numero mas alto es: " + _higherNumber + " y el mas bajo es: " + _lowerNumber);
    }

}
