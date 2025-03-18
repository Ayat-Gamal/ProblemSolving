class Solution {
  /**
      x^y = x+y
    Sliding Window (r- l +1) + two Pointer Approach
        while in array (right < nums.length)
            xor ^= right
            sum = sum + right

            while( xor != sum) subtract this value
            { 
                sum -= left; // the start of window will change
                xor ^= left //    (8^4^3) ^3 => 12 (8^4)
                left++;
            }
            get max of window ==> our answer
     */
    public int longestNiceSubarray(int[] nums) {
        int windowSize = 0;
        int left = 0;
        int right = 0;

        int xorSum = 0;
        int currentSum = 0;

        while(right < nums.length){
            xorSum ^= nums[right];
            currentSum += nums[right];

            while(currentSum != xorSum){
                currentSum -= nums[left];
                xorSum ^= nums[left];
                left ++;
            }
             windowSize = Math.max(windowSize, right-left+1);
            right++;
        }
     
        return windowSize;
    }

}

    /** 
     
  //  Sliding Window (l-r+1)
 //   x^y = x+y
    
    public int longestNiceSubarray(int[] nums) {
        int windowSize = 1;
        int xorBits = 0;
        int left = 0;
        for(int i =0 ;i<nums.length; i++){

            while((xorBits & nums[i]) != 0){
                    xorBits ^= nums[left];
                    left++;
            }
            xorBits = xorBits + nums[i]; 
            windowSize = Math.max(windowSize, i-left+1);
        } 
        return windowSize;
    }
    }
    * */
