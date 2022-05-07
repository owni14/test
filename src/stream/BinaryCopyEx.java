package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("G:/workspace/jdk8.zip");
		File dest = new File("C:/test/jdk8_copy.zip");
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);
			long startTime = System.currentTimeMillis();
			int v = 0;
			while (true) {
				int i = fis.read();
				if (i == -1) break;
				fos.write((byte)i);
				v++;
				if (v == 1000000) {
					System.out.println("■");
					v = 0;
				}
			}
			long endTime = System.currentTimeMillis();
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료, 걸린 시간:" + (endTime - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
