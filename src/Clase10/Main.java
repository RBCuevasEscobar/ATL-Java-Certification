package Clase10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Main {
    static ClassPersona[] _personArray = new ClassPersona[10];

    public static void main(String[] args) {
        Boolean _addOneMorePerson = Boolean.TRUE;
        Integer _personArrayIndex = 0;
        Integer _personId = _personArrayIndex + 1;

        Scanner _keyboard = new Scanner(System.in);
        System.out.println("Sistema de Gestion de Personas");
        while (_addOneMorePerson) {
            _personArray[_personArrayIndex] = _getNewPersona(_personId);
            _personId++;
            _personArrayIndex++;
            System.out.println(" ");
            System.out.print("Desea agregar informacion de otra persona? [S/N]: ");
            String _userResponse = _keyboard.nextLine().toUpperCase();
            if (_userResponse.equals("N")) _addOneMorePerson = Boolean.FALSE;
        }
        _getAllPersonas();
    }

    public static ClassPersona _getNewPersona(Integer _personIdParm) {
        String _personName;
        String _dateString;
        LocalDate _personDateOfBirth;
        String _personDNI;
        Scanner _keyboard = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ingrese el nombre: ");
        _personName = _keyboard.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (dd/MM/YYYY): ");
        _dateString = _keyboard.nextLine();
        _personDateOfBirth = _stringToDate(_dateString);
        System.out.print("Ingrese el documento DNI: ");
        _personDNI = _keyboard.nextLine();
        System.out.println(" ");
        ClassPersona _persona = new ClassPersona(_personIdParm, _personName, _personDateOfBirth, _personDNI);
        System.out.println("La siguiente informacion de la persona fue guardada en la BD: ");
        _persona._getPersona();
        return _persona;
    }

    public static LocalDate _stringToDate(String _dateStringParm) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate _dateParse = LocalDate.parse(_dateStringParm, formatter);
        return _dateParse;
    }

    public static void _getAllPersonas() {
        Integer _lengthPersonArray = _personArray.length;
        for (int i = 0; i < _lengthPersonArray; i++) if (_personArray[i] != null) {
            _personArray[i]._getPersona();
            if(_personArray[i]._getIsAdult()) System.out.println("Esta persona es mayor de edad.");
            else System.out.println("Esta persona NO es mayor de edad!");
            System.out.println(" ");
        }
    }


}