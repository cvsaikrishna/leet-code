class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        LinkedList<Integer> ans  = new LinkedList<>();
        
        int lo = 0;
        int hi = arr.length - 1;
        
        int indx = 0;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            indx = Math.abs(arr[indx] - x) > Math.abs(arr[mid] - x) ? mid : indx; 
            if(arr[mid] == x){
                break;
            }
            else if(arr[mid] > x){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        
        lo = indx - 1;
        hi = indx;
        
        while(ans.size() < k && lo >= 0 && hi < arr.length){
            
            if(Math.abs(x - arr[lo]) <= Math.abs(arr[hi] - x)){
                ans.addFirst(arr[lo]);
                lo--;
            }
            else{
                ans.addLast(arr[hi]);
                hi++;
            }
            
        }
        
        while(ans.size() < k && lo >= 0){
            ans.addFirst(arr[lo]);
            lo--;
        }
        
         while(ans.size() < k && hi < arr.length){
            ans.addLast(arr[hi]);
            hi++;
        }
        
        
        return ans;
        
    }
}