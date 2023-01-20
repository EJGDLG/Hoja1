/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package radiohojat1;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Mesias
 */
public class Radio extends javax.swing.JFrame {
    /**
     * Creates new form Radio
     */
    RadioF r = new RadioF();
    public Radio() {
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

        jLabel1 = new javax.swing.JLabel();
        numeroemi = new javax.swing.JLabel();
        emiabaja = new javax.swing.JButton();
        emisube = new javax.swing.JButton();
        ON = new javax.swing.JButton();
        OFF = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        amfm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Emisora:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 90, -1, -1));

        numeroemi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numeroemi.setText("--------------");
        getContentPane().add(numeroemi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 133, 59));

        emiabaja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emiabaja.setText("<");
        emiabaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiabajaActionPerformed(evt);
            }
        });
        getContentPane().add(emiabaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 155, -1, -1));

        emisube.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emisube.setText(">");
        emisube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisubeActionPerformed(evt);
            }
        });
        getContentPane().add(emisube, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 155, -1, -1));

        ON.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ON.setText("ON");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });
        getContentPane().add(ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 39, -1, -1));

        OFF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        OFF.setText("OFF");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });
        getContentPane().add(OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 39, -1, -1));

        guardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 173, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 224, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 224, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 224, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 224, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 224, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 224, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 50, 30));

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setText("11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 50, -1));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setText("12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 60, -1));

        amfm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amfm.setText("AM");
        amfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amfmActionPerformed(evt);
            }
        });
        getContentPane().add(amfm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emiabajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiabajaActionPerformed
        boolean subirBajar = false;
        r.cambiarEmisora(subirBajar);
        Double emisora = r.emisoraActual();
        numeroemi.setText(emisora.toString());
    }//GEN-LAST:event_emiabajaActionPerformed

    private void emisubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisubeActionPerformed
        boolean subirBajar = true;
        r.cambiarEmisora(subirBajar);
        Double emisora = r.emisoraActual();
        numeroemi.setText(emisora.toString());
    }//GEN-LAST:event_emisubeActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        Double emisora = r.emisoraActual();
        r.guardarEmisora(emisora);
        
    }//GEN-LAST:event_guardarActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        r.power();
        Double emisora = r.emisoraActual();
        numeroemi.setText(emisora.toString());
        
        
    }//GEN-LAST:event_ONActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        r.power();
        numeroemi.setText("----------");
    }//GEN-LAST:event_OFFActionPerformed

    private void amfm(){
        boolean frecuencia = r.frecuencia();
        if (frecuencia == true){
            amfm.setText("FM");
        }
        if (frecuencia == false){
            amfm.setText("AM");
        }
        Double emisora = r.emisoraActual();
        numeroemi.setText(emisora.toString());
    }
    private void amfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amfmActionPerformed
        amfm();
    }//GEN-LAST:event_amfmActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int posicion = 0 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion = 1 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int posicion = 2 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int posicion = 3 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int posicion = 4 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int posicion = 5 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = 6 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int posicion = 7 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int posicion = 8 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int posicion = 9 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int posicion = 10 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int posicion = 11 ;
        r.cargarEmisoraGuardada(posicion);
        amfm();
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OFF;
    private javax.swing.JButton ON;
    private javax.swing.JButton amfm;
    private javax.swing.JButton emiabaja;
    private javax.swing.JButton emisube;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel numeroemi;
    // End of variables declaration//GEN-END:variables
}