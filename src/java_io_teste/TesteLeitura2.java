package java_io_teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
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
		
		//Scanner que recebe a linha para tratamento
		Scanner linhaScanner = new Scanner(linha);
		//Define para o sistema utilizar as regras americanas de pontuacao
		linhaScanner.useLocale(Locale.US);
		//insere um delimitador na String.
		linhaScanner.useDelimiter(",");
		
		String valor1 = linhaScanner.next();
		int valor2 = linhaScanner.nextInt();
		int valor3 = linhaScanner.nextInt();
		String valor4 = linhaScanner.next();
		double valor5 = linhaScanner.nextDouble();
		
		
		System.out.println(valor1+valor2+valor3+valor4+valor5);
		linhaScanner.close();
		//metodo split quebra uma String, nesse caso esta inserindo uma virgula
		/*
		 * String[] valores = linha.split(","); System.out.println(valores[3]);
		 */
		}
		//fechando classe scanner
		scanner.close();
	}

}
