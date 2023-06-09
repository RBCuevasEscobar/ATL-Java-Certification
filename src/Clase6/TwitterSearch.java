package Clase6;

import java.util.Scanner;
public class TwitterSearch {
    public static void main(String[] args) {
        System.out.println("Buscador de tweets en Twitter.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa la cuenta de Twitter que deseas buscar: ");
        String _twitterUserToSearchFor = _keyboard.nextLine();
        System.out.print("https://twitter.com/search?q=" + _twitterUserToSearchFor);
    }
}
