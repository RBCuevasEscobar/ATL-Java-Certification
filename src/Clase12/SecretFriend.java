package Clase12;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecretFriend {
    static List<String> _friendList = new ArrayList<>();

    public static void main(String[] args) {

        _setFriendsList(_friendList);
        _getFriendsList();
        _matchFriends(_friendList);
    }

    public static void _setFriendsList(List<String> _friendListParm) {
        Boolean _addOneMoreFriend = Boolean.TRUE;
        Scanner _keyboard = new Scanner(System.in);

        while(_addOneMoreFriend) {
            String _newFriend = "";
            System.out.print("Ingrese el nombre: ");
            _newFriend = _keyboard.nextLine().toUpperCase();
            _friendListParm.add(_newFriend);
            System.out.println(" ");
            System.out.print("Deseas agregar otro amigo?[S/N]: ");
            String _userChoice = _keyboard.nextLine().toUpperCase();
            if (_userChoice.equals("N")) {
                _addOneMoreFriend = Boolean.FALSE;
            }
        }
    }

    public static void _getFriendsList() {
        Integer _lengthFriendsList = _friendList.size();

        System.out.println("La lista de amigos registrados es: " + _friendList);
/*        for (int i = 0; i < _lengthFriendsList; i++) {
            System.out.println(_friendList.get(i));
        }
*/    }

    public static void _matchFriends(List<String> _friendListParm) {
        List<String> _chosenFriends = new ArrayList<>();
        List<String> _matchedFriendsList = new ArrayList<>();
        List<String> _selectorsAlreadyChoose = new ArrayList<>();
        Random _randomNumber = new Random();
        Scanner _keyboard = new Scanner(System.in);
        Boolean _friendsToSelect = Boolean.TRUE;

        while (_friendsToSelect) {
            List<String> _bagFriendsToPick = new ArrayList<>();
            _bagFriendsToPick.addAll(_friendListParm);
            String _giftDeliveringFriend = "";
            String _matchingFriend = "";
            Boolean _selectorHasChoose = Boolean.FALSE;
            do {
                System.out.print("Ingresa tu nombre: ");
                _giftDeliveringFriend = _keyboard.nextLine().toUpperCase();
                if (_selectorsAlreadyChoose.contains(_giftDeliveringFriend)) {
                    System.out.println("Ya tiene asignado su amigo secreto!");
                    _selectorHasChoose = Boolean.TRUE;
                }
                else _selectorHasChoose = Boolean.FALSE;
            } while (_selectorHasChoose);
            _bagFriendsToPick.remove(_giftDeliveringFriend);
            if (_chosenFriends.size() > 0) {
                for (String _friendToSearch : _friendListParm) {
                    if (_chosenFriends.contains(_friendToSearch)) _bagFriendsToPick.remove(_friendToSearch);
                }
            }
            Integer _lengthFriendsToPick = _bagFriendsToPick.size();
            if (_lengthFriendsToPick.equals(0)) {
                System.out.println("El selector se regala a si mismo. Sorteo se repite!");
                break;
            }
            else {
                int _IndexFriendsToPick = _randomNumber.nextInt(_lengthFriendsToPick);
                _matchingFriend = _bagFriendsToPick.get(_IndexFriendsToPick);
                System.out.println(" ");
                System.out.println("Tu amigo secreto es: " + _matchingFriend);
                _matchedFriendsList.add(_giftDeliveringFriend + " , " + _matchingFriend);
                _chosenFriends.add(_matchingFriend);
                _selectorsAlreadyChoose.add(_giftDeliveringFriend);
            }
            if (_chosenFriends.size() == _friendListParm.size()) {
                System.out.println("La lista de amigos secretos es: ");
                for (String _matchingFriends : _matchedFriendsList) System.out.println(_matchingFriends);
                _friendsToSelect = Boolean.FALSE;
            }
        }
    }
}
