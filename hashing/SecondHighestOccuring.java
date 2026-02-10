import java.util.HashMap;
import java.util.Map;

class SecondHighestOccuring {
    // int maxElement(int[] nums) {
    //     int max = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         if (max < nums[i])
    //             max = nums[i];
    //     }
    //     return max;
    // }
    
    // public int secondMostFrequentElementMostBruteApproach(int[] nums) {

    //     // Variable to store the size of array
    //     int n = nums.length;

    //     /*
    //      * Variable to store maximum frequency
    //      * and second Max frequency
    //      */
    //     int maxFreq = 0;
    //     int secMaxFreq = 0;

    //     /*
    //      * Variable to store elements with most
    //      * and second most frequency
    //      */
    //     int maxEle = -1, secEle = -1;

    //     // Visited array
    //     boolean[] visited = new boolean[n];

    //     // First loop
    //     for (int i = 0; i < n; i++) {
    //         // Skip second loop if already visited
    //         if (visited[i])
    //             continue;

    //         /*
    //          * Variable to store frequency
    //          * of current element
    //          */
    //         int freq = 0;

    //         // Second loop
    //         for (int j = i; j < n; j++) {
    //             if (nums[i] == nums[j]) {
    //                 freq++;
    //                 visited[j] = true;
    //             }
    //         }

    //         /*
    //          * Update variables if new element
    //          * having highest frequency or second
    //          * highest frequency is found
    //          */
    //         if (freq > maxFreq) {
    //             secMaxFreq = maxFreq;
    //             maxFreq = freq;
    //             secEle = maxEle;
    //             maxEle = nums[i];
    //         } else if (freq == maxFreq) {
    //             maxEle = Math.min(maxEle, nums[i]);
    //         } else if (freq > secMaxFreq) {
    //             secMaxFreq = freq;
    //             secEle = nums[i];
    //         } else if (freq == secMaxFreq) {
    //             secEle = Math.min(secEle, nums[i]);
    //         }

    //     }

    //     // Return the result
    //     return secEle;
    // }
    
   
    int secondMostFrequentElementOptimal(int[] nums){
        // Using hashmap
        int n = nums.length;
        int maxEl = -1, maxFreq = 0, secMaxEl = -1,  secMaxFreq = 0;
        Map<Integer,Integer> mapp = new HashMap<>();

        for(int i = 0; i < n; i++){
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> it: mapp.entrySet()){
            int el = it.getKey();
            int freq = it.getValue();
            if(freq > maxFreq){
                secMaxEl = maxEl;
                secMaxFreq = maxFreq;
                maxFreq = freq;
                maxEl = el;
            }else if(freq == maxFreq){
                maxEl = Math.min(maxEl, el);
            } else if (freq > secMaxFreq) {
                secMaxFreq = freq;
                secMaxEl = el;
            } else if (freq == secMaxFreq) {
                secMaxEl = Math.min(secMaxEl, el);
            }
        }
        return secMaxEl;
    }
    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6, 7};
        SecondHighestOccuring obj = new SecondHighestOccuring();
        
        int ans = obj.secondMostFrequentElementOptimal(nums); 
        System.out.println("The highest occurring element in the array is: " + ans);
    }
}
