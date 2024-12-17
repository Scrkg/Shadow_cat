package shadow_cat.cerebro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import shadow_cat.cuerpo.Cuerpo;
import shadow_cat.interfaces_visuales.PantallaPrincipal;
import shadow_cat.interfaces_visuales.VentanaCarga;
import shadow_cat.interfaces_visuales.Config;

/**
 * @author oekg
 * @version 0.1
 */
public class Fist implements ActionListener {

    //Variables
    private Cuerpo Estructura;
    private PantallaPrincipal Inicio;
    private Config Config;
    private VentanaCarga Carga = new VentanaCarga();

    private String fotoini = "";

    //Controlador
    public Fist() {
    }

    public Fist(Cuerpo Estructura, PantallaPrincipal Inicio) {
        System.out.println("Control controlador");
        this.Estructura = Estructura;
        this.Inicio = Inicio;

        iniciaEscuchadores();
    }

    private void iniciaEscuchadores() {
        Inicio.addActionListenerConfig(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("evento: " + e.getActionCommand());
        switch (e.getActionCommand()) {
            case "Config":
                Config.setVisible(true);
                System.out.println("hola");
                break;
            default:
                System.out.println("Se ha pulsado algo ???");
        }
    }

    //Metodos
    /**
     * Recoge un string con direccion url y lo pasa a la ventana y la iniciliza
     */
    public void arranque() {

        Carga.setTitle("Cargando Shadow_cat");
        Carga.setResizable(false);
        Carga.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carga.setVisible(false); // Ocultar la ventana de carga
                Carga.dispose();

                // Mostrar otra ventana
                Inicio.setTitle("Shadow_cat");
                Inicio.setVisible(true);
            }
        });

        timer.setRepeats(false); // Solo ejecutar una vez
        timer.start();
    }
}
