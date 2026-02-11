

public class Palindrome {
    boolean palindromeCheck(String s){
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        String str = "racecar";

        if (solution.palindromeCheck(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
