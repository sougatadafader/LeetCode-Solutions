/*21 / 21 test cases passed.
Status: Accepted
Runtime: 3 ms*/

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0;
        int len= nums.length;
        int ctr=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
            else
                ctr++;
        }
        while(ctr>0)
        {
            nums[len-ctr] =0;
            ctr--;
        } 
    }
}