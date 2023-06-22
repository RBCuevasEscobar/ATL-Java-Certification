package Clase7;

import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {
        Scanner _keyboard = new Scanner(System.in);
        System.out.println("Ejercicio Calculadora de Ganancias.");
        System.out.println(" ");
        System.out.print("Ingrese el precio de venta del producto: ");
        Float _productPrice = _keyboard.nextFloat();
        System.out.println(" ");
        System.out.print("Ingrese el costo unitario del producto: ");
        Float _unitCostProduct = _keyboard.nextFloat();
        System.out.println(" ");
        System.out.print("Ingrese la cantidad de productos: ");
        Float _productQty = _keyboard.nextFloat();
        Float _totalInvestment = _productQty * _unitCostProduct;
        Float _totalRevenue = _productQty * _productPrice;
        Float _grossProfit = _totalRevenue - _totalInvestment;
        System.out.println(" ");
        System.out.println("Capital invertido es: " + _totalInvestment);
        System.out.println(" ");
        System.out.println("Ingresos por ventas es: " + _totalRevenue);
        System.out.println(" ");
        System.out.println("Ganancia bruta obtenida es: " + _grossProfit);
    }
}
