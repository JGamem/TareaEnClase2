package umg.principal.grupo1;
import java.util.Scanner;

public class AreaCirculo {

    public AreaCirculo() {}
    public void PedirDatos() {
        System.out.println("Ingrese radio: ");
        Scanner sc = new Scanner(System.in);
        Double radio=sc.nextDouble();
        Double areaC= (Math.PI*(Math.pow(radio,2)));
        System.out.printf("El area de circulo es: %.2f", areaC);
    }
}
