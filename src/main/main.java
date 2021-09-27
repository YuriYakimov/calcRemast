package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CalculationException {
        System.out.println("Введите данные");
        Scanner console = new Scanner(System.in);
        String inputInfo = console.nextLine();        // считывание ввода
        boolean addition = inputInfo.contains("+");              // присутствие операции сложения
        if (addition == true){
            Сalculations toAddition = new Сalculations();
            toAddition.addition(toArrays(inputInfo));
            if (inputInfo.contains("I") || inputInfo.contains("X") || inputInfo.contains("V")){
                ArabToRome numberRome = new ArabToRome();
                System.out.println(numberRome.toRomeNumberTen(toAddition.addition(toArrays(inputInfo))));
            } else {
                System.out.println(toAddition.addition(toArrays(inputInfo)));
            }
        }
        boolean subtraction = inputInfo.contains("-");           // присутствие опрации вычитания
        if (subtraction == true){
            Сalculations toSubtraction = new Сalculations();
            int result = toSubtraction.subtraction(toArraysSubtraction(inputInfo));
            if (inputInfo.contains("I") || inputInfo.contains("X") || inputInfo.contains("V")){
                ArabToRome numberRome = new ArabToRome();
                System.out.println(numberRome.toRomeNumberTen(toSubtraction.subtraction(toArraysSubtraction(inputInfo))));
            } else {
                System.out.println(result);
            }
        }
        boolean multiplication = inputInfo.contains("*");        // присутсвие операции умножение
        if (multiplication == true){
            Сalculations toMultiplication = new Сalculations();
            toMultiplication.multiplication(toArraysMultiplication(inputInfo));
            if (inputInfo.contains("I") || inputInfo.contains("X") || inputInfo.contains("V")){
                ArabToRome numberRome = new ArabToRome();
                System.out.println(numberRome.toRomeNumberTen(toMultiplication.multiplication(toArraysMultiplication(inputInfo))));
            } else {
                System.out.println(toMultiplication.multiplication(toArraysMultiplication(inputInfo)));
            }
        }
        boolean division = inputInfo.contains("/");              // присутсвие операци деление
        if (division == true){
            Сalculations toDivision = new Сalculations();
            toDivision.division(toArraysDivision(inputInfo));
            if (inputInfo.contains("I") || inputInfo.contains("X") || inputInfo.contains("V")){
                ArabToRome numberRome = new ArabToRome();
                System.out.println(numberRome.toRomeNumberTen(toDivision.division(toArraysDivision(inputInfo))));
            } else {
                System.out.println(toDivision.division(toArraysDivision(inputInfo)));
            }
        }
    }

    public static String[] toArrays(String info){
        String[] values = info.split("\\+");
        if (info.contains("I") || info.contains("V") || info.contains("X")){
            RomeCalc translat = new RomeCalc();
            return translat.romeTranslat(values);
        } else {
            return values;
        }
    }
    public static String[] toArraysSubtraction(String info){
        String[] values = info.split("\\-");
        if (info.contains("I") || info.contains("V") || info.contains("X")){
            RomeCalc translat = new RomeCalc();
            return translat.romeTranslat(values);
        } else {
            return values;
        }
    }
    public static String[] toArraysMultiplication(String info){
        String[] values = info.split("\\*");
        if (info.contains("I") || info.contains("V") || info.contains("X")){
            RomeCalc translat = new RomeCalc();
            return translat.romeTranslat(values);
        } else {
            return values;
        }
    }
    public static String[] toArraysDivision(String info){
        String[] values = info.split("\\/");
        if (info.contains("I") || info.contains("V") || info.contains("X")){
            RomeCalc translat = new RomeCalc();
            return translat.romeTranslat(values);
        } else {
            return values;
        }
    }
}
