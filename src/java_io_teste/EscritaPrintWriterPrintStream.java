package java_io_teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class EscritaPrintWriterPrintStream {

	public static void main(String[] args) throws IOException {
		//Classe usada para medir o tempo de execucao do programa
		long ini = System.currentTimeMillis();
		
		//Imprimindo para o fluxo primario
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		//Mesmas funcoes do PrintStream, PrintWriter é de mais alto nivel ainda
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Teste PrintStream");
		ps.println();
		ps.println("Classe mais antiga para imprimir caracteres");
		
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram: " + (fim - ini) + " Milissegundos");
	}

}
