/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class selJugador extends javax.swing.JFrame {

 
    public selJugador() {
        initComponents();
        Plantas.plantas(true);
        Zombies.plantas(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Jugar como Plantas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));

        jButton2.setText("Jugar Como Zombies");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, -1));

        jButton3.setText("Iniciar Juego");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 227, -1, -1));

        jButton4.setText("Eliminar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 227, -1, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Plantas vs Zombies");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pvszfondo.jpg"))); // NOI18N
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        items Plantas=new items();
        items Zombies=new items();
        boolean Ingreso1=false;
        boolean Ingreso2=false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Ingreso1=true;
        Plantas.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Ingreso2=true;
        Zombies.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Plantas.limpiar();
        Zombies.limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed
//creacionPersonajes plants=new creacionPersonajes();
//creacionPersonajes zoombies=new creacionPersonajes();
CrearTodo crearper=new CrearTodo();

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean Error=false;
        if(Ingreso1==true&&Ingreso2==true)
        {
        if(Plantas.nombreJugador.equals("")||Plantas.cantidad==0)
        {
            JOptionPane.showMessageDialog(null,"Faltan datos del Jugador PLANTAS", "Error",JOptionPane.ERROR_MESSAGE);
            Error=true;
        }
        if(Zombies.nombreJugador.equals("")||Zombies.cantidad==0)
        {
            JOptionPane.showMessageDialog(null,"Faltan datos del Jugador Zombies", "Error",JOptionPane.ERROR_MESSAGE);
            Error=true;
        }
        if(Error!=true)
        {
            /*plants.setNombres(Plantas.nombreJugador,"Plantas");
            plants.setVisible(true);
            zoombies.setNombres(Zombies.nombreJugador,"Zombies");
            zoombies.setVisible(true);*/
            crearper.cargar(Plantas.nombreJugador,Zombies.nombreJugador);
            crearper.setListaJugadores(Plantas.getLista(),Zombies.getLista(),Plantas,Zombies);
            //System.out.println(Plantas.nombreJugador+","+Plantas.cantidad);
            crearper.show();
            this.dispose();
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Debe crear sus Jugadores", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
