package Object_Oriented_Programming.Classes_and_Objects;

public class classandobject {
    //a class is a blueprint for creating objects and it defines the structure and behaviour(data and methods)
    public static void main(String[] args) {
        car obj = new car();//default | non-parameterized constructors
        car obj2 = new car("red", "audiz7");// parameterized constructors
        car obj3 = new car(obj2); //copy constructors
        obj3.displayinfo();
    }
}

//car is class
class car{

    //fields of the class car
    String color;
    String model;
    int year;

    //constuctor
    public car(String color, String modell)
    {
        this.color = color;
        this.model = modell;
    }

    //copy constructor
    public car(car obj){
        this.color = obj.color;
        this.model = obj.model;

    }

    public car() {
        //TODO Auto-generated constructor stub
    }

    //method
    public void displayinfo()
    {
        System.out.println("Model : "+model+" Color : "+color+" Year : "+year);
    }
    //Types of methods in java are
    // 1. Instance Method
    /*  
        void setColor(String color)
        {
            this.color = color;
        }
     
      2. Static Method
      
         public static int add(int a , int b)
         {
            return a + b;
         }
     
      3. Abstract Method
    
         public abstract class Animal{
            abstract void sound();
         }
     
     4. Final Methods

        public final void start(){
            System.out.println("vehicle starts!");
        }
     
     5. Synchronized Methods
    
        private int count = 0;
        public synchronized void increment()
        {
            count++;
        }
     

      6. Native methods
     
         public native void nativemethod();
      

       7. Constructor
      
       *  class person{
       *  String name;
       *    public Person(String name)
       *    {
       *        this.name = name;
       *    }
       * }
       */

// }     Types of constructors 
//     1. Parameterised
//     2. non-Parameterised
//     3. copy constructors
//     4. default constructors



}
