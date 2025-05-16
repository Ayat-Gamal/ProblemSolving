class Solution {
    /** stair(n) 1 2 3 4 5 6 7 8
        steps   [1,2,3,5,8,13,21,... ]
       current = stepOne + stepTwo
       stepOne = stepTWo
       stepTwo = current 
     */
     
    public int climbStairs(int n) {
        if (n == 1)return 1;
        if (n ==2)  return 2;

       int stepOne = 1;
       int stepTwo =2 ;
       
        for(int i = 3 ; i<= n; i++){
          int current = stepOne + stepTwo;
          stepOne = stepTwo;
          stepTwo = current;

        }
        return stepTwo;

    }
}