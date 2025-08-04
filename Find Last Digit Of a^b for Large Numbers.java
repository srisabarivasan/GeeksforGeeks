import java.math.*;
class Solution
{
 static int getLastDigit(String a, String b) 
 {
  BigInteger aa = new BigInteger(a);
  BigInteger bb = new BigInteger(b);
  BigInteger p = aa.modPow(bb,BigInteger.TEN);
  return p.intValue();
 }
}
