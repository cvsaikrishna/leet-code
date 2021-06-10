class Solution {
    public int countPrimes(int n) {
        int count=0;
        int prime[]=new int[n+1];
        for(int i=0;i<=n;i++){
            prime[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]==1){
                for(int p=i*i;p<=n;p=p+i){
                    prime[p]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]==1)
                count++;
        }
        return count;
    }
}