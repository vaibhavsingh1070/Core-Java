package Object_Oriented_Programming.Abstraction;

public class abstraction {
    public static void main(String[] args) {
        samsung cell = new samsung();
        cell.call();

        cell.ringing();
    }
    
}

//Abstract classes are used when want to create a common template for a group of related classes
// any class which inherits this class must have these methods | solving the problem of incomplete implementation.
abstract class Phone{
    abstract void call();

    void ringing()
    {
        System.out.println(" The phone is ringing...");
    }
}

class samsung extends Phone{

    @Override
    void call() {
        System.out.println("This comes with samsung dialer");
    }

    @Override
    void ringing()
    {
        System.out.println("samsung rington!");
    }

}

/* 
 Inheritance concepts 

 solve multiple inheritance problem example class liger can inherit from two classes lion and tiger
 but it can be done using interface
 also privides concrete implementation of this methods
 loose coupling - easier to modify and maintain the code
class tiger{

}

class lion{

}

 class liger extends lion , tiger{
    Its not possible because java doesnt support multiple inheritance
}
*/

interface lion{
    void sound();
}

interface tiger {
    void sound();
}

class liger implements lion , tiger{

    @Override
    public void sound() {
        System.out.println("Ligers roar but not as lion!");
    }

}

/* 
 * how interface is different from abstract class 
 * 1. Interface cannot have constrctors and abstract classes can have
 * 2. Interface have access modifiers Public , static and final where as abstact class have Public Private and Protected
 * 3. Interface can be used to implement multiple inheritance in java whereas abstact class cant.
 * 4. Interface can have only static fields no instance field whereas abstract class can have instance field and static field.
 * 5. Interfaces can be used when you want to define a contract that multiple classes can use.
 * 6. Abstact class can be used when you want to share code among closely related classes.
 */