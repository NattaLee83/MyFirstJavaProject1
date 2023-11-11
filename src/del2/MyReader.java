package del2;

import java.util.Scanner;

public class MyReader {
    public static void main(String[] args) {
        MyInput test = new MyInput();


        String input;
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Type a word:");
            input = scan.nextLine();
            if (input.contentEquals("stop")) {
                break;
            }
            test.processInput(input);


        }



        test.showResult();

    }
}

