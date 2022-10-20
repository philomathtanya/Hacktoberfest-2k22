public class DiagonalTraversal
{
    public void diagonalView(int[][] data)
    {
        // Get the size
        int row = data.length;
        int col = data[0].length;
        // First Half
        for (int i = 0; i < col; ++i)
        {
            for (int j = i; j >= 0 && i - j < row; --j)
            {
                // Display element value
                System.out.print("  " + data[i - j][j]);
            }
        }
        // Second Half
        for (int i = 1; i < row; ++i)
        {
            for (int j = col - 1, k = i; 
                 j >= 0 && k < row; --j, k++)
            {
                // Display element value
                System.out.print("  " + data[k][j]);
            }
        }
    }
    public static void main(String[] args)
    {
        DiagonalTraversal task = new DiagonalTraversal();
        // Given matrix
        int [][]matrix = {
          {1,  2,  4,  7,  11},
          {3,  5,  8,  12, 15}, 
          {6,  9,  13, 16, 18},
          {10, 14, 17, 19, 20}
        };
		// Test
        task.diagonalView(matrix);
    }
}
