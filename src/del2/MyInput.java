package del2;

/*
   Programmet skall bestå av två klasser:
❖  En klass som läser in text och skriver ut resultatet till användaren
❖  En annan klass som räknar raderna och har koll på antalet tecken
❖  Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
 */

import java.util.Scanner;

public class MyInput {
    private MyCounter counter;//En annan klass som räknar raderna och har koll på antalet tecken

    public MyInput() { //konstruktor
        this.counter = new MyCounter(); //Rows, Characters
    }
    public void processInput() { //Denna funktion läser in texten som användaren skriver.

        String input;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Type a word:");
            input = scan.nextLine();
            if (input.contentEquals("stop")) {
                break;
            }
            this.counter.countChars(input);
            this.counter.addRow();

        }
    }

    public void showResult() {
        System.out.println("Rows: " + this.counter.getRows());
        System.out.println("Characters: " + this.counter.getChars());
    }
}
