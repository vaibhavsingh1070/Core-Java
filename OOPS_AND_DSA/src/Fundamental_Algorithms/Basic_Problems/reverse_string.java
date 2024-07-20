package Fundamental_Algorithms.Basic_Problems;

public class reverse_string {
    

    public static void main(String[] args) {
        // String [] letters = {"a","b","c","d","e"};

        // int range = letters.length - 1;
        // for (int i = range; i >= 0; i--) {
        //     System.out.println(letters[i]);     
        // }

        reverse("abcde");

    }

    public static void reverse(String str)
    {
        char [] chars = str.toCharArray();
        int left = 0; 
        int right = str.length() - 1;
         
        while(left < right)
        {
            //swap the characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        System.out.println("String after reversing : ");

        for (char c : chars) {
            System.out.print(" "+c);    
        }

    }
}
