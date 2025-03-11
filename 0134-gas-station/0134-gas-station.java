class Solution {

    /**
        sum of all gas minus all cost 
        if the total gas < 0 => i dont have a gas currGas = 0;
        so start from next station

         after finish looping if the total gas < 0 (negative value so we cant satartt)
     */


    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                startStation = i + 1;
            }
        }

        if (totalGas >= 0) {
            return startStation;
        }

        return -1;
    }
}