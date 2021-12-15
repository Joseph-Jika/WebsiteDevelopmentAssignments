import java.util.Scanner;

public class AreaOfShapes{


    public static void main(String[] args){
        Scanner gik = new Scanner(System.in);

        System.out.println("the area will be shown here");

        System.out.println("enter length: ");
        int leng = gik.nextInt();

        System.out.println("enter width: ");
        int wid = gik.nextInt();

        Area calcarea = new Area();

        calcarea.setArea(leng, wid);
        System.out.println("area is "+calcarea.getArea());

    }
}