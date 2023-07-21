import Work3.*;
import work1.Rectangle;
import work1.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        work1();
        work3();

    }

    public static void work1(){
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Площадь прямоугольника: " + rectangle.findArea());
        Square square = new Square(4);
        System.out.println("Площадь квадрата: " + square.findArea());
    }

    public static void work3(){

        CasualMessage casualMessage = new CasualMessage();
        FormalMessage formalMessage = new FormalMessage();
        IntimateMessage intimateMessage = new IntimateMessage();
        Greeter greeter1 = new Greeter(formalMessage);
        System.out.println(greeter1.great());
        Greeter greeter2 = new Greeter(casualMessage);
        System.out.println(greeter2.great());
        Greeter greeter3 = new Greeter(intimateMessage);
        System.out.println(greeter3.great());
    }


}
