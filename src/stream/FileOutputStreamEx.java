package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// -128 ~ 127
		byte[] data = { 52, 48, -3, 0, 7 };
		try {
			FileOutputStream fos = new FileOutputStream("C:/test/test.out");
			for (int i = 0; i < data.length; i++) {
				fos.write(data[i]);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
