// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;        
                maxCount = Math.max(maxCount,currentCount);
            } else {
                currentCount = 0;     
            }
        }

        return maxCount;
    }
}
