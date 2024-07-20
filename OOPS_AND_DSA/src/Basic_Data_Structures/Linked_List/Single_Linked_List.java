package Basic_Data_Structures.Linked_List;

import java.util.LinkedList;

public class Single_Linked_List {
    public static void main(String[] args) {

        // in array list we were facing the delay in insertion or deletion 
        // bcz if want to insert somthing in betweeen then we have to move all the elements indexs
        // so that why linked list came into the picture
        
        //In linked list elements left and right elements addresses are connected so if we 
        // want to insert anything in between so then only the address will link with new element

        //It has three values
        //1. value it self
        //2. previous reference
        //3. next referance


        // Its outer code structure is same as linked list

        LinkedList<Integer> li1 = new LinkedList<>();
        li1.add(9);
        li1.add(5);
        li1.add(7);
        li1.add(2);
        System.out.println(li1.isEmpty());
    }
    
}
