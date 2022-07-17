public class Rectangle implements IShape {
    double length, width;
    String color;
    Render renderer;

    public Rectangle(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.length);
    }
    // @Override
    // public void draw(){
    // System.out.println("This is a "+ this.color + "Rectangle");
    // }
    // @Override
    // public void draw(String Message){
    // System.out.println(Message);
    // }
}
