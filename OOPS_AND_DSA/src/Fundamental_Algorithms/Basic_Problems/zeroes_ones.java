package Fundamental_Algorithms.Basic_Problems;

public class zeroes_ones {
    public static void main(String[] args) {
        String number = "011011000101";

        // StringBuilder for zeros and ones
        StringBuilder zeros = new StringBuilder();
        StringBuilder ones = new StringBuilder();

        // Iterate through the given number string
        for (char c : number.toCharArray()) {
            if (c == '0') {
                zeros.append(c);
            } else {
                ones.append(c);
            }
        }

        // Print all zeros first, then ones
        System.out.println(zeros.toString() + ones.toString());
    }
}
