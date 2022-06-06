class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length -1,mid=0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) end =mid-1;
            else start = mid+1;
        }
        if(nums[mid]<target) return mid+1;
        else return mid;

    }
}