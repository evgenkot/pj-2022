import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        if (y >= 0 && y <= 1 && x > 0 && y > x-1)
            System.out.println("YES");
        else if (y <= 0 && x > 0 && Math.pow(x,2)+Math.pow(y,2) < 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}