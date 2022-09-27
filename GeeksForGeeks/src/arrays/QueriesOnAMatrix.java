package arrays;

/*Problem statement*/
/*HARD*/
/*You are given a matrix of dimension n*n. All the cells are initially, zero. You are given Q queries, which contains 4 integers a b c d where (a,b) is the TOP LEFT cell and (c,d) is the Bottom Right cell of a submatrix. Now, all the cells of this submatrix have to be incremented by one. After all the Q queries have been performed. Your task is to find the final resulting Matrix.*/

public class QueriesOnAMatrix {
	public int[][] solveQueries(int n, int[][] Queries) {
        int a, b, c, d;
        int arr[][] = new int[n][n];
        for(int i = 0; i < Queries.length; i++){
            a = Queries[i][0];
            b = Queries[i][1];
            c = Queries[i][2];
            d = Queries[i][3];  
            for(int l = a; l <= c; l++){
                for(int m = b; m <= d; m++ ){
                    arr[l][m]++;
                }
            }
        }
        return arr;
    }
}
