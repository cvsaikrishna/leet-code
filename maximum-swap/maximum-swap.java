class Solution {
    public void swap(char arr[],int left,int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public int maximumSwap(int n) {
        
        String num = n + "";
        char[] arr = num.toCharArray();
        
        int[] lastIndxOfDigit = new int[10];
        
        for(int i = 0;i < arr.length;i++){
            lastIndxOfDigit[arr[i]-'0'] = i;
        }
        
        
        //travel and find swapping point
        
        for(int i =0; i < arr.length;i++){
            int digit = arr[i] - '0';
            int indx = i;
            for(int j = 9; j > digit; j--){
                if(lastIndxOfDigit[j] > i){
                    indx = lastIndxOfDigit[j];
                    break;
                }
            }
            if(indx!=i){
                swap(arr,i,indx);
                break;
            }
        }
        String res = String.valueOf(arr);
        return Integer.parseInt(res);
        
    }
}