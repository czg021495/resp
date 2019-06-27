package 复制文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyFile {
	public  void copyfile(String oldfile,String newfile) {
		int bytesum =0;
		int byteread= 0;
		
		try {
		File ofile = new File(oldfile);
		File oldPath = ofile;
		if(oldPath.exists()) {
			FileInputStream in = new FileInputStream(oldfile);
			FileOutputStream fs = new FileOutputStream(newfile);
			byte[] buffer=new byte[1440];
			while((byteread=in.read(buffer))!=-1) {
				bytesum=bytesum+=byteread;
				System.out.println(bytesum);
				fs.write(buffer, 0, byteread);
			}
			in.close();
		}
		} catch (Exception e) {
			System.out.println("fuzhiwenjianchucuo");
		}
	}
	
}
