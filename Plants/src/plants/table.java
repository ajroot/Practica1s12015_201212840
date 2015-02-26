/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import plants.TDA.Lista_Doble;

/**
 *
 * @author Javier
 */
public class table extends javax.swing.JInternalFrame implements Runnable {

    /**
     * Creates new form table
     */
    public table() {
        initComponents();
    }
    picola pila=new picola();
    picola cola=new picola();
    Lista_Doble plantas=new Lista_Doble();
    Lista_Doble zombies=new Lista_Doble();
    Lista_Doble usuarioP=new Lista_Doble();
    Lista_Doble usuarioZ=new Lista_Doble();
    items uplantas=new items();
    items uzombies=new items();
    int cantidadPersonajesPlantas=0;
    int cantidadPersonajesZombies=0;
    public void cargarPaneles()
    {
        crearPaneles();
    }
    
    public void setListas(Lista_Doble plan,Lista_Doble zombie,Lista_Doble up, Lista_Doble uz,items planta,items zombiee)
    {
        this.plantas=plan;
        this.zombies=zombie;
        this.usuarioP=up;
        this.usuarioZ=uz;
        this.uplantas=planta;
        this.uzombies=zombiee;
        this.cantidadPersonajesPlantas=plantas.tamano();
        this.cantidadPersonajesZombies=zombies.tamano();
        cambiarImagen();
                
    }
    
    public void cambiarImagen()
    {
        String path="../imagenes/tableroimg.jpg";
        //System.out.println(path);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(path));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(500,500, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lbltablero1.setIcon(iconoEscalado);
    }
    
    
    public void ponerEnTablero()
    {
        JLabel a=new JLabel();
        a.setText("nuevo");
        a.mouseDrag(null, WIDTH, WIDTH);
        this.add(a);
        a.setBounds(100, 100,25,25);
       
    }
    
    public void crearPaneles()
    {
        pila.setLista(plantas, true,uplantas.cantidad);
        pila.start();
        //pila.cargarPersonajes();
        this.panelPila.removeAll();
        this.panelPila.add(pila);
        this.panelPila.setLayout(null);
        this.panelPila.setLayout(new GridLayout(1,1));
        this.panelPila.updateUI();
        this.pack();
        
        cola.setLista(zombies, false, uzombies.cantidad);
        cola.start();
//cola.cargarPersonajes();
        this.panelCola.removeAll();
        this.panelCola.add(cola);
        this.panelCola.setLayout(null);
        this.panelCola.setLayout(new GridLayout (1,1));
        this.panelCola.updateUI();
        this.pack();
    }
    
    
    
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlantas = new javax.swing.JScrollPane();
        panelPila = new javax.swing.JPanel();
        scrollZombies = new javax.swing.JScrollPane();
        panelCola = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbltablero1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(17, 119, 15));
        setMaximizable(true);
        setResizable(true);
        setTitle("Tablero de Juego");
        setToolTipText("Juega ");
        setVisible(true);

        javax.swing.GroupLayout panelPilaLayout = new javax.swing.GroupLayout(panelPila);
        panelPila.setLayout(panelPilaLayout);
        panelPilaLayout.setHorizontalGroup(
            panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        panelPilaLayout.setVerticalGroup(
            panelPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        scrollPlantas.setViewportView(panelPila);

        javax.swing.GroupLayout panelColaLayout = new javax.swing.GroupLayout(panelCola);
        panelCola.setLayout(panelColaLayout);
        panelColaLayout.setHorizontalGroup(
            panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        panelColaLayout.setVerticalGroup(
            panelColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        scrollZombies.setViewportView(panelCola);

        jButton1.setText("Desapilar Planta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desencolar Zombie");

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltablero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltablero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plants vs Zombies");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollZombies)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(scrollZombies, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pila.desapilar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltablero1;
    private javax.swing.JPanel panelCola;
    private javax.swing.JPanel panelPila;
    private javax.swing.JScrollPane scrollPlantas;
    private javax.swing.JScrollPane scrollZombies;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
