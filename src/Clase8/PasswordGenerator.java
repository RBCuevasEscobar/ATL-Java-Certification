package Clase8;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Integer _charLongPassword = 8;
        String _newPassword = _getNewPasword(_charLongPassword);
        System.out.println(_newPassword);
    }

    static private String _getNewPasword(Integer _charLongPasswordParm) {
        String[] _validNumbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] _validCharacters = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "!", "@", "#", "$", "%", "&"
        };
        Integer _passwordLength = 0;
        Boolean _passwordLenghtCompleted = Boolean.FALSE;
        String _newPassword = "";
        do {
                _newPassword = _newPassword + _getNewCharacter(_validCharacters);
                _passwordLength = _passwordLength + 1;
                _newPassword = _newPassword + _getNewNumber(_validNumbers);
                _passwordLength = _passwordLength + 1;
                if (_passwordLength.equals(_charLongPasswordParm)) _passwordLenghtCompleted = Boolean.TRUE;
        } while(!_passwordLenghtCompleted);
        return _newPassword;
    }
    static private String _getNewCharacter(String[] _validCharactersArray) {
        Random _randomNumber = new Random();
        Integer _newCharacterIndex = _randomNumber.nextInt(_validCharactersArray.length);
        String _newCharacter = _validCharactersArray[_newCharacterIndex];
        return _newCharacter;
    }
    static private String _getNewNumber(String[] _validNumbersArray) {
        Random _randomNumber = new Random();
        Integer _newNumberIndex = _randomNumber.nextInt(_validNumbersArray.length);
        String _newNumber = _validNumbersArray[_newNumberIndex];
        return _newNumber;
    }
}


