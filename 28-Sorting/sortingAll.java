public class sortingAll {
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

}
