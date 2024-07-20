package Basic_Data_Structures.Array_List;

import java.util.ArrayList;

public class Array_list {
    // Modified array | update | delete | insert
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(5);
        li.add(2);
        li.add(3);
        li.get(0);
        li.size();
        li.remove(3);
        li.set(0, 99); //to update the arraylist

        ArrayList<Integer> li2 = new ArrayList<>();
        li2.add(11);
        li2.add(12);
        li2.add(13);
        li2.add(14);
        li2.add(15);
        li.addAll(li2); // it adds all the element of list 2 in list 1
        // li.clear(); clears all the elements in the list

        for (Integer integer : li) {
            System.out.print(", "+integer);
        }

        System.out.println(li.contains(13)); // checking if 13 is in the list 
        System.out.println(li.indexOf(11)); // checking the index of number 11 in the list
        
    }

}
