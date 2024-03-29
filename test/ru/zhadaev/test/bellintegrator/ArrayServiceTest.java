package ru.zhadaev.test.bellintegrator;

import org.junit.jupiter.api.Test;
import ru.zhadaev.test.bellintegrator.Task2.ArrayService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayServiceTest {
    @Test
    void getSumDiagonal_returnValidValue_whenInputDataIsValid() {
        ArrayService arrayService = new ArrayService();
        int[][] initArray = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int expected = 109;
        int actual = arrayService.getSumDiagonal(initArray);
        assertEquals(expected, actual);
    }

    @Test
    void getSumDiagonal_throwNullPointerException_whenInputIsNull() {
        ArrayService arrayService = new ArrayService();
        int[][] initArray = null;
        assertThrows(NullPointerException.class, () -> arrayService.getSumDiagonal(initArray));
    }
}
