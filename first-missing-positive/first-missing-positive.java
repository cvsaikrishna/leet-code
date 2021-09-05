class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        
        //1. Find occurence of one and mar out of range
        boolean one = false;
    for(int i = 0; i < n; i ++){
        if(nums[i]==1)
                one = true;
        if(nums[i]<1 || nums[i]>n)
                nums[i] = 1;
        
    }
        if(one == false)
            return 1;
        
        //2. mark element in arra
        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);
            int idx = val-1;
            nums[idx] = -Math.abs(nums[idx]);
        }
        //3, check for missing positive
        for(int i = 0; i < n;i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}