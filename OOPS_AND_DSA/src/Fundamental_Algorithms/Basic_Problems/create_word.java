package Fundamental_Algorithms.Basic_Problems;

public class create_word {

    public static void main(String[] args) {
        create_word("javascript");
    }

    public static void create_word(String str)
    {
        // char [] chars = str.toCharArray();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));     
            }
            
        }
    }
    
}
