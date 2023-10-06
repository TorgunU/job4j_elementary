package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = array.length - 1;
        int sum;
        while (i != j) {
            sum = array[i] + array[j];
            if (sum == target) {
                result = new int[]{i, j};
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}
