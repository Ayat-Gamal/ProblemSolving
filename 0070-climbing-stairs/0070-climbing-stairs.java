class Solution {
    /** stair(n) 1 2 3 4 5 6 7 8
        steps   [1,2,3,5,8,13,21,... ]
        way(n ) = way(n-1) + way(n-2)
     */

    public int climbStairs(int n) {
        if (n == 1)return 1;
        if (n ==2)  return 2;

        List<Integer> solutions = new ArrayList<>();
            solutions.add(1);
            solutions.add(2); // steps initilaize [1 ,2 ]

        for(int i = 2 ; i< n; i++){
            solutions.add(solutions.get(i-1) + solutions.get(i-2));

        }
        return solutions.get(n-1);

    }
}