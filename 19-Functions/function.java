public class function {
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
    
}
