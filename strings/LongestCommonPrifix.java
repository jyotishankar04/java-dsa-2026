 
import java.util.Arrays;

public class LongestCommonPrifix {

    public String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String start = s[0];
        String end = s[s.length - 1];

        int counter = 0;
        int minLen = Math.min(start.length(), end.length());
        for(int i = 0; i < minLen; i++){
            if(start.charAt(i) == end.charAt(i)){
                counter++;
            } else {
                break;
            }
        }
        return start.substring(0, counter);
    }
    
    
    public static void main(String[] args) {
        LongestCommonPrifix solution = new LongestCommonPrifix();
        String[] input = { "flower", "flow", "flight" };
        String result = solution.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}
