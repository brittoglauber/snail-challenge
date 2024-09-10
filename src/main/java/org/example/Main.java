package org.example;

import org.example.snail.SnailMatrix;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SnailMatrix snailMatrix = new SnailMatrix();

        List<Integer> result = snailMatrix.snail(matrix);

        System.out.println(result);
    }
}