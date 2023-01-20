public class recursionBasic {
    // //35.1 print number in desecnding order
    // public static void desecnding(int n){
    //     if(n==1){
    //         System.out.print("1");
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     desecnding(n-1);
    // }
    // public static void main(String[] args) {
    //     desecnding(10);
    // }

    /*Stack overflow=> 
     * 1.Too much parameters
     * 2.Too many calls
     */


    //  //35.2 prine from 1 to n
    // public static void print1toN(int n){
    //     if(n==1){
    //         System.out.print(1);
    //         return;
    //     }
    //     print1toN(n-1);
    //     System.out.print(" "+n);
    // }
    // public static void main(String[] args) {
    //     print1toN(5);
    // }


    // //35.3 print factorial
    // public static int printFact(int n){
    //     if(n==1){
    //         return n;
    //     }
    //     return n*printFact(n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(printFact(5));    
    // }


    // //35.4 Sum of n natural number
    // public static int recsum(int n){
    //     if(n==1){
    //         return n;
    //     }
    //     return n+recsum(n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(recsum(9));
    // }


    // //35.5 Prine Nth fibonacci number
    // public static int fibonacci(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     return fibonacci(n-1)+fibonacci(n-2);
    // }
    // public static void main(String[] args) {
    //     System.out.println(fibonacci(5));
    // }


    // //35.6 Array is sorted or not
    // public static boolean sorted(int arr[],int i){
    //     if(i==arr.length-1){
    //         return true;
    //     }
    //     if(arr[i]>arr[i+1]){
    //         return false;
    //     }
    //     return sorted(arr,i+1);
    // }
    // public static void main(String[] args) {
    //     int arr[]={2,3,4,9,6};
    //     System.out.println(sorted(arr,0));
    // }


    // //35.7 First occurance of an element
    // public static int firstOcc(int arr[],int i,int t){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     if(arr[i]==t){
    //         return i;
    //     }
    //     return firstOcc(arr,i+1,t);
    // }
    // public static void main(String[] args) {
    //     int arr[]={4,5,6,3,2};
    //     System.out.println(firstOcc(arr,0,6));
    // }


    // //35.8 Last occurance of an element
    // public static int lastOcc(int arr[],int i,int t){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     int o=lastOcc(arr, i+1, t);
    //     if(o==-1 && arr[i]==t){
    //         return i;
    //     }
    //     return o;

    // }
    // public static void main(String[] args) {
    //     int arr[]={6,6,6,6,3,4,5,6};
    //     System.out.println(lastOcc(arr, 0, 6));
    // }


    // //35.9 Print x^n
    // public static int xpown(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*xpown(x,n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(xpown(2,10));
    // }


    // //35.10 print x^n in logn time
    // /*
    //  * 2^10 = 2^5 * 2^5
    //  * 2^5 = 2 * 2^2 * 2*2
    //  */
    // public static int fastxpown(int x,int n){
    //     if(n==1){
    //         return x;
    //     }
    //     if(n%2==0){
    //         int a=fastxpown(x, n/2);
    //         return a*a;
    //     }
    //     else{
    //         int a=fastxpown(x, n/2);
    //         return x*a*a;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(fastxpown(2, 9));
    // }


    // //35.11 Tiling problem
    // /*
    //  * 2*n floor
    //  * 2*1 tile
    //  */
    // public static int tilingFill(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     return tilingFill(n-1)+tilingFill(n-2);
    // }
    // public static void main(String[] args) {
    //     System.out.println(tilingFill(5));
    // }


    // //35.12 Remove duplicate from string
    // /* a-z given */
    // public static void uniqueString(String s,int i,StringBuilder sb,boolean map[]){
    //     if(i==s.length()){
    //         System.out.println(sb);
    //         return;
    //     }
    //     if(map[s.charAt(i)-'a']==false){
    //         map[s.charAt(i)-'a']=true;
    //         sb.append(s.charAt(i));
    //     }
    //     uniqueString(s, i+1, sb, map);
    // }
    // public static void main(String[] args) {
    //     boolean map[]=new boolean[26];
    //     StringBuilder sb=new StringBuilder("");
    //     uniqueString("nlllluuuucvtull", 0, sb, map);
    // }


    // //35.13 Freinds pairing problem
    // /*
    //  * Given n friends
    //  * find ways number where each of them can be friend or single
    //  * ex. n=1
    //  * single way=1
    //  * ex. n=2
    //  * single single
    //  * mingle way=2
    //  * ex. n=3
    //  * a,b c
    //  * a b c
    //  * a b,c
    //  * a,c b way=4
    //  */
    // public static int waysFriend(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     return waysFriend(n-1)+(n-1)*waysFriend(n-2);
    // }
    // public static void main(String[] args) {
    //     System.out.println(waysFriend(5));
    // }


    // //35.14 Binary string problem
    // /*
    //  * print all binary string of length N where there are no consecutive 1s
    //  */
    // public static void binaryString(int n,int lastPos,String str){
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     binaryString(n-1, 0, str+"0");
    //     if(lastPos!=1){
    //         binaryString(n-1, 1, str+"1");
    //     }
    // }
    // public static void main(String[] args) {
    //     binaryString(5, 0,"");
    // }


    // //35.15 Tower of Honoi
    // /*
    //  * 3 tower A B C
    //  * move N disk from A to C 
    //  */
    // public static void moveDisk(int n,String src,String helper,String dest){
    //     if(n==1){
    //         System.out.println("Move disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     moveDisk(n-1, src, dest, helper);
    //     System.out.println("Move disk "+n+" from "+src+" to "+dest);
    //     moveDisk(n-1, helper, src, dest);
    // }
    // // public static void main(String[] args) {
    // //     moveDisk(3, "A", "B", "C");
    // }

    
}
