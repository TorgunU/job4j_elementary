package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers =
                {
                        {5},
                        {1, 76},
                        {98, 532, 0},
                        {65, 1253, 7, 546}
                };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i].length);
        }
    }
}
