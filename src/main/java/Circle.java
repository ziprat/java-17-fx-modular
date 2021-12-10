public class Circle extends Shape {
    private double radius;

    public Circle (double radius,double x,double y){
        super();
        radius=setRadius();
        x=setX();
        y=setY();
    }


    public double computeArea(){
        double Area=this.radius*this.radius*Math.PI;
        return Area;
    }
    public double computeCircumference(){
        double Circumference=2*Math.PI*this.radius;
        return Circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
