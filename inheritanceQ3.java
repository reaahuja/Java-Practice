import java.util.*;

class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area(){
        int area = length*width;
        return area;
    }

    public int perimeter(){
        int perimeter = (2*length) + (2*width);
        return perimeter;
    }

    public boolean isSquare(){
        if (length == width){
            return true;
        }else{
            return false;
        }
    }
}

class RectangularPrism extends Rectangle{
    int height;
    public RectangularPrism(){
        this.height = 0;
    }

    public RectangularPrism(int h){
        this.height = h;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int volume(){
        int volume = super.getWidth()*super.getLength()*this.height;
        return volume;
    }

    public int surfaceArea(){
        int surfaceArea = 2*((super.getWidth()*super.getLength()) + (this.height*super.getLength()) + (this.height*super.getWidth()));
        return surfaceArea;
    }


}
public class inheritanceQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length");
        int length = input.nextInt();
        System.out.println("Enter the width");
        int width = input.nextInt();

        Rectangle r = new Rectangle(length, width);

        System.out.println("Enter the height of the prism: ");
        int height = input.nextInt();

        RectangularPrism rp = new RectangularPrism(height);

    }
}
