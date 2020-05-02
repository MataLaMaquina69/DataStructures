
package Search;

/**
 *
 * @author CLARKE
 */
public class BreadthSearch {
    public static void main(String[] args) {
        //static case
        Graph graph = new Graph(3);
        
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.display();
    }
   
}
