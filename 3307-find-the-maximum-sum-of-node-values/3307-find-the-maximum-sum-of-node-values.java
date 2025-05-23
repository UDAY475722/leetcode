import java.util.*;

public class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long totalSum = 0;
        int positiveGainCount = 0;
        int minGain = Integer.MAX_VALUE;

        for (int num : nums) {
            int xorValue = num ^ k;
            int gain = xorValue - num;

           
            if (gain > 0) {
                positiveGainCount++;
                totalSum += xorValue;
                minGain = Math.min(minGain, gain);
            } else {
                totalSum += num;
                minGain = Math.min(minGain, -gain);
            }
        }
 
        if (positiveGainCount % 2 == 0) {
            return totalSum;
        } else {
            
            return totalSum - minGain;
        }
    }
}
