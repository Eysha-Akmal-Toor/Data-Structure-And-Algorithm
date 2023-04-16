package graphusingmatrix;

public class GraphUsingMatrix {
    int vertarr[][] = new int[20][20];

    void edgeadd(int u, int v) {
        vertarr[u][v] = 1;
        vertarr[v][u] = 1;
    }
    
    void displaymatrix(int v) {
        int i, j;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                System.out.print(vertarr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 6;
        GraphUsingMatrix g = new GraphUsingMatrix();
        g.edgeadd(0, 4);
        g.edgeadd(0, 3);
        g.edgeadd(1, 2);
        g.edgeadd(1, 4);
        g.edgeadd(1, 5);
        g.edgeadd(2, 3);
        g.edgeadd(2, 5);
        g.edgeadd(5, 3);
        g.edgeadd(5, 4);
        g.displaymatrix(v);
    }
    
}
