package chapter11;

/**
 *
 * @author Mohammad Asif
 */
public class TestGeometricObject {
      public static void main(String[] args) {
          circle c=new circle(12);
          rectangle r=new rectangle(10, 3);
          System.out.println("the area of circle and rectangle is equal ? "+new circle(12).equals(new rectangle(10, 3)));
          
          System.out.println("circle area "+c.getArea());
          System.out.println("rectagle area "+r.getArea());
          
      }
    
}
