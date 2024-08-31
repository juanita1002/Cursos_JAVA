import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        double estanque = 70.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de gasolina en el estanque en litros: ");
        double litros = sc.nextDouble();

        String respuesta = litros == estanque ? "El estanque está lleno":
                litros < 70 && litros >=60 ? "Estanque casi lleno":
                litros < 60 && litros >= 40 ? "Estanque  3/4":
                litros < 40 && litros >= 35 ? "Medio Estanque ":
                litros <= 35 && litros >= 20 ? "Suficiente":
                litros < 20 && litros >= 1 ? "Insuficiente": "Estanque vacío";

        System.out.println(respuesta);

    }

}

