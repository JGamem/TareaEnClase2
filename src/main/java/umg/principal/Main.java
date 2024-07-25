package umg.principal;

import umg.principal.grupo1.AreaCirculo;
import umg.principal.grupo1.CircunferenciaCirculo;
import umg.principal.grupo1.VolumenCubo;
import umg.principal.grupo2.AreaPiramide;
import umg.principal.grupo2.AreaTriangulo;
import umg.principal.grupo2.VolumenPiramide;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Grupo 1
        AreaCirculo areaCirculo = new AreaCirculo();
        areaCirculo.PedirDatos();
        CircunferenciaCirculo circunferenciaCirculo = new CircunferenciaCirculo();
        circunferenciaCirculo.ResultadoCircunferenciaCirculo();
        VolumenCubo volumenCubo = new VolumenCubo();
        volumenCubo.VolumenResultado();

        //Grupo 2
        AreaPiramide areaPiramide = new AreaPiramide();
        areaPiramide.ResultadoAreaPiramide();
        VolumenPiramide volumenPiramide = new VolumenPiramide();
        volumenPiramide.ResultVolumenPiramide();
        AreaTriangulo areaTriangulo =new AreaTriangulo();
        areaTriangulo.ResultAreaTriangulo();
    }
}