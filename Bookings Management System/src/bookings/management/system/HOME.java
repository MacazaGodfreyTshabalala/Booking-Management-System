
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookings.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Tshabalala.M
 */
public class HOME extends javax.swing.JFrame {
    
    public String email;
    public int manage = 0;

    /**
     * Creates new form HOME
     */
    public HOME() {
        initComponents();
        
          btManageBookings.setVisible(true);
        
        //  new ManageVenueBookings().setVisible(true);
        
       /*  ManageVenueBookings whitePanel = new ManageVenueBookings();
         whitePanel.setBounds(300,150,500,350);
         getContentPane().add(whitePanel);
         repaint();
         revalidate();*/
        
    }

    public HOME(String userEmail){
    
        initComponents();
        email = userEmail;
    }
    
    public int ShowManageVenueBooking(int manage)
    {
       int x = manage;
       
       
       ManageVenueBookings bookingFrame = new ManageVenueBookings(this);
        bookingFrame.setVisible(true);
       
         x=0;
       
       
        return x;
    }
    
    
    public void showManageBookingButton()
    {
     
        btManageBookings.setVisible(true);
              
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSignOut = new javax.swing.JButton();
        btManageBookings = new javax.swing.JButton();
        mainPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSignOut.setBackground(new java.awt.Color(0, 153, 255));
        btSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSignOut.setForeground(new java.awt.Color(255, 0, 51));
        btSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btSignOut.setText("Sign Out");
        btSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, 43));

        btManageBookings.setBackground(new java.awt.Color(0, 153, 255));
        btManageBookings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btManageBookings.setForeground(new java.awt.Color(255, 255, 255));
        btManageBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LIST.png"))); // NOI18N
        btManageBookings.setText("Manage Bookings");
        btManageBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageBookingsActionPerformed(evt);
            }
        });
        getContentPane().add(btManageBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 190, 40));

        mainPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BACKGROUND.jpg"))); // NOI18N
        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignOutActionPerformed
        // TODO add your handling code here:
        
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to sign out","Select",JOptionPane.YES_NO_OPTION);
        
        if(a == 0)
        {
            System.exit(0);
        
        }
        
        if(manage==1)
        {
            
            ShowManageVenueBooking(manage);
            
            
        
        }
       
         
         
    }//GEN-LAST:event_btSignOutActionPerformed

    private void btManageBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageBookingsActionPerformed
        // TODO add your handling code here:
        
        
       manage =1;
       
       btManageBookings.setVisible(false);
        
       ShowManageVenueBooking(manage);
       
       //btManageBookings.setVisible(true);
        
        
          
    }//GEN-LAST:event_btManageBookingsActionPerformed

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HOME().setVisible(true);
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btManageBookings;
    private javax.swing.JButton btSignOut;
    private javax.swing.JLabel mainPanel;
    // End of variables declaration//GEN-END:variables
}
