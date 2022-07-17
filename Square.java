public class Square extends Rectangle {
    public Square(String color, int side) {
        super(color, side, side);
    }

    // @Override
    public void draw() {
        System.out.println("This is a " + super.color + " Square!!!");
    }

    // @Override
    public void draw(String Message) {
        System.out.println(Message);
    }

    @Override
    public double calculateArea() {
        System.out.println("The Area of a square");
        return this.length * this.width;
    }
}
