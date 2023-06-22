package Clase7;

import java.util.Scanner;

public class AverageOfNumberSet {
    public static void main(String[] args) {
        System.out.println("Uso de Arrays Ejemplo 3 - Despliega el valor promedio de un conjunto ingresado.");
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

        float _arrayAddition = 0;
        for(int i = 0; i < _arrayLength; i++) _arrayAddition = _arrayAddition + _numberArray[i];

        System.out.println("La suma total de este conjunto es: " + _arrayAddition);

        float _floatNumberQty = _numberQty;
        System.out.println("El valor promedio de este conjunto es: " + _arrayAddition / _floatNumberQty);
    }
}
