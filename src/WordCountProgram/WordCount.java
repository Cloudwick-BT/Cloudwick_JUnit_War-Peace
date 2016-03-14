package WordCountProgram;

import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Bhavin
 * @since 14/03/2016; 16:36
 */

public class WordCount {

	public FileReader inputFile(String fileName){
		FileReader file = null;
		try{
			file = new FileReader(fileName);
		}
		catch (IOException e ) {}
		return file;
	}
	
	public void main(String[] args){
		String fileName = "F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt";
		FileReader file = inputFile(fileName);
	}

}
