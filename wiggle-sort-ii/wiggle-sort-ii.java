class Solution {
    public void wiggleSort(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];
        
        for(int i = 0; i < n;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        
        int i = 1;
        int j = n-1;
        
        while(i<n){
            nums[i] = arr[j];
            j--;
            i=i+2;
        }
         i= 0;
        
        while(i<n){
            nums[i] = arr[j];
            j--;
            i=i+2;
        }
        
    }
}