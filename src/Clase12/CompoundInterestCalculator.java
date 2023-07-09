package Clase12;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Float _amountInitialInvestment = 0.00F;
        Float _interestRatePerYear = 0.00F;
        Integer _timesCompoundInteresApplied = 0;
        Integer _yearsPeriodInvestment = 0;
        Float _totalEstimatedFinalBalance = 0.00F;
        Scanner _keyboard = new Scanner(System.in);
        System.out.println("Ejercicios Clase 12 - Calculadora de Interes Compuesto.");
        System.out.println(" ");
        System.out.print("Ingrese el monto de la inversion (USD$): ");
        _amountInitialInvestment = _keyboard.nextFloat();
        System.out.print("Ingrese la tasa de interes a aplicar (%): ");
        _interestRatePerYear = _keyboard.nextFloat()/100;
        System.out.print("Ingrese el numero de veces que el interes es aplicado anualmente (Min. 1 vez): ");
        _timesCompoundInteresApplied = _keyboard.nextInt();
        System.out.print("Ingrese el periodo de la inversion (Años): ");
        _yearsPeriodInvestment = _keyboard.nextInt();
        System.out.println(" ");
        System.out.println("Los parametros del calculo para su inversion son:");
        System.out.println("Monto Inicial Inversion (USD$): " + _amountInitialInvestment);
        System.out.println("Tasa de Interes Compuesto (%): " + _interestRatePerYear);
        System.out.println("Veces a aplicar tasa de interes (Min. 1 vez): " + _timesCompoundInteresApplied);
        System.out.println("Periodo de la inversion (Años): " + _yearsPeriodInvestment);
        System.out.println(" ");
        _totalEstimatedFinalBalance = _getCompoundInterestEstimate(_amountInitialInvestment, _interestRatePerYear, _timesCompoundInteresApplied, _yearsPeriodInvestment);
        System.out.print("El monto total de su inversion al final del periodo es: " + _totalEstimatedFinalBalance);
    }

    public static Float _getCompoundInterestEstimate(Float _amountInitialInvestmentParm,Float _interestRatePerYearParm, Integer _timesCompoundInteresAppliedParm, Integer _yearsPeriodInvestmentParm) {
        Float _totalBalanceEstimated = 0.00F;
        _totalBalanceEstimated = _amountInitialInvestmentParm * (float) Math.pow((1 + _interestRatePerYearParm / _timesCompoundInteresAppliedParm), (_timesCompoundInteresAppliedParm * _yearsPeriodInvestmentParm));
        return (float) Math.round(_totalBalanceEstimated * 100) / 100;
    }
}
