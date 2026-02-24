class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {9, 8},
            {7, 6}
        };
        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };

        int[][] result = new int[2][2]; // result matrix

        // Matrix subtraction logic
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Displaying the result matrix
        System.out.println("Result of Matrix Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
