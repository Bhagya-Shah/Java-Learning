public class patterns2 {
    // /*22 Patterns part - II */

    // //22.1 => hollow recatangle
    // /*
    //     * * * * * 
    //     *       *
    //     *       *
    //     * * * * *
    // */
    // public static void main(String[] args) {
    //     int row=4,col=5;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=col;j++){
    //             if(i<row && i>1 && j<col && j>1){
    //                 System.out.print("  ");
    //             }else{
    //                 System.out.print("* ");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.2 Inverted half pyramid with numbers
    // /*
    //  * 1 2 3 4 5
    //  * 1 2 3 4
    //  * 1 2 3
    //  * 1 2 
    //  * 1
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=row-i+1;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.3 Floyds Triangle
    // /*
    //  * 1
    //  * 2 3
    //  * 4 5 6
    //  * 7 8 9 10
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     int c=1;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(c+" ");
    //             c++;
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.4 0-1 Triangle
    // /*
    //  * 1
    //  * 0 1
    //  * 1 0 1
    //  * 0 1 0 1
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     int c=1;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print(1);
    //             }else{
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.5 Butterfly pattern
    // /*
    //  * *        *
    //  * **      **
    //  * ***    ***
    //  * ****  ****
    //  * **********
    //  * **********
    //  * ****  ****
    //  * ***    ***
    //  * **      **
    //  * *        *
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     for(int i=1;i<=row;i++){
    //         for(int j=1;j<=row*2;j++){
    //             if(j<=i || j>row*2-i){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println("");
    //     }
    //     for(int i=row;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         for(int j=1;j<=(row-i)*2;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.6 Solid Rhoumbus
    // /*
    //  *      *****
    //  *     *****
    //  *    *****
    //  *   *****
    //  *  *****
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     for(int i=1;i<=row;i++){
    //         for(int j=i;j<row;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=row;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.7 Hollow Rhombus
    // /*
    //  *     ****
    //  *    *  *
    //  *   *  *
    //  *  ****
    //  */
    // public static void main(String[] args) {
    //     int row=5;
    //     for(int i=1;i<=row;i++){
    //         for(int j=i;j<row;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=row;j++){
    //             if(i==1 || j==1 || j==row || i==row){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

    // //22.8 Diamond pattern
    // /*
    //  *     *
    //  *    ***
    //  *   *****
    //  *   *****
    //  *    ***
    //  *     *
    //  */
    // public static void main(String[] args) {
    //     int row=10;
    //     for(int i=1;i<=row;i++){
    //         for(int j=i;j<row;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=(2*i-1);j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    //     for(int i=row;i>=1;i--){
    //         for(int j=i;j<row;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=(2*i-1);j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }
}
