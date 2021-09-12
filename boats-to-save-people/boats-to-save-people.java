class Solution {
    public int numRescueBoats(int[] people, int limit) {
     
        Arrays.sort(people);
        int left =0;
        int right = people.length-1;
        int ans = 0;
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
               left++;
                right--;
            }
            else{
                right--;
            }
            ans++;
            
        }
        return ans;
    }
}