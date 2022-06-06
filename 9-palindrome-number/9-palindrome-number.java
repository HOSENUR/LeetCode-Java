class Solution {
    public boolean isPalindromeAlternate(int x) {
        int temp=x,res=0;
        while(x>0){
            int a=x%10;
            res = (res*10)+a;
            x=x/10;
        }
        return temp==res;
    }
    public boolean isPalindrome(int x) {
        int temp=x,res=0;
        while(x>0){
            int a=x%10;
            res = (res*10)+a;
            x=x/10;
        }
        return temp==res;
    }
}