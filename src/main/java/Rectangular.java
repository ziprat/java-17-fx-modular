public class Rectangular extends Shape{
    private double width;
    private double height;

    public Rectangular(double width,double height,double x,double y){
        super();
        width=setWidth();
        height=setHeight();
        x=setX();
        y=setY();
    }
    public double computeArea(){
        double Area=this.height*this.width;
        return Area;
    }
    public double computeCircumference(){
        double Circumference=2*(this.height+this.width);
        return Circumference;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
