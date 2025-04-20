class Solution {

/** fixed   j
    1   1 | 1 2 2 3
    ^       
    p       
    if(nums[p-2] != nums[j]) => num[p] = nums[j]
    fixed     j
    1   1 | 1 2 2 3
            ^       
            p   
    fixed   
    1   1 | 1 2 2 3
                ^       
      Fixed     p
    1   1   2  |
 */

    public int removeDuplicates(int[] nums) {
        int idx = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[idx - 2] != nums[j]) {
                nums[idx] = nums[j];
                idx++;
            }

        }
        return idx;
    }
}