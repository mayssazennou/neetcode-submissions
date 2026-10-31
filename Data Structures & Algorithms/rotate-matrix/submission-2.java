class Solution {
    public void rotate(int[][] matrix) {
        
        // in-place rotation trick: "transpose then reverse each row" or "reverse each column then transpose"
        // O(n²) time, O(1) space

        int n = matrix.length;

        for (int i=0; i<n; i++) {
            // very common bug, only transpose one triangle
            // j starts at i+1 not 0 (or starts at 0 and stops at i-1)
            // otherwise the matrix will be transposed twice and will thus remain unchanged
            for (int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
