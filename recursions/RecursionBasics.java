import java.util.ArrayList;

public class RecursionBasics {
    public int NnumbersSum(int N) {
        // your code goes here
        if (N <= 0)
            return 0;
        return NnumbersSum(N - 1) + N;
    }
    
    public long factorial(int N) {
        // your code goes here
        // your code goes here
        if (N <= 1)
            return 1;
        return factorial(N - 1) * N;
    }
    
    public int sum(int i, int[] arr) {
        if (arr.length <= i)
            return 0;
        return arr[i] + sum(i + 1, arr);
    }

    public int arraySum(int[] nums) {
        // your code goes here
        return sum(0, nums);
    }
    
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes heren
        int left = 0;
        int right = s.size() -1;
        while(left < right){
            char temp = s.get(left);
            s.set(left,s.get(right));
            s.set(right,temp);
            left++;
            right--;
        }
        return s;
    }
    
    public boolean palindromeCheck(String s) {
        // your code goes here
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        RecursionBasics rb = new RecursionBasics();
        System.out.println(rb.NnumbersSum(5));
        System.out.println(rb.factorial(5));
        System.out.println(rb.arraySum(new int[]{1, 2, 3, 4, 5}));
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        System.out.println(rb.reverseString(s));
        System.out.println(rb.palindromeCheck("racecar"));
    }
}
