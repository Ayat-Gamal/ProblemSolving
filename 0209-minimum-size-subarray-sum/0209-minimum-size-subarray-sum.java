class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int subarrayLength =Integer.MAX_VALUE;
        int left = 0;
        for(int i =0; i<nums.length ;i++){

            sum += nums[i];

            while(sum >= target){
                subarrayLength = Math.min(subarrayLength ,i -left +1);
                sum -= nums[left];
                left++;

            }
        }

        if(subarrayLength != Integer.MAX_VALUE) return subarrayLength;
        return 0;
    }
}