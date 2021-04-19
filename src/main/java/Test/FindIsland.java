package Test;

import java.util.LinkedList;
import java.util.Queue;

public class FindIsland {
    public static void main(String[] args) {
        int M[][] = new int[][] { 
            { 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 1 }, 
            { 1, 0, 0, 1, 1 }, 
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 } };
        findIsland(M);
    }

    public static void findIsland(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        boolean visited[][] = new boolean[row][col];

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 1 && !visited[i][j]) {
                    dfs(M, visited, row, col, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(int[][] M, boolean[][] visited, int row, int col, int i, int j) {
        if (i < 0 || j < 0 || i >= row || j >= col || M[i][j] == 0 || visited[i][j])
            return;
        visited[i][j] = true;
        dfs(M, visited, row, col, i + 1, j);
        dfs(M, visited, row, col, i - 1, j);
        dfs(M, visited, row, col, i, j + 1);
        dfs(M, visited, row, col, i, j - 1);
    }

}
