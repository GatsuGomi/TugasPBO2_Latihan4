/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;
import java.awt.Panel;


public class PenampilGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarButton
     */
    public PenampilGambarButton() {
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

        btnPanel = new javax.swing.JPanel();
        btnDK = new javax.swing.JButton();
        btnSB = new javax.swing.JButton();
        btnSBF = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imgPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDK = new javax.swing.JLabel();
        lblSB = new javax.swing.JLabel();
        lblSBF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penampil Gambar(Button)");

        btnPanel.setBackground(new java.awt.Color(255, 51, 0));
        btnPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnDK.setText("Duck");
        btnDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKActionPerformed(evt);
            }
        });
        btnPanel.add(btnDK);

        btnSB.setText("Shuba");
        btnSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSBActionPerformed(evt);
            }
        });
        btnPanel.add(btnSB);

        btnSBF.setText("S.B.F");
        btnSBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSBFActionPerformed(evt);
            }
        });
        btnPanel.add(btnSBF);

        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnPanel.add(btnExit);

        getContentPane().add(btnPanel, java.awt.BorderLayout.PAGE_START);

        imgPanel.setBackground(new java.awt.Color(255, 255, 255));
        imgPanel.setLayout(new java.awt.CardLayout());
        imgPanel.add(jLabel1, "card5");

        lblDK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/duck.jpg"))); // NOI18N
        lblDK.setName("null"); // NOI18N
        imgPanel.add(lblDK, "0");
        lblDK.getAccessibleContext().setAccessibleName("0");
        lblDK.getAccessibleContext().setAccessibleDescription("null");

        lblSB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shuba.jpg"))); // NOI18N
        lblSB.setName("null"); // NOI18N
        imgPanel.add(lblSB, "1");
        lblSB.getAccessibleContext().setAccessibleName("1");
        lblSB.getAccessibleContext().setAccessibleDescription("null");

        lblSBF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSBF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SBF.jpg"))); // NOI18N
        lblSBF.setName("null"); // NOI18N
        imgPanel.add(lblSBF, "2");
        lblSBF.getAccessibleContext().setAccessibleName("2");
        lblSBF.getAccessibleContext().setAccessibleDescription("null");

        getContentPane().add(imgPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "0");
    }//GEN-LAST:event_btnDKActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSBActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "1");
    }//GEN-LAST:event_btnSBActionPerformed

    private void btnSBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSBFActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imgPanel.getLayout()); 
        cl.show(imgPanel, "2");
    }//GEN-LAST:event_btnSBFActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenampilGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDK;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton btnSB;
    private javax.swing.JButton btnSBF;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDK;
    private javax.swing.JLabel lblSB;
    private javax.swing.JLabel lblSBF;
    // End of variables declaration//GEN-END:variables
}
