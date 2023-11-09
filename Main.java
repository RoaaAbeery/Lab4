// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(3);
        System.out.println("Area of a Circle: "+ c.calculateArea());
        System.out.println("Circumference of a Circle: "+ c.calculateCircumference());
        Rectangle r=new Rectangle(4,3);
        System.out.println("Area of a Rectangle: "+r.calculateArea());
        System.out.println("Circumference of a Rectangle: "+r.calculateCircumference());
         Triangle t=new Triangle(4.0,4.0);
        System.out.println("Area of a Triangle: "+t.calculateArea());
        System.out.println("Circumference of a Triangle: "+t.calculateCircumference());

    }

}