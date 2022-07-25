package java_io_teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {

		//Melhor classe para leitura de dados.
		Scanner scanner = new Scanner(new File("contas.csv"));
		//enquanto tiver uma proxima linha o scanner le o arquivo
		while(scanner.hasNextLine()) {
		//retorna proxima linha
		String linha = scanner.nextLine();
		System.out.println(linha);
		}
		
		scanner.close();
	}

}
