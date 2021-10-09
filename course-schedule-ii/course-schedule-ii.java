class Solution {
    public int[] findOrder(int n, int[][] edges) {
        
        //1. Prepare graph for knowing the neighbours
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
        }
        
        //2. make indegree from graph
        int[] indegree = new int[n];
        
        for(int i = 0; i < n; i++){
            for(int nbr:graph.get(i)){
                indegree[nbr]++;
            }
        }
        
        //3. add element in queue which has 0 indegree
        
        Queue<Integer> qu = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                qu.add(i);
            }
        }
        int count = 0;
        int index = n-1;
        int[] res = new int[n];
        while(qu.size() > 0){
            //1. get+remove
            int rem = qu.remove();
            //2. print*
            res[index] = rem;
            count++;
            index--;
            // 3. decrease indegree of nbr and if indegree becomes 0 then add in queue
            for(int nbr:graph.get(rem)){
                indegree[nbr]--;
                if(indegree[nbr] == 0){
                    qu.add(nbr);
                }
            }
        }
     if(count != n){
        return new int[0];
     } 
        return res;
        
    }
}