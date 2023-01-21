/* 36 Divide & Conquer */

public class divideconquer{
    
    // //36.1 Merge sort => DFS type
    // /*
    //  * Time complexity -> O(nlogn)  -same as inbuild sort
    //  * Space complexity -> O(n) same as temp array
    //  * 
    //  * 6 3 9 5 2 8
    //  * 6 3 9 |  5 2 8
    //  * 6 | 3 9 |  5 | 2 8
    //  * 6 | 3 9 |  5 | 2 8
    //  * 3 6 9 | 2 5 8
    //  * 2 3 5 6 8 9
    //  */
    // public static void merge(int arr[],int i,int mid,int j){
    //     int temp[]=new int[j-i+1];
    //     int li=i;
    //     int ri=mid+1;
    //     int ti=0;
    //     while(li<=mid && ri<=j){
    //         if(arr[li]<arr[ri]){
    //             temp[ti]=arr[li];
    //             li++;
    //             ti++;
    //         }
    //         else{
    //             temp[ti]=arr[ri];
    //             ri++;
    //             ti++;
    //         }
    //     }
    //     while(li<=mid){
    //         temp[ti]=arr[li];
    //         ti++;
    //         li++;
    //     }
    //     while(ri<=j){
    //         temp[ti]=arr[ri];
    //         ri++;
    //         ti++;
    //     }
    //     for(int k=0,u=i;u<=j;u++,k++){
    //         arr[u]=temp[k];
    //     }
    // }
    // public static void msort(int nums[],int i,int j){
    //     if(i>=j){
    //         return;
    //     }
    //     int mid=i+(j-i)/2;
    //     msort(nums, i, mid);
    //     msort(nums, mid+1, j);
    //     merge(nums,i,mid,j);
    // }
    // public static void main(String[] args) {
    //     int arr[]={4,3,5,6,1,2};
    //     msort(arr,0,arr.length-1);
    //     for(int i:arr){
    //         System.out.print(i+" ");
    //     }
    // }


    // //36.2 Quick sort
    // /*
    //  * Time -> O(nlogn)  worst-> O(n^2)   => worst case when pivot selected is always largest or smallest (sorted in ascending or descending order)
    //  * Space O(1)
    //  * 
    //  * pivot and partition
    //  * lets say last element as pivot
    //  * 6 3 9 8 2 5
    //  * pivot-5
    //  * partiton
    //  * 
    //  * 3 2 [5] 6 9 8
    //  * call again for 2 and 9 as pivot
    //  */
    // public static int partition(int arr[],int s,int e){
    //     int pivot=arr[e];
    //     int i=s-1;
    //     for(int j=s;j<e;j++){
    //         if(arr[j]<=pivot){
    //             i++;
    //             int t=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=t;
    //         }
    //     }
    //     i++;
    //     int t=pivot;
    //     arr[e]=arr[i];
    //     arr[i]=t;
    //     return i;
    // }
    // public static void quickSort(int arr[],int s,int e){
    //     if(s>=e){
    //         return;
    //     }
    //     int pivot=partition(arr,s,e);
    //     quickSort(arr, s, pivot-1);
    //     quickSort(arr, pivot+1, e);
    // }
    // public static void main(String[] args) {
    //     int arr[]={5,4,3,2,1};
    //     quickSort(arr, 0, arr.length-1);
    //     for(int i:arr){
    //         System.out.print(i+" ");
    //     }
    // }


    // //36.3 Search in Rotated sorted array
    // /*
    //  * sorted,rotated array will be given we have to return the index of a element of a target
    //  * ex. 4 5 6 7 0 1 2     t=0
    //  * output => 4 (index 4 -> 0)
    //  * we can solve it via linear search but then there will be no use of given sorted and rotated so we will use modified binary search 
    //  * |
    //  * |      /
    //  * |    /
    //  * |  /
    //  * |        /
    //  * |_______/_________________
    //  * when we plot all points then we will have 2 lines
    //  * now we find mid of array
    //  * if mid is in L1 then
    //  * if(s<t<mid) then L1 ke left part me hoga target
    //  * else L1 ke right and L2 me ho sakta hai
    //  * 
    //  * if mid is in L2 then
    //  * if(mid<t<e) then L2 ke right 
    //  * else mid ke pura left side
    //  */

    // public static int modifiedBinarySearch(int arr[],int t,int s,int e){
    //     int mid=s+(e-s)/2;
    //     if(arr[mid]==t){
    //         return mid;
    //     }
    //     //mid on L1
    //     if(arr[s]<=arr[mid]){
    //         if(arr[s]<=t && t<=arr[mid]){
    //             return modifiedBinarySearch(arr, t, s, mid-1);
    //         }
    //         else{
    //             return modifiedBinarySearch(arr, t, mid+1, e);
    //         }
    //     }
    //     //mid on L2
    //     else{
    //         if(arr[mid]<=t && t<=arr[e]){
    //             return modifiedBinarySearch(arr, t, mid+1, e);
    //         }
    //         else{
    //             return modifiedBinarySearch(arr, t, s, mid-1);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={4,5,6,7,1,2,3};
    //     System.out.println(modifiedBinarySearch(arr, 6, 0, arr.length-1));
    // }


    

    



}

