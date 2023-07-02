package Clase10;

import java.nio.channels.FileLock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Main {
//    static ClassPersona[] _personArray = new ClassPersona[10];

    public static void main(String[] args) {
/*        Boolean _addOneMorePerson = Boolean.TRUE;
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
*/
        ClassAccount[] _accountArray = new ClassAccount[10];

        Scanner _keyboard = new Scanner(System.in);
        Integer _indexAccountArray = 0;
        Integer _accountNumberValue = _indexAccountArray + 1;
        Boolean _moreTransactions = Boolean.TRUE;
        Integer _userSelection;
        String _userChoice = "";

        System.out.println("Sistema de gestion de cuentas bancarias");
        System.out.println(" ");
        while (_moreTransactions) {
            System.out.println("Seleccione tipo de transaccion a realizar: ");
            System.out.println(" ");
            System.out.println("1. Apertura de cuenta");
            System.out.println("2. Deposito en cuenta");
            System.out.println("3. Retiro de cuenta");
            System.out.println("4. Consulta saldo de la cuenta");
            System.out.println("5. Reporte de Cuentas");
            System.out.println("6. Salir");
            System.out.println(" ");
            Boolean _invalidSelection = Boolean.FALSE;
            do {
                System.out.print("Ingrese la opcion [1-5]: ");
                _userSelection = _keyboard.nextInt();
                if (_userSelection < 1 || _userSelection > 6) {
                    _invalidSelection = Boolean.TRUE;
                    System.out.println("Favor ingresar una opcion valida.");
                }
                else _invalidSelection = Boolean.FALSE;
            } while (_invalidSelection);
            switch (_userSelection) {
                case 1:
                    _accountArray[_indexAccountArray] = _getNewAccount(_accountNumberValue);
                    System.out.println(" ");
                    _accountArray[_indexAccountArray]._getAccountData();
                    _indexAccountArray++;
                    _accountNumberValue++;
                    System.out.println(" ");
                    break;
                case 2:
                   _setAccountDeposit(_accountArray);
                    break;
                case 3:
                    _setAccountWithdrawal(_accountArray);
                    break;
                case 4:
                    _getAccountBalance(_accountArray);
                    break;
                case 5:
                    _getAllAccountReport(_accountArray);
                    break;
                case 6:
                    _moreTransactions = Boolean.FALSE;
                    break;
            }
            if (_moreTransactions) {
                System.out.print("Deseas hacer otra transaccion? [S/N]: ");
                _userChoice = _keyboard.next().toUpperCase();
                if (_userChoice.equals("N")) _moreTransactions = Boolean.FALSE;
            }
        }

/*    public static ClassPersona _getNewPersona(Integer _personIdParm) {
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
*/

    }
   static public ClassAccount _getNewAccount(Integer _accountNumberParm) {
        ClassAccount _newAccount = new ClassAccount();
        Scanner _keyboard = new Scanner(System.in);
        _newAccount.set_accountNumber(_accountNumberParm);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String _accountOwner = _keyboard.nextLine();
        _newAccount.set_accountOwner(_accountOwner);
        System.out.print("Ingrese el monto a depositar: ");
        Float _accountBalance = _keyboard.nextFloat();
        _newAccount.set_accountBalance(_accountBalance);
        return _newAccount;
    }

    static public void  _getAllAccountReport(ClassAccount[] _accountArrayParm) {
        Integer _lenghtAccountArrayParm = _accountArrayParm.length;
        for (int i = 0; i < _lenghtAccountArrayParm; i++) {
            if (_accountArrayParm[i] != null) {
                System.out.println(" ");
                _accountArrayParm[i]._getAccountData();
            }
        }
    }

    static public void _setAccountDeposit(ClassAccount _arrayAccountParm[]) {
        Integer _accountNumber;
        Integer _indexAccountDeposit = 0;
        Boolean _accountNumberExists = Boolean.FALSE;
        Integer _lengthArrayAccountParm = _arrayAccountParm.length;
        Scanner _keyboard = new Scanner(System.in);
        while (!_accountNumberExists) {
            System.out.println(" ");
            System.out.print("Ingrese el numero de la cuenta a la que desea hacer el deposito: ");
            _accountNumber = _keyboard.nextInt();
            if (_accountNumber.equals(0)) break;
            for (int i = 0; i < _lengthArrayAccountParm; i++) {
                if (_arrayAccountParm[i] != null && _arrayAccountParm[i].get_accountNumber().equals(_accountNumber)) {
                    _accountNumberExists = Boolean.TRUE;
                    _indexAccountDeposit = i;
                }
            }
            if (_accountNumberExists) {
                    System.out.println(" ");
                    _arrayAccountParm[_indexAccountDeposit]._getAccountData();
                    System.out.println(" ");
                    System.out.print("Ingrese la cantidad a depositar: ");
                    Float _depositAmount = _keyboard.nextFloat();
                    _arrayAccountParm[_indexAccountDeposit]._setAccountDeposit(_depositAmount);
                    System.out.println(" ");
                    _arrayAccountParm[_indexAccountDeposit]._getAccountData();
                    System.out.println(" ");
            }
            else {
                System.out.println(" ");
                System.out.print("Numero de cuenta no existe. Ingrese el numero correcto, por favor,o 0 para cancelar la transaccion.");
            }
          }
    }

    static public void _setAccountWithdrawal(ClassAccount _arrayAccountParm[]) {
        Integer _accountNumber;
        Integer _indexAccountDeposit = 0;
        Boolean _accountNumberExists = Boolean.FALSE;
        Integer _lengthArrayAccountParm = _arrayAccountParm.length;
        Scanner _keyboard = new Scanner(System.in);
        while (!_accountNumberExists) {
            System.out.println(" ");
            System.out.print("Ingrese el numero de la cuenta de la que desea hacer el retiro: ");
            _accountNumber = _keyboard.nextInt();
            if (_accountNumber.equals(0)) break;
            for (int i = 0; i < _lengthArrayAccountParm; i++) {
                if (_arrayAccountParm[i] != null && _arrayAccountParm[i].get_accountNumber().equals(_accountNumber)) {
                    _accountNumberExists = Boolean.TRUE;
                    _indexAccountDeposit = i;
                }
            }
            if (_accountNumberExists) {
                System.out.println(" ");
                _arrayAccountParm[_indexAccountDeposit]._getAccountData();
                System.out.println(" ");
                System.out.print("Ingrese la cantidad a retirar: ");
                Float _depositAmount = _keyboard.nextFloat();
                _arrayAccountParm[_indexAccountDeposit]._setAccountWithdrawal(_depositAmount);
                System.out.println(" ");
                _arrayAccountParm[_indexAccountDeposit]._getAccountData();
                System.out.println(" ");
            }
            else {
                System.out.println(" ");
                System.out.print("Numero de cuenta no existe. Ingrese el numero correcto, por favor,o 0 para cancelar la transaccion.");
            }
        }
    }

    static public void _getAccountBalance(ClassAccount _arrayAccountParm[]) {
        Integer _accountNumber;
        Integer _indexAccount = 0;
        Boolean _accountNumberExists = Boolean.FALSE;
        Integer _lengthArrayAccountParm = _arrayAccountParm.length;
        Scanner _keyboard = new Scanner(System.in);
        while (!_accountNumberExists) {
            System.out.println(" ");
            System.out.print("Ingrese el numero de la cuenta de la que desea saber el saldo: ");
            _accountNumber = _keyboard.nextInt();
            if (_accountNumber.equals(0)) break;
            for (int i = 0; i < _lengthArrayAccountParm; i++) {
                if (_arrayAccountParm[i] != null && _arrayAccountParm[i].get_accountNumber().equals(_accountNumber)) {
                    _accountNumberExists = Boolean.TRUE;
                    _indexAccount = i;
                }
            }
            if (_accountNumberExists) {
                System.out.println(" ");
                System.out.println("El saldo de la cuenta no. " + _arrayAccountParm[_indexAccount].get_accountNumber() + " a nombre de " + _arrayAccountParm[_indexAccount].get_accountOwner() + "es: " + _arrayAccountParm[_indexAccount].get_accountBalance());
                System.out.println(" ");
            }
            else {
                System.out.println(" ");
                System.out.print("Numero de cuenta no existe. Ingrese el numero correcto, por favor,o 0 para cancelar la transaccion.");
            }
        }
    }
}
