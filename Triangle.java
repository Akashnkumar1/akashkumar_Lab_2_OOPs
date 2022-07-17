public class Triangle implements IShape{
    double height, base;
    String color;

    public Triangle(String color, double height, double base){
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
       return (this.height * this.base)/2;
    }

    @Override
    public double calculatePerimeter() {
        return ((this.height * this.base) + Math.sqrt(this.height * this.base)/2);
    }
}
