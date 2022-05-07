package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopyEx {

	public static void main(String[] args) {
		// C:/Windows/system.ini -> C:/test/system.text 복사
		File src = new File("C:/Windows/system.ini"); 
		File dest = new File("C:/test/system.text");
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while (true) {
				int i = fr.read();
				if (i == -1) {
					break;
				}
				fw.write(i);
			}
			fr.close();
			fw.close();
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
