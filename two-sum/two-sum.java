class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        int[] solution = new int[2];
        
      for(int numsIndex=0; numsIndex<nums.length; numsIndex++)
      {
        solution[1]=numsIndex;
        solution[0]=numsMap.getOrDefault(target-nums[numsIndex],-1);
        if(solution[0] != -1 )
        {
          return solution;
        }
        else
        {
	        numsMap.putIfAbsent(nums[numsIndex],numsIndex);                   
        }
      }      
      return solution;
    }
}