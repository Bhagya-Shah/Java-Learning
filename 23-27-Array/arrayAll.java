public class arrayAll {
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
}
