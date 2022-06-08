class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num : nums)
        {
            int temp=num,l=0;
            
            while(temp>0){
                l++;
                temp=temp/10;
            }
            if(l%2==0){
                c++;
            }
            
        }
        return c;
    }
}