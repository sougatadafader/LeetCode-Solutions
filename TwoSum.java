/*20 / 20 test cases passed.
Status: Accepted
Runtime: 11 ms
*/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           
           if(map.containsKey(target-nums[i])){
               result[0]= map.get(target-nums[i]);
               result[1]= i;
           }
             map.put(nums[i],i);
        }
        return result;
    }
}