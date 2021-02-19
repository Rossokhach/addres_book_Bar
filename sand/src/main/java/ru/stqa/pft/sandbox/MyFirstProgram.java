package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("Oxana");
        hello("user");
        Square s = new Square(5);
        System.out.println("Площаь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторнами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }


}