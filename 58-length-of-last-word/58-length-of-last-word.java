class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length(),l=0;
        for(int i=n-1;i>=0;i--)
        {
            if(l==0&&Character.isWhitespace(s.charAt(i)))
            {
                continue;
            }
            if(Character.isLetter(s.charAt(i)))
            {
                l++;
            }
            if(l!=0 && Character.isWhitespace(s.charAt(i)))
            {
                return l;
            }
           
        }
         return l;
        
            
        
    }
}