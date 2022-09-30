package ArquivosPathFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoFileIO2 {

	public static void main(String[] args) {
		
		String path = "c:\\TabelaBrasileirao\\TimesSerieA.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // usando o try para tentar ler o arquivo sem travar a leitura//
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

	}

}
