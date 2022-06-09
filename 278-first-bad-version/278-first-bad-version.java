/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
     public int firstBadVersion(int n) {
        int s=1,e=n,mid;
        int ans=0;
        while(s<=e){
			mid=s+(e-s)/2;
			if(isBadVersion(mid)){
				 ans=mid;
		         e=mid-1;
              }
            else{
                s=mid+1;
              }
        }
        return ans;
    }
}