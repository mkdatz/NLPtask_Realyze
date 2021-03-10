import java.io.*;

public class NLPtask {
	public static void main(String[] args) {
		// take in user input from the command line
		// this assumes they provide the full name with extension
		Scanner userInput = new Scanner(System.in);
		System.out.println("Provide a filename: ");
		String userInput = in.nextLine();
		File file = new File(input);

		// create a scanner that reads in the text file with the specified name
		Scanner fileRead = new Scanner(new Filereader(file));
		StringBuilder built = new StringBuilder();
		while(fileRead.hasNext()) {
			build.append(fileRead.next());
		}
		// close the scanner and put the output to a full string
		fileRead.close();
		output = built.toString();
	}
}