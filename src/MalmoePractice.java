import java.util.Scanner;

public class MalmoePractice {
    public static void main(String[] args) {

        //32.Skapa ett program där talen 2, 4, 6, ..., 100 skrivs ut.


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 100; i += 2) {
            System.out.print((i + 2) + " ");

        }
    }
}
