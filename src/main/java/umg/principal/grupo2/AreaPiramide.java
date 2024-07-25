package umg.principal.grupo2;

import java.util.Scanner;

public class AreaPiramide {
    public AreaPiramide(){}
    public void ResultadoAreaPiramide() {
        System.out.println("\n\nIngrese la base: ");
        Scanner sc = new Scanner(System.in);
        Double base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        Double altura = sc.nextDouble();
        Double areaPiramide = (base*altura)/2;
        System.out.printf("El area de piramide es: %.2f", areaPiramide);
    }
}
