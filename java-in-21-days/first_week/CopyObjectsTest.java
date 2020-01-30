import java.awt.Point;

class CopyObjectsTest {

    public static void main (String args[]) {
        Point pt1, pt2, pt3;
        pt1 = new Point(0,0);
        pt2 = new Point(100, 100);

        System.out.println("Point1: " + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
        // System.out.println("Copy pt1 to pt2");
        // pt2.copy(pt1);
        System.out.println("Point2: " + pt2.x + ", " + pt2.y);
        System.out.println("Clone pt2 to pt3");
        pt3 = (Point) pt2.clone();
        System.out.println("Point3: " + pt3.x + ", " + pt3.y);
        System.out.println("Same object? " + (pt2 == pt3));
    }
}