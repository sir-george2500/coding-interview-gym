package Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Prototype.Circle{" + super.toString() + ", radius=" + radius + "}";
    }
}