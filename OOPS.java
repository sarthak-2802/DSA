// Objects- group of entities ,Blue print of objects , kese banana haii 
// Entity - entities in the world
// Get    - to return the value 
// set    - to modify the value 
// this: this keyword is used to refer to current object 


// Encapsulation - is defined as the wrapping up of data & methods under a single unit. It also implements 
//                 data hiding


// Constructor   - is a special method which is automatically invoked at the time of object creation
//                #have same name as class or structure 
//                #dont have return type
//                #are only called once, at object creation 
//                #memory allocation happens when constructor is called
//  non-paramarized constructor 
//  paramarized constructor
//  copy constructor 


// Inheritene    - is when properties and methods of base classes are passed on to derived class.
//   Single-level inheritence
//   Multi-level inheritence
//   Hierarchial inheritence
//   Hybrid inheritence


// Polymorphism- 
// Compile-time polymorphism (method overloading-multiple functions with same name but different parameters)
// Run-time polymorphism     (method overiding -parent nd child classes both contain the same function with different 
//                            defination)


// Packages- is a group of similar types of claases, interfaces and sub-packages.
public class OOPS{  
    public static void main(String[] args){
        Pen P1= new Pen();
        P1.setColor("Blue");
        System.out.print(P1.color);
        P1.setTip(5);
        System.out.print(P1.tip);

        BankAccount myAcc= new BankAccount();
        myAcc.username="Sarthak";
        // myAcc.password="abcdef"; this gives a error because password is a private 
        myAcc.setPassword("abcdef");

        Student S1=new Student();
        Student S2=new Student("vivek doggy");  // constructor is called 
        Student S3=new Student(231099124);


        Student S4=new Student(S1);
        S2.roll_no=231099123;

        Bear polarbear= new Bear();
        polarbear.eat();
    }
}


// Parent class
class Animal{
    String color;
    void eat(){
        System.out.print("eats");
    }
    void poops(){
        System.out.print("Poops");
    }
}

// Derived class / child class
class Bear extends Animal{
    Bear(){
        this.color="Black";
    }
    void hunt(){
        System.out.print("Hunts");
    }
}

class Pen{   // first letter of the class must be capital
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}


class BankAccount{
    public String username;
    private String password;
    void setPassword(String pwd) {
        password = pwd;
    }
}

class Student{
    public String name;
    int age;
    float percentage; //CGPA
    int roll_no;


    Student(Student S1){   // Copy constructor which gives the properties of s1 to s2
        this.name=S1.name;
        this.roll_no=S1.roll_no;
    }

    Student(){              //non-parametrized constructor 
        System.out.println("Constructor is called......");
    }

    Student(String name){  //parametrized constructor 
        this.name=name;
    }

    Student(int roll_no){
        this.roll_no=roll_no;
    }

    void Calculatepercentage(int phy , int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}



