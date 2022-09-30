package NovoArquivoFile2;

import java.io.File;
import java.util.Scanner;

public class PastaFileEFiltros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma pasta path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("pastas:");
		for (File pasta : pastas ) {
			System.out.println(pasta);
		}
		
		boolean sucesso = new File(strPath +"\\pastaNova").mkdir();
		System.out.println("diretorio criado com sucesso: " + sucesso);
		
		sc.close();
	} 

}
