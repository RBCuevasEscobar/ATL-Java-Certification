package Clase6;

import java.util.Scanner;
public class GoogleSearch {
    public static void main(String[] args) {
        System.out.println("Buscador de paises en Google Search.");
        Scanner _keyboard = new Scanner(System.in);
        System.out.print("Ingresa el pais que deseas buscar: ");
        String _countryToSearchFor = _keyboard.nextLine();
        System.out.print("https://www.google.com/maps/search/" + _countryToSearchFor);
    }
}