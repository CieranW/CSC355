import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class test2 {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        
        System.out.println("Enter a string:");
        String input = scnr.nextLine();
        
        // Read input one character at a time
        for (char ch : input.toCharArray()) {
            // Only consider alphabetic characters for palindrome checking
            if (Character.isLetter(ch)) {
                char lowerChar = Character.toLowerCase(ch);
                stack.push(lowerChar);
                queue.offer(lowerChar);
            }
        }
        
        // Check if the string is a palindrome
        boolean isPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }
        
        // Output result
        System.out.println(isPalindrome);
    }
}