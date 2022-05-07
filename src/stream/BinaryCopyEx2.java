package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BinaryCopyEx2 {

	public static void main(String[] args) {
		File src = new File("G:/workspace/ChromeSetup.exe");
		File dest = new File("C:/test/ChromeSetup_Copy.exe");
		long size = src.length();
		long percent = size / 100;
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			long startTime = System.currentTimeMillis();
			int v = 0;
			int w = 0;
			while (true) {
				int i = bis.read();
				if (i == -1) break;
				bos.write((byte)i);
				v++;
				if (v == percent) {
					System.out.println(++w + "퍼센트\n");
					v = 0;
				}
			}
			long endTime = System.currentTimeMillis();
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료, 걸린 시간:" + (endTime - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
