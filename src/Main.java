public class Main {
    public static void main(String[] args) {

        //test shape class
        Shape s1 = new Shape();
        System.out.println(s1);

        System.out.println("Color: "+s1.getColor());
        System.out.println("filled: "+s1.isFilled());

        System.out.println();//mini divider
        s1.setColor("black");
        s1.setFilled(false);
        System.out.println("Color: "+s1.getColor());
        System.out.println("filled: "+s1.isFilled());

        System.out.println(s1);

        System.out.println();//mini divider

        Shape s2 = new Shape("red",false);
        System.out.println(s2);

        //end of class shape testing


        System.out.println("\n\n\n\n");//divider



        //test class circle

        Circle c1 = new Circle();

        System.out.println("Radius is "+c1.getRadius());
        System.out.println("Area is "+c1.getArea());
        System.out.println("Perimeter is "+c1.getPerimeter());

        System.out.println();//mini divider

        c1.setRadius(5);
        System.out.println("Radius is "+c1.getRadius());
        System.out.println("Area is "+c1.getArea());
        System.out.println("Perimeter is "+c1.getPerimeter());
        System.out.println(c1);

        System.out.println();//mini divider

        Circle c2 = new Circle(4);
        System.out.println(c2);

        System.out.println();//mini divider

        Circle c3 = new Circle(7,"blue",false);
        System.out.println(c3);

        //end of class Circle testing


        System.out.println("\n\n\n\n");//divider


        //test class Rectangle

        Rectangle r1 = new Rectangle();

        System.out.println("Width: "+r1.getWidth());
        System.out.println("Length: "+r1.getLength());
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());

        System.out.println();//mini divider

        r1.setWidth(2);
        r1.setLength(5);
        System.out.println("Width: "+r1.getWidth());
        System.out.println("Length: "+r1.getLength());
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println(r1);

        System.out.println();//mini divider

        Rectangle r2 = new Rectangle(3,4);
        System.out.println(r2);

        System.out.println();//mini divider

        Rectangle r3 = new Rectangle(7,5,"lime",false);
        System.out.println(r3);

        //end class Rectangle testing


        System.out.println("\n\n\n\n");//divider


        //test class Square

        Square sq1 = new Square();

        System.out.println("Side: "+sq1.getSide());
        System.out.println("Area: "+sq1.getArea());
        System.out.println("Perimeter: "+sq1.getPerimeter());

        System.out.println();//mini divider

        /*no need to override getArea or getPerimeter
        since ultimately squares and rectangles use the same rule
        but the width and length of a square are the same.
        my constructors and setSide take care of keeping them equal*/

        sq1.setSide(4);
        System.out.println("Side: "+sq1.getSide());
        System.out.println("Area: "+sq1.getArea());
        System.out.println("Perimeter: "+sq1.getPerimeter());
        System.out.println(sq1);

        System.out.println();//mini divider

        Square sq2 = new Square(5);
        System.out.println(sq2);

        System.out.println();//mini divider

        Square sq3 = new Square(5,"cyan",false);
        System.out.println(sq3);

    }
}