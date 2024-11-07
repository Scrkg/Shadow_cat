package shadow_cat.interfaces_visuales;

/**@author oekg
 * @version 0.1*/
public class PantallaPrincipal extends javax.swing.JFrame {

    //Variables
//    private String fotoini;
    private String Title;
    private javax.swing.JLabel txtPaginaIni;
    
    //Constructor
    public PantallaPrincipal() {
        IniciarComponetes();
        Title="Shadow_cat";
    }
    
    //Metodos
    /**Mi propio iniciador de componentes*/
    private void IniciarComponetes(){
        txtPaginaIni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Foto de la pagina principal, rarrete
//        txtPaginaIni.setIcon(new javax.swing.ImageIcon(getClass().getResource(Fotoini))); // NOI18N
        //Le he forzado el minimo a la ventana porque si no se queda al minimo al tardar en meter la foto al label
        setMinimumSize(new java.awt.Dimension(816, 639));
        getContentPane().add(txtPaginaIni, java.awt.BorderLayout.CENTER);

        pack();
    }
    
    public void ObtenerFotoIni(String fotoini) {
        //Foto de la pagina principal
        txtPaginaIni.setIcon(new javax.swing.ImageIcon(getClass().getResource(fotoini))); // NOI18N

    }
    
    /*             Basura que no se puede borrar xd            */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 
}
