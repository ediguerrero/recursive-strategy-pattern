public class Cliente {
    public static void main(String[] args) {
        Navegador navegador = new Navegador(TIPO.VEHICULAR);
        navegador.generarRuta2("calle 11 #22-9", "el centro de medellin");
    }
}
