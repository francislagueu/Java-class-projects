

/**
 *
 * @author Francis
 */
public class Driver {
    public static void main(String[] args){
        Graph g = new Graph(8);
        
        for(int i =0; i <8; i++)
            g.addVertex(i);
        g.addEdge(0, 2, 10);
        g.addEdge(1, 2, 5);
        g.addEdge(2, 4, 8);
        g.addEdge(3, 0, 6);
        g.addEdge(4, 1, 2);
        g.addEdge(5, 7, 12);
        g.addEdge(6, 3, 15);
        g.addEdge(7, 2, 3);
        g.addEdge(4, 6, 10);
        
        g.print();
        g.Dijkstra();
    }
}
