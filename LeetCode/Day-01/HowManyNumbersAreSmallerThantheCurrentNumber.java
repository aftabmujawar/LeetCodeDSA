// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {   
        int n = nums.length;
        int[] arr = new int[n];
        int temp = 0 ,big;

        for(int i=0 ; i<n ;i++)
        {
            big=nums[i];
            for(int j=0 ; j<n ; j++)
            {
                if( big > nums[j] )
                {
                    temp++;
                }

            }

            arr[i]=temp;
            temp=0;

        }
        
        return arr;

    }
}