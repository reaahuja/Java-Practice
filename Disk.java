import java.util.*;

class Disk {
    double thickness;
    double radius;

    public Disk(){
        thickness = 0;
        radius = 0;
    }

    public Disk(double rad, double thick){
        radius = rad;
        thickness = thick;
    }

}

class Puck extends Disk{
    double weight;
    boolean standard;
    boolean youth;

    public Puck(){
        weight = 0;
        standard = false;
        youth = false;
    }

    public Puck(double pW){
        weight = pW;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getDivison(){
        if (this.weight >= 5 && this.weight <= 5.5){
            return "This is a standard puck";
        }else if (this.weight >= 4 && this.weight <= 4.5){
            return "This is a youth puck";
        }else{
            return "This is an invalid weight";
        }
    }
    @Override
    public String toString(){
        return "The weight of the puck is: " + getWeight();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the thickness of the disk");
        double diskThickness = input.nextInt();

        System.out.println("Enter the radius of the disk");
        double diskRadius = input.nextInt();

        Disk d = new Disk(diskRadius, diskThickness);

        System.out.println("Enter the weight of the puck");
        double puckWeight = input.nextInt();

        Puck puck = new Puck(puckWeight);

        Disk pu = new Puck(puckWeight);

        System.out.println(puck.getDivison());
        System.out.println(pu.toString());
    }
}
