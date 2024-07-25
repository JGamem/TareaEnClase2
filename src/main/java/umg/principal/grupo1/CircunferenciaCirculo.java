package umg.principal.grupo1;
import java.util.Scanner;

public class CircunferenciaCirculo {
    public CircunferenciaCirculo() {}
    public void ResultadoCircunferenciaCirculo() {
        System.out.println("\n\nIngrese el radio del circulo: ");
        Scanner sc = new Scanner(System.in);
        Double radio = sc.nextDouble();
        Double circunferencia = 2*Math.PI*radio;
        System.out.printf("La circunferencia es: %.2f", circunferencia);
    }

}
