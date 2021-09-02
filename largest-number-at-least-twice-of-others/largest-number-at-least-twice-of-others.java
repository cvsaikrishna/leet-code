class Solution {
    public int dominantIndex(int[] arr) {
        
        if(arr.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int k = 0;
        
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max1= max;
                max = arr[i];
                k = i;
            }
           else if(arr[i] > max1){
               max1 = arr[i];
           }
        }
        
        if(max >= 2*max1){
            return k;
        }
        else{
            return -1;
        }
    }
}