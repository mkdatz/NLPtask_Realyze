# NLP Task

This is my solution for the provided NLP task for Realyze Intelligence. Provided a normally formatted .txt file, returns the number of words, sentences, and paragraphs provided.

The solution is written in Java and is run from the command line.


## Thought Process

At first, I thought it would be enough to count the words based on if there was whitespace at the end, but this approach had to change to account for corner cases.


## Running the solution

Pull the repository to your local 

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
