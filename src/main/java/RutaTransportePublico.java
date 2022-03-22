import java.util.List;

public class RutaTransportePublico extends Ruta{

    RutaTransportePublico(){

        List<String> names = this.getNames();
        names.add("1TP");
        names.add("2TP");
        names.add("3TP");
        names.add("4TP");
    }

    public void generarRuta(String origen, String destino) {
        System.out.println("se ha generado ruta para trayecto transporte publico "  +"\n"+
                "del origen: "+ origen+  " al destino: " + destino);    }

    public boolean validarTipoRuta(TIPO TIPO) {
        return TIPO.name().equals(TIPO.TRANSPORTE.name());
    }
}
