
public abstract class Grafo {
	private Vertice vertices[][];
	
	private int tam = 0;
	
	public Grafo(int vs) {
		vertices = new Vertice[vs][vs];
		tam = vs;
	}
	
	public void setVertices(int v1, int v2, int peso) {
		this.vertices[v1-1][v2-1]=new Vertice(peso);
	}
	
	public int getTam() {
		return this.tam;
	}
}
