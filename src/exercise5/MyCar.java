package exercise5;

public class MyCar {
    public static void main(String[] args) {
        //skapa ett nytt objekt myCar av typen Car
        Car myCar = new Car();

        //ändra på myCar genom att sätta färgen till Blue
        myCar.setColor("Blue");

        //(hämta info ifrån myCar i detta fall bilfärgen Blue
        String color = myCar.getColor();

        System.out.println(color);


    }
}
