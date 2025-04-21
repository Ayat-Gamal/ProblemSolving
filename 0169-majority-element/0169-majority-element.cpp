class Solution {
public:
    int majorityElement(vector<int>& nums) {
 int n = nums.size();
	int voteCnt =0;
	int majElement;
	for(int i=0; i< n; i++){
		if(voteCnt == 0){
			voteCnt =1;
			majElement = nums[i];
		}else if(nums[i] == majElement){
			voteCnt++;
		}else{
			voteCnt--;
		}
	}
//	verifying
	int actCnt=0;
	for(int i = 0;i<n ;i++ ){
		if(nums[i]== majElement){
			actCnt++;
		} 
	}
	if(actCnt > (n/2)){
		return majElement;
	}
        return -1;
    }
};