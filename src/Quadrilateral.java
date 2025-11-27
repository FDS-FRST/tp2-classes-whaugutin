public class Quadrilateral {
    private double width;
    private double length;

    // Constructors
    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Quadrilateral() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return (2 * (length + width));
    }


}
