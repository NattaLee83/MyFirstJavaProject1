package inlamingsuppgiftDel2;

import java.util.Scanner;

public class Del2 {

    public static void main(String[] args) {
        //Skriv ett program som läser in text ifrån kommandoraden
        // rad för rad tills användaren skriver ordet stop.
        Scanner scan = new Scanner(System.in);
        int chars = 0;
        int rows = 0;
        while(true) {
            System.out.println("Type a word:");
            String input = scan.nextLine();
            if(input.matches("stop")) {
                break;
            }

            chars += input.length();
            rows++;
        }
        System.out.println("Chars: " + chars);
        System.out.println("Lines: " + rows);
        //❖ När användaren är klar skriver programmet ut antal tecken
        // och hur många rader som användaren har skrivit, exklusive raden med ordet stop




    }

}
