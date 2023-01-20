public class practice {
    public static void main(String[] args) {
        
        //java does not have private and protected class because then it is unusable
        /*private default protected public
         * class NYNY
         * nested class YYYY
         */
        /*
         * parent reference de sakte hai child class
         * class vehicle()
         * class car extends vehicle()
         * Vehicle v=new Car(); //allowed
         * Car c=new Vehicle(); =>runtime erroe
         */
        Vehicle v1=new Car();
        v1.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("vehicle");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("car");
    }
}


