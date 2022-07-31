class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
      boolean res=false;
      Queue<Integer> queue=new LinkedList<>();
      Map<Integer,Queue<Integer>> adj=new HashMap<>();
      int[] nodeVisited=new int[n+1];
      Arrays.fill(nodeVisited,-1);
      for(int i=0;i<edges.length;i++)
      {
        Queue<Integer> tmpQueue=new LinkedList<>();
        
        tmpQueue=adj.getOrDefault(edges[i][0],new LinkedList<>());
        tmpQueue.add(edges[i][1]);
        adj.put(edges[i][0],tmpQueue);
        
        tmpQueue=adj.getOrDefault(edges[i][1],new LinkedList<>());
        tmpQueue.add(edges[i][0]);
        adj.put(edges[i][1],tmpQueue);
      }
      queue.add(source);
      while(!queue.isEmpty())
      {
        int current=queue.poll(); 
        if(current==destination)
          return true;
        if(!adj.containsKey(current))
            continue;
        for(Integer nextNode:adj.get(current))
        {
          if(nodeVisited[nextNode]==-1)
          {
            queue.add(nextNode);
            nodeVisited[nextNode]=1;
          }
        }
      }
      
      return res;
    }
}