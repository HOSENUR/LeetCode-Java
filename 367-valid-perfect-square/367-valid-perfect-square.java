class Solution {
    public boolean isPerfectSquare(int num) {
            long start=0,end=num/2,mid=0;
            while(start<=end){
                if(num==1) return true;
                mid = start + (end-start)/2;
                if(mid*mid==num) return true;
                if(mid*mid>num) end =mid-1;
                else start = mid+1;
            }
            return false;
        }
}