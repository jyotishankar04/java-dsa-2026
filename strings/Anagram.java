
import java.util.Arrays;

public class Anagram {
    public boolean anagramStringsBrute(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);

    }
    public boolean anagramStringsOptimized(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "integer";
        String str2 = "tegerni";

        // Creating an instance of Solution class
        Anagram sol = new Anagram();

        // boolean result = sol.anagramStringsOptimized(str1, str2);
        boolean result = sol.anagramStringsBrute(str1, str2);

        // Output
        if (result)
            System.out.println("The given strings are anagrams.");
        else
            System.out.println("The given strings are not anagrams.");
    }
}
