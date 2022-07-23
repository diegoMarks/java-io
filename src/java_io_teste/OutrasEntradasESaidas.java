package java_io_teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class OutrasEntradasESaidas {

	public static void main(String[] args) throws IOException {
		
		try (//Criando a classe que se conectaria a rede
		Socket s = new Socket()) {
			// Leitura dos bytes dos caracteres digitados pelo usuario
			InputStream fis = s.getInputStream();//System.in;
			// Classe que lê um InputStream transformando bits e bytes em caracteres
			Reader isr = new InputStreamReader(fis);
			// Classe que guarda os caracteres até preencher uma linha, após isso ele lê
			// a linha completa
			BufferedReader br = new BufferedReader(isr);

			// Gera bytes no console ao digitar
			OutputStream fos = s.getOutputStream();//System.out;
			// Classe que lê um OutputStream transformando bits e bytes em caracteres
			Writer osw = new OutputStreamWriter(fos);
			// Classe que escreve os caracteres formando um conjunto de texto dentro do
			// Write e envia pro arquivo passado por parâmetro no OutputStream fos
			BufferedWriter bw = new BufferedWriter(osw);
			// Lendo a linha e inserindo na variável linha
			String linha = br.readLine();

			// Loop para ler o texto completo
			while (linha != null && !linha.isEmpty()) {
				// Imprimindo no console a linha
				bw.write(linha);
				bw.newLine();
				//Metodo de descarga dos dados
				bw.flush();
				// Recebendo nova linha para impressão
				linha = br.readLine();
			}

			// Finalizando o objeto br
			br.close();
			bw.close();
		}
	}
}
