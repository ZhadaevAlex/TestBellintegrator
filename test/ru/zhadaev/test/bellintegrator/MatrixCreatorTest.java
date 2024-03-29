package ru.zhadaev.test.bellintegrator;

import org.junit.jupiter.api.Test;
import ru.zhadaev.test.bellintegrator.Task3.MatrixCreator;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixCreatorTest {
    @Test
    void create_returnValidData_whenInputDataIsValid() {
        MatrixCreator matrixCreator = new MatrixCreator();
        int matrixDeep = 3;
        int size = 8;
        int[][] expected = {
                {3, 3, 3, 3, 3, 3, 3, 3},
                {3, 2, 2, 2, 2, 2, 2, 3},
                {3, 2, 1, 1, 1, 1, 2, 3},
                {3, 2, 1, 0, 0, 1, 2, 3},
                {3, 2, 1, 0, 0, 1, 2, 3},
                {3, 2, 1, 1, 1, 1, 2, 3},
                {3, 2, 2, 2, 2, 2, 2, 3},
                {3, 3, 3, 3, 3, 3, 3, 3}
        };
        int[][] actual = matrixCreator.create(matrixDeep);
        for (int i = 0; i < size; i++) {
            assertArrayEquals(actual[i], expected[i]);
        }
    }

    @Test
    void create_returnValidData_whenMatrixDeepIsZero() {
        MatrixCreator matrixCreator = new MatrixCreator();
        int matrixDeep = 0;
        int size = 2;
        int[][] expected = {
                {0, 0},
                {0, 0},
        };
        int[][] actual = matrixCreator.create(matrixDeep);
        for (int i = 0; i < size; i++) {
            assertArrayEquals(actual[i], expected[i]);
        }
    }

    @Test
    void create_returnValidData_whenMatrixDeepIsNegative() {
        MatrixCreator matrixCreator = new MatrixCreator();
        int matrixDeep = -1;

        int[][] expected = new int[0][0];
        int[][] actual = matrixCreator.create(matrixDeep);
        assertArrayEquals(actual, expected);
    }
}
