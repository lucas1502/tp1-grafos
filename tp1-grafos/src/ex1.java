import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws IOException {
		Dirigido d;
		System.out.println("OlÃ¡, git!");
		String path = "file.txt";
		int vertices = 0;					// numero de vertices no grafo
		int inteiros[] = new int[4];		// vetor = [verticeU, verticeV, peso, direção]
		String aux = "";
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path)); 
			String linha = "";
			int i = 0;
			linha = buffRead.readLine();		// Primeira linha é lida
			vertices = Integer.parseInt(linha); // Primeiro valor é do numero de vertices, converte para inteiro
			d = new Dirigido(vertices);
			while ((linha = buffRead.readLine()) != null) {		// ler todas as linhas do arquivo
				aux = "";
				i = 0;
				System.out.println(linha);	
				for(char c : linha.toCharArray()) {		// A linha é dividida char a char para guardar no vetor
					if(c == ';') {
						inteiros[i++] = Integer.parseInt(aux);
						aux = "";
						
					} else if (c == ' ') {
						continue;
					} else {
						aux = aux + c;		// Concatena os char na string porque pode ser um numero mais de 1 digito
					}
				}
				inteiros[i] = Integer.parseInt(aux);
				d.inserirVertices(inteiros[0], inteiros[1], inteiros[2], inteiros[3]);
				
			}
			buffRead.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		
		
	}

}
