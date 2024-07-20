package Object_Oriented_Programming.Encapsulation;

public class encapsulation {
    /*Access Modifiers
    1.public - can accessed outside the package also (outside the class)
    2.private - can accessed only within the class (cannot be accessed other than defioned class including sub class)
    3.protected - can be accessed within the package (same package and by sub-class) even if different package
    4.default - accessible within its own package (no other package )
    */

    private final int key = 1070;
    public int getKey() {
        return key;
    }
    // public void setKey(int key) {
    //     this.key = key;
    // } This wont work bcz of final keyword
    private String name;
    String color;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class private_check extends encapsulation{
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
       // obj.name = "test"; // cannot be accessed by subclass within the same package
        obj.color="white"; // can be accessed by default constructor wihtin the same package
        obj.setName("xyz"); // we can access the private variable only with the setters
        System.out.println(obj.getName());
       // obj.setKey(1080); // bcz of final keyword we cannot set new values
        System.out.println(obj.getKey()); //but we can get those values
    }
}
