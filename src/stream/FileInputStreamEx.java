package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
	
	public static void main(String[] args) {
		byte[] data = new byte[5];
		try {
			FileInputStream fis = new FileInputStream("C:/test/test.out");
			int index = 0;
			while (true) {
				int i = fis.read();
				if (i == -1) {
					break;
				}
				data[index++] = (byte)i;
			}
			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
