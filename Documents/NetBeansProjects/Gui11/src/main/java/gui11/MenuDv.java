package gui11;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MenuDv extends javax.swing.JFrame {

    /**
     * Creates new form MenuDv
     */
    public MenuDv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JCheckBoxMenuItem();
        menuItemGuardar = new javax.swing.JCheckBoxMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JCheckBoxMenuItem();
        menuEdicion = new javax.swing.JMenu();
        Colores = new javax.swing.JMenu();
        menuItemRojo = new javax.swing.JCheckBoxMenuItem();
        menuItemVerde = new javax.swing.JCheckBoxMenuItem();
        menuItemAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);

        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);

        menuEdicion.setText("Edición");

        Colores.setText("Colores");

        menuItemRojo.setText("Rojo");
        menuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRojoActionPerformed(evt);
            }
        });
        Colores.add(menuItemRojo);

        menuItemVerde.setText("Verde");
        menuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerdeActionPerformed(evt);
            }
        });
        Colores.add(menuItemVerde);

        menuItemAzul.setText("Azul");
        menuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAzulActionPerformed(evt);
            }
        });
        Colores.add(menuItemAzul);

        menuEdicion.add(Colores);

        barraMenus.add(menuEdicion);

        menuInsertar.setText("Insertar");
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRojoActionPerformed
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuItemRojoActionPerformed

    private void menuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerdeActionPerformed
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuItemVerdeActionPerformed

    private void menuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAzulActionPerformed
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuItemAzulActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Colores;
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JCheckBoxMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAzul;
    private javax.swing.JCheckBoxMenuItem menuItemGuardar;
    private javax.swing.JCheckBoxMenuItem menuItemRojo;
    private javax.swing.JCheckBoxMenuItem menuItemVerde;
    private javax.swing.JCheckBoxMenuItem menuSalir;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
