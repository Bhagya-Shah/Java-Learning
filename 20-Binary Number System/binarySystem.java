public class binarySystem {
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
}
