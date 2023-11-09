public class Triangle extends Shap{
    private double height;
    private double base;
    @Override
    public double calculateArea() {
        return  (base*height)/2;
    }

    @Override
    public double calculateCircumference() {
        return 3*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
}
