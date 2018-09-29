
public class Dirigido extends Grafo {

	public Dirigido(int vs) {
		super(vs);
		// TODO Auto-generated constructor stub
	}
	
	public void inserirVertices(int v1, int v2, int peso, int dir) {
		if(dir == 1) {
			this.setVertices(v1, v2, peso);
		}
		else if(dir == -1) {
			this.setVertices(v2, v1, peso);
		}
		
	}

}
