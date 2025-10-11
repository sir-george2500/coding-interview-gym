package Prototype;

// Step 2: Create an abstract class that implements the Prototype.Prototype interface
abstract class Shape implements Prototype {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    // Copy constructor
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // Common setters
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setColor(String color) { this.color = color; }

    public abstract Prototype clone();

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", color=" + color;
    }
}

