class Student{
    String name;
    int rollno;

    //non-parameterized constructor
    Student(){
        System.out.println("non parameterized constructor called....");
    }

    //parameterized constructor
    Student(String name){
        this.name=name;
    } 

    //copy constructor (values from s2 is copied)!!
    Student(Student s2){
        this.name=s2.name;


    }
}
public class constructors {
    public static void main(String[] args) {
        Student s1=new Student();

        Student s2=new Student("anjali");
        System.out.println(s2.name);

        Student s3=new Student(s2);
        System.out.println(s3.name);

    }
    
}
