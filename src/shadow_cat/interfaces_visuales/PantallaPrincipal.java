package shadow_cat.interfaces_visuales;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 * @author oekg
 * @version 0.1
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    //Variables
//    private String fotoini;
    private String Title;
    private javax.swing.JLabel txtPaginaIni = new javax.swing.JLabel();

    //Constructor
    public PantallaPrincipal() {
        initComponents();

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/shadow_cat/cuerpo/LOGO-PRINCIPAL.png"));
        Image scaledImage = originalIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        jLabel1.setIcon(scaledIcon); // Asigna la imagen escalada

    }

    //Metodos
    /**
     * Mi propio iniciador de componentes
     */
//    private void iniciarComponetes() {
//        
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        //Foto de la pagina principal, rarrete
////        txtPaginaIni.setIcon(new javax.swing.ImageIcon(getClass().getResource(Fotoini))); // NOI18N
//        //Le he forzado el minimo a la ventana porque si no se queda al minimo al tardar en meter la foto al label
//        setMinimumSize(new java.awt.Dimension(816, 639));
//        getContentPane().add(txtPaginaIni, java.awt.BorderLayout.CENTER);
//
//        pack();
//    }
    public void addActionListenerConfig(ActionListener l) {
        Config.addActionListener(l);
    }


    /*             Basura que no se puede borrar xd            */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Config = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shadow_cat/cuerpo/LOGO-PRINCIPAL.png"))); // NOI18N
        jLabel1.setText("Equipo");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel1.setPreferredSize(new java.awt.Dimension(10, 100));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jScrollBar2, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel2.setText("Jugador1");
        jPanel2.add(jLabel2);

        jLabel3.setText("Jugador2");
        jPanel2.add(jLabel3);

        jLabel4.setText("Jugador3");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Equipo");

        Config.setText("Config");
        jMenu3.add(Config);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Calendario");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Config;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar2;
    // End of variables declaration//GEN-END:variables

}
