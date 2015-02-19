/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Javier
 */
public class objeto extends javax.swing.JPanel {

    /**
     * Creates new form objeto
     */
    public objeto() {
        initComponents();
    }
    int img=1;
    String tipo;
    personaje per=new personaje();
    
    public void setImg(int imagen)
    {
        this.img=imagen;
    }
    
    public void setTipo(String ti)
    {
        this.tipo=ti;
    }
    
    public void setImagen()
    {
        cambiarImagen();
    }
    public void setNombre(String nombre)
    {
        this.lbNombre.setText(nombre);
    }
    
    public void setPersonaje(personaje nuevo)
    {
        this.per=nuevo;
    }
    
    
    
    public void cambiarImagen()
    {
        String path="../imagenes/"+tipo+"/"+String.valueOf(img)+".png";
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(path));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(75,75, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lbImagen.setIcon(iconoEscalado);
    }
    
    public void crear()
    {
        setImg(per.getImagen());
        setTipo(per.getTipo());
        lbNombre.setText(per.getNombre());
        cambiarImagen();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImagen = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

        lbImagen.setText("objeto");

        lbNombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addGap(0, 114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
}
