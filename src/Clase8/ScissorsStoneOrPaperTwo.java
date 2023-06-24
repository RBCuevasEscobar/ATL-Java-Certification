package Clase8;

import java.util.Random;
import java.util.Scanner;

public class ScissorsStoneOrPaperTwo {
    public static void main(String[] args) {
        System.out.println("Uso de Funciones Ejemplo 5 - Juego de Piedra, Papel o Tijeras.");
        Scanner _keyboard = new Scanner(System.in);
        Boolean _oneMoreTry = Boolean.TRUE;
        String _userChoiceString = "";
        while (_oneMoreTry) {
            String _oneMoreGame = "";
            Boolean _invalidChoice = Boolean.FALSE;
            Random _randomNumber = new Random();
            Integer _selectChoice = _randomNumber.nextInt(3);
            String _systemChoiceString = _getValidOption(_selectChoice);
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
            _userChoiceString = _getValidOption(_selectChoice);
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
    static private String _getValidOption(Integer _selectChoice) {
        String[] _validOptions = {"Piedra", "Papel", "Tijeras"};
        return _validOptions[_selectChoice];
    }
}
