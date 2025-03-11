class Solution {

    /**
     * low, , , ,high => (high -low +1) if even =>n/2
     * if odd (low < hith) = n/2 +1
     * 3 , 5 ,7 =>)(3) 7- 3 = 4 -1 =3
     * 8, 9, 10 =>(3) 3/2 => 1
     * 
     * 1, 3,5,7, ,8 =>(8) n/2 = 8/2 =4
     * 5, 7,9 ,10 => (6) 6/3= 3
     * 1,3,5, 6 =>(6) 6/2 = 3
     */
    public int countOdds(int low, int high) {

        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        } else if (low % 2 != 0 && high % 2 != 0) {
            if (low == high)
                return 1;
            return (((high - low - 1) / 2 )+ 2);
        } else {
            return (((high - low - 1) / 2) + 1);

        }
    }
}