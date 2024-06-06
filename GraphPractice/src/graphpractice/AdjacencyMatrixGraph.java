/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphpractice;

/**
 *
 * @author Alejandro Loutphi
 */
public class AdjacencyMatrixGraph<E> {

    private boolean[][] adjacencyMatrix;
    private final E[] elts;

    public AdjacencyMatrixGraph(E[] elts) {
        this.elts = elts;
        this.adjacencyMatrix = new boolean[elts.length][elts.length];
    }

    public E get(int n) {
        return this.elts[n];
    }
    
    public void linkAToB(int a, int b) {
        this.adjacencyMatrix[a][b] = true;
    }

    public void linkAAndB(int a, int b) {
        linkAToB(a, b);
        linkAToB(b, a);
    }

    public boolean isDirected() {
        for(int i = 0; i < this.elts.length; i++) {
            for (int j = 0; j < i; j++) {
                if (this.adjacencyMatrix[i][j] != this.adjacencyMatrix[j][i])
                    return false;
            }
        }
        return true;
    }
}


