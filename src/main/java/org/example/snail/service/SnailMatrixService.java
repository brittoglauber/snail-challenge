package org.example.snail.service;

import java.util.List;

public class SnailMatrixService {
    public void moveLeftToRight(int[][] matrix, List<Integer> result, int row, int left, int right) {
        for (int i = left; i <= right; i++) {
            result.add(matrix[row][i]);
        }
    }

    public void moveTopToBottom(int[][] matrix, List<Integer> result, int col, int top, int bottom) {
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][col]);
        }
    }

    public void moveRightToLeft(int[][] matrix, List<Integer> result, int row, int left, int right) {
        for (int i = right; i >= left; i--) {
            result.add(matrix[row][i]);
        }
    }

    public void moveBottomToTop(int[][] matrix, List<Integer> result, int col, int top, int bottom) {
        for (int i = bottom; i >= top; i--) {
            result.add(matrix[i][col]);
        }
    }
}
