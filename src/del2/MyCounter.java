package del2;

public class MyCounter {
   /* En annan klass som räknar raderna och har koll på antalet tecken
  Kontrollen för att ha koll på om användaren har skrivit
  ordet stop eller inte får utföras i vilken av klasserna man vill
 */
    private int rows;
    private int chars;

    public MyCounter() {
        this.chars = 0;
        this.rows = 0;
    }

    public void countChars(String str) {
        this.chars += str.length();
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
}
