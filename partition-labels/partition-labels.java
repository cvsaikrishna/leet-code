class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        
        List<Integer> res = new ArrayList<>();
        
        int prev = 0; 
        int max = 0;
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            max = Math.max(max,map.get(ch));
            if(max == i){
                res.add(i-prev+1);
                prev = i + 1;
            }
        }
            return res;
    }
}