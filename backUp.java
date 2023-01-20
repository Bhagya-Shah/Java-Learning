import java.util.*;

import javax.xml.crypto.dsig.XMLSignature.SignatureValue;
import javax.xml.stream.events.StartDocument;

public class backUp{
    
    // /*2. Data Types*/
    // name of the variables is called identifier and it can start with any alphabat,_,$


    // /*3.Sum of 2*/
    // public static void main(String[] args) {
    //    int a=10;
    //    int b=56;
    //    int sum=a+b;
    //    System.out.println(sum+" Sum");
    // }


    // /*4. Input in java*/
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String inputone = sc.next();
    //     String inputfull = sc.nextLine();
    //     int number = sc.nextInt();
    //     float price = sc.nextFloat();
    //     //next nextLine nextInt nextFloat nextLong nextDouble nextShort nextBoolean nextByte
    // }


    // /*5. Sum of a & b form user*/
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=a+b;
    //     System.out.println(sum);
    // }


    // /*6. Product of a & b*/
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int prod=a*b;
    //     System.out.println(prod);
    // }
 
    
    // /*7. Arra of Circle*/
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     float r=sc.nextFloat();
    //     float area=3.14F*r*r;   //here we have to type F next to a float number bcoz by default it takes double as a type in decimal numbers.
    //     System.out.println(area);
    // }
 
    
    // /*8. Type conversion || Type casting (narrowing or explicit conversion)*/
    // public static void main(String[] args) {
    //     //Conversion happens when 1=> Type compatible  2=> Destination type > Source type
    //     //byte<short<int<float<long<doble
    //     //loosy conversion java itself doesnt do ex. long => short or int

    //     float a=25.97F;
    //     int b=(int)a;
    //     System.out.println(b);

    //     char ch='a';
    //     int ascii=ch;
    //     System.out.println(ascii);
    // }


    // /*9. Type promotion */
    // public static void main(String[] args) {
    //     //char short byte are automatically converted into int when oprations are done on them in only expression
    //     char ch='a';
    //     short s=10;
    //     int ans1=ch+s;
    //     System.out.println(ans1);
    //     //if one oprand is float,long or double then whole expression is promoted to long,float or double repectively.
    //     int a=10;
    //     float b=10.25F;
    //     long c=25;
    //     double d=30.22;
    //     double ans2=a+b+c+d;
    //     System.out.println(ans2);

    //     byte bt=2;
    //     bt=(byte)bt*2;
    //     System.out.println(bt);
    // }

    // /*10.How our code runs*/
    // // Source code.java => Compiler => Byte code .class => JVM => Native code (Machine code) -> differnet for different machines
    // // --------------Comilation------------------------  || ----------------Execution--------------


    // /*11. Oprators in java */
    // //sum = a + b ||  a,b => oprands  +,-,*,/,% => oprators
    // //Types:
    // //1.Aithmatic (Binary/Unary/Ternary)
    // //2.Relational
    // //3.Logical
    // //4.Biwwise
    // //5.Assignment

    // public static void main(String[] args) {
    //     //1.Airthnatic
    //     //1.1 Binary (2 oprator needed) => a+b, a-b, a*b, a/b, a%b
    //     //1.2 Unary (1 oprator needed) => a++ , a--, --a, ++a
    //     int a=10;
    //     int b=5;
    //     int c=a+b;
    //     System.out.println("a+b  "+c);
    //     System.out.print("a-b  ");System.out.println(a-b);
    //     System.out.println("a*b  "+a*b);
    //     System.out.println("a/b  "+a/b);
    //     System.out.println("a%b  "+a%b);
    //     System.out.println("a++  "+a++);
    //     System.out.print("++a  ");System.out.println(++a);
    //     System.out.println("a--  "+a--);
    //     System.out.print("--a  ");System.out.println(--a);
    // }

    // public static void main(String[] args) {
    //     //2.Relational
    //     //==, =>, <=, !=, <, >
    //     int a=10,b=9;
    //     System.out.println(a==b);
    //     System.out.println(a!=b);
    //     System.out.println(a<=b);
    //     System.out.println(a>=b);
    //     System.out.println(a>b);
    //     System.out.println(a<b);
    // }

    // public static void main(String[] args) {
    //     //3.Logical
    //     // && => and, || => or, ! => not
    //     int a=10,b=9;
    //     System.out.println(a==b || a>=b); 
    //     System.out.println(a==b && a>=b);
    //     System.out.println(!(a==b) && a>=b); 
    // }

    // public static void main(String[] args) {
    //     //5.Assignments 
    //     //=, +=, -=, *=, /=
    //     //= => right ka value left ko assign
    //     int a=10;
    //     a+=10; //a=a+10
    //     System.out.println(a);
    //     a-=10; //a=a-10
    //     System.out.println(a);
    //     a*=10; //a=a*10
    //     System.out.println(a);
    //     a/=10; //a=a/10
    //     System.out.println(a);
    // }


    // /*12 Conditional*/

    // public static void main(String[] args) {
    //     //if (condition){ } else { }
    //     int age=20;
    //     if(age>=18){
    //         System.out.println("You can vote!");
    //     }
    //     else{
    //         System.out.println("Cant vote, Sorry dude!");
    //     }
    // }

    // public static void main(String[] args) {
    //     //Largest of 2 numbers
    //     int a=5,b=10;
    //     if(a>b){
    //         System.out.println("A is largest");
    //     }
    //     else{
    //         System.out.println("B is largest");
    //     }
    // }

    // public static void main(String[] args) {
    //     //Odd Even
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     if(a%2==0){
    //         System.out.println("Number is even");
    //     }
    //     else{
    //         System.out.println("Odd number");
    //     }
    // }

    // public static void main(String[] args) {
    //     //If ElseIf Else => Income tax calculator
    //     System.out.println("Enter your Income");
    //     Scanner sc = new Scanner(System.in);
    //     int income=sc.nextInt();
    //     if(income<500000){
    //         System.out.println("Tax =0");
    //     }
    //     else if(income>500000 && income<1000000){
    //         System.out.println("Tax = "+income*0.2);
    //     }
    //     else{
    //         System.out.println("Tax is = "+income*0.3);
    //     }
    // }

    // public static void main(String[] args) {
    //     //Largest of three numbers
    //     int a=100,b=999,c=221;
    //     if(a>=b && a>=c){
    //         System.out.println("A");
    //     }
    //     else if(b>=c){
    //         System.out.println("B");
    //     }
    //     else{
    //         System.out.println("C");
    //     }
    // }


    // /*13. Ternary oprator => 3 oprands ||=> from (11.1) */
    // public static void main(String[] args) {
    //     //Ternary oprator => variable = condition ? statement1 : statement2;

    //     //13.1 Largest
    //     int larger=5>2?5:2;
    //     System.out.println(larger);

    //     //13.2 Even odd
    //     int num=100;
    //     String type=num%2==0?"Even":"Odd";
    //     System.out.println(type);

    //     //13.3 Pass - Fail
    //     int marks=67;
    //     String reportCard=marks>=35?"Pass":"Fail";
    //     System.out.println(reportCard);
    // }


    // /*14 Switch*/
    // public static void main(String[] args) {
    //     //14.1 Day check
    //     int day=4;
    //     switch(day){
    //         case 1: System.out.println("Sunday");
    //                 break;
    //         case 2: System.out.println("Monday");
    //                 break;
    //         case 3: System.out.println("Tuesday");
    //                 break;
    //         case 4: System.out.println("Wednesday");
    //                 break;
    //         case 5: System.out.println("Thursday");
    //                 break;
    //         case 6: System.out.println("Friday");
    //                 break;
    //         case 7: System.out.println("Saturday");
    //                 break;
    //         default: System.out.println("Not a day");
    //     }
    // }

    // public static void main(String[] args) {
    //     //14.2 Calculator
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a: ");
    //     int a=sc.nextInt();
    //     System.out.print("Enter operation: ");
    //     char oprator = sc.next().charAt(0);
    //     System.out.print("Enter b: ");
    //     int b=sc.nextInt();
        
    //     switch(oprator){
    //         case '+': System.out.println(a+b);
    //                   break;
    //         case '-': System.out.println(a-b);
    //                   break;
    //         case '*': System.out.println(a*b);
    //                   break;
    //         case '/': System.out.println((float)a/b);
    //                   break;
    //         case '%': System.out.println(a%b);
    //                   break;
    //         default: System.out.println("Wrong");
    //     }
    // }


    /*15 Loops */
    // public static void main(String[] args) {
    //     //15.1 while loop
    //     //1 to n numbers
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int i=0;
    //     while(i<=n){
    //         System.out.print(i+" ");
    //         i++;
    //     }
    // }
        
    // public static void main(String[] args) {
    //     //15.2 Sum of N natural numbers
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int i=1,sum=0;
    //     while(i<=n){
    //         sum+=i;
    //         i++;
    //     }
    //     System.out.println("Sum is => "+sum);
    // }

    // public static void main(String[] args) {
    //     //15.3 For loop
    //     int n=10;
    //     for(int i=1;i<=n;i++){
    //         System.out.print(i+" ");
    //     }
    // }

    // public static void main(String[] args) {
    //     //15.4 Square pattern
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         System.out.println("* * * *");
    //     }

    //     while(n>0){
    //         System.out.println("* * * *");
    //         n--;
    //     }
    // }

    // public static void main(String[] args) {
    //     //15.5 Print reverse of a number and save a reverse of a number
    //     int number=123114;
    //     int rev=0;
    //     System.out.println("Number is: \n"+number+"\nand reverse is: ");
    //     while(number>0){
    //         System.out.print(number%10);
    //         rev=rev*10+number%10;
    //         number/=10;
    //     }
    //     System.out.println("\nReverse number is: "+rev);
    // }

    // public static void main(String[] args) {
    //     //15.6 Do while
    //     //loop runs first then condition is checked
    //     int counter=1;
    //     do{
    //         System.out.println("Hello world");
    //         counter++;
    //     }while(counter==0);
    // }


    /*16 Break Continue*/
    // public static void main(String[] args) {
    //     //16.1 Break
    //     //keep taking input till user input multiple of 10
    //     Scanner sc=new Scanner(System.in);
    //     do{
    //         System.out.print("Enter your number :");
    //         int n=sc.nextInt();
    //         if(n%10==0){
    //             break;
    //         }
    //         System.out.println("Your number: "+n);
    //     }while(true);
    // }

    // public static void main(String[] args) {
    //     //16.2 Continue
    //     //we use it to skip the itration
    //     //print 1 2 4 5 7 8 10
    //     for(int i=1;i<=30;i++){
    //         if(i%3==0){
    //             continue;
    //         }System.out.println(i);
    //     }
    // }


    // /*17 Check number is prime or not*/
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num=sc.nextInt();
    //     boolean isPrime=true;
    //     int i=2;
    //     do{
    //         if(num%i==0){
    //             isPrime=false;
    //             break;
    //         } i++;
    //     }while(i<Math.sqrt(num));
    //     System.out.println(isPrime==true?"Prime":"Not prime"); 
    // }


    // /*18 Patterns part-1 */
    // public static void main(String[] args) {
    //     /* 18.1 Star pattern
    //         *
    //         * *
    //         * * *
    //         * * * * 
    //     */
    //     int n=4;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // public static void main(String[] args) {
    //     /*  18.2 Inverted Star
    //         * * * *
    //         * * *
    //         * *
    //         *
    //     */
    //     int n=4;
    //     for(int i=n;i>0;i--){
    //         for(int j=i;j>0;j--){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // public static void main(String[] args) {
    //     /*18.3 Half pyramid pattern
    //      * 1
    //      * 12
    //      * 123
    //      * 1234
    //     */
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println("");
    //     }
    // }

    // public static void main(String[] args) {
    //     /* 18.4 Inverted and rotated half Pyramid pattern
    //               *
    //             * *
    //           * * *
    //         * * * *
    //     */
    //     int n=4;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(j<n-i-1){
    //                 System.out.print("  ");
    //             }else{
    //                 System.out.print("* ");
    //             }
    //         }
    //         System.out.println("");
    //     }
    // }

    // public static void main(String[] args) {
    //     /* 18.5
    //      * A
    //      * BC
    //      * DEF
    //      * GHIJ
    //      * KLMNO
    //     */
    //     char ch='A';
    //     int n=5;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print(ch++);
    //         }
    //         System.out.println("");
    //     }
    // }


    // /* 19 Functions */
    // //Block of code to do a particular task again and again reusable
    // //Java me functions ko hi method bulaya jata hai => jo functions class ke andar likhe jate hai unko method bolte hai

    // //syntax
    // //returnType name(){
    //     //body
    //     //return statement
    // //}

    // //Parameter functions syntax
    // //returnType name(type p1,type p2, ..){
    //     //body
    //     //return statement
    // //} 

    // //19.1 print helloworld
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    // }
    // public static void main(String[] args) {
    //     printHelloWorld();
    // }

    // //19.2 Add 2 number
    // public static int calculateSum(int a,int b){ //(int a,int b) parameters || formal parameters =>defination time
    //     int sum=a+b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num1=sc.nextInt();
    //     int num2=sc.nextInt();
    //     int sum=calculateSum(num1,num2); //arguments || actual paramaters =>calling time
    //     System.out.println("Sum is: "+sum);
    // }

    //Memory me kya hota hai => fuunctions me memory ka part stack (call stack) me functions save hote hai 
    //call by value =>java me always call by value hota hai => copy always pass hota hai

    // //19.3 Swap two values
    // public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println(a+" "+b);
    // }
    // public static void main(String[] args) {
    //     int a=10;
    //     int b=7;
    //     //swap
    //     swap(a,b);
    //     System.out.println(a+" "+b);
    // }

    // //19.4 Multiply 2 number
    // public static int multiply(int a,int b){
    //     int prod=a*b;
    //     return prod;
    // }
    // public static void main(String[] args) {
    //     int prod=multiply(5,6);
    //     System.out.println(prod);
    // }

    // //19.5 factorial of n
    // public static int factorial(int n){
    //     int fact=1;
    //     while(n>=1){
    //         fact*=n;
    //         n-=1;
    //     }
    //     return fact;
    // }
    // public static void main(String[] args) {
    //     int fact=factorial(0);
    //     System.out.println("Factorial is : "+fact);
    // }

    // //19.6 Binomial coefficient => nCr
    // public static int factorial(int n){
    //     int fact=1;
    //     while(n>=1){
    //         fact*=n;
    //         n-=1;
    //     }
    //     return fact;
    // }
    // public static int binomialCoefficient(int n,int r){
    //     int nCr=factorial(n)/(factorial(r)*factorial(n-r));
    //     return nCr;
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     int r=2;
    //     int nCr=binomialCoefficient(n, r);
    //     System.out.println(nCr);
    // }

    //user defined method
    //in-built method => ex. math.pow,math.sqrt

    // //19.7 function overloading => type of parameter || number of parameter
    // //19.7.1 => dataType
    // public static int multiply(int a,int b){
    //     return a*b;
    // }
    // public static float multiply(float a,float b){
    //     return a*b;
    // }
    // //19.7.2 =>number of parameter
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(multiply(4, 5));
    //     System.out.println(multiply(4.1f, 5.1f));
    //     System.out.println(sum(4, 5, 6));
    //     System.out.println(sum(4, 5));
    // }

    // //19.8 prime or not using function
    // public static boolean isPrime(int n){
    //     boolean prime=true;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             prime=false;
    //             return prime;
    //         }
    //     }
    //     return prime;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPrime(20));
    // }
        
    // //19.9 print all primes in range
    // public static boolean isPrime(int n){
    //     boolean prime=true;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return prime;
    // }
    // public static void primeRange(int range){
    //     for(int i=2;i<=range;i++){
    //         if(isPrime(i)){
    //             System.out.println(i);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println("Enter range");
    //     Scanner sc=new Scanner(System.in);
    //     int range=sc.nextInt();
    //     primeRange(range);
    // }


    // /*20. Binary number system part 1 BIT Manupulation */

    // //20.1 convert from binary to decimal
    // //0(10)=0(2) 2(10)=10(2) 5(10)=101(2)
    // public static int binToDecimal(int bin){
    //     int pow=0;
    //     int dec=0;
    //     while(bin>0){
    //         int ld=bin%10;
    //         dec+=ld*Math.pow(2,pow);
    //         pow+=1;
    //         bin/=10;
    //     }
    //     return dec;
    // }
    // public static void main(String[] args) {
    //     int bin=10111;
    //     System.out.println(binToDecimal(bin));
    // }

    // //20.2 convert from decimal to binary
    // public static int decToBinary(int n){
    //     int bin=0;
    //     int pow=0;
    //     while(n>0){
    //         int reminder=n%2;
    //         bin=bin+(reminder*(int)Math.pow(10,pow));
    //         pow++;
    //         n/=2;
    //     }
    //     return bin;
    // }
    // public static void main(String[] args) {
    //     System.out.println(decToBinary(5));
    // }

    // /*21 Scope => 
    //  * Mathod scope => jaha define huva uske bad se we can access them
    //  * Block scope => {} ke bich me only access
    //  * Class scope => access modifier (public private protected)
    //  */

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


    // /*23 Arrays */
    // //List of elements of the same type placed in a contiguous memory location
    // //dataType arrayName[] = new dataType(size);
    // public static void main(String[] args) {

    // //23.1=>INPUT
    //     int marks[]=new int[5];
    //     int numbers[]={1,2,3,4,5};
    //     String fruits[]={"'banana'","'apple'","'mango'"};
    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0;i<5;i++){
    //         marks[i]=sc.nextInt();
    //     }
    //     for(int i=0;i<5;i++){
    //         System.out.println(marks[i]);
    //     }
    // }

    // //23.2=> Array Length
    // public static void main(String[] args) {
    //     int marks[]=new int[50];
    //     System.out.println(marks.length);
    // }

    // //23.3=> Pass by reference => Arrays always pass by refrence hota hai whenever we call function it takes the address so change occured gives change to main too.
    // public static void update(int tt[],int change){
    //     for(int i=0;i<tt.length;i++){
    //         tt[i]+=10;
    //     }
    //     change=100;
    //     System.out.println("Here change="+change);
    // }
    // public static void main(String[] args) {
    //     int marks[]={40,50,70};
    //     int change=50;
    //     update(marks,change);
    //     for(int i=0;i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println(change);
    // }

    // //23.4 Linerar search
    // public static int linearSearch(int array[],int key){
    //     for(int i=0;i<array.length;i++){
    //         if(key==array[i])
    //         return i;
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int array[]={4,5,6,1,2,3};
    //     int key=2;
    //     index=System.out.println(linearSearch(array, key));
    //     if(index==-1){
    //         System.out.println("Not Found");
    //     }else{
    //         System.out.println("Found at index: "+index);
    //     }
    // }

    // //23.5 Max Min from array
    // public static int greatest(int numbers[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest=numbers[i];
    //         }
    //     }
    //     return largest;
    // }
    // public static int smallest(int numbers[]){
    //     int mini=Integer.MAX_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         if(mini>numbers[i]){
    //             mini=numbers[i];
    //         }
    //     }
    //     return mini;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={5,4,7,8,1,2,23,55,12};
    //     System.out.println("MINIMUM= "+smallest(numbers));
    //     System.out.println("MAXIMUM= "+greatest(numbers));
    // }


    // /*24 Binary Search */
    // public static int binarySearch(int numbers[],int key){
    //     int start=0;
    //     int end=numbers.length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(numbers[mid]==key){
    //             return mid;
    //         }if(numbers[mid]<key){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2,3,4,5,6,7,8,9};
    //     int key=12;
    //     System.out.println(binarySearch(numbers,key));
    // }


    // /*25- Reverse an array */
    // //1 2 3 4 5
    // //5 2 3 4 1 =>step 1
    // //5 4 3 2 1 =>step 2
    // public static void reverseArray(int array[]){
    //     int i=0,j=array.length-1;
    //     while(i<j){
    //         int t=array[i];
    //         array[i]=array[j];
    //         array[j]=t;
    //         i++;
    //         j--;
    //     }
    // }
    // public static void main(String[] args) {
    //     int array[]={1,2,3,4,5};
    //     reverseArray(array);
    //     for(int i=0;i<array.length;i++){
    //         System.out.print(array[i]+" ");
    //     }
    // }


    // /*26.1 Pairs in an array */
    // //2 4 6 8 10
    // //ans=> 2,4 2,6 2,8 2,10 4,6 4,8 4,10 6,8 6,10 8,10
    // public static void printPairs(int array[]){
    //     int totalPairs=0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             System.out.print("{"+array[i]+","+array[j]+"}"+" ");
    //             totalPairs++;
    //         }
    //         System.out.println("");
    //     }
    //     System.out.println("TotalPairs: "+totalPairs);
    // }
    // public static void main(String[] args) {
    //     int array[]={2,3,4,5,6};
    //     printPairs(array);
    // }

    // //26.2 continuous part of subarray {print subarray}
    // //26.3 Max,Min SUM of subarray
    // public static void printSubArray(int numbers[]){
    //     int totalSubArray=0;
    //     int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             int sum=0;
    //             System.out.print("{ ");
    //             for(int k=i;k<=j;k++){
    //                 System.out.print(numbers[k]+" ");
    //                 sum+=numbers[k];
    //             }
    //             totalSubArray++;
    //             System.out.println("}");
    //             if(sum>max){
    //                 max=sum;
    //             }
    //             if(sum<min){
    //                 min=sum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total Sub Arrays: "+totalSubArray);
    //     System.out.println("Maximum sum of subarray: "+max);
    //     System.out.println("Minimum sum of subarray: "+min);
    // }
    // public static void main(String[] args) {
    //     int numbers[]={-1,2,-3,4,-5};
    //     printSubArray(numbers);
    // }


    // //26.3 Max subarray sum => Prefix sum
    // public static void prefixSubArraySum(int arr[]){
    //     int prefixSum[]=new int[arr.length];
    //     int max=Integer.MIN_VALUE;
    //     int min=Integer.MAX_VALUE;
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
    //         prefixSum[i]=sum;
    //     }
    //     for(int i=0;i<prefixSum.length;i++){
    //         System.out.print(prefixSum[i]+" ");
    //     }
    //     System.out.println("");
    //     for(int i=0;i<prefixSum.length;i++){
    //         for(int j=i;j<prefixSum.length;j++){
    //             int psum=i==0?prefixSum[j]:prefixSum[j]-prefixSum[i-1];
    //             if(psum>max){
    //                 max=psum;
    //             }
    //             if(psum<min){
    //                 min=psum;
    //             }
    //         }
    //     }
    //     System.out.println("Max sum: "+max);
    //     System.out.println("Min sum: "+min);
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,-2,6,-1,3};
    //     prefixSubArraySum(arr);
        
    // }

    // //26.4 Kadanes Algorithm
    // /*
    //  * + + = +
    //  * + small(-) = +
    //  * + large(-) = 0 //negative se better 0
    //  */
    // /*
    //  *     -2 -3 4 -1 -2 1 5 -3
    //  * CSum 0  0 4  3  1 2 7  4 
    //  * MSum 0  0 4  4  4 4 7  7
    //  */
    // public static int kadaneMaxSubArraySum(int array[]) {
    //     int curSum=0,maxSum=Integer.MIN_VALUE,smallestNeg=Integer.MIN_VALUE;
    //     for(int i=0;i<array.length;i++){
    //         curSum+=array[i];
    //         if(curSum<0){
    //             curSum=0;
    //         }
    //         if(maxSum<curSum){
    //             maxSum=curSum;
    //         }
    //         //if all numbers are negative then kadane gives 0 as output but we want smallest negative from array as output as max
    //         smallestNeg=Math.max(smallestNeg, array[i]);
    //     }
    //     return maxSum==0?smallestNeg:maxSum;
    // }
    //  public static void main(String[] args) {
    //     int array[]={-2,-3,4,-1,-2,1,5,-3};
    //     int array2[]={-1,-2,-3,-4};
    //     int max=kadaneMaxSubArraySum(array);
    //     int max2=kadaneMaxSubArraySum(array2);
    //     System.out.println("Max SubarraySum = "+max);
    //     System.out.println("Max SubarraySum = "+max2);
    // }

    
    // /*27 Auxillary array => Helper arrays*/
    // //27.1 Trapping Rainwater 
    // /*
    //  * How much water it stores
    //  * given the hight of pannel of each bar and width
    //  * ex.
    //  *  _
    //  * | |    _
    //  * | |   | |
    //  * | |_  | |
    //  * |_|_|_|_| {4,1,0,3}
    //  * 
    //  * leftMax={4,4,4,4}
    //  * rightMax={3,3,3,3}
    //  * 
    //  * c1=totalBar>2
    //  * c2=assending deseding order water=0
    //  * har time left me max bar dundo right ka max bound dundo => get minimum of it and do 
    //  * waterLevel[i]=((Math.min(leftmax,rightmax))-barHight[i])*width
    //  * if that is neagtive then consider 0
    //  */
    // public static int[] leftMaxBoundry(int arr[]){
    //     int leftMax[]=new int[arr.length];
    //     leftMax[0]=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         leftMax[i]=Math.max(arr[i],leftMax[i-1]);
    //     }
    //     return leftMax;
    // }
    // public static int[] rightMaxBoundry(int arr[]){
    //     int rightMax[]=new int[arr.length];
    //     rightMax[arr.length-1]=arr[arr.length-1];
    //     for(int i=arr.length-2;i>=0;i--){
    //         rightMax[i]=Math.max(arr[i], rightMax[i+1]);
    //     }
    //     return rightMax;
    // }
    // public static int trappingWater(int bar[],int width){
    //     int leftMax[]=leftMaxBoundry(bar);
    //     int rightMax[]=rightMaxBoundry(bar);
    //     int trappedWater=0;
    //     for(int i=0;i<bar.length;i++){
    //         int hight=Math.min(leftMax[i],rightMax[i]);
    //         trappedWater+=(hight-bar[i])*width;
    //     }
    //     return trappedWater;
    // }
    // public static void main(String[] args) {
    //     int bar[]={4,2,0,6,3,2,5};
    //     System.out.println(trappingWater(bar, 1));
    // }

    // //27.2 Best time to Buy and Sell stocks
    // public static void buySellStocks(int price[]){
    //     int maxProfit=0;
    //     int buyPrice=Integer.MAX_VALUE;
    //     for(int i=0;i<price.length;i++){
    //         if(buyPrice<price[i]){
    //             int todayProfit=price[i]-buyPrice;
    //             maxProfit=Math.max(todayProfit, maxProfit);
    //         }else{
    //             buyPrice=price[i];
    //         }
    //     }
    //     System.out.println(maxProfit);
    // }
    // public static void main(String[] args) {
    //     int price[]={7,6,4,3,1};
    //     buySellStocks(price);
    // } 

    // //27.3 return true if any value appears twice in an array or if every distinct then false
    // public static boolean containDuplicate(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,1};
    //     System.out.println(containDuplicate(arr));
    // }


    // /*28 Sorting*/
    // //28.1 Bubble Sort
    // //Time complexity => O(n^2)
    // //Using swap to check if at particular iteration none swap has been done then return
    // //large elements come to the end of array bby swapping with adjacent array
    // //----0th turn---
    // //5 4 1 3 2
    // //4 5 1 3 2
    // //4 1 5 3 2
    // //4 1 3 5 2
    // //4 1 3 2 5
    // //----1st turn------
    // //4 1 3 2 5
    // //1 4 3 2 5
    // //1 3 4 2 5
    // //1 3 2 4 5
    // //---2nd turn---
    // //1 3 2 4 5
    // //1 3 3 4 5
    // //1 2 3 4 5
    // //---3rd turn---
    // //1 2 3 4 5
    // //1 2 3 4 5
    // public static void bubbleSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int swap=0;
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 //swap
    //                 int t=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=t;
    //                 swap++;
    //             }
    //         }
    //         if(swap==0){
    //             return;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int array[]={1,2,3,4,5};
    //     bubbleSort(array);
    //     for(int i=0;i<array.length;i++){
    //         System.out.print(array[i]+" ");
    //     }
    // }

    // //28.2 Selection Sort
    // //Time complexity => O(n^2)
    // //pick the smallest from array and push it to start
    // // 5 4 1 3 2
    // // 1  5 4 3 2
    // // 1 2  5 4 3
    // // 1 2 3  4 5
    // // 1 2 3 4  5
    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minPos=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPos]>arr[j]){
    //                 minPos=j;
    //             }
    //         }
    //         //swap
    //         int t=arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=t;
    //     }
    // }
    // public static void main(String[] args) {
    //     int array[]={5,4,1,2,3};
    //     selectionSort(array);
    //     printArr(array);
    // }

    // //28.3 Insertion Sort
    // //Time complexity => O(n^2)
    // //Pick an element from unsorted part and place it into the right place
    // // 5 4 1 3 2
    // // 4 5 1 3 2
    // // 1 4 5 3 2
    // // 1 3 4 5 2
    // // 1 2 3 4 5
    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void insertionSort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int curr=arr[i];
    //         int prev=i-1;
    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }
    // public static void main(String[] args) {
    //     int array[]={5,4,3,2,1};
    //     insertionSort(array);
    //     printArr(array);
    // }

    // //28.4 Inbuilt sort
    //Time complexity => O(nlogn)
    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void printArr2(Integer arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     int arr1[]={5,4,3,2,1};
    //     Arrays.sort(arr1);
    //     printArr(arr1);
    //     int arr2[]={5,4,3,2,1};
    //     Arrays.sort(arr2,1,3); //sort from index 1 to index 2
    //     printArr(arr2);
    //     Integer arr3[]={4,7,6,1,2};
    //     Arrays.sort(arr3,Collections.reverseOrder()); //sort in reverse order
    //     printArr2(arr3);
    //     Integer arr4[]={4,-3,0,1,2};
    //     Arrays.sort(arr4,2,5,Collections.reverseOrder()); //sort from index 2 to index 4 in reverse order
    //     printArr2(arr4);
    // }

    // //28.5 Counting sort
    // //usually performed on short range numbers
    // //only positive numbers
    // //done by counting frequncy
    // //1 4 1 3 2 4 3 7
    // //freq=> 0 2 1 2 2 0 0 1 (range 1-7 so 0 se 7(range))
    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void countSort(int arr[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         largest=Math.max(largest,arr[i]);
    //     }
    //     int count[]=new int[largest+1];
    //     for(int i=0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }
    //     //sorting
    //     //we take 0 here to traverse through main array to modify it
    //     int j=0;
    //     for(int i=0;i<arr.length;i++){
    //         while(count[i]>0){
    //             arr[j]=i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,3,1,4,2,4,3,7};
    //     countSort(arr);
    //     printArr(arr);
    // }


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


    /*30 Strings*/
    // //Strings are immutable=>never changes
    // //30.1 Basic string
    // public static void main(String[] args) {
    //     String str="abcd";
    //     String str2=new String("xyz");
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.nextLine();
    //     System.out.println(name);
    //     System.out.println(name.length());
    //     //concatanation
    //     System.out.println(name+" "+str);
    //     //travesrse through string
    //     System.out.println(name.charAt(0));
    //     for(int i=0;i<name.length();i++){
    //         System.out.print(name.charAt(i)+" ");
    //     }
    // }

    // //30.2 check if palindrome or not
    // public static boolean palindromecheck(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i)!=str.charAt(str.length()-i-1)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String str="racecar";
    //     System.out.println(palindromecheck(str));
    // }
   
    // //30.3 find shortest path given 4 directions traveled
    // public static double euclidianDistance(int a,int b,int c,int d){
    //     double dist=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
    //     return dist;
    // }
    // public static double findShortestPath(String path){
    //     int x=0,y=0;
    //     for(int i=0;i<path.length();i++){
    //         switch (path.charAt(i)) {
    //             case 'E':
    //                 x++;
    //                 break;
    //             case 'W':
    //                 x--;
    //                 break;
    //             case 'N':
    //                 y++;
    //                 break;
    //             case 'S':
    //                 y--;
    //                 break;
    //             default:
    //                 break;
    //         }
    //     }
    //     return(euclidianDistance(0, 0, x, y));
    // }
    // public static void main(String[] args) {
    //     String path="NSNSNNNSSSEEEWWWW";
    //     double shortestPath=findShortestPath(path);
    //     System.out.println("Shortest path = "+shortestPath);
    // }

    //30.4 Compare string
    /*
     *when we want to check via value if they are equal then use str1.equals(str2)
     *where we want to check at object level that address of that string then we use str1==str2
     */
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }


}
