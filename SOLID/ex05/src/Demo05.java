
public class Demo05 {
    static int areaOf(Shape s) {
        return s.area();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(5);
        r.setHeight(4);
        System.out.println(areaOf(r));

        Square s = new Square();
        s.setSide(4);
        System.out.println(areaOf(s));
    }
}
