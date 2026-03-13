import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class uc13 {

    // Method 1: Two Pointer Approach
    public static boolean twoPointer(String str) {
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

    // Method 2: Stack Approach
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Approach
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madamimadam";

        // Two Pointer Timing
        long start1 = System.nanoTime();
        twoPointer(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Timing
        long start3 = System.nanoTime();
        dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method Time: " + (end3 - start3) + " ns");
    }
}