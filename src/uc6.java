import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class uc6 {
    public static void main(String[] args) {

        String str = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into Stack and Queue
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        boolean isPalindrome = true;

        // Compare Queue dequeue vs Stack pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Palindrome (FIFO vs LIFO matched)");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}