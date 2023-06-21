package Clase7;

import java.util.Scanner;

public class GuessHigherAndLowerNumbers {

    public static void main(String[] args) {

        System.out.println("Uso de Arrays Ejemplo 2 - Despliega el numero mayor y menor de un conjunto ingresado.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Cuantos numeros deseas ingresar? : ");
        Integer _numberQty = _keyboard.nextInt();
        Integer _counterNumber = 0;
        Float[] _numberArray = new Float[_numberQty];
        Integer _arrayLength = _numberArray.length;
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

        Float _higherNumber = _numberArray[0];
        Float _lowerNumber = _numberArray[0];
        for(int i = 1; i < _arrayLength; i++) {
            if (_numberArray[i] > _higherNumber) _higherNumber = _numberArray[i];
            if (_numberArray[i] < _lowerNumber) _lowerNumber = _numberArray[i];
        }
        System.out.println("El numero mayor de este conjunto es: " + _higherNumber);
        System.out.println("El numero menor de este conjunto es: " + _lowerNumber);
    }
}
