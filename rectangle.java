package chapter11;

/**
 *
 * @author Mohammad Asif
 */
public class rectangle extends geometric_object {
int h;
int w;

    public rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }



    @Override
    public double getArea() {
        return  w*h;
    }

    @Override
    public double getPerimeter() {
        
                return 2*w+2*h;
    }
    
    
}
