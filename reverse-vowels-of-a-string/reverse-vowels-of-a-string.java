class Solution {
      private boolean isVowel(char ch){
            String vowels = "aeiouAEIOU";
            return vowels.contains(ch+"");
        }
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();
        int lft = 0; 
        int rt = ch.length-1;
        
        while(lft < rt){
            
        while(lft < rt && isVowel(ch[lft]) == false){
            lft++;
        }
             while(lft < rt && isVowel(ch[rt]) == false){
            rt--;
        }
           
                char temp = ch[lft];
                ch[lft] = ch[rt];
                ch[rt] = temp;
                
                lft++;
                rt--;
        }
        
        return String.valueOf(ch);
    }
        
      
    
}