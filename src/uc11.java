class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class uc11 {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "madam";

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}