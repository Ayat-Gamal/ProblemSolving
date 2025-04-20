class Solution {
    public int removeDuplicates(int[] nums) {
        //first elemnt will be always unique, check after that elemnt, if it not equla to past one, mov forward elemnt step back
     int pos = 0;
     int j= 0;
        for(int i =1 ; i< nums.length;i++){
            if(nums[pos] != nums[i]){
               nums[pos+1] = nums[i];
               pos++;
            }

        }
        return pos+1;
    }
}