import java.util.Scanner;

public class javaAssignments {

    // /*A1 Q1=> In a program,input 3 numbers:A, B and C.You have to output the average of these 3 numbers */
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int A,B,C;
    //     A=sc.nextInt();
    //     B=sc.nextInt();
    //     C=sc.nextInt();
    //     float avg=(A+B+C)/3;
    //     System.out.println(avg);
    // }

    // /*A1 Q2=> Input and area of square */
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int side=sc.nextInt();
    //     System.out.println("Area is "+side*side);
    // }

    /*Input set of integers and print sum of even and odd entered */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int n;
        do{
            n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }else{
                oddSum+=n;
            }
        }while(n!=-1);
        oddSum+=1;
        System.out.println("EvenSum= "+evenSum+" OddSum= "+oddSum);
    }

    
}
