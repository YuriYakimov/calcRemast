package main;

public class Сalculations extends Main {
    public int addition (String[] value) throws CalculationException {
        int summ = 0;
        for (String toAddition : value) {
            int summand = Integer.parseInt(toAddition);
            exceptionNumber(summand, summand);
            summ = summ + summand;
        }
        return summ;
    }

    public int subtraction (String[] value) throws CalculationException {
        int reduced = Integer.parseInt(value[0]);
        int deductible = Integer.parseInt(value[1]);
        exceptionNumber(reduced, deductible);
        int difference = reduced - deductible;
        return difference;
    }

    public int multiplication (String[] value) throws CalculationException {
        int multipl = 1;
        for (String toMultiplication: value){
            int multiplier = Integer.parseInt(toMultiplication);
            exceptionNumber(multiplier, multiplier);
            multipl = multipl*multiplier;
        }
        return multipl;
    }

    public int division (String[] value) throws CalculationException {
        int divisible = Integer.parseInt(value[0]);
        int divisor = Integer.parseInt(value[1]);
        exceptionNumber(divisible, divisor);
        int privat = divisible / divisor;
        return privat;
    }

    public void exceptionNumber(int a, int b) throws CalculationException{
        String message = "Числа должны быть меньше или равны 10";
        CalculationException toException = new CalculationException(message);
        if (a > 10 || b > 10){
            throw toException;
        }
    }
}
