package Clase8;

import java.util.Scanner;
import java.lang.*;

public class MorseCodeCodec {
    public static void main(String[] args) {

        Boolean _anotherIteration = Boolean.TRUE;
        while (_anotherIteration) {
            Scanner _keyboard = new Scanner(System.in);
            System.out.println("Uso de Funciones Ejemplo 6 - Codificador/Decodificador de Codigo Morse.");
            System.out.println(" ");
            Boolean _invalidChoice = Boolean.FALSE;
            Integer _selectionOperation;
            do {
                System.out.println("Seleccione una de las opciones de conversion: ");
                System.out.println("[1] Texto a Codigo Morse.");
                System.out.println("[2] Codigo Morse a Texto.");
                System.out.println("[3] Salir.");
                System.out.print("Opcion: ");
                _selectionOperation = _keyboard.nextInt();
                if (_selectionOperation < 1 || _selectionOperation > 3) {
                    System.out.println("Por favor, ingresa una opcion valida.");
                    _invalidChoice = Boolean.TRUE;
                } else _invalidChoice = Boolean.FALSE;
            } while (_invalidChoice);
            if (_selectionOperation != 3) {
                System.out.print("Por favor, ingresa el texto que deseas convertir: ");
                String _convertedText ="";
                String _textToConvert = "";
                Scanner _stringInput = new Scanner(System.in);
                _textToConvert = _stringInput.nextLine();
                if (_selectionOperation.equals(1)) {
                    _convertedText = _getMorseCode(_textToConvert);
                } else if (_selectionOperation.equals(2)) {
                    _convertedText = _getTextConverted(_textToConvert);
                }
                System.out.print("El resultado de la conversion es: ");
                System.out.println(_convertedText);
            } else _anotherIteration = Boolean.FALSE;

        }
    }
    private static String _getMorseCode(String _textToConvertParm) {
        char[] _englishChars = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', ',', '.',
                '?', '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '_', '+',
                '=', '[', ']', '{', '}', '/', '\\', ';', ':', '<', '>', '\"', '\''
        };

        String[] _morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/",
                "--..--", ".-.-.-", "..--..", "-.-.--", ".--.-.", ".--.-.", ".-...", "-.--.", "...-..-", "-.--.-", "-....-",
                "-.-.-.", "-..-.", "-.--.", "-.--.-", "-...-", ".-..-.", ".--.-."
        };

        String _convertedText = "";
        if (_textToConvertParm.length() == 0) {
            _convertedText = "ERROR: No hay texto que convertir!";
            return _convertedText;
        };
        Integer _englishCharsArrayLength = _englishChars.length;
        char[] _stringArrayBuffer = _textToConvertParm.toCharArray();
        Integer _lengthTextToConvert = _stringArrayBuffer.length;
        for (int i = 0; i < _lengthTextToConvert; i++) {
            if (_stringArrayBuffer[i] == ' ') _convertedText = _convertedText + "/";
            else {
                Boolean _validChar = Boolean.FALSE;
                for (int j = 0; j < _englishCharsArrayLength; j++) {
                    if (_stringArrayBuffer[i] == _englishChars[j]) {
                        _validChar = Boolean.TRUE;
                        if (_convertedText.length() > 0 && _convertedText.charAt(_convertedText.length() - 1) == '/') _convertedText = _convertedText + _morseCode[j];
                        else if (_convertedText.length() == 0) _convertedText = _convertedText + _morseCode[j];
                            else _convertedText = _convertedText + ' ' + _morseCode[j];
                    }
                }
                if (!_validChar) return _convertedText = "ERROR: Caracter no valido!";
            }
        }
        return _convertedText;
    };

    private static String _getTextConverted(String _textToConvertParm) {
        char[] _englishChars = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', ',', '.',
                '?', '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '_', '+',
                '=', '[', ']', '{', '}', '/', '\\', ';', ':', '<', '>', '\"', '\''
        };

        String[] _morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/",
                "--..--", ".-.-.-", "..--..", "-.-.--", ".--.-.", ".--.-.", ".-...", "-.--.", "...-..-", "-.--.-", "-....-",
                "-.-.-.", "-..-.", "-.--.", "-.--.-", "-...-", ".-..-.", ".--.-."
        };

        String _convertedText = "";
        Integer _lengthTextToConvert = _textToConvertParm.length();
        if (_lengthTextToConvert == 0) {
            _convertedText = "ERROR: No hay texto que convertir!";
            return _convertedText;
        };
        Integer _morseCodeArrayLength = _morseCode.length;
        String _addSpacesToTextParm = _textToConvertParm.replace("/", " / ");
        _textToConvertParm = _addSpacesToTextParm;
        String[] _arrayMorseCodeWords = _textToConvertParm.split(" ",0);
        Integer _arrayMorseCodeWordsLength = _arrayMorseCodeWords.length;
        for (int i = 0; i < _arrayMorseCodeWordsLength; i++) {
            if(_arrayMorseCodeWords[i].equals("/")) _arrayMorseCodeWords[i] = " ";
            else {
                Boolean _validMorseCode = Boolean.FALSE;
                for (int j = 0; j < _morseCodeArrayLength; j++) {
                    if (_arrayMorseCodeWords[i].equals(_morseCode[j])) {
                        _arrayMorseCodeWords[i] = String.valueOf(_englishChars[j]).toUpperCase();
                        _validMorseCode = Boolean.TRUE;
                    }
                }
                if (!_validMorseCode) return _convertedText = "ERROR: Caracter no valido!";
            }
        }
    return _convertedText = _joinArrayToString(_arrayMorseCodeWords);
   }

   private static String _joinArrayToString(String[] _arrayMorseCodeWordsParm) {
        Integer _arrayMorseCodeWordsParmLength = _arrayMorseCodeWordsParm.length;
        String _textPhrase = "";
        for (int i = 0; i < _arrayMorseCodeWordsParmLength; i++)
            _textPhrase = _textPhrase + _arrayMorseCodeWordsParm[i];
        return _textPhrase;
   }
}
