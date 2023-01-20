public class 2dArrayBasic {
    // /*29 2D Arrays*/
    // //29.1
    // //Representation
    // //rowas=4 columns=3
    // /*
    //  * 00 01 02
    //  * 10 11 12
    //  * 20 21 22
    //  * 30 31 32
    //  */
    // public static void print2Darr(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void search(int matrix[][],int key){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==key){
    //                 System.out.println("Found at ("+i+","+j+")");
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.println("Not found");
    // }
    // public static void maxmin(int matrix[][]){
    //     int max=Integer.MIN_VALUE;
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]>max){
    //                 max=matrix[i][j];
    //             }
    //             if(matrix[i][j]<min){
    //                 min=matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println("Max= "+max+"\nMin= "+min);
    // }
    // public static void main(String[] args) {
    //     int row=4,col=3;
    //     int matrix[][]=new int[row][col];
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++){
    //             matrix[i][j]=i;
    //         }
    //     }
    //     print2Darr(matrix);
    //     search(matrix, 2);
    //     maxmin(matrix);
    // }

    //29.2 2D Array in memory
    //1.Row major
    /*
     * 0 1 2
     * 3 4 5
     * 6 7 8
     * 
     * Memory=> 0 1 2 3 4 5 6 7 8
     */
    //2.Col major
    /* 
     * 0 1 2
     * 3 4 5
     * 6 7 8
     * 
     * Memory=> 0 3 6 1 4 7 2 5 8
     */
    //3.java Memory
    /*
     * Java creates sepearate arrays of all and creates one single array which point starting position of all different arrays
     * not in continuous fashion
     */

    // //29.3 Spiral Matrix
    // /*
    //  * 1  2  3  4
    //  * 5  6  7  8
    //  * 9  10 11 12
    //  * 13 14 15 16
    //  * 
    //  * Output=> 1 2 3 4 8 12 16 15 14 13 9  5 6 7 11 10
    //  */
    // public static void print2Darr(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void spiralOutput(int mat[][]){
    //     int startRow=0,endRow=mat.length-1,startCol=0,endCol=mat[0].length-1;
    //     while(startRow<=endRow && startCol<=endCol){
    //         //PrintLeft
    //         for(int i=startCol;i<=endCol;i++){
    //             System.out.print(mat[startRow][i]+" ");
    //         }
    //         //PrintDown
    //         for(int i=startRow+1;i<=endRow;i++){
    //             System.out.print(mat[i][endCol]+" ");
    //         }
    //         //printRight
    //         for(int i=endCol-1;i>startCol;i--){ 
    //             if(startRow==endRow){
    //                 break;
    //             }
    //             System.out.print(mat[endRow][i]+" ");
    //         }
    //         //printUp
    //         for(int i=endRow;i>startRow;i--){
    //             if(startCol==endCol){
    //                 break;
    //             }
    //             System.out.print(mat[i][startCol]+" ");
    //         }
    //         startRow++;
    //         startCol++;
    //         endRow--;
    //         endCol--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int mat[][]={{1,2,3,4,5},
    //                  {5,6,7,8,9},
    //                  {9,10,11,12,13},
    //                  {13,14,15,16,17},
    //                  {20,21,22,21,25}};
    //     int mat2[][]={{1,2,3,4,5},
    //                   {6,7,8,9,10},
    //                   {11,12,13,14,15}};
    //     int mat3[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
    //     print2Darr(mat2);
    //     spiralOutput(mat2);
    // }

    // //29.2 Dogonal Sum
    // public static void print2Darr(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void digonalSum(int mat[][]){
    //     int primaryDigonalSum=0;
    //     int secondaryDigonalSum=0;
    //     // //Time complexity = O(n^2)
    //     // for(int i=0;i<mat.length;i++){
    //     //     for(int j=0;j<mat.length;j++){
    //     //         if(i==j){
    //     //             primaryDigonalSum+=mat[i][j];
    //     //         }
    //     //         else if(i+j==mat.length-1){
    //     //             secondaryDigonalSum+=mat[i][j];
    //     //         }
    //     //     }
    //     // }
    //     for(int i=0;i<mat.length;i++){
    //         primaryDigonalSum+=mat[i][i];
    //         if(i!=mat.length-1-i){
    //             secondaryDigonalSum+=mat[i][mat.length-i-1];
    //         }
    //     }
    //     int sum=primaryDigonalSum+secondaryDigonalSum;
    //     System.out.println("Sum = "+sum);
    // }
    // public static void main(String[] args) {
    //     int mat[][]={{1,2,3,4,5},
    //             {5,6,7,8,9},
    //             {9,10,11,12,13},
    //             {13,14,15,16,17},
    //             {20,21,22,21,25}};
    //     print2Darr(mat);
    //     digonalSum(mat);
    // }

    // //29.3 Search in sorted 2D matrix
    // //29.3.1 Brute force not using advantage of sorted matrix
    // //29.3.2 Binary search every row pe binary search time complexity=> nlogn
    // //29.3.3 Staircase search
    // //time complexity => O(row+col)
    // /*
    //  * 10 20 30 40
    //  * 15 25 35 45
    //  * 27 29 37 48
    //  * 32 33 39 50
    //  * 
    //  * if we pick top corner or bottom corner then we do not get any idea about where to travel
    //  * but if we pick
    //  * (0,n-1) cell then
    //  * if key>cell move down
    //  * if key<cell move left
    //  * 
    //  * OR
    //  * 
    //  * (n-1,0) cell then
    //  * if key<cell move up
    //  * if key>cell move right
    //  */
    // public static void staircaseSearch(int mat[][],int key){
    //     int row=0;
    //     int col=mat[0].length-1;
    //     while(row<mat.length && col>=0){
    //         if(mat[row][col]==key){
    //             System.out.println("Found at ("+row+" "+col+")");
    //             return;
    //         }
    //         else if(key>mat[row][col]){
    //             row++;
    //         }
    //         else if(key<mat[row][col]){
    //             col--;
    //         }
    //     }
    //     System.out.println("Not found");
    // }
    // public static void main(String[] args) {
    //     int mat[][]={{1,2,3,4,5},
    //             {5,6,7,8,9},
    //             {9,10,11,12,13},
    //             {13,14,15,16,17},
    //             {20,21,22,21,25}};
    //     int key=11;
    //     staircaseSearch(mat,key);
    // }

    // //29.4 Transpose of a Matrix
    // public static void print2Darr(int matrix[][]){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             System.out.print(matrix[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static int[][] transpose(int mat[][]){
    //     int trans[][]=new int[mat[0].length][mat.length];
    //     for(int i=0;i<mat.length;i++){
    //         for(int j=0;j<mat[0].length;j++){
    //             trans[j][i]=mat[i][j];
    //         }
    //     }
    //     return trans;
    // }
    // public static void main(String[] args) {
    //     int mat[][]={{1,2,3,4,5},
    //             {5,6,7,8,9},
    //             {9,10,11,12,13},
    //             {20,21,22,21,25}};
    //     int trans[][]=transpose(mat);
    //     print2Darr(trans);
    // }
    
}
