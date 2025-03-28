import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger numberOne = new BigInteger(a,2);
        BigInteger numberTwo = new BigInteger(b,2);
        BigInteger sum = numberOne.add(numberTwo);
         return sum.toString(2);
    }
}