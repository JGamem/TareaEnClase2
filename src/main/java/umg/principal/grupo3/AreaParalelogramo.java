package umg.principal.grupo3;

import java.util.Scanner;

public class AreaParalelogramo {
    public AreaParalelogramo() {}
    public void ResultAreaParalelogramo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nIngrese la base del Paralelogramo: ");
        Double base = sc.nextDouble();
        System.out.println("Ingrese la altura del Paralelogramo: ");
        Double altura = sc.nextDouble();
        Double area = base * altura;
        System.out.printf("El area del Paralelogramo es: %.2f", area);
    }
}
