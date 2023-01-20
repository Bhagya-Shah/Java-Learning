import java.util.*;

public class stringsBasic {
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

    // //30.4 Compare string
    // /*
    //  *when we want to check via value if they are equal then use str1.equals(str2)
    //  *where we want to check at object level that address of that string then we use str1==str2
    //  */
    // public static void main(String[] args) {
    //     String s1="Tony";
    //     String s2="Tony";
    //     String s3=new String("Tony");
    //     System.out.println(s1==s2);
    //     System.out.println(s1==s3);
    //     System.out.println(s1.equals(s3));
    // }

    // //30.5 String substring
    // //Ending index not included
    // public static String subString(String s,int start,int end){
    //     String subStr="";
    //     for(int i=start;i<end;i++){
    //         subStr+=s.charAt(i);
    //     }
    //     return subStr;
    // }
    // public static void main(String[] args) {
    //     String s1="Hello World";
    //     System.out.println(subString(s1, 1, 7));
    //     //in-Build
    //     System.out.println(s1.substring(2,7));
    // }

    // //30.6 Compare string => lexicographically
    // //Time complexity => O(x*N) x=>largest length of string
    // /*
    //  * str1.comareTo(str2)
    //  * 0 => equal
    //  * -1 => s1<s2
    //  * +1 => s1>s2
    //  */
    // public static void main(String[] args) {
    //     String fruits[]={"apple","banana","chiku"};
    //     String largest=fruits[0];
    //     for(int i=1;i<fruits.length;i++){
    //         if(fruits[i].compareToIgnoreCase(largest)>0){
    //             largest=fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
    // // }

    //30.7 String memory
    /*Java me string banate hai tab agar new string karke nahi banaya to vo 
     * name at stack
     * and value at heap me store hota hai
     * new nahi kiya to same hi string ke object ko point karega both str1 and str2 =>interning
     * to string me jab bhi changes hoga vo purana string copy karega aur naya string me daalke change append karega which is very bad
     * to avoid this there is StringBuilder
     */

    // //30.7.1 String Builder
    // //Time complexity here is O(n)
    // public static void main(String[] args) {
    //     StringBuilder sb=new StringBuilder("");
    //     System.out.println(sb);
    //     for(char ch='a';ch<='z';ch++){
    //         sb.append(ch);
    //     }
    //     System.out.println(sb);
    //     sb.toString();
    //     System.out.println(sb);
    //     Integer a=10;
    //     a.toString();
    //     System.out.println(a);
    // }

    // //30.8 first letter uppercase
    // public static String uppercaseString(String s){
    //     StringBuilder sb=new StringBuilder("");
    //     char ch=Character.toUpperCase(s.charAt(0));
    //     sb.append(ch);
    //     for(int i=1;i<s.length();i++){
    //         if(s.charAt(i)==' ' && i<s.length()-1){
    //             sb.append(s.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(s.charAt(i)));  
    //         }else{
    //             sb.append(s.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }
    // public static void main(String[] args) {
    //     String s1="hii, my name is bhagya";
    //     System.out.println(uppercaseString(s1));
    // }

    // //30.9 String compression
    // /*
    //  * aaabbbccd =>a3b3c2d
    //  * abc => abc
    //  */
    // public static String compression(String s){
    //     StringBuilder sb=new StringBuilder("");
    //     int count=1;
    //     for(int i=0;i<s.length();i++){
    //        while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
    //         count++;
    //         i++;
    //        }
    //        sb.append(s.charAt(i));
    //        if(count>1){
    //         sb.append(count);
    //        }
    //        count=1;
    //     }
    //     return sb.toString();
    // }
    // public static void main(String[] args) {
    //     String str="AAABBBCCDEGHIIIJJJKKK";
    //     System.out.println(compression(str));
    // }

    // //30.9 Replace in string
    // public static void main(String[] args){
    //     String str1="ApnaCollege";
    //     str1=str1.replace("pn", "nna");
    //     str1=str1.replace('A', 'B');
    //     System.out.println(str1);
    // }

    // //30.10 Anagrams in String
    // /*
    //  * Anagrams is a concept where care and race or earth and thear is anagrams of each other
    //  */
    // public static boolean anagram(String s1,String s2){
    //     s1=s1.toLowerCase();
    //     s2=s2.toLowerCase();
    //     char ch1[]=s1.toCharArray();
    //     char ch2[]=s2.toCharArray();
    //     if(ch1.length==ch2.length){
    //         Arrays.sort(ch1);
    //         Arrays.sort(ch2);
    //         if(Arrays.equals(ch1, ch2)){
    //             return true;
    //         }
    //         return false;
    //     }else{
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     String str1="caRe";
    //     String str2="race";
    //     System.out.println(anagram(str1, str2));
    // }    
}
