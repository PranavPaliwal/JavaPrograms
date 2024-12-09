// public class abstractClass{
//     public static void main(String args[]){
//        vehicle v = new vehicle();
//        v.car();
//     }
//    }

// public abstract class aclass {
//     abstract void car();
//     abstract void bus();
// }

// class vehicle extends aclass{
//     void car(){
//         System.out.println("car");
//     }
//     void bus(){
//         System.out.println("bus");
//     }
// }

 
class Example {
    static void display() {
        System.out.println("Static method");
    }
    void print(){
        System.out.println("print this");
    }
}
class abstractClass{
public static void main(String[] args) {
    Example.display();
    Example.print();
}
     // Called without object
}