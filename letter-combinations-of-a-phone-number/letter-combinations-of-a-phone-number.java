class Solution {
    public List<String> letterCombinations(String digits){
        if(digits.length()==0){
             List<String> base = new ArrayList<String>();
            return base;
            
        }
         
        List<String> result=letterCombinations1(digits);
        return result;
    }
    
    public List<String> letterCombinations1(String digits) {
        
        
        
        String[] words = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        if(digits.length()==0){
            List<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        
        char ch  = digits.charAt(0);
        String ros = digits.substring(1);
        List<String> res = letterCombinations1(ros);
        
        List<String> result = new ArrayList<String>();
        
        String temp = words[Character.getNumericValue(ch)];
        
        for(int i = 0;i<temp.length();i++){
            char tt = temp.charAt(i);
            for(String j: res){
                result.add(tt+j);
            }
        }
        
        return result;
    }
    
}