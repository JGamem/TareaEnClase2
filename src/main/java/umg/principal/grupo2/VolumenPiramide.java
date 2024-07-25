package umg.principal.grupo2;

import java.util.Scanner;

public class VolumenPiramide {
    public VolumenPiramide() {}
    public void ResultVolumenPiramide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nIngrese la base: ");
        Double base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        Double altura = sc.nextDouble();
        Double areaPiramide = (base*altura)/3;
        System.out.printf("El area de piramide es: %.2f", areaPiramide);
    }
}
