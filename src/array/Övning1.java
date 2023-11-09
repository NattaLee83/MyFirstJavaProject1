package array;

public class Övning1 {
    public static void main(String[] args) {
        //String [] names= {"Zoran", "Natalie", "Nova", "Mila", "Elise"};

        String[] names = new String[5];

        names[0] = "Zoran";
        names[1] = "Natalie";
        names[2] = "Nova";
        names[3] = "Mila";
        names[4] = "Elise";

        for(int i = 0; i< names.length;i++) {
            System.out.println(names[i]);
        }

        String myString = "hej på dig";
        String [] stringArray = myString.split(" ");

        for(int i = 0; i< stringArray.length;i++){
            System.out.println(stringArray[i]);
        }




    }
}
