package java_io_teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Gera bytes ao digitar
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		//Classe que lê um OutputStream transformando bits e bytes em caracteres
		//Writer isw = new OutputStreamWriter(fos);
		//Classe que escreve os caracteres formando um conjunto de texto dentro do
		//Write e envia pro arquivo passado por parâmetro no OutputStream fos
		//BufferedWriter bw = new BufferedWriter(isw);
		
		//Faz o mesmo que todo o codigo acima
		//FileWriter fw = new FileWriter("lorem2.txt");
		//Pode criar o FileWriter diretamente no Buffered, o Buffered é a classe
		//de mais alto nivel
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Diego Marks de Capanema para Dois Vizinhos");
		//Metodo System.lineSeparator() devolve o caractere de quebra de linha
		//conforme o sistema operacional
		//bw.write(System.lineSeparator());
		bw.newLine();
		bw.write("Revendo conceitos de Java IO");
		
		//Finalizando o objeto fw
		bw.close();
	}
}
