import java.util.List;

public class RutaVehicular extends Ruta {


    RutaVehicular() {

        List<String> names = this.getNames();
        names.add("1v");
        names.add("2v");
        names.add("3v");
        names.add("4v");
    }

    public boolean validarTipoRuta(TIPO TIPO) {
        return TIPO.name().equals(TIPO.VEHICULAR.name());
    }

    public void generarRuta(String origen, String destino) {
        System.out.println("se ha generado la ruta para trayecto vehicular " + "\n" +
                "del origen: " + origen + " al destino: " + destino);
    }
}