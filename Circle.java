public class Circle implements IShape {
    double radius;
    String color;

    final double pi = 3.14;
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return pi*this.radius *this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*this.radius;
    }
}
