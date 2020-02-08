public class Dog {

    // public: accessor for method or class - private, public, protected, .... etc
    // static: Used for memory managment - used for a constant variable or a method that is same for every instance of a class
    // void: the return type or in other words it wont return anything
    // main: name of the main method in java
    // String[] args: "A string array named 'args' ", can also be written like so: String args[], String... args, String ...args, String []args
    // args: arguments

    public static void main(String... args) {

        //Demo 
        Dog pablo = new Dog("Pablo", "Maltipoo", 3, "White");

        System.out.print("Pablo's Age is: " + pablo.getAge() + "   ");
        System.out.print("Pablo's Breed is: " + pablo.getBreed() + "   ");
        System.out.print("Pablo's Color is: " + pablo.getColor() + "   ");

        System.out.print(pablo.toString());

        System.out.println(pablo.Bark());
    }

    // Global Variables - or STATES
    private String name;
    private String breed;
    private int age;
    private String color;

    // Constructor - So you can build your object more easily
    // Can have 0-arg, 1-arg, 2-arg, n-arg constructors ...This is a principal of polymorphism
    public Dog() {} // 0-args - which exists implicitly - you actually do not have to technically write it
                    // because when you create an object it does this arg by default/automatically

    public Dog(String name) { // 1-arg constructor
        this.name = name;
    }

    public Dog(String name, String breed) { // 2-arg constructor
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int age) { // 3-arg constructor
        
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String name, String breed, int age, String color) { // 4-arg 
        
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter Methods - BEHAVIORS
    public String getName() 
    { 
        return name; 
    } 

    public String getBreed() 
    { 
        return breed; 
    } 
  
    public int getAge() 
    { 
        return age; 
    } 
  
    public String getColor() 
    { 
        return color; 
    } 

    public String Bark() {
        return "Woof Woof";
    }

    // toString
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ 
               ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getAge()+ 
               ","+ this.getColor()); 
    } 

}