package Basic_Data_Structures.Arrays;

public class Arrays_singledimensional {
    /*
    * primitive data types in java
    * 1. Byte
    * 2. Short
    * 3. Int
    * 4. Float
    * 5. Double
    * 6. String/char
    * 7. Long
    * 8. Boolean
    * */

    public static void main(String[] args) {
        //syntax for the array
        int [] marks = new int[10];
        String [] subjects = {"English","Hindi","GK","Maths","Science"};

        //for each loop
        for (String names: subjects)
        {
            System.out.println(names);
        }
        

    }

}
