class Solution {
    public void rotate(int[][] matrix) {

        // mathematic formula: M[i,j] = R[j,n-1-i], R[i,j] = M[n-1-j,i]
        // O(n²) time, O(n²) space
        
        int n = matrix.length;
        int[][] rotation = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                rotation[i][j] = matrix[n-1-j][i];
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = rotation[i][j];
            }
        }
    }
}
