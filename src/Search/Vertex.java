/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author CLARKE
 */
public class Vertex {
    public String label;//nombre del vertice 
    public boolean visited;//bandera para saber si ya lo visitó

    public Vertex(String label) {
        this.label = label;
        this.visited = false;
    }
}
