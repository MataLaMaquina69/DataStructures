
package Search;

import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private Vertex vertexList[];
    private int adjacencyMat[][];
    private int nVerts;
    private Queue<Integer> q;
    

    public Graph(int ver) {
        vertexList = new Vertex[ver];
        adjacencyMat = new int[ver][ver];
        nVerts = 0;
        q = new LinkedList<Integer>();
         
        
                
    }
    public void addVertex(String label){
        vertexList[nVerts++] = new Vertex(label);
    }
    public void addEdge(int start, int end){
        adjacencyMat[start][end] = 1;
        adjacencyMat[end][start] = 1;
    } 
    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }
    
    public int getAdjacencyMatrix(int v){
        for (int i = 0; i < nVerts; i++) {
            if (adjacencyMat[v][i] == 1 && vertexList[i].visited == false) {
                System.out.println("Retornó " + adjacencyMat[v][i]);
                return i;
                
            }else{
                System.out.println("Retornó erroneo " + adjacencyMat[v][i]);
            }
            
        }
        
        return -1;
    }
    public void bfs(){
        vertexList[0].visited = true;
        displayVertex(0);
        q.add(0);
        System.out.println(q.toString());
        int v2;
        
        while(!q.isEmpty()) {
            int v1 = q.remove();
            while((v2 = getAdjacencyMatrix(v1))!= -1){
                vertexList[v2].visited = true;
                System.out.println("V2= " + v2);
                displayVertex(v2);
                q.add(v2);
            }
        }
        for (int i = 0; i < nVerts; i++) {
            System.out.print( vertexList[i].label + " = ");
            for (int j = 0; j < nVerts; j++) {
                System.out.print( adjacencyMat[i][j]+" ");
            }
            System.out.println("");
        }
    }
}