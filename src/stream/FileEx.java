package stream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) {
		File f1 = new File("C:/Windows/system.ini");
		String path = f1.getPath();
		System.out.println("path:" + path);
		String parent = f1.getParent();
		System.out.println("parent:" + parent);
		String filename = f1.getName();
		System.out.println("filename:" + filename);
		boolean isFile = f1.isFile();
		System.out.println("isFile:" + isFile);
		boolean isDirectory = f1.isDirectory();
		System.out.println("isDirectory:" + isDirectory);
		
		File f2 = new File("C:/test/java_test");
		boolean exists = f2.exists();
		System.out.println("exists:" + exists);
		if (!exists) {
			f2.mkdir(); // mk : make
		}
		
		File f3 = new File("C:/Windows");
		File[] files = f3.listFiles();
		for (File f : files) {
			String strIsFile = "����";
			if (!f.isDirectory()) {
				strIsFile = "���丮";
			}
			long time = f.lastModified(); // ����������
			// java.util.Date
			Date d = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("MM�� dd�� HH:mm:ss");
			String strDate = sdf.format(d);
			long len = f.length();
			System.out.println(f.getName() + "\t\t\t" + strIsFile + "\t����ũ��:" + len + 
							  "\t�����ѽð�:" + strDate);
		}
	}

}
