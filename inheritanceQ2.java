import java.util.*;

class Rhombus{
    private int verticalDiagonal;
    private int horizontalDiagonal;

    public Rhombus(){
        this.verticalDiagonal = 0;
        this.horizontalDiagonal = 0;
    }
    public Rhombus(int vDiagonal, int hDiagonal){
        this.verticalDiagonal = vDiagonal;
        this.horizontalDiagonal = hDiagonal;
    }

    public void setVerticalDiagonal(int vDiagonal) {
        this.verticalDiagonal = verticalDiagonal;
    }

    public void setHorizontalDiagonal(int hDiagonal) {
        this.horizontalDiagonal = horizontalDiagonal;
    }

    public int getVerticalDiagonal(){
        return this.verticalDiagonal;
    }

    public int getHorizontalDiagonal(){
        return this.horizontalDiagonal;
    }

    public double sideLength(){
        double sideLength = Math.pow(verticalDiagonal, 2) + Math.pow(horizontalDiagonal, 2);
        sideLength = Math.sqrt(sideLength)/2;
        return sideLength;
    }

    public double area(){
        int area = (verticalDiagonal*horizontalDiagonal)/2;
        return area;
    }

    public double perimeter(){
        double perimeter = 4*sideLength();
        return perimeter;
    }

}

class RhombusPrism extends Rhombus{
    int height;

    public RhombusPrism(){
        this.height = 0;
    }
    public RhombusPrism(int h){
        this.height = h;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return this.height;
    }

    public double volume(){
        double volume = super.area()*this.height;
        return volume;
    }

    public double totalArea(){
        double totalArea = super.perimeter()*this.height + 2*super.area();
        return totalArea;
    }

    public String toString(){
        return "The length of the vertical diagonal is: " + super.getVerticalDiagonal() + " the length of the horizontal diagonal is " + super.getHorizontalDiagonal() + " the length of a side is: " + super.sideLength() + " the area is " + super.area() + " the perimeter is: " + super.perimeter() + " the volume is: " + volume() + " and the surface area is " + totalArea();
    }
}

public class inheritanceQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the vertical diagonal: ");
        int vertDiagonal = input.nextInt();
        System.out.println("Enter the length of the horizontal diagonal: ");
        int horiDiagonal = input.nextInt();

        Rhombus r = new Rhombus(vertDiagonal, horiDiagonal);

        System.out.println("Enter the height of the prism: ");
        int height = input.nextInt();

        RhombusPrism rp = new RhombusPrism(height);

    }
}
