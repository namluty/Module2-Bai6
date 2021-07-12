public class Circle extends Shape{
    private Double radius = 1.0;

    public Circle (){
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getArea (){
        return radius * radius * Math.PI;
    }
    public Double getPerimeter (){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
