package ru.zhadaev.test.bellintegrator.Task3.utils;

import java.util.Arrays;

public class ArrayUtils {
    public void printArray(int[][] matrix) {
        for (int[] row : matrix) {
            Arrays.stream(row).forEach(value -> System.out.printf("%4d", value));
            System.out.println();
        }
    }
}
