
/** Write a Java program to create a class called "Rectangle" with width and height attributes.
  Calculate the area and perimeter of the rectangle.
 */
public class Rectangle {
   private float width,height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width=width;
    }
    public float getArea(){//to find the area of rectangle
       return ( height*width)/2;
    }

    public  float getPrimeter(){//to find the primeter of rectangle
        return 2*(height+width);
    }

    public static void main(String[] args) {
        Rectangle r1 =new Rectangle(7,12);
        System.out.println(r1.getArea());
        System.out.println(r1.getPrimeter());
        r1.setHeight(20);
        System.out.println(r1.getPrimeter());
    }


}
