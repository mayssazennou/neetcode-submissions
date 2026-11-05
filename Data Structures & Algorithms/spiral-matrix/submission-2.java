class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        // O(n*m) time, O(1) extra space (O(n*m) for the returned list)
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;    // rows
        int n = matrix[0].length; // columns

        // number of layers is min(m,n)/2 if min(m,n) is even (each layer peeled off shrinks both dimensions by 2)
        // and (min(m,n)/2)+1 if it's odd (the last layer is a single row or column, so we round up)
        // that is exactly (min(m,n)+1)/2
        int layers = (Math.min(m,n)+1)/2;

        for (int i=0; i<layers; i++) {
            int top = i, bottom = m-1-i, left = i, right = n-1-i;

            if (top == bottom) { // single row: add the whole row and break
                for (int j=left; j<=right; j++) list.add(matrix[top][j]);
                break;
            }

            if (left == right) { // single column
                for (int j=top; j<=bottom; j++) list.add(matrix[j][left]);
                break;
            }

            // each side excludes its last cell, which the next side picks up
            // first row [top][left, right[
            for (int j=left; j<right; j++) list.add(matrix[top][j]);
            // last column [top, bottom[[right]
            for (int j=top; j<bottom; j++) list.add(matrix[j][right]);
            // last row [bottom][right, left[
            for (int j=right; j>left; j--) list.add(matrix[bottom][j]);
            // first column [bottom, top[[left]
            for (int j=bottom; j>top; j--) list.add(matrix[j][left]);
            
            // 2((m-2i-1)+(n-2i-1)) elements added at each iteration (except the last)
            // number of elements at each layer (contour of each rectangle)
            //   [  (top,left)    (top,right)   ]     [   (i,i)     (i,n-1-i)   ]
            //   [ (bottom,left) (bottom,right) ]     [ (m-1-i,i) (m-1-i,n-1-i) ] 
        }

        return list;
    }
}
