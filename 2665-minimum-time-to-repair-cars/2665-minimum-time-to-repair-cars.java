class Solution {
    /**
         time = r * n*n
         n = sqrt(t/r) => t = mid 'assume mid is the time'

        find min time to repair all the cars
        
     */

    public long repairCars(int[] ranks, int cars) {
        long low = 1; long high = (long) 1e14;
        long answer = 0;
        while(low <= high){
            long mid = low + (high - low )/2;
            long canRepair = 0;
            for(int r : ranks){
                canRepair += (long) Math.sqrt(mid /r);
            }
            if(canRepair >= cars){
                high = mid - 1;
                answer = mid;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }
}