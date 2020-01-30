import java.awt.Point;

class ClassOfObjectTest {

    public static void main (String args[]) {
        Point pt = new Point(10, 10);
        System.out.println("foo" instanceof String);
        System.out.println(pt instanceof String);
    }
}