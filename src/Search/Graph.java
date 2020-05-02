
package Search;

import java.util.LinkedList;


public class Graph {
  int vertices;
  LinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList= new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
  
    public void addEdge(int start, int end) {
        adjacencyList[start].add(end);
        adjacencyList[end].add(start);//viceversa link
        
    }
    
    public void display(){
        for (int i = 0; i < vertices; i++) {
            
            if (adjacencyList[i].size()>0) {
                System.out.println("Vertice " + i + "is connectes to:");
                for (int j = 0; j < adjacencyList[i].size(); j++) {
                    System.out.println(adjacencyList[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
    }
  
    
}
