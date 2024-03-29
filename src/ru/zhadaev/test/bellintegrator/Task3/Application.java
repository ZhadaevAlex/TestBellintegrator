package ru.zhadaev.test.bellintegrator.Task3;

import ru.zhadaev.test.bellintegrator.Task3.utils.ArrayUtils;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Matrix Deep: ");
        int matrixDeep = in.nextInt();

        MatrixCreator matrixCreator = new MatrixCreator();
        int[][] matrix = matrixCreator.create(matrixDeep);

        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(matrix);
    }
}
