package ru.zhadaev.test.bellintegrator.Task2;

public class ArrayService {
    public int getSumDiagonal(int[][] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        int size = array[0].length;
        for (int i = 0, j = size - 1; i < size && j >= 0; i++, j--) {
            if (i == j) {
                continue;
            }
            sum = sum + array[i][j];
        }
        return sum;
    }
}
