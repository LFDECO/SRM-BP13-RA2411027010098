import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "amanaplanacanalpanama";

        long start, end;

        start = System.nanoTime();
        boolean result1 = checkPalindromeWithStack(word);
        end = System.nanoTime();
        System.out.println("Stack method: " + result1 + " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean result2 = checkPalindromeWithDeque(word);
        end = System.nanoTime();
        System.out.println("Deque method: " + result2 + " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean result3 = checkPalindromeWithStringReverse(word);
        end = System.nanoTime();
        System.out.println("String reverse method: " + result3 + " | Time: " + (end - start) + " ns");
    }

    private static boolean checkPalindromeWithStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (char c : word.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    private static boolean checkPalindromeWithDeque(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : word.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) if (!deque.removeFirst().equals(deque.removeLast())) return false;
        return true;
    }

    private static boolean checkPalindromeWithStringReverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) reversed += word.charAt(i);
        return word.equals(reversed);
    }

}
