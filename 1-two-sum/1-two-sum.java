class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0; 

         int index2 = 0; 

         for(int i=0;i<nums.length;i++) 

         { 

             for(int j=i+1;j<nums.length;j++) 

             { 

                 if(nums[i]+nums[j]==target) 

                 { 

                     index1=i; 

                     index2=j; 

                 } 

             } 

         } 

         int[] result = new int[] {index1, index2}; 

         return result;  
    }
}