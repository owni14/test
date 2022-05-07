package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			FileWriter fw = new FileWriter("C:/test/hello2.txt");
			while (true) {
				int i = isr.read();
				if (i == -1) {
					break;
				}
				fw.write(i);
			}
			fw.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
