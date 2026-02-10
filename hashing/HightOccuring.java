
import java.util.HashMap;
import java.util.Map;

class HightOccuring {
    int maxElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }

    int mostFrequentElementBrute(int[] nums){
        int n = nums.length;
        int maxEl = maxElement(nums);
        int maxFreq = 0;
        int maxFreqEl = nums[0];
        int[] hash = new int[maxEl + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }
        for(int i = 0; i < hash.length;i++){
            if(hash[i] > maxFreq){
                maxFreq = hash[i];
                maxFreqEl = i;
            }
        }
        return maxFreqEl;
    }

    int mostFrequentElementOptimal(int[] nums){
        // Using hashmap
        int n = nums.length;
        int maxEl = nums[0], maxFreq = 0;
        Map<Integer,Integer> mapp = new HashMap<>();

        for(int i = 0; i < n; i++){
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> it: mapp.entrySet()){
            int el = it.getKey();
            int freq = it.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                maxEl = el;
            }
        }
        return maxEl;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };

        /*
         * Creating an instance of
         * Solution class
         */
        HightOccuring sol = new HightOccuring();

        /*
         * Function call to get the
         * highest occurring element in array n
         */
        // int ans = sol.mostFrequentElementBrute(nums);
        int ans = sol.mostFrequentElementOptimal(nums);

        System.out.println("The highest occurring element in the array is: " + ans);
    }
}
