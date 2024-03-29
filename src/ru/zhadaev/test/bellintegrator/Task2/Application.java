package ru.zhadaev.test.bellintegrator.Task2;

public class Application {
    public static void main(String[] args) {
        int[][] initArray = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        ArrayService arrayService = new ArrayService();
        double sumDiagonal = arrayService.getSumDiagonal(initArray);
        System.out.println(sumDiagonal);
    }
}
