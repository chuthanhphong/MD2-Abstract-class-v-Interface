public class Rectangle extends Shape implements Resizeable {
        private  double width = 1.0;
        private  double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double side, double v, String color, boolean filled) {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*this.height;
    }
    public double getPerimeter(){
        return  2*(width + height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        width = width*percent;
        height = height*percent;
    }
}
