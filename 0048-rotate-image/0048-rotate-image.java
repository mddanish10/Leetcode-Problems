class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //brute force
        // int[][] mat = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {

        //         mat[j][n - 1 - i] = matrix[i][j];

        //     }

        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {

        //         matrix[i][j] = mat[i][j];

        //     }

        // }

        //optimal
        //transpose;
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse

        for(int i =0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start <end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
               matrix[i][end]=temp;
                start++;
                end--;
            }
        }

    }
}