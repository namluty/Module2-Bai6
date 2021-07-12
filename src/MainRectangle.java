public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(9.2, 8.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("Blue", true, 6.8, 7.2);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
