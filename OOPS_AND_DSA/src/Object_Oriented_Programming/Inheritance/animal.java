package Object_Oriented_Programming.Inheritance;

//base class
public class animal {
    String name;

    void displayname()
    {
        System.out.println("Name "+this.name);
    }

    animal(String name){
        this.name = name;
    }
    
}

//derived class | single level inheritance
class dog extends animal{

    dog(String name) {
        super(name);
    }

    @Override
    void displayname(){
        System.out.println("Name : "+this.name);
    }


}

//multi-level inheritance
class labrador extends dog{

    labrador(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    
}

//hierarchial inheritance
class cat extends animal {

    cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

}
//interface pet
interface pet{
    void play();
}

//hybrid inheritance | mixture of multi level and hirarchial inhritance
class pumba extends labrador implements pet{

    pumba(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
        System.out.println("Pumba makes hhhh sound !");
        System.out.println("Pumba is a mixture cat and dog!");
    }

}

//multiple inheritance
interface bird{
    void fly();
}

interface hunter_bird{
    void play();
}

class eagle implements bird , hunter_bird{

    @Override
    public void play() {
     System.out.println("eagle hunts rats");
    }

    @Override
    public void fly() {
        System.out.println("eagles fly high");
    }

}

class run_it{
    public static void main(String[] args) {
        animal horse = new animal("Horse");
        horse.displayname();

        animal cat = new cat("Cat");
        cat.displayname();

        animal dog = new dog("Dog");
        dog.displayname();
    }
}
