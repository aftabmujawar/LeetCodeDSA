// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0 ; i<n ; i++)
        {
            x[i]=nums[i];
            y[i]=nums[i+n];
        }

        int[] ans = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = x[i];
            ans[index++] = y[i];
        }

        return ans;
    }
}