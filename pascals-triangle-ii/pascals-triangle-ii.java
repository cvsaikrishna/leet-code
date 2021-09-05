class Solution {
    public List<Integer> getRow(int r) {
        
    ArrayList<Integer> ans = new ArrayList<>();
    
    long val = 1;
    for(int j = 0 ; j <= r;j++){
        ans.add((int)val);
        val = (val * (r-j)) / (j+1);
    }
    return ans;
    }
}