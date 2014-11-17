import java.util.*;
public class ArraySums {
    public static void main(String[] args) {
        int gridSize = 3;
        int randomRange = 100;
        
        // testing
        // create square grid of type int (3 x 3 in this case)
        int[][] table = new int[gridSize][gridSize];
        Random rand = new Random();
        
        // initialize table with ramdom values
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                table[i][j] = rand.nextInt(randomRange);
            }
        }
        
        // print original table
        System.out.println(Arrays.deepToString(table));
        
        // print out row sums
        for (int i = 0; i < table.length; i++) {
            System.out.println("Row " + i + " sum = " + RowSum(i, table));
        }
        
        // print out column sums
        for (int i = 0; i < table.length; i++) {
            System.out.println("Col " + i + " sum = " + ColSum(i, table));
        }        
        
        // print out diagonal sums 
        System.out.println("Diags: " + Arrays.toString(DiagSums(table)));
    }
    
    // compute sum of elements in row of a square 2D array
    public static int RowSum(int row, int[][] grid) {
        int result = 0;
        
        for (int col = 0; col < grid.length; col++) {
            result += grid[row][col];
        }
        
        return result;
    }
    
    // COMPLETE to return sum of column in a square 2D array
    public static int ColSum(int col, int[][] grid) {
        int result = 0;
        
        return result;
    }
    
    // COMPLETE to return sum of diagonals in a square 2D array as an array of 2 ints
    public static int[] DiagSums(int[][] grid) {
        int[] result = new int[2];
        
        return result;
    }
}
