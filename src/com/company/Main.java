
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Triangle t = new Triangle(2,3);
        Rectangle r = new Rectangle(3, 4);
        Cercle c = new Cercle(3);
        Quadrat q = new Quadrat(2);

        Figura[] f = new Figura[5];
        f[0] = t;
        f[1] = r;
        f[2] = t;
        f[3] = c;
        f[4] = q;

        double suma = GestorFigures.suma(f);
        System.out.println(suma);

        GestorFigures.sort(f);
        for (Figura l: f) {
            System.out.println(l.getClass().getName() + " " + l.area());
        }
    }
}
