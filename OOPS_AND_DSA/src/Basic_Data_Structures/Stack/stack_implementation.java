package Basic_Data_Structures.Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class stack_implementation {
    static ArrayList<Integer> stack = new ArrayList<>();
    static int top = -1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*Stack
        # It follows LIFO (last in first out)
        1. Push (adds an element)
        2. Pop (removes an element)
        3. Peek (returns the top element without removing)

        # Exceptions
        1. while inserting array size 
        2. while removing empty array
        3. searching for element which doesn't exist in the array
        */

        call_stack();
    }

    // Function for inserting element in stack
    public static void push() {
        // There will be no size issue of stack because we are using ArrayList instead of array
        System.out.println("Enter the element to push into the stack: ");
        int element = sc.nextInt();
        stack.add(element);
        System.out.println(element+" added to the stack successfully!");
        top = top + 1;
    }

    // Function to remove element from stack
    public static void pop() {
        // Here error can occur if the element doesn't exist
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            int removedElement = stack.remove(top);
            System.out.println(removedElement+" removed from the stack successfully!");
            top = top - 1;
        }
    }

    // Function to return the top element without removing
    public static void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element: " + stack.get(top));//here we are just passing index 
        }
    }

    //function to view all the present elements in the stack
    public static void display()
    {
        System.out.println("Present stack conatins...");
        for (Integer values : stack) {
            System.out.print(+values+", ");
        }
    }

    //calling stack methods automatically
    public static void call_stack()
    {
        System.out.println("Enter the below numbers to perform operations in the stack : ");
        System.out.println("1. Push \n2. Pop \n3. Peek \n4. Display \n0.exit");
        int userinput=0;
        do
        {
            System.out.print("\nEnter operation code : ");
            userinput = sc.nextInt();
            if(userinput == 1)
            {
                push();
            }
            else if(userinput == 2)
            {
                pop();
            }
            else if(userinput == 3)
            {
                peek();
            }
            else if(userinput == 4)
            {
                display();
            }
            else{
                System.out.println(" Exited successfully!");
            }

        }while(userinput != 0);
    }
}
