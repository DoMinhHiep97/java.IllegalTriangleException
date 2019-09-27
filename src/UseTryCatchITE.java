import java.util.Scanner;

public class UseTryCatchITE {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle:");
        double side1=scanner.nextDouble();
        double side2=scanner.nextDouble();
        double side3=scanner.nextDouble();
        if (side1 <0 || side2<0 || side3<0 ){
            throw new IllegalTriangleException("Lỗi nhap canh tam giac la 1 so am"); // sinh ngoai le
        }

        if((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)){
            throw new IllegalTriangleException("Lỗi nhap canh, day khong phai canh tam giac!");
        }

        if((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)    ){
            System.out.println("It's a triangle!");
        }


    }
}
class IllegalTriangleException extends RuntimeException{

    IllegalTriangleException(String msg) {
        super(msg);// goi truc tiep vao bien trong lop cha gan nhat
    }
}
