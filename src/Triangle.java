public class Triangle extends Figura {
    public double h;
    public double b;


    public Triangle(double b,double h){
        this.b = b;
        this.h = h;
    }
    @Override
    public double area(){
        return (this.b * this.h) / 2;
    }
}
