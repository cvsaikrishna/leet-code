class Solution {
    public String addStrings(String num1, String num2) {
        String ans= "";
    int n1 = num1.length();
    int n2 = num2.length();
    int maxSize = Math.max(n1,n2) + 1;
    int c = 0;
    for(int i = n1-1,j=n2-1,k=maxSize-1;k>=0;i--,j--,k--){
        int sum= c;
        if(i>=0)
            sum = sum +(num1.charAt(i) -'0');
        if(j >=0)
            sum = sum + (num2.charAt(j) - '0');
          
          int add = sum % 10;
          ans = add + ans;
          c = sum/10;
            
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < ans.length();i++){
        if(ans.charAt(i) == '0' && i == 0){
            continue;
        }
        else{
            sb.append(ans.charAt(i));
        }
    }
    return sb.toString();
        
    }
}