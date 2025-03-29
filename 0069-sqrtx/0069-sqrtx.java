class Solution {
 

    public int mySqrt(int x) {
        if(x==0) return 0;
        int answer = 0 ;
        int left = 0; int right = x;

        while(left<= right){
            int mid= left + (right-left)/2;
            long value =(long) mid * mid;
            if(value == x){
                return mid;
            }
            if(value> x){
                right = mid-1;
            }else{
                answer = mid;
                left = mid +1;
            }
        }
        return answer;
    }
}