class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int count = 0;
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        
        for(int v = 0; v < n; v++){
            if(visited[v] == false){
                count++;
                getConnectedComp(isConnected,v,visited);
            }
        }
        
        return count;
        
    }
    public void getConnectedComp(int[][] graph,int src,boolean[] visited){
        visited[src] = true;
        
        for(int nbr = 0; nbr < graph.length;nbr++){
            if(graph[src][nbr] == 1 && visited[nbr] == false){
                getConnectedComp(graph,nbr,visited);
            }
        }
    }
}