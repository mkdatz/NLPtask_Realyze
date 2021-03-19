# NLP Task

This is my solution for the provided NLP task for Realyze Intelligence. Provided a normally formatted .txt file, returns the number of words, sentences, and paragraphs provided.

The solution is written in Java and is run from the command line.


## Thought Process

At first, I thought it would be enough to count the words based on if there was whitespace at the end, but this approach had to change to account for corner cases. As you can see by the sample text, this text includes dialogue- not every sentence will necessarily end with a period. Also, with abbreviations such as E.N.E., counting periods again does not work, because these would be counted as sentences.

An elegant solution after I examined the text was that each sentence begins with a double space- "  " as opposed to " ". I could simply check for these and this would count as a sentence.

## Assumptions Made

Firstly, assume a properly structured .txt file.

Assume that paragraphs are separated by an "enter"/new line.

Obviously assume that text is written in English.


## Running the solution

Pull the repository to your local machine and run as you would any Java file.

```bash
javac NLPtask.java
java NLPtask
Provide a filename: 20000leagues.txt
```

## Output

```bash
92 Words
7 Sentences
3 Paragraphs
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
