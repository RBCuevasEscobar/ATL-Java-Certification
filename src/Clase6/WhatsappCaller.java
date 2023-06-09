package Clase6;

import java.util.Scanner;
public class WhatsappCaller {
    public static void main(String[] args) {
        System.out.println("Whatsapp caller service.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa el numero telefonico de Whatsapp al que deseas llamar: ");
        String _whatsappNumberToCall = _keyboard.nextLine();
        System.out.print("https://api.whatsapp.com/send?phone=" + _whatsappNumberToCall);
    }
}

