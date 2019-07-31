package hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        Rectangle rectangle1= new Rectangle(width,height);
        System.out.println(rectangle1.display());
        System.out.println("Dien tich hcn: "+ rectangle1.getArea());
        System.out.println("Chu vi hcn: "+ rectangle1.getPerimeter());
    }
}
