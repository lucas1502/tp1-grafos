import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Olá, git!");
		String path = "file.txt";
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (linha != null) {
			System.out.println(linha);
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

}
