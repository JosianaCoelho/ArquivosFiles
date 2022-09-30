package ArquivosPathFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoFileIO {

	public static void main(String[] args) {

		String path = "c:\\TabelaBrasileirao\\TimesSerieA.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try { // usando o try para tentar ler o arquivo sem travar a leitura//
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
