public class Circle extends Shape{
    private double radius=1.0;

    Circle(){
        radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+ getRadius()+", which is a subclass of "+super.toString();
    }
}
