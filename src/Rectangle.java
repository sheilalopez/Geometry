public class Rectangle extends Figura {
    public double l1;
    public double l2;

    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;


        }
    @Override
    public double area(){
        return this.l1 * this.l2; /*holi*/
    }

}
