import java.util.ArrayList;


public abstract class Grafo {
	private ArrayList[][] arestas;
	
	private int tam = 0;
	
	public Grafo(int vs) {
		arestas = new ArrayList[vs][vs];
		tam = vs;
	}
	
	public void setVertices(int v1, int v2, int peso) {
		this.arestas[v1-1][v2-1] = new ArrayList<Aresta>();
		this.arestas[v1-1][v2-1].add(new Aresta(peso));
	}
	public int getTam() {
		return this.tam;
	}
	
	public int getGrau (int v1) {
		int cont=0;
		for(int i=0; i<this.tam; i++) {
			if(this.arestas[i][v1]!=null) {
				cont = cont + this.arestas[i][v1].size();
			}
		}
		return cont;
	}
}
