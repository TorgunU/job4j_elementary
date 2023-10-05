package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (i != j && array[i] + array[j] == target) {
                result = new int[] {i, j};
                break;
            }
            j++;
            if (j == array.length) {
                i++;
                j = i;
            }
        }
        return result;
    }
}
