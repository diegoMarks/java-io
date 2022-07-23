package java_io_teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//Leitura dos bytes do arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		//Classe que lê um InputStream transformando bits e bytes em caracteres
		Reader isr = new InputStreamReader(fis);
		//Classe que guarda os caracteres até preencher uma linha, após isso ele lê
		//a linha completa
		BufferedReader br = new BufferedReader(isr);
		//Lendo a linha e inserindo na variável linha
		String linha = br.readLine();
		//Loop para ler o texto completo
		while(linha != null) {
			//Imprimindo no console a linha
			System.out.println(linha);
			//Recebendo nova linha para impressão
			linha = br.readLine();
		}
		
		//Finalizando o objeto br
		br.close();
	}
}
