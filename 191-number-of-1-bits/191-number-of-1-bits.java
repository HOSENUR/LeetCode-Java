public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        String s = Integer.toBinaryString(n);           // Converting Integer to  Binary String.
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '1')                     // Counting number of '1'
                c++;
        }    
      return c;
    }
}