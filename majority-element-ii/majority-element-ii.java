class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
         int val1 = arr[0];
        int count1 = 1;
         int val2 = arr[0];
         int count2 = 0;
         
         for(int i = 1; i < arr.length; i++){
             if(arr[i] == val1){
                 count1++;
                }
            else if(arr[i] == val2){
                count2++;
            }
            else{
                if(count1 == 0){
                    val1 = arr[i];
                    count1 = 1;
                }
                else if(count2 == 0){
                    val2 = arr[i];
                    count2 = 1;
                }
                else{
                    count1--;
                    count2--;
                }
            }
            
         }
            ArrayList<Integer> res = new ArrayList<>();
            
            //for freq greater than n/3
            
            boolean chk = checkFreq(arr,val1);
            if(chk == true)
                res.add(val1);
            
            if(val1==val2)
                return res;
            boolean chk1 = checkFreq(arr,val2);
            if(chk1 == true)
                res.add(val2);
            
            return res;
        
    }
    
      public  boolean checkFreq(int[] arr,int val){
        int count = 0;
        for(int i:arr){
            if(i==val){
                count++;
            }
        }
        return count>arr.length/3;
    } 
}