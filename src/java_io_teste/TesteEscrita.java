package java_io_teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Gera bytes ao digitar
		OutputStream fos = new FileOutputStream("lorem2.txt");
		//Classe que lê um OutputStream transformando bits e bytes em caracteres
		Writer isw = new OutputStreamWriter(fos);
		//Classe que escreve os caracteres formando um conjunto de texto dentro do
		//Write e envia pro arquivo passado por parâmetro no OutputStream fos
		BufferedWriter bw = new BufferedWriter(isw);
		
		bw.write("Diego Marks de Capanema para Dois Vizinhos");
		bw.newLine();
		bw.newLine();
		bw.write("Revendo conceitos de Java IO");
		
		//Finalizando o objeto br
		bw.close();
	}
}
