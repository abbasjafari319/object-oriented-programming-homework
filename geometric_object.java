
package chapter11;

import java.util.Date;

/**
 *
 * @author Mohammad Asif
 */
public abstract class geometric_object {

    
  private  String color="white";
  private  boolean filled;
  private Date created_date;
  
   public geometric_object() {
        created_date= new Date();
    }
   
  public geometric_object(boolean filled, Date created_date) {
      created_date= new Date();
        this.filled = filled;
        this.created_date = created_date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreated_date() {
        return created_date;
    }
    
public String toString(){
    return "created on " + created_date + "\ncolor: " + color + " and filled: " + filled;
}

public abstract double getArea();

public abstract double getPerimeter();
   
    
}
