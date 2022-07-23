package java_io_teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// Leitura dos bytes do arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		// Classe que lê um InputStream transformando bits e bytes em caracteres
		Reader isr = new InputStreamReader(fis);
		// Classe que guarda os caracteres até preencher uma linha, após isso ele lê
		// a linha completa
		BufferedReader br = new BufferedReader(isr);

		// Gera bytes ao digitar
		OutputStream fos = new FileOutputStream("lorem2.txt");
		// Classe que lê um OutputStream transformando bits e bytes em caracteres
		Writer isw = new OutputStreamWriter(fos);
		// Classe que escreve os caracteres formando um conjunto de texto dentro do
		// Write e envia pro arquivo passado por parâmetro no OutputStream fos
		BufferedWriter bw = new BufferedWriter(isw);
		// Lendo a linha e inserindo na variável linha
		String linha = br.readLine();

		// Loop para ler o texto completo
		while (linha != null) {
			// Imprimindo no console a linha
			bw.write(linha);
			bw.newLine();
			// Recebendo nova linha para impressão
			linha = br.readLine();
		}

		// Finalizando o objeto br
		br.close();
		bw.close();
	}
}
