package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double calculationsOperationsSum(double first, double second) {
        return multiply(first, second)
                + subtract(first, second)
                + sum(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат суммы вычисления всех четырех операций: "
                + calculationsOperationsSum(10, 20));
    }
}
