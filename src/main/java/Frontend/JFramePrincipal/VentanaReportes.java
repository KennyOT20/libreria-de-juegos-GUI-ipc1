/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend.JFramePrincipal;

import javax.swing.JFrame;

/**
 *
 * @author kenny
 */
public class VentanaReportes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaReportes
     */
    public VentanaReportes() {
        initComponents();
        this.setTitle("Reportes");
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelReporteBuscaminasç = new javax.swing.JPanel();
        panelTituloBuscaminas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelVolverMenu = new javax.swing.JPanel();
        volverAlMenu = new javax.swing.JButton();
        panelReporteHuntin = new javax.swing.JPanel();
        panelTituloHuntin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonEliminarDatos = new javax.swing.JPanel();
        botonBorrarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yrsa SemiBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTES");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelReporteBuscaminasç.setBackground(new java.awt.Color(102, 102, 255));
        panelReporteBuscaminasç.setForeground(new java.awt.Color(102, 204, 255));

        panelTituloBuscaminas.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reportes de Buscaminas");

        javax.swing.GroupLayout panelTituloBuscaminasLayout = new javax.swing.GroupLayout(panelTituloBuscaminas);
        panelTituloBuscaminas.setLayout(panelTituloBuscaminasLayout);
        panelTituloBuscaminasLayout.setHorizontalGroup(
            panelTituloBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        panelTituloBuscaminasLayout.setVerticalGroup(
            panelTituloBuscaminasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        volverAlMenu.setBackground(new java.awt.Color(255, 51, 102));
        volverAlMenu.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        volverAlMenu.setForeground(new java.awt.Color(0, 0, 0));
        volverAlMenu.setText("Volver al menu");
        volverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVolverMenuLayout = new javax.swing.GroupLayout(panelVolverMenu);
        panelVolverMenu.setLayout(panelVolverMenuLayout);
        panelVolverMenuLayout.setHorizontalGroup(
            panelVolverMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverAlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVolverMenuLayout.setVerticalGroup(
            panelVolverMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverAlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelReporteBuscaminasçLayout = new javax.swing.GroupLayout(panelReporteBuscaminasç);
        panelReporteBuscaminasç.setLayout(panelReporteBuscaminasçLayout);
        panelReporteBuscaminasçLayout.setHorizontalGroup(
            panelReporteBuscaminasçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTituloBuscaminas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelReporteBuscaminasçLayout.setVerticalGroup(
            panelReporteBuscaminasçLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteBuscaminasçLayout.createSequentialGroup()
                .addComponent(panelTituloBuscaminas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelReporteHuntin.setBackground(new java.awt.Color(255, 204, 102));

        panelTituloHuntin.setBackground(new java.awt.Color(255, 102, 102));
        panelTituloHuntin.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reportes de Hunting");

        javax.swing.GroupLayout panelTituloHuntinLayout = new javax.swing.GroupLayout(panelTituloHuntin);
        panelTituloHuntin.setLayout(panelTituloHuntinLayout);
        panelTituloHuntinLayout.setHorizontalGroup(
            panelTituloHuntinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        panelTituloHuntinLayout.setVerticalGroup(
            panelTituloHuntinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        botonBorrarDatos.setBackground(new java.awt.Color(255, 51, 204));
        botonBorrarDatos.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        botonBorrarDatos.setForeground(new java.awt.Color(0, 0, 0));
        botonBorrarDatos.setText("Borrar reportes");

        javax.swing.GroupLayout botonEliminarDatosLayout = new javax.swing.GroupLayout(botonEliminarDatos);
        botonEliminarDatos.setLayout(botonEliminarDatosLayout);
        botonEliminarDatosLayout.setHorizontalGroup(
            botonEliminarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonBorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonEliminarDatosLayout.setVerticalGroup(
            botonEliminarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonBorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelReporteHuntinLayout = new javax.swing.GroupLayout(panelReporteHuntin);
        panelReporteHuntin.setLayout(panelReporteHuntinLayout);
        panelReporteHuntinLayout.setHorizontalGroup(
            panelReporteHuntinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTituloHuntin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonEliminarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelReporteHuntinLayout.setVerticalGroup(
            panelReporteHuntinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReporteHuntinLayout.createSequentialGroup()
                .addComponent(panelTituloHuntin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelReporteBuscaminasç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelReporteHuntin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelReporteBuscaminasç, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReporteHuntin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuActionPerformed
        // TODO add your handling code here:
        VentanaInicial ventanaInicial = new VentanaInicial();
        ventanaInicial.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarDatos;
    private javax.swing.JPanel botonEliminarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelReporteBuscaminasç;
    private javax.swing.JPanel panelReporteHuntin;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTituloBuscaminas;
    private javax.swing.JPanel panelTituloHuntin;
    private javax.swing.JPanel panelVolverMenu;
    private javax.swing.JButton volverAlMenu;
    // End of variables declaration//GEN-END:variables
}
