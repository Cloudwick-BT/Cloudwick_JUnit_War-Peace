package testunits;

import java.io.FileReader;

import WordCountProgram.*;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * 
 * @author Bhavin Tandel
 * @since 14/03/2016; 16:36
 */
public class WordCountTestClass {
	
	@Test
	public void testInput(){
		WordCount test = new WordCount();
		FileReader file = test.inputFile("F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt");
		assertNotNull(file);
	}
	
	@Test
	public void testInputNull(){
		WordCount test = new WordCount();
		FileReader file = test.inputFile("F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt");
		assertNull(file);
	}
	
	@Test
	public void testFile(){
		String[] args = null;
		WordCount test = new WordCount();
		FileReader file = test.inputFile("F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt");
		int count = test.readFile(file, "the");
		assertNotNull(count);
	}
	
	@Test
	public void testFileBlank(){
		String[] args = null;
		WordCount test = new WordCount();
		FileReader file = test.inputFile("F:/Cloudwick/java_Cloudwick/gutenberg/war&peace.txt");
		int count = test.readFile(file, "the");
		assertEquals(-1,count);
	}

}
