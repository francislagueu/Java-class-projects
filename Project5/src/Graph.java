
/**
 *
 * @author Francis
 */
public class Graph {
    private int numVertex;
    private int maxVertex;
    private int[] vertex;
    private int[][] edges;
    private boolean[] visited;
    private static final int zero = 0;
    private int min = 99, nextvertex = 0;
    private int[]next = new int[maxVertex];
    private int[] distance = new int[maxVertex];
    
    public Graph(){
        numVertex = 0;
        maxVertex = 50;
        edges = new int[maxVertex][maxVertex];
        vertex = new int[maxVertex];
        visited = new boolean[maxVertex];
    }
    
    public Graph(int max){
        
        numVertex = 0;
        maxVertex = max;
        edges = new int[max][max];
        vertex = new int[max];
        visited = new boolean[max];
    }
    public void addVertex(int item){
        vertex[numVertex] = item;
        for(int i=0; i<numVertex; i++){
            edges[numVertex][i] = zero;
            edges[i][numVertex]=zero;
        }
        numVertex++;
    }
    
    public int findIndex(int item){
        int i=0;
        while(item!=vertex[i])
            i++;
        return i;
    }
    
    public void addEdge(int start, int end, int weight){
        int row, col;
        row = findIndex(start);
        col = findIndex(end);
        edges[row][col] = weight;
    }
   
    public int findMin(int[] weight){
        int min = weight[0];
        for(int i=1; i<weight.length; i++){
            if(weight[i]<min)
                min = weight[i];
        }
        return min;
    }
    
    public void Dijkstra(){
        distance = edges[0];
        visited[0]=true;
        distance[0]=0;
        
        for(int i=0; i<maxVertex;i++){
            min = 99;
            for(int j=0;j<maxVertex;j++){
                if(min<distance[j]&&visited[j]!=true){
                    min = distance[j];
                    nextvertex = j;
                }
            }
            visited[nextvertex] = true;
            for(int k=0;k<maxVertex;k++){
                if(visited[k]!=true){
                    if(min+edges[nextvertex][k]<distance[i]){
                        distance[i] = min +edges[nextvertex][k];
                        next[k]=nextvertex;
                    }
                }
            }
        }
        
        for(int n = 0; n<maxVertex; n++){
            System.out.print("|" + distance[n]);
        }
        System.out.println("|");
        int j;
        for(int m=0;m<maxVertex;m++){
            if(m!=0){
                System.out.print("Path = "+m);
                j = m;
                do{
                    j = next[m];
                    System.out.print("<-" +j);
                }while(j!=0);
            }
        }
    }
    public void print(){
        //int item, data;
        for(int i = 0; i < numVertex; i++){
           System.out.print(vertex[i]+" Edges:");
           for(int j = 0; j< numVertex; j++){
               if(edges[i][j]!=zero){
                   System.out.print("("+ vertex[i]+","+vertex[j]+") weight: "
                                        + edges[i][j]+"\n");
               }
           }
        }
    }
}
