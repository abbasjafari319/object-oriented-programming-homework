package chapter_13;

import java.util.Comparator;

public class ComparableRectangle extends rectangle implements Comparator<ComparableRectangle>{
    public ComparableRectangle(double width, double height){
        super(height, width);
    }

    @Override
    public int compare(ComparableRectangle o1, ComparableRectangle o2) {
        if(o1.getArea()>o2.getArea())   return 1;
        else  if(o1.getArea()<o2.getArea())   return -1;
        else return 0;
    }
    
}
