package DAY2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile2 {
	public static void main(String[] args) throws IOException {
		String fileSrc = "C:/JMPX/hellotest.txt";
		String fileDes = "C:/JMPX/hellotest.txt2";
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(fileSrc);
			fo = new FileOutputStream(fileDes);
			in = fi.getChannel();
			out = fo.getChannel();
			in.transferTo(0, in.size(), out);
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("C:/JMPX/Copy文件夹文件复制成功");
	}
}
