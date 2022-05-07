package stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedIOEx {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/test/Hello.txt");
			BufferedOutputStream bos = new BufferedOutputStream(System.out, 6);
			while (true) {
				int i = fr.read();
				if (i == -1) {
					break;
				}
				bos.write(i);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
