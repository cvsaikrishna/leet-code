class Solution {
    
     public static String nextGreaterElement_(String str) {
        // write your code here
        
        if(str.length()==1){
            return "-1";
        }
        
        char arr[] = str.toCharArray();
        int dpIndex = dipIndex(arr);
        if(dpIndex == -1){
            return "-1";
        }
        int ceilIndx = ceilIndex(arr,dpIndex);
        swap(arr,dpIndex,ceilIndx);
        reverse(arr,dpIndex+1);
        return String.valueOf(arr);
        
    }
    
    public static void swap(char arr[],int left,int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    public static void reverse(char arr[],int index){
        int left = index;
        int right = arr.length-1;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    
    public static int ceilIndex(char arr[],int index){
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] > arr[index]){
                return i;
            }
        }
        return -1;
    }
    
    public static int dipIndex(char arr[]){
        int index = arr.length-2;
        while(index >= 0 && arr[index] >= arr[index+1]){
            index--;
        }
        return index;
    }
    public int nextGreaterElement(int n) {
        String str = n + "";
        
        String res_ = nextGreaterElement_(str);
        long res = Long.parseLong(res_);
        
        if(res <= Integer.MAX_VALUE){
            return (int)res;
        }
        else{
            return -1;
        }
        
        
        
    }
    
    
}