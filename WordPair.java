
public class WordPair {
    /** Constructs a WordPair object. */
    public WordPair(String first, String second) {
       for(int i=0;i<words.length-1;i++){
        for(int j=i+1;j<words.length;j++){
            WordPair w = new WordPair(words[i],words[j]);
            allPairs.add(w);
        }
       }
       
        }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        /* implementation not shown */ }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        /* implementation not shown */ }
}