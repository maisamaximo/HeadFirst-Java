package chapter1;

public class MyFirstApp {
    public static void main(String[] args) {

        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();

        System.out.println("I Rule!");
        System.out.println( "The World");

        while(x>10){
            x -= 1;
        }

        for (x = 0; x < 10 ; x = x + 1){
            System.out.println("x is now" + x);
        }

        if (x == 10){
            System.out.print("x must be 10");
        }else{
            System.out.println("x ins't 10");
        }

        if ((x<3) &  (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what!  ");
    }
}
