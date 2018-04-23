/*2080 / 2080 test cases passed.
Status: Accepted
Runtime: 76 ms
Beats other java submissions: 74.14%
*/

class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
                         int n1= nums1.length;
        int n2= nums2.length;
        int[] nums3 = new int[n1+n2];
        int i=0,j=0,k=0;
			
			while (i<n1 && j<n2)
			{
				if(nums1[i]<=nums2[j])
					nums3[k++]=nums1[i++];
				else
					nums3[k++]=nums2[j++];
			}
			while(i<n1)
				nums3[k++]= nums1[i++];
			
			while(j<n2)
				nums3[k++]= nums2[j++];
		
		int len= nums3.length;
		
		
		double sum=0;
		int mid= len/2;
		
		
		
		if(len%2==0)
		{
			sum= ((double) nums3[mid-1]+ (double) nums3[mid])/2;
		}
		else
			sum= nums3[mid];
		
		return sum;
    }
}