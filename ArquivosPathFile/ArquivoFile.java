package ArquivosPathFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoFile {

	public static void main(String[] args) {
		
		File file = new File("c:\\TabelaBrasileirao\\TimesSerieA.txt");
		Scanner sc = null;                   // Liter basic do arquivo txt //
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
