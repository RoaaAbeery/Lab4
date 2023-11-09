public class Circle extends Shap{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    public double calculateCircumference() {
        return 2*3.14*radius;
    }
}
