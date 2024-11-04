public class Square extends Rectangle{
    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    /*no need to override getArea or getPerimeter
     since ultimately squares and rectangles use the same rule
     but the width and length of a square are the same */

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }

}
