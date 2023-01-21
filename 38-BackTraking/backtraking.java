public class backtraking {
    /* 38 - Backtraking */
    /*
     * Types of Backtraking
     * -Descicion based (Left or Right move ets)
     * -Optimization (Best solution)
     * -Enumeration (Total paths from start to end)
     */
    public static void printArray(int nums[]){
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    
    // //38.1 Backtraking - Arrays
    // /*
    //  * jate time 1 2 3 4 5 likho aur back track karte time -2 kar do sab ko
    //  */
    // public static void changeArray(int arr[],int i,int val){
    //     if(i==arr.length){
    //         printArray(arr);
    //         return;
    //     }
    //     arr[i]=val;
    //     changeArray(arr, i+1, val+1);
    //     arr[i]-=2; //BackTracking Step
    // }
    // public static void main(String[] args) {
    //     int arr[]=new int[5];
    //     changeArray(arr, 0, 1);
    //     printArray(arr);
    // }


    // //38.2 Find subsets  => Time complexity -> O(n*2^n)  Space complecity -> O(n)
    // /*
    //  * abc => a b c ab bc ac abc ""
    //  * n string -> 2^n subsets
    //  * 
    //  * every letter has two choice to be part of subset or to not be part
    //  *                  abc
    //  *                a     bc
    //  *               
    //  */
    // public static void printSubset(String s,String subSet,int i){
    //     if(s.length()==i){
    //         System.out.println(subSet);
    //         return;
    //     }
    //     printSubset(s, subSet+s.charAt(i), i+1);
    //     printSubset(s, subSet, i+1);
    // }
    // public static void main(String[] args) {
    //     printSubset("abc", "", 0);
    // }


    //38.3 
    
}
