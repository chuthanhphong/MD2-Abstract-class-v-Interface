package Shape;

public class Rectangle extends Shape {
    private  double width = 1.0;
    private  double leight = 1.0;

    public Rectangle(double side, double v, String color, boolean filled) {
    }

    public Rectangle(double width, double leight) {
        this.width = width;
        this.leight = leight;
    }

    public Rectangle(String color, boolean filled, double width, double leight) {
        super(color, filled);
        this.width = width;
        this.leight = leight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLeight() {
        return leight;
    }

    public void setLeight(double leight) {
        this.leight = leight;
    }
    public double getArea(){
        return width*this.leight;
    }
    public double getPerimeter(){
            return 2 * (width + this.leight);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
