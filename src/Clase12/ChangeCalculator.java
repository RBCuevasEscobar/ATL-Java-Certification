package Clase12;

import java.util.Scanner;

public class ChangeCalculator {

    static Float[] _validCurrencyNotes = {500.00F, 200.00F, 100.00F, 50.00F, 20.00F, 10.00F, 5.00F, 1.00F, 0.50F};

    public static void main(String[] args) {
        Scanner _keyboard = new Scanner(System.in);
        Integer[] _amountChangeNotes = new Integer[9];
        Float _cambioTotal = 0.00F;

        System.out.println("Ejercicios Clase 12 - Calculadora de Cambio");
        System.out.println(" ");
        System.out.print("Ingrese monto total de la venta: ");
        Float _totalDueSelling = _keyboard.nextFloat();
        System.out.print("Ingrese monto pagado por el cliente: ");
        Float _totalPaidAmount = _keyboard.nextFloat();
        _amountChangeNotes = _getChangeNotes(_totalPaidAmount, _totalDueSelling);
        System.out.println("El monto total de la compra es: "+ _totalDueSelling + ".");
        System.out.println("El cliente pago: " + _totalPaidAmount + ".");
        System.out.println("El cambio a devolver es: " + (_totalPaidAmount - _totalDueSelling));
        for(int i = 0; i < _amountChangeNotes.length; i++) {
            if (_amountChangeNotes[i] != 0) System.out.println(_amountChangeNotes[i] + " piezas de " + _validCurrencyNotes[i] + " pesos igual a " + _amountChangeNotes[i]*_validCurrencyNotes[i]);
            _cambioTotal = _cambioTotal + _amountChangeNotes[i]*_validCurrencyNotes[i];
        }
        System.out.println("Total Cambio: " + _cambioTotal);
    }

    public static Integer[] _getChangeNotes(Float _totalAmountPaymentParm, Float _totalProductPriceParm) {
        Boolean _changePending = Boolean.TRUE;
        Float _pendingChangeAmount = 0.00F;
        Integer[] _notesChangeToReturn = new Integer[9];
        Integer _lengthNotesChangeToReturn = _notesChangeToReturn.length;

        if (_totalAmountPaymentParm >= _totalProductPriceParm) {
            _pendingChangeAmount = _totalAmountPaymentParm - _totalProductPriceParm;
        }
        else {
            System.out.println("Falta dinero para cubrir el costo del producto!");
            for (int i = 0; i < _lengthNotesChangeToReturn; i++) _notesChangeToReturn[i] = 0;
            return _notesChangeToReturn;
        }
        Float _changeStillDue = _pendingChangeAmount;
        while (_changePending) {
            for (int j = 0; j < _lengthNotesChangeToReturn; j++) {
                Integer _timesNoteInChangeDue = (int) (_changeStillDue / _validCurrencyNotes[j]);
                if (_timesNoteInChangeDue > 0) {
                    _notesChangeToReturn[j] = _timesNoteInChangeDue;
                    _changeStillDue = _changeStillDue - (_validCurrencyNotes[j] * _timesNoteInChangeDue);
                }
                else {
                    _notesChangeToReturn[j] = 0;
                }
            }
            if (_changeStillDue < 0.50) _changePending = Boolean.FALSE;
        }
        return _notesChangeToReturn;
    }
}

