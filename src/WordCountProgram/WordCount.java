package WordCountProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public int readFile(FileReader file, String word){
        Pattern p = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
        BufferedReader br = new BufferedReader(file);
        String currentLine = null;
        String[] arrayList = null; 
        int count = -1;
                
    try{
        while ((currentLine = br.readLine()) != null) {
            arrayList = currentLine.split("[^a-zA-Z]");
            for(String str : arrayList){
                Matcher M = p.matcher(str);
                if (M.find()){
                    count++;
                }
            }
        }
    } catch(Exception e) {}

    return count;
    }
	
	
	public void main(String[] args){
		String fileName = "F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt";
		FileReader file = inputFile(fileName);
		int count = readFile(file, "the");
		
	}

}
