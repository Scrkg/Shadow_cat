package shadow_cat.cerebro;

import shadow_cat.cuerpo.Cuerpo;
import shadow_cat.interfaces_visuales.PantallaPrincipal;

/**
 * @author oekg
 * @version 0.1
 */
public class Fist {

    //Variables
    private Cuerpo Estructura;
    private PantallaPrincipal Inicio;
    private String fotoini = "";

    //Controlador
    public Fist(Cuerpo Estructura, PantallaPrincipal Inicio) {
        System.out.println("Control controlador");
        this.Estructura = Estructura;
        this.Inicio = Inicio;
    }

    //Metodos
    /**
     * Recoge un string con direccion url y lo pasa a la ventana y la iniciliza
     */
    public void Arranque() {
        fotoini = Estructura.ObtenerFotoIni();
        System.out.println("Que esta pasando" + fotoini);
        Inicio.ObtenerFotoIni(fotoini);
        Inicio.setTitle("Shadow_cat");
        Inicio.setVisible(true);
    }

}
