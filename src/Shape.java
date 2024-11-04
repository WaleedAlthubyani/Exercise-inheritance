public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        color="green";
        filled=true;
    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "+getColor()+" and "+((isFilled()) ? "filled":"not filled");
    }
}
