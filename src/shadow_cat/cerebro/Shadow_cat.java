package shadow_cat.cerebro;

import shadow_cat.interfaces_visuales.PantallaPrincipal;
import shadow_cat.cuerpo.Cuerpo;

import java.io.IOException;

/**
 * @author oekgS
 * @version 0.1
 */
public class Shadow_cat {

    /**
     * Metodo principal
     *
     * @param args argumento del documento
     * @throws IOException clase general de excepciones
     */
    public static void main(String[] args) throws IOException {

        //Seguimiento y depurado de errores
        System.out.println("Hola");

        //Variables
        Cuerpo Estructura = new Cuerpo();
        PantallaPrincipal Inicio = new PantallaPrincipal();
        Fist Cerebro = new Fist(Estructura, Inicio);

        //Metodo
        Cerebro.Arranque();

    }

}
