import java.io.*;
import java.util.*;

public class NLPtask {
	public static void main(String[] args) throws IOException {
		int wordCount = 0;
		int sentenceCount = 0;
		int paragraphCount = 1;
		// take in user input from the command line
		// this assumes they provide the full name with extension
		Scanner userInput = new Scanner(System.in);
		System.out.print("Provide a filename: ");
		String answer = userInput.nextLine();
		FileInputStream file = new FileInputStream(answer);
		InputStreamReader input = new InputStreamReader(file);
		BufferedReader parse = new BufferedReader(input);
		String line;

		int i = 0;
		while((line = parse.readLine()) != null) {
			if(line.equals("")) {
				paragraphCount++;
			}
			else {
				String[] words = line.split("\\s+");
				wordCount += words.length;

				String[] sentences = line.split("  ");


				System.out.println(sentences[i]);

				sentenceCount += sentences.length;
			}
		}
		System.out.println("Total word count = " + wordCount); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
	}
}