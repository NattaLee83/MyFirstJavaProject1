package del2;

/*
   Programmet skall bestå av två klasser:
❖  En klass som läser in text och skriver ut resultatet till användaren
❖  En annan klass som räknar raderna och har koll på antalet tecken
❖  Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MyInput {
    //konstruktor
//Rows, Characters
    private MyCounter counter = new MyCounter();//En annan klass som räknar raderna och har koll på antalet tecken
    private ArrayList<String> rows = new ArrayList<String>();

    public MyInput() {
    }

    public void processInput(String input) { //Denna funktion läser in texten som användaren skriver.


        this.counter.countChars(input);
        this.counter.addRow();
        this.rows.add(input);

    }

    public void showResult() {
        System.out.println("Rows: " + this.counter.getRows());
        System.out.println("Characters: " + this.counter.getChars());
    }

    public MyCounter getCounter(){
        return this.counter;
    }
    public ArrayList<String> getRows(){
        return this.rows;
    }

}

