import java.util.Scanner;

public class Main {
    public static void main(String[] arrgs){
        System.out.println("Введите x");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("Введите y");
        double y = in.nextDouble();
        if(IsPointlnSquare(x,y))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean IsPointlnSquare(double x, double y){
        return (Math.abs(x) + Math.abs(y)) <= 1;
    }
}
