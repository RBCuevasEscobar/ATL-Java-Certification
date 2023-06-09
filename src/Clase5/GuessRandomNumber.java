package Clase5;

import java.util.Scanner;
import java.util.Random;
public class GuessRandomNumber {
    public static void main(String[] args) {
        System.out.println("Juego de adivinar el numero aleatorio. ");
        Scanner _keyboard = new Scanner(System.in);
        Random _randomNumber = new Random();
        int _systemNumber = _randomNumber.nextInt(100);
        boolean _successGuessing = false;
        System.out.println("El numero oculto es " + _systemNumber);
        for (int i = 1; i < 4; i++) {
            System.out.print("Intento numero " + i + " para adivinar el numero. Ingresa la cifra que tu crees: ");
            int _userNumber = _keyboard.nextInt();
            if (_userNumber == _systemNumber) {
                System.out.println("Adivinaste! El numero oculto es " + _systemNumber + " y lo adivinaste al intento numero " + i + ".");
                _successGuessing = true;
                break;
            }
        }
        if (_successGuessing == false) {
            System.out.println("Lo siento. El numero oculto es " + _systemNumber + ". Mas suerte la proxima vez");
        }
    }
}
