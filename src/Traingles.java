import sun.awt.geom.AreaOp;

public class Traingles {

    public static void main(String[] args) {

        int a = 0;
        int b = 90;
        int c = 90;

        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c)
                System.out.println("Equilateral Triangle");

            if (a != b && b != c && c != a)
                System.out.println("Scalene Traingle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right Angled Traingle");

            if ((a == b && b != c) || (c == a && a != b) || (b == c && c != a))
                System.out.println("Isosceles Traingle");
        }
           else
               System.out.println("This is not  a Traingle");

    }
}
