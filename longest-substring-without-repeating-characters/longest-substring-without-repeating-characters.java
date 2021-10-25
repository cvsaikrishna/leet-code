class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 1){
            return 1;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int start = 0;
        int maxLen = 0;
    
        for(int end = 0; end < s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end))+1);
            }
            map.put(s.charAt(end),end);
            maxLen = Math.max(maxLen,end-start+1);
        }
        
        return maxLen;
    }
}