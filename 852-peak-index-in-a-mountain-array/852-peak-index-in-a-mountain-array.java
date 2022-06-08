class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=1,end=arr.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) return mid;
            if(arr[mid]<arr[mid]+1 && arr[mid]>arr[mid-1]) start=mid+1;
            else end=mid-1;
        }
        return mid;
        
    }
}