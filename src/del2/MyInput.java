package del2;
import java.util.ArrayList;
import java.util.Scanner;
public class MyInput {
    private MyCounter counter = new MyCounter();//En annan klass som räknar raderna och har koll på antalet tecken
    private ArrayList<String> rows = new ArrayList<>(); //<--Skapar en Arraylist som innehåller text.
    public static void main(String[] args) {
        MyInput test = new MyInput(); //<--MyInput-Skapar en ny objekt av klassen och döper variabeln till test.

        String userinput; //<--Ny String som heter input.
        Scanner scan = new Scanner(System.in); //<--Ta in det användaren skriver.
        while(true) { //<--Varje gång man går igenom Loopen så börjar den om från början
            System.out.println("Please type one word, followed by enter:");
            System.out.println("To quit, please type: stop");
            userinput = scan.nextLine(); //<--Användarens textrad.
            if (userinput.equals("stop")) {
                break;
            }
            test.processInput(userinput);//<--Kör funktionen.
        }
        test.showResult(); //<--Säger till test att köra funktionen.
    }
    public void processInput(String input) { //Denna funktion läser in texten som användaren skriver.

        this.counter.countChars(input);//<--Räknar tecken+mellanrum det som finns i input.
        this.counter.addRow(); //<--Räknar rader +1.
        this.rows.add(input); //<--Lägger till ny rad till arrayn, till texten.
        this.counter.countWords(input); //<--Räknar orden.
    }
    public void showResult() {
        System.out.println("Rows: " + this.counter.getRows());
        System.out.println("Characters: " + this.counter.getChars());
        System.out.println("Words: " + this.counter.getWords());
        System.out.println("Longest word: " + this.counter.getLongestWord());
        for (String row : this.rows) { //<--Skriver ut användarens textrader.
            System.out.println(row);
        }
    }
    public MyCounter getCounter(){ //
        return this.counter;
    }
    public ArrayList<String> getRows(){
        return this.rows;
    }
}

