class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int num=0;
        for(int i=0;i<s.length();i++){
            if(i<=s.length()-2 && hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
                num=num-hm.get(s.charAt(i));
            else
                num=num+hm.get(s.charAt(i));
        }
        return num;
    }
}