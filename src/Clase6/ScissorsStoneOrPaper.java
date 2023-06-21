package Clase6;


import java.util.Random;
import java.util.Scanner;

public class ScissorsStoneOrPaper {
    public static void main(String[] args) {
        System.out.println("Uso de Operadores Logicos Ejemplo 5 - Juego de Piedra, Papel o Tijeras.");
        Scanner _keyboard = new Scanner(System.in);
        Random _randomNumber = new Random();
        Boolean _oneMoreTry = Boolean.TRUE;
        String _userChoiceString = "";
        String _systemChoiceString = "";
        while (_oneMoreTry) {
            String _oneMoreGame = "";
            Boolean _invalidChoice = Boolean.FALSE;
            Integer _selectChoice = _randomNumber.nextInt(3);
            if (_selectChoice == 0) _systemChoiceString = "Piedra";
            if (_selectChoice == 1) _systemChoiceString = "Papel";
            if (_selectChoice == 2) _systemChoiceString = "Tijeras";
            System.out.println(" ");
            do {
                System.out.print("Ingresa tu opcion - [0]-Piedra, [1]-Papel o [2]-Tijeras: ");
                _selectChoice = _keyboard.nextInt();
                if (_selectChoice < 0 || _selectChoice > 2) {
                    System.out.println("Por favor, ingresa una opcion valida.");
                    _invalidChoice = Boolean.TRUE;
                }
                else _invalidChoice = Boolean.FALSE;
            } while (_invalidChoice);
            if (_selectChoice == 0) _userChoiceString = "Piedra";
            if (_selectChoice == 1) _userChoiceString = "Papel";
            if (_selectChoice == 2) _userChoiceString = "Tijeras";
            System.out.println("Tu opcion es: " + _userChoiceString);
            System.out.println("La opcion del sistema es: " + _systemChoiceString);
            if (_systemChoiceString.equals(_userChoiceString)) System.out.println("Es un empate!");
            else
                if ((_systemChoiceString.equals("Piedra") && _userChoiceString.equals("Papel")) || (_systemChoiceString.equals("Papel") && _userChoiceString.equals("Tijeras")) || (_systemChoiceString.equals("Tijeras") && _userChoiceString.equals("Piedra")))
                    System.out.println("Tu ganas!");
                else System.out.println("El sistema gano!");
            System.out.println(" ");
            System.out.print("Deseas jugar otra vez? [S/N]: ");
            _oneMoreGame = _keyboard.next().toUpperCase();
            if (_oneMoreGame.equals("N")) _oneMoreTry = Boolean.FALSE;
        }
    }
}
