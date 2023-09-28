package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        int x = x2 - x1;
        int y = y2 - y1;

        int degree = 2;

        double xResult = Math.pow(x, degree);
        double yResult = Math.pow(y, degree);

        double result = Math.sqrt(xResult + yResult);
        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result);

        result = distance(10, 10, 2, 4);
        System.out.println("result (10,10) to (2,4) " + result);

        result = distance(2, 1, 10, 7);
        System.out.println("result (2,1) to (10,7) " + result);
    }
}
