public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("Red", true);
        System.out.println(shape);
    }
}
