class Solution {
    public int sumBase(int n, int k) {
        if(k==10){
            int sum = 0;
            while(n != 0){
                int r = n % 10;
                sum=sum+r;
                n=n/10;
            }
            return sum;
        }
        int pow=1;
        int sum=0;
        while(n!=0){
            int r=n%k;
            n=n/k;
            sum+=r*pow;
            pow=pow*10;
        }
        int ans=0;
        while(sum!=0){
            int r=sum%10;
            ans+=r;
            sum=sum/10;
        }
        return ans;
        
    }
}