public class bitManupulationBasic {
        // /*31 BIT MANUPULATION*/
    // //31.1 Binary number system => 0 1 && Binart oprartors
    // /*
    //  * Binary AND => &
    //  * Binary OR => |
    //  * Binary XOR => ^
    //  * Binary ones complement => ~
    //  * Binary Left shift => <<
    //  * Binary Right Shift => >>
    //  */
    // public static void main(String[] args) {
    //     //31.1.1 Binary AND => &
    //     /*
    //      * 0 0 => 0
    //      * 0 1 => 0
    //      * 1 0 => 0
    //      * 1 1 => 1
    //      */
    //     System.out.println(5&6);
    //     //31.1.2 Binary OR => |
    //     /*
    //      * 0 0 => 0
    //      * 0 1 => 1
    //      * 1 0 => 1
    //      * 1 1 => 1
    //      */
    //     System.out.println(5|6);
    //     //31.1.2 Binary XOR => ^
    //     /*
    //      * 0 0 => 0
    //      * 0 1 => 1
    //      * 1 0 => 1
    //      * 1 1 => 0
    //      */
    //     System.out.println(5^6);
    //     //31.1.3 Binary One's Complement => ~
    //     /*
    //      * 0 => 1
    //      * 1 => 0
    //      */
    //     //MSB=> Positive or Negative define karta hai
    //     //kisi bhi number ka value nikalna ho to uska 2's complement liya jata hai
    //     //here in this case 5 is 101 and it is in memory as 000000101
    //     //when not is taken then it converts into 111111010
    //     //now it is converted to decimal to calculate its magnitude we use 2's complment
    //     //step1 => 1's complnent => 000000101
    //     //step2 => add 1
    //     //00000110 => which is 6
    //     //and it will check from where it came and it came from there where MSB was 1 so ans will be -6
    //     System.out.println(~5);
    //     //31.1.4 Binary left shift => <<
    //     //10001110101 shift bt 2 
    //     //00111010100  (remove start ke numbers=shift value then append 0 at last equal to shift ka value)
    //     //a<<b = a*2^b
    //     System.out.println(5<<2);
    //     //31.1.5 Binary Right shift => >>
    //     //10101101 shift by 2 
    //     //00101011 (remove end ke numbers=shift value then append 0 at start equal to shift ka value)
    //     //a>>b = a/2^b
    //     System.out.println(6>>1);    
    // }

    // //31.2 Check if Even or Odd
    // //Odd => LSB 1
    // //Even => LSB 0
    // public static boolean oddEven(int n){
    //     int bitMask=1;
    //     if((n & bitMask) == 1){
    //         return false;
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     System.out.println(oddEven(5));
    //     System.out.println(oddEven(28));
    // }

    // //31.3 Get Set Clear update clear last ith bit
    // public static int getiBit(int n,int i){
    //     int bitMask=1<<i;
    //     if((n & bitMask)==0){
    //         return 0;
    //     }
    //     return 1;
    // }
    // public static int setibit(int n,int i){
    //     int bitMask=1<<i;
    //     return n|bitMask;
    // }
    // public static int clearibit(int n,int i){
    //     int bitMask=~(1<<i);
    //     return n&bitMask;
    // }
    // public static int updateibit(int n,int i,int newBit){
    //     // if(newBit==0){
    //     //     return clearibit(n, i);
    //     // }else{
    //     //     return setibit(n, i);
    //     // }
    //     n=clearibit(n, i);
    //     int bitMask=newBit<<i;
    //     return n|bitMask;
    // }
    // public static int clearLastibits(int n,int i){
    //     int bitMask=(~0)<<i;
    //     return n&bitMask;
    // }
    // public static int clearRangebits(int n,int i,int j){
    //     // int bitMask=((~0)<<j)>>i;
    //     // return n&bitMask;
    //     int a=((~0)<<(j+1));
    //     int b=(1<<i)-1;
    //     //becoz if we want all 001111 all 1 at right then this is equivalent to (1*2^i)-1 and 1*2^i => 1<<i 1 3 7 15 etc
    //     return n & (a|b);
    // }
    // public static void main(String[] args) {
    //     System.out.println(getiBit(15, 2));
    //     System.out.println(setibit(10, 2));
    //     System.out.println(clearibit(10, 1));
    //     System.out.println(updateibit(10, 2, 1));
    //     System.out.println(clearLastibits(15, 2));
    //     System.out.println(clearRangebits(10,2,4));
    // }

    // //31.4 Check if number is power of 2 or not?
    // //always 15 aur 16 ya 32 and 31 ka & lege to 0 hi aayega kyu ki 15 => 01111 and 16 => 10000
    // public static boolean isPowerof2(int n){
    //     return (n&(n-1))==0;
    // }
    // public static void main(String[] args) {
    //     System.out.println(isPowerof2(32));
    // }

    // //31.5 Count set bits in a number
    // //ex. 10111 setBit=4
    // //Time complecity log(2)n + 1  =>every number can be represented in binary in log(2)n+1 bits
    // //we will check LSB at every iteration and check it and then we will perform right shift by 1
    // public static int countSetBit(int n){
    //     int count=0;
    //     while(n>0){
    //         if((n&1)!=0){
    //             count++;
    //         }
    //         n=n>>1;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     System.out.println(countSetBit(16));
    // }

    // //31.6 Fast exponantion 
    // //Time complexity => O(logn)
    // //a^n => n will convert to binary then
    // //ex. 3^5=> 3^101 => 101 is 3^4 3^2 3^1 then multiply is where binary is 1 not 0
    // public static int fastExponention(int a,int b){
    //     int ans=1;
    //     while(b>0){
    //         if((b&1)!=0){ 
    //             ans*=a;
    //         }
    //         a*=a;
    //         b=b>>1;
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     System.out.println(fastExponention(3, 4));
    // }

    // //31.7 Swap without using third variable
    // public static void main(String[] args){
    //     int a=5,b=4;
    //     // a=a+b;
    //     // b=a-b;
    //     // a=a-b;
    //     a=a^b;
    //     b=a^b;
    //     a=a^b;
    //     System.out.println(a+" "+b);
    // }

    // //31.8 add 1 to an integer using bit
    // public static void main(String[] args) {
    //     System.out.println("5 + 1 = "+-~5);
    // }
}
