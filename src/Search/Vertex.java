package Search;

public class Vertex {
    public String label; //nombre del vertice 
    public boolean visited; //bandera para saber si ya lo visitó

    public Vertex(String label) {
        this.label = label;
        this.visited = false;
    }
}
