class Solution {
    // any nubmer XOR itself = 0 i.e. 5 ^ 5 = 0
    // and anyy muber XOR zero 0 == that nu,br i.e. 5^0 = 5
    // so if we keep xoring all eleent at tthe end the number that appears once will be in xorr variable! 
    public int singleNumber(int[] nums) {
        int n = nums.length;
    int xorr = 0;
	for(int i = 0 ;i <n ; i++){
		xorr = xorr ^nums[i];
	}
 
	return xorr;
    }
}