package ArquivosPathFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoFileWriterBufferedWriter {

	public static void main(String[] args) {
		
		String[] linhas = new String[] { "Palmeiras, "
				+ "Fluminense, "
				+ "Internacional, "
				+ "Corinthians, " };
		
		String path = "c:\\TabelaBrasileirao\\TimesSerieA2.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
