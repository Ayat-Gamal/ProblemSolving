class Solution {
    /**
        simple greedy appraoch
        go threugh th array and check if it one continue  else filp with Window Size 3
        ** don't forget check last 2 items as i skiped them while iterate on th array
     */

    public int minOperations(int[] nums) {
        int operations = 0;
        int n = nums.length;
        for (int i = 0; i < n-2; i++) { 
            if (nums[i] == 1) {
                continue;
            }
            // filp using xorr
            nums[i] ^= 1;
            nums[i + 1] ^= 1;
            nums[i + 2] ^= 1;

            operations++;
        }

        if (nums[n - 2] != 1 || nums[n - 1] != 1) { // last to elements in the array
            return -1;
        }
        return operations;

    }
}