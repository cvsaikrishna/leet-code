class Solution {
    public boolean isLongPressedName(String name, String typed) {
         int i = 0;
        int j = 0;
        
        if(name.length() > typed.length()){
            return false;
        }
        
        while(i < name.length() && j < typed.length()){
            
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if( 0 <= i-1 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        
        while(j < typed.length()){
            if(name.charAt(i-1) != typed.charAt(j)){
                return false;
            }
            j++;
        }
        
        return i < name.length()?false:true;
        
    }
}