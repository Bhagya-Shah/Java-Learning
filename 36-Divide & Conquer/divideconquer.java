/* 36 Divide & Conquer */

public class divideconquer{
    
    // //36.1 Merge sort
    // /*
    //  * Time complexity -> O(nlogn)  -same as inbuild sort
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
    public static void main(String[] args) {
        String s="hello";
        char c=s.ch
    }

}

