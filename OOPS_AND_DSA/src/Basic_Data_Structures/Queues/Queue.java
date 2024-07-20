package Basic_Data_Structures.Queues;

import java.util.LinkedList;
import java.util.Scanner;
import Basic_Data_Structures.Stack.stack_implementation;

public class Queue {
    /*Queues Rules
    -> It follow FIFO OR first come first serve

    Operations
    1. push
    2. pop
    3. display
    */
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Integer> queue = new LinkedList<>();
    static int end = -1;
    
    public static void enque()
    {
        System.out.println("Enter the element to push  : ");
        int element = sc.nextInt();
        queue.add(element);
        System.out.println(element+" added to the stack successfully!");
        end = end + 1;

    }

    public static void deque()
    {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty!");
        }else{
           System.out.println("The element removed is : "+queue.removeFirst());
           end = end - 1;
        }
    }

    public static void display()
    {
        if (queue.isEmpty()) {
            System.out.println("The Queue is empty !");
        }else{
            System.out.println("The elememts in the queue are ...");
            for (Integer values : queue) {
                System.out.print(values+", ");
            }
        }
    }
    //calling queue methods automatically
    public static void call_queue()
    {
        System.out.println("Enter the below numbers to perform operations in the stack : ");
        System.out.println("1. Push \n2. Pop \n3. Display \n0.exit");
        int userinput=0;
        do
        {
            System.out.print("\nEnter operation code : ");
            userinput = sc.nextInt();
            if(userinput == 1)
            {
                enque();
            }
            else if(userinput == 2)
            {
                deque();
            }
            else if(userinput == 3)
            {
                display();
            }
            else{
                System.out.println(" Exited successfully!");
            }

        }while(userinput != 0);
    }

    public static void main(String[] args) {
        call_queue();
        //stack_implementation.call_stack();// static methods can be called with class name
    }
                            
}
