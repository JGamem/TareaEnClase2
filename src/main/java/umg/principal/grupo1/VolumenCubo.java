package umg.principal.grupo1;

import java.util.Scanner;

public class VolumenCubo {
    public VolumenCubo (){}
    public void VolumenResultado(){
        System.out.println("\n\nIngresa la longitud de un lado del cubo: ");
        Scanner sc = new Scanner(System.in);
        Double lado = sc.nextDouble();
        Double volumen = Math.pow(lado, 3);
        System.out.printf("El volumen del cubo es: %.2f", volumen);
    }
}
