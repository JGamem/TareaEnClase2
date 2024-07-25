package umg.principal.grupo2;

import java.util.Scanner;

public class AreaTriangulo {
    public AreaTriangulo(){}
    public void ResultAreaTriangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nIngrese la altura del triangulo: ");
        Double altura = sc.nextDouble();
        System.out.println("Ingrese la base del triangulo: ");
        Double base = sc.nextDouble();
        Double areaTriangulo = (base*altura)/2;
        System.out.printf("El area del triangulo es: %.2f" + areaTriangulo);
    }
}
