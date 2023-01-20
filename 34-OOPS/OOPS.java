import java.sql.Struct;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.setColor("orange");
        // System.out.println(p1.color);
        // p1.color="Yellow";
        // System.out.println(p1.color);

        //Access Modifier
        /*
         * Access Modifire      WithinClass     Within Package      OutsidePackage by Subclass      Outside packafe
         * Private                  Y                 N                         N                          N               
         * Default                  Y                 Y                         N                          N
         * Protected                Y                 Y                         Y                          N
         * Public                   Y                 Y                         Y                          Y
         */
        // BankAcc b1=new BankAcc();
        // b1.setPassword("abcd1234");
        // // error: password has private access in BankAcc
        // // System.out.println(b1.password);

        // //Getters and Setters
        // b1.setUserName("BhagyaShah");
        // System.out.println(b1.getPassword());
        // System.out.println(b1.getClass());
        // System.out.println(b1.getUserName());

        /*4 Pillars of OOPS
            //1 Encapsulation 
            //2 Inheritance
            //3 Polymerphism
            //4 Abstraction 
        */

        /*
         * Encapsulation => It is a wrapping of data(Properties) and methods(Functions) under a single unit. It also implemets data hiding(Uses of access modifire/specifier).
        */

        /*
         * Constructor=> is a sepcial keyword which is called automaticallay called at the time of object creation.
         * Properties: Same name as className
         * Can be called only once
         * Memory allocation happens when constructor is called
         * dont have return type
         */
        // Student s1=new Student("Bhagya");
        // /*
        //  * 3 Types
        //  * 1.Non parameterized
        //  * 2.Parameterized
        //  * 3.Copy constructor
        //  */
        // Student s2=new Student(45);
        // s2.name="Ariyan";
        // s2.marks[0]=100;
        // s2.marks[1]=100;
        // s2.marks[2]=90;

        // //shallow copy => Changes reflect
        // //deep copy => changes do not reflects
        // Student s3=new Student(s2);
        // System.out.println(s3.marks[2]);
        // s2.marks[2]=75; 
        // System.out.println(s3.marks[2]);

        //Destructor
        //Java has garbage collector we so do not define destructor.

        /*
         * Inheritance
         * Properties and methods of base class is passed on to derive class
         * parent,base=>child,derived
         */
        
        // Fish f1=new Fish();
        // f1.breath();
        // /*
        //  * 1.Single level Inheritance {Animal->Fish}
        //  * 2.Multilevel Inheritance (Animal->Memals->Dog)
        //  * 3.Hirearchical Inheritance {Animal->Fish,Human}
        //  * 4.Hybrid Inheritance {All}
        //  * 5.Multiple Inheritance (using interface in java)
        //  */

        //  /*Polymerphism => Many forms
        //   * Compile time => Method overloading
        //         Same name functions and different parameters
        //         sum(int a,int b)
        //         sum(int a,int b,int c)
        //         sum(float a,float b)
        //         sum(float a,float b,float c)
        //   * Run time => Method overriding
        //   */
        // //overloadind
        // Calculator c1=new Calculator();
        // System.out.println(c1.sum(4,5));
        // System.out.println(c1.sum(4.5F,5.2F));
        // System.out.println(c1.sum(4.5F,5.2F,4.2F));
        //overriding
        // Dear d1=new Dear();
        // d1.eat();

        /*Packages in Java*/
        //Packags in java is a group of similar types of classses interfaces and sub-packages
        //in-built packages => java.util.*;
        
        // /*Abstraction*/
        // /*
        //  * Hiding all the unncessary data and showing only the important parts to the user
        //  * done by Abstract class or Inheritance (Giving idea not the implementation)
        //  * 
        //  * to make any class use abstract keyword
        //  * 1.No object can be made
        //  * 2.Abstract and non abstract methods
        //  * 3.Abstract method can not have a body
        //  * 4.Cannot create object
        //  * 5.Can made constructor
        //  */
        // Horse h1=new Horse();
        // h1.walk();
        // h1.eat();
        //sabse pehle parent ka constructor call hoga 

        // /*
        //  * Interface => blueprint of class
        //  * 1.Multiple inheritance implementation {A,B => C}
        //  * 2.To achive total abstraction
        //  * 3.All methods are compulsory abstraction
        //  * 4.ALl methods are public,abstratc without implementations
        //  * 5.Variables in the interface are final,public and static.
        //  */
        // Queen q1=new Queen();
        // q1.moves();

        /*Static keyword */
        /*
         * Static keyword in java is used to share the same variable or method of a given class => Har object ke liye same
         * properties
         * Functions
         * Blocks
         * Nested class
         * 
         * multiple creation nahi hota
         */
        // Student2 s1=new Student2();
        // s1.schoolName="SHVIV";
        // System.out.println(s1.schoolName);
        // Student2 s2=new Student2();
        // System.out.println(s2.schoolName);
        // s2.schoolName="haha";
        // System.out.println(s1.schoolName);

        // /*this keyword,super keyword*/
        // /*
        //  * to access parents properties
        //  * to access parents functions
        //  * to access parents constructor
        //  */

        // Horse2 a1=new Horse2();
        // System.out.println(a1.color);

        //constructor chaining
        




    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class BankAcc{
    public String userName;
    private String password;
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
    
}

class Student{
    String name;
    int age;
    int marks[]=new int[3];
    float percentage;

    Student(){
        System.out.println("Constructor is called");
    }
    //Constructor overloading |=> Polymerphism (One name multiple form)
    Student(String name){
        this.name=name;
    }
    Student(int age){
        this.age=age;
    }
    // Student(Student s){
    //     this.age=s.age;
    //     this.name=s.name;
    //     this.marks=s.marks; //Shallow copy : Array ka reference share huva. isliye ab agar koi change marks me aaya to vo copy constructor me bhi dikhega.
    // }
    Student(Student s){
        this.age=s.age;
        this.name=s.name;
        for(int i=0;i<3;i++){
            this.marks[i]=s.marks[i];
        }
    }
    void calPercentage(int phy,int chem,int mat){
        percentage=(phy+chem+mat)/3;
    }
}

class Animal{
    
    String color;
    void eat(){
        System.out.println("Can eat");
    }
    void breath(){
        System.out.println("can breath");
    }
}
  
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("can swim");
    }
}
class StartFish extends Fish{
    String shape;
}
class Human extends Animal{
    void think(){
        System.out.println("Can think");
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    float sum(float a,float b,float c){
        return a+b+c;
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("Eats grass!");
    }
}
abstract class Animal2{
    Animal2(){
        System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Can eat");
    }
    abstract void walk();
}
class Horse extends Animal2{
    Horse(){
        System.out.println("Horse constrctor called");
    }
    void walk(){
        System.out.println("On 4 legs");
    }
}
interface ChessPlayer{
    void moves();
}
interface Board{
    void size();
}
//multiple inheritance
class Queen implements ChessPlayer,Board{
    public void size(){
        System.out.println("Have size large");
    }
    public void moves(){
        System.out.println("All move");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Right left");
    }
}
class Student2{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
class Animal3{
    String color;
    Animal3(){
        System.out.println("called");
    }
}
class Horse2 extends Animal3{
    Horse2(){
        super();
        super.color="yellow";
        System.out.println("called horse");
    }
}