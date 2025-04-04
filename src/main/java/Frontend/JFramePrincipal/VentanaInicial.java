/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend.JFramePrincipal;

import Frontend.FrontendBuscaminas.JframeBuscaminas.VentanaBuscaminas;
import Frontend.FrontendHuntin.VentanaHunting;
import javax.swing.JFrame;

/**
 *
 * @author kenny
 */
public class VentanaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        initComponents();
        this.setTitle("Buscaminas y Hunting ");
        setLocationRelativeTo(null);
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

        PanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btonBuscaminas = new javax.swing.JButton();
        botonHuntin = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelContenedor.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Yrsa SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BUSCAMINAS Y HUNTER ");

        btonBuscaminas.setBackground(new java.awt.Color(0, 153, 255));
        btonBuscaminas.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        btonBuscaminas.setForeground(new java.awt.Color(0, 0, 0));
        btonBuscaminas.setText("BUSCAMINAS");
        btonBuscaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBuscaminasActionPerformed(evt);
            }
        });

        botonHuntin.setBackground(new java.awt.Color(51, 153, 255));
        botonHuntin.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        botonHuntin.setForeground(new java.awt.Color(0, 0, 0));
        botonHuntin.setText("HUNTING");
        botonHuntin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHuntinActionPerformed(evt);
            }
        });

        botonReportes.setBackground(new java.awt.Color(51, 153, 255));
        botonReportes.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        botonReportes.setForeground(new java.awt.Color(0, 0, 0));
        botonReportes.setText("REPORTES");
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(51, 153, 255));
        botonSalir.setFont(new java.awt.Font("Yrsa SemiBold", 0, 24)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonHuntin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addComponent(btonBuscaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btonBuscaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botonHuntin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btonBuscaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBuscaminasActionPerformed
        // TODO add your handling code here:
        VentanaBuscaminas buscaminas = new VentanaBuscaminas();
        buscaminas.setVisible(true);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btonBuscaminasActionPerformed

    private void botonHuntinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHuntinActionPerformed
        // TODO add your handling code here:
        
        VentanaHunting hunting = new VentanaHunting();
        hunting.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_botonHuntinActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        // TODO add your handling code here:
        VentanaReportes reportes = new VentanaReportes();
        reportes.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton botonHuntin;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton btonBuscaminas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
