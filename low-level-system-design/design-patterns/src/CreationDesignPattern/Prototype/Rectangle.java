package CreationDesignPattern.Prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "CreationDesignPattern.Prototype.Rectangle{" + super.toString() + ", width=" + width + ", height=" + height + "}";
    }
}
