import java.io.*;
import java.net.*;

hi its day 3 
hi its day 2
public class JavaFileDownloadExample{
	public static void main(String[] args) throws IOException{

		String fileUrl= "http://www.roseindia.net/java/beginners/CreateDirectory.java";
		URL url = new URL(fileUrl);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
		FileOutputStream fileOutputStream =new  FileOutputStream("sampleFile.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);

		byte data[] = new byte[1024];

		while(bufferedInputStream.read(data, 0, 1024) >=0 )
		{
			bufferedOutputStream.write(data);
		}

		bufferedOutputStream.close();
		bufferedInputStream.close();
	}				
}
