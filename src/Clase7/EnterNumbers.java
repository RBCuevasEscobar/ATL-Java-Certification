package Clase7;

import java.util.Scanner;
public class EnterNumbers {
    public static void main(String[] args) {
        Float[] _numberArray = new Float[5];
        Integer _arrayLength = _numberArray.length;
        System.out.println("Uso de Arrays Ejemplo 1 - Captura de numeros.");
        Scanner _keyboard = new Scanner(System.in);
        Integer _counterNumber = 0;
        for (int i = 0; i < _arrayLength; i++) {
            _counterNumber = i + 1;
            System.out.print("Ingresa numero " + _counterNumber + ": ");
            _numberArray[i] = _keyboard.nextFloat();
        }
        System.out.println("Los numeros ingresados son: ");
        _counterNumber = 0;
        for (int i = 0; i < _arrayLength; i++) {
            _counterNumber = i + 1;
            System.out.println("Numero " + _counterNumber + ": " + _numberArray[i]);
        }
    }
}
