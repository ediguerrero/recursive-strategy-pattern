import java.util.ArrayList;
import java.util.List;

public class Navegador {

    private final TIPO TIPO;
    private List<Ruta> rutas;


    public Navegador(TIPO TIPO) {
        this.TIPO = TIPO;
        rutas = new ArrayList<Ruta>();
        rutas.add(new RutaPie());
        rutas.add(new RutaTransportePublico());
        rutas.add(new RutaVehicular());
    }

    public Ruta recorrer(int index1, int index2, List<Ruta> rutas) {
        if (rutas.get(index1).validarTipoRuta(TIPO)) {
            if (rutas.get(index1).getNames().size() == index2) {
                System.out.println("sali'o");
            } else {
                System.out.println(rutas.get(index1).getNames().get(index2));
                return recorrer(index1, index2+1, rutas);
            }
            System.out.println(rutas.get(index1).getNames().hashCode());
            return rutas.get(index1);
        } else {
            if (rutas.get(index1).getNames().size() == index2) {
                System.out.println("sali'o");
            } else {
                System.out.println(rutas.get(index1).getNames().get(index2));
                return recorrer(index1, index2+1, rutas);
            }
            System.out.println(rutas.get(index1).getNames().hashCode());
            return recorrer(index1 + 1, 0, rutas);
        }
    }

    public void generarRuta2(String origen, String destino) {
        this.recorrer(0, 0, rutas).generarRuta(origen, destino);
    }


    public void generarRuta(String origen, String destino) {
        for (Ruta ruta : rutas) {
            if (ruta.validarTipoRuta(TIPO)) {
                ruta.generarRuta(origen, destino);
                break;
            }
        }
    }
}
