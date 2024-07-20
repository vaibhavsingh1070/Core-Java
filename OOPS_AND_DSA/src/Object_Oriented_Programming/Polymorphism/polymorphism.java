package Object_Oriented_Programming.Polymorphism;

public class polymorphism {

    //polymorphism
    //1. Run time polymorphism (overriding)
    //2. compile time polymorphism (overloading)

    public int add(int a , int b)
    {
        return a + b;
    }

    //overloading the method
    public int add(int a , int b , int c)
    {
        return a + b + c;
    }
    
}

class test extends polymorphism{
     //overridding the method
     @Override
     public int add(int a,int b)
     {
         return a * a; // here the output is changed
     }
}
