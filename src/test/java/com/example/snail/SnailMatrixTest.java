package com.example.snail;


import org.example.snail.SnailMatrix;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SnailMatrixTest {
    @Test
    void testSnailMatrixWith3x3Matrix() {
        SnailMatrix snailMatrix = new SnailMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> result = snailMatrix.snail(matrix);

        assertEquals(expected, result);
    }

    @Test
    void testSnailMatrixWith4x4Matrix() {
        SnailMatrix snailMatrix = new SnailMatrix();

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
        List<Integer> result = snailMatrix.snail(matrix);

        assertEquals(expected, result);
    }

    @Test
    void testSnailMatrixWithEmptyMatrix() {
        SnailMatrix snailMatrix = new SnailMatrix();

        int[][] matrix = new int[0][0]; // Matriz vazia

        List<Integer> expected = Arrays.asList();
        List<Integer> result = snailMatrix.snail(matrix);

        assertEquals(expected, result);
    }

    @Test
    void testSnailMatrixWithSingleElementMatrix() {
        SnailMatrix snailMatrix = new SnailMatrix();

        int[][] matrix = {
                {42}
        };

        List<Integer> expected = Arrays.asList(42);
        List<Integer> result = snailMatrix.snail(matrix);

        assertEquals(expected, result);
    }

    @Test
    void testSnailMatrixWith2x2Matrix() {
        SnailMatrix snailMatrix = new SnailMatrix();

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        List<Integer> expected = Arrays.asList(1, 2, 4, 3);
        List<Integer> result = snailMatrix.snail(matrix);

        assertEquals(expected, result);
    }
}
