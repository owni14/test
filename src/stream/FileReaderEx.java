package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		//C:/test/Hello.txt
		try {
			FileReader reader = new FileReader("C:/test/Hello.txt");
			while(true) {
				int i = reader.read();
				if (i == -1) {
					break;
				}
				System.out.print((char)i);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}

}
