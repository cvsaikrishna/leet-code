class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunk = 0;
        int max = arr[0];
        for(int i = 0; i  < arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(max== i){
                chunk++;
            }
        }
        return chunk;
        
    }
}