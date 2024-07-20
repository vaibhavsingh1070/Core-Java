package Basic_Data_Structures.Arrays;
import java.util.Arrays;

public class Array_manipulation {
        // Instead of this use ArrayList
        // Array Manipulation
        // 1. Insertion
        // 2. Delete 
        // 3. Update

        public static void main(String[] args) {
            // Initial array
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Original array: " + Arrays.toString(numbers));
    
            // Insert element
            numbers = insertElement(numbers, 2, 99); // Insert 99 at index 2
            System.out.println("After insertion: " + Arrays.toString(numbers));
    
            // Delete element
            numbers = deleteElement(numbers, 3); // Delete element at index 3
            System.out.println("After deletion: " + Arrays.toString(numbers));
    
            // Update element
            updateElement(numbers, 2, 55); // Update element at index 2 to 55
            System.out.println("After update: " + Arrays.toString(numbers));
        }
    
        // Function to insert an element into an array at a specific index
        public static int[] insertElement(int[] originalArray, int index, int newElement) {
            int[] newArray = new int[originalArray.length + 1];
    
            for (int i = 0; i < index; i++) {
                newArray[i] = originalArray[i];
            }
    
            newArray[index] = newElement;
    
            for (int i = index; i < originalArray.length; i++) {
                newArray[i + 1] = originalArray[i];
            }
    
            return newArray;
        }
    
        // Function to delete an element from an array at a specific index
        public static int[] deleteElement(int[] originalArray, int index) {
            if (originalArray.length == 0 || index < 0 || index >= originalArray.length) {
                throw new IllegalArgumentException("Index out of bounds");
            }
    
            int[] newArray = new int[originalArray.length - 1];
    
            for (int i = 0; i < index; i++) {
                newArray[i] = originalArray[i];
            }
    
            for (int i = index + 1; i < originalArray.length; i++) {
                newArray[i - 1] = originalArray[i];
            }
    
            return newArray;
        }
    
        // Function to update an element in an array at a specific index
        public static void updateElement(int[] array, int index, int newValue) {
            if (index < 0 || index >= array.length) {
                throw new IllegalArgumentException("Index out of bounds");
            }
    
            array[index] = newValue;
        }
    
}
