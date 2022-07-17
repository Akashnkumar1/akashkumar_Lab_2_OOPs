public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Baby Pupel", 12, 24);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());
        rect.renderer.draw();
        rect.renderer.draw("It's Rectangle Dude!");

        Square sqr = new Square("Grey", 75);
        System.out.println(sqr.calculateArea());
        System.out.println(sqr.calculatePerimeter());
        sqr.renderer.draw();
        sqr.renderer.draw("It's Square Dude!!!");

    }
}
