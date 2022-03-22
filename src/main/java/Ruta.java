import java.util.ArrayList;
import java.util.List;

public abstract class Ruta {
    private List<String> names ;
    Ruta(){
        names = new ArrayList<String>();

    }

    public List<String> getNames(){
        return names;
    }

    public abstract void generarRuta(String origen, String destino);
    public abstract boolean validarTipoRuta(TIPO TIPO);
}
