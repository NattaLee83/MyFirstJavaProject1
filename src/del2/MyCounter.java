package del2;
public class MyCounter {
    private int rows = 0;
    private int chars = 0;
    private int words = 0;
    private String longestWord = new String();

    public void countChars(String str) { //Textradens bokstäver räknas.
        this.chars += str.length(); //<--plus antal tecken + mellanrum.
    }
    public void countWords(String str) {
        String[] strArr = str.split(" ");//Delar upp textraden i en array.
        this.words += strArr.length;//<--Räknar antalet element (ord).

        for (String word : strArr) {//<--Kollar genom varje ord i textraden.
            if (word.length() > this.longestWord.length()) {//<--Kollar om ordet är längre än det nuvarande längsta ordet.
                this.longestWord = word; //<--Sparar ordet om det är längre än det nuvarande längsta ordet.
            }
        }
    }
    public void addRow() {
        this.rows++;
    }
    public int getRows() {
        return this.rows;
    }
    public int getChars() {
        return this.chars;
    }
    public int getWords() {
        return this.words;
    }
    public String getLongestWord() {
        return this.longestWord;
    }
}


