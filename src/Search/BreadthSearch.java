
package Search;

public class BreadthSearch {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
        
        //static case
        Graph graph = new Graph(6);
        
        graph.addVertex("A"); // 0
        graph.addVertex("B"); // 1
        graph.addVertex("C"); // 2
        graph.addVertex("D"); // 3
        graph.addVertex("E"); // 4
        graph.addVertex("F"); // 5
                
        // nodos adyacentes de A
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        
        // nodos adyacentes de B
        graph.addEdge(1,2);
        
        // nodos adyacentes de D
        graph.addEdge(3,4);                        
        
        // nodos adyacentes de E
        graph.addEdge(4,5);                                
        
        System.out.println("Visits: ");
        graph.bfs();
        System.out.println();
    }
    
}
