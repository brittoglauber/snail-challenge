package org.example.snail;

import org.example.snail.service.SnailMatrixService;

import java.util.ArrayList;
import java.util.List;

public class SnailMatrix {

    private final SnailMatrixService snailMatrixService;

    public SnailMatrix() {
        this.snailMatrixService = new SnailMatrixService();
    }

    public List<Integer> snail(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            snailMatrixService.moveLeftToRight(matrix, result, top, left, right);
            top++;

            snailMatrixService.moveTopToBottom(matrix, result, right, top, bottom);
            right--;

            if (top <= bottom) {
                snailMatrixService.moveRightToLeft(matrix, result, bottom, left, right);
                bottom--;
            }

            if (left <= right) {
                snailMatrixService.moveBottomToTop(matrix, result, left, top, bottom);
                left++;
            }
        }
        return result;
    }
}
