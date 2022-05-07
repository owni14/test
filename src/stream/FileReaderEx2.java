package stream;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class FileReaderEx2 extends JFrame implements ActionListener{
	Container c = getContentPane();
	
	JFileChooser chooser = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일(*.txt, *.html, *.java)", "txt", "html", "java");
	
	JTextArea ta = new JTextArea();
	
	public FileReaderEx2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메모장");
		ta.setFont(new Font("Consolas", Font.PLAIN, 20));
		c.add(new JScrollPane(ta));
		chooser.setFileFilter(filter);
		setMenu();
		setSize(500, 500);
		setVisible(true);
	}

	private void setMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu mnuFile = new JMenu("파일");
		JMenuItem miOpen = new JMenuItem("열기");
		miOpen.addActionListener(this);
		mnuFile.add(miOpen);
		mb.add(mnuFile);
		setJMenuBar(mb);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int choose = chooser.showOpenDialog(null);
		// 파일 다이얼로그의 열기 버튼을 눌렀다면
		if (choose == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			String path = f.getAbsolutePath();
			try {
				FileReader reader = new FileReader(path);
				while (true) {
					int i = reader.read();
					if (i == -1) {
						break;
					}
//					System.out.print((char)i);
					ta.append(String.valueOf((char)i));
				}
				reader.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new FileReaderEx2();
	}

}
