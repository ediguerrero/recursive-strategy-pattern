import java.util.List;

public class RutaPie extends Ruta {


    RutaPie() {

        List<String> names = this.getNames();
        names.add("1P");
        names.add("2P");
        names.add("3P");
        names.add("4P");
    }
    public void generarRuta(String origen, String destino) {
        System.out.println("se ha generado la ruta para trayecto a pie "  +"\n"+
                "del origen: "+ origen+  " al destino: " + destino);
    }

    public boolean validarTipoRuta(TIPO TIPO) {
        return TIPO.name().equals(TIPO.PIE.name());
    }
}
