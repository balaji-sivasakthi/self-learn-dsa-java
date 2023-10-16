package Array.SetMatrixZeroes;

import Utils.DSAUtils;

import java.util.Arrays;

public class Solution {
    public static int[][] setZeroes(int[][] matrix) {
        int[] col = {0,0,0}; // initialize col flags
        int[] row = {0,0,0}; // initialize row flags
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // visit ith and jth index
                if(matrix[i][j] == 0){
                    col[j] = 1; // visited col
                    row[i] = 1; // visited row
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // set zero based on visited row and col flags
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,1},
                {1,1,1},
                {1,1,1}
        };
        DSAUtils.print2DArray(setZeroes(matrix));

        // Time Complexity :- O((M*N)+(M+N))
        // Space Complexity:- O(1)
    }
}
