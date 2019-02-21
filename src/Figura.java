public abstract class Figura implements Comparable<Figura> {
    public abstract double area();
    @Override /*para heredar área a otras clases*/
    public int compareTo(Figura f){
        return (int)(this.area() - f.area()); /*el componente Figura tiene este criterio de ordenación*/
    }

}
