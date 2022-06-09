class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n>0)
        {
            int a=n%10;
            p=p*a;
            s=s+a;
            n=n/10;
        }
        return p-s;
        
    }
}