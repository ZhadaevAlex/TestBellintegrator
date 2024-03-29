package ru.zhadaev.test.bellintegrator.Task3;

public class MatrixCreator {
    public int[][] create(int matrixDeep) {
        if (matrixDeep < 0) {
            return new int[0][0];
        }

        int size = (matrixDeep + 1) * 2;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrixDeep; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                int value = matrixDeep - i;
                matrix[j][i] = value;
                matrix[size - 1 - i][j] = value;
                matrix[j + 1][size - i - 1] = value;
                matrix[i][j + 1] = value;
            }
        }

        return matrix;
    }
}
