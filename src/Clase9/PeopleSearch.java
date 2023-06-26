package Clase9;

import java.util.Scanner;

public class PeopleSearch {
    public static void main(String[] args) {
        String[] _peopleArray = {"RAMON CUEVAS", "VIANEY VEGA", "ABRIL CUEVAS", "ISABELLA CACERES", "TOMAS CUEVAS", "ESTHER ESCOBAR", "MILAN CUEVAS", "BRENDA CUEVAS", "MONSERRAT HIDALGO", "ISARY URIBE"};

        Scanner _keyboard = new Scanner(System.in);
        System.out.println("Ejercicios Practicos Arreglos - Busqueda de Personas");
        System.out.println(" ");
        System.out.print("Introduzca el criterio de busqueda: ");
        String _searchCriteria = _keyboard.nextLine().toUpperCase();

        Boolean _searchValueFound = Boolean.FALSE;
        for (String _personName : _peopleArray) {
            if (_personName.contains(_searchCriteria)) {
                _searchValueFound = Boolean.TRUE;
                System.out.println("Resultado de la busqueda es: " + _personName);
            }
        }
        if (!_searchValueFound) System.out.println("No se encontraron resultados que coincidan con ese criterio.");
    }
}
