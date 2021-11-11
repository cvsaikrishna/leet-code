class Solution {
    public int pivotIndex(int[] arr) {
         
        int index = -1;
        
        int Tsum = 0;
        for(int i: arr){
            Tsum += i;
        }
        
        int lsum = 0;
        
        for(int i = 0; i < arr.length;i++){
            
            if(i == 0){
                lsum = 0;
            }
            else{
                lsum += arr[i-1];
            }
            
            Tsum -= arr[i];
            
            if(lsum == Tsum){
                return i;
            }
            
            
        }
        
        return index;
        
    }
}