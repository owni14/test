package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// UTF - 8
		try {
			FileInputStream fis = new FileInputStream("C:/test/Hello.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			while (true) {
				int i = isr.read();
				if (i == -1) {
					break;
				}
				System.out.print((char)i);
			}
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
