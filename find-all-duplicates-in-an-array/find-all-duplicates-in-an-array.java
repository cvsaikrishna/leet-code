class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i  < nums.length;i++){
         int index = Math.abs(nums[i])-1;
          int val = nums[index];
            if(val < 0){
                ans.add(index+1);
            }
            
            else{
                nums[index] = -1 * nums[index];
            }
            
        }
        return ans;
    }
}