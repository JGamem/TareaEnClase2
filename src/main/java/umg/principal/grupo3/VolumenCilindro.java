package umg.principal.grupo3;

import java.util.Scanner;

public class VolumenCilindro {
    public VolumenCilindro() {}
    public void ResVolumenCilindro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nIngrese el radio: ");
        Double radio = scanner.nextDouble();
        System.out.println("Ingrese la altura: ");
        Double altura = scanner.nextDouble();
        Double volumenCilindro = (Math.PI*(Math.pow(radio,2))*altura);
        System.out.printf("El volumen Cilindro es: %.2f", volumenCilindro);
    }
}
