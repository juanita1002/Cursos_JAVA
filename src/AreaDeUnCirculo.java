import java.util.Scanner;

public class AreaDeUnCirculo {
    public static void main(String[] args) {
        double area;
        double PI= Math.PI;
        double radio = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir radio de circulo");
        radio = sc.nextDouble();

        area = PI * Math.pow(radio,2);
        System.out.println("area = " + area);
    }
}
