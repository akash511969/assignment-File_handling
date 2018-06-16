//READ FILE AND DISPLAY ON CANSOLE
package file_handling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class file_handling {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\user\\Desktop\\New folder (2)\\abc.txt");    //path of file
	System.out.print(f.exists());                                                          //tells file presence
	f.createNewFile();                                                                     //create file if not present in path
	FileReader in=new FileReader(f);                                                       //read fxn
	int current=in.read();                                                                 //read file
	while(current!=-1) {                                                                   //read until EOF(End of File)
	System.out.print((char)current+"");                                                  //display 1 char
	current=in.read();                                                                      //display next char
	}
}

}
