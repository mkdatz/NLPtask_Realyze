import java.io.*;
import java.util.*;

public class NLPtask {
	public static void main(String[] args) throws IOException {
		// all values start at zero
		// save for paragraph, which assumes there is text in the file
		int wordCount = 0;
		int sentenceCount = 0;
		int paragraphCount = 1;
		// take in user input from the command line
		// this assumes they provide the full name with extension
		Scanner userInput = new Scanner(System.in);
		System.out.print("Provide a filename: ");
		// accept file and read in
		String answer = userInput.nextLine();
		FileInputStream file = new FileInputStream(answer);
		InputStreamReader input = new InputStreamReader(file);
		// create new bufferedReader for file reading
		BufferedReader parse = new BufferedReader(input);
		// create new string for reading in each line
		String line;
		// read the current inline
		while((line = parse.readLine()) != null) {
			// if the line is empty, we've found a paragraph
			if(line.equals("")) {
				paragraphCount++;
			}
			// otherwise, begin parsing word by word.
			else {
				// split the words if they are followed by a space.
				String[] words = line.split("\\s+");
				// add to words
				wordCount += words.length;

				// split the sentences if they are followed by a double space.
				String[] sentences = line.split("  ");

				// add to sentences
				sentenceCount += sentences.length;
			}
		}
		System.out.println("Total word count = " + wordCount); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
	}
}