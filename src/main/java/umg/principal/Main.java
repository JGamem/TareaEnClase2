package umg.principal;

import umg.principal.grupo1.AreaCirculo;
import umg.principal.grupo1.CircunferenciaCirculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Grupo 1
        AreaCirculo areaCirculo = new AreaCirculo();
        areaCirculo.PedirDatos();
        CircunferenciaCirculo circunferenciaCirculo = new CircunferenciaCirculo();
        circunferenciaCirculo.ResultadoCircunferenciaCirculo();
    }
}