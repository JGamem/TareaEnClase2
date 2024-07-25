package umg.principal.grupo3;

import java.util.Scanner;

public class VolumenPrisma {
    public VolumenPrisma(){}
    public void ResultadoVolumenPrisma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nIngrese el area_base del prisma: ");
        Double areaBase = sc.nextDouble();
        System.out.println("Ingrese la altura del prisma: ");
        Double altura = sc.nextDouble();
        Double volumen = areaBase * altura;
        System.out.printf("El volumen del prisma es: %.2f", volumen);
    }
}
