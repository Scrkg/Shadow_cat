package shadow_cat.interfaces_visuales;

/**
 *
 * @author Sckg
 */
public class VentanaCarga extends javax.swing.JFrame {

    private javax.swing.JLabel jEtiquetaFoto = new javax.swing.JLabel();
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JLabel jEtiquetaIniciando = new javax.swing.JLabel();

    //Constructor
    public VentanaCarga() {
        iniComponentes();
        System.out.println("hola?");
    }

    private void iniComponentes() {

        jEtiquetaFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jEtiquetaIniciando = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(600, 250));
        setMaximumSize(new java.awt.Dimension(600, 250));
//        setPreferredSize(new java.awt.Dimension(600, 250));

//        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        jEtiquetaFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEtiquetaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shadow_cat/cuerpo/ImagenCarga.png"))); // NOI18N
        jEtiquetaFoto.setMaximumSize(new java.awt.Dimension(300, 150));
        jEtiquetaFoto.setMinimumSize(new java.awt.Dimension(300, 150));
        jEtiquetaFoto.setPreferredSize(new java.awt.Dimension(300, 150));
        add(jEtiquetaFoto, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jEtiquetaIniciando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jEtiquetaIniciando.setText("Iniciando...");
        jEtiquetaIniciando.setToolTipText("");
        jPanel1.add(jEtiquetaIniciando, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>                        


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
