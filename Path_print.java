package file_handling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
public class Path_print {
	public static void main(String[] args) throws IOException{
	File f=new File("C:\\Users\\user\\Desktop\\New folder (2)\\abc.txt");
	FileReader in=null;
	try {
		in=new FileReader(f);
		int current=in.read();
		while(current!=-1) {
			System.out.print((char)current+"");
			current=in.read();  
		}
	}
	catch(InputMismatchException e) {
		System.out.print("Wrong Input");
	}
	finally {
		if(in!=null)
			in.close();
	}
	}
}