import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Olá, git!");
		String path = "file.txt";
		int u,v,peso,direc;
		char c;
		String aux;
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			String linha = "";
			while (linha != null) {
				System.out.println(linha);
				linha = buffRead.readLine();
			}
			buffRead.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
		
		
	}

}
