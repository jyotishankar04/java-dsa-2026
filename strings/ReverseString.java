
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseString {
    public void reverseStringBrute(List<Character> s){
        Stack<Character> stack = new Stack<>();
        for(Character ch: s){
            stack.push(ch);
        }
        for(int i = 0; i < s.size(); ++i) {
            s.set(i, stack.pop());
        }
    }
    public void reverseStringOptimal(List<Character> s){
        int start = 0;
        int end = s.size() -1;
        while(start < end){
            Character ch = s.get(start);
            s.set(start, s.get(end));
            s.set(end, ch);

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        // Creating an instance of Solution class
        ReverseString sol = new ReverseString();

        // Function call to reverse the string
        // sol.reverseStringBrute(str);
        sol.reverseStringOptimal(str);

        for (char c : str) {
            System.out.print(c);
        }
    }
}