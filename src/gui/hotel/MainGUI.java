/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.hotel;

import accounts.hotel.Login;
import accounts.hotel.User;
import accounts.hotel.ViewAccountGUI;
import accounts.hotel.WelcomeGUI;
import architecture.hotel.MasterRoomList;
import architecture.hotel.Room;
import billing.hotel.BillingGUI;
import java.util.ArrayList;
import res.hotel.CreateReservationGUI;
import res.hotel.ModifyReservationGUI;
import res.hotel.Reservation;
import res.hotel.RoomSearchGUI;

/**
 *
 * @author Brandon Skrabanek
 */
public class MainGUI extends javax.swing.JFrame {
    private int x, y, xx, yy;
    private final MasterRoomList masterRoom;
    private ArrayList<Room> masterRoomList;
    private final ArrayList<Reservation> masterReservationList;
    private ArrayList<User> masterUserList;
    private final WelcomeGUI welcome = new WelcomeGUI(this);
    private User currentUser;

    public MainGUI() {
        welcome.setVisible(true);
        initComponents();
        masterRoom = new MasterRoomList();
        masterRoomList = new ArrayList<>();
        masterRoomList = masterRoom.getMasterRoomList();
        masterReservationList = new ArrayList<>();
        masterUserList = new ArrayList<>();
        getUserList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userAccountButton = new javax.swing.JButton();
        makeResButton = new javax.swing.JButton();
        modifyResButton = new javax.swing.JButton();
        roomListingButton = new javax.swing.JButton();
        billingButton = new javax.swing.JButton();
        viewModifyLabel = new javax.swing.JLabel();
        createResLabel = new javax.swing.JLabel();
        modifyResLabel = new javax.swing.JLabel();
        closeResLabel = new javax.swing.JLabel();
        viewRoomLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 107, 181));

        userAccountButton.setText("User Account");
        userAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAccountButtonActionPerformed(evt);
            }
        });

        makeResButton.setText("Make Reservation");
        makeResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeResButtonActionPerformed(evt);
            }
        });

        modifyResButton.setText("Modify Reservation");
        modifyResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyResButtonActionPerformed(evt);
            }
        });

        roomListingButton.setText("Room Listing");
        roomListingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomListingButtonActionPerformed(evt);
            }
        });

        billingButton.setText("Billing");
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });

        viewModifyLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        viewModifyLabel.setText("View and Modify Account:");

        createResLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        createResLabel.setText("Create a Reservation:");

        modifyResLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        modifyResLabel.setText("Modify an Existing Reservation:");

        closeResLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        closeResLabel.setText("Close out a Reservation:");

        viewRoomLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        viewRoomLabel.setText("View a Listing of Rooms:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(createResLabel)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifyResButton)
                            .addComponent(makeResButton)
                            .addComponent(roomListingButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modifyResLabel)
                                    .addComponent(viewRoomLabel))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(closeResLabel)
                                .addGap(69, 69, 69)))
                        .addComponent(billingButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(viewModifyLabel)
                        .addGap(62, 62, 62)
                        .addComponent(userAccountButton)))
                .addGap(0, 64, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewModifyLabel)
                    .addComponent(userAccountButton))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeResButton)
                    .addComponent(createResLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyResLabel)
                    .addComponent(modifyResButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewRoomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomListingButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeResLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billingButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brandon Skrabanek\\Documents\\NetBeansProjects\\GoodStaysHotelApp\\images\\exit.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(5, 10, 46));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void getUserList(){
        masterUserList.clear();
        masterUserList = Login.getUsersList();
    }
    
    private void userAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAccountButtonActionPerformed
        ViewAccountGUI account = new ViewAccountGUI(this);
        account.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_userAccountButtonActionPerformed

    private void modifyResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyResButtonActionPerformed
        ModifyReservationGUI res = new ModifyReservationGUI(this);
        res.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifyResButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        xx = evt.getXOnScreen();
        yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void makeResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeResButtonActionPerformed
        CreateReservationGUI res = new CreateReservationGUI(this);
        this.setVisible(false);
        res.setVisible(true);
    }//GEN-LAST:event_makeResButtonActionPerformed

    private void roomListingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomListingButtonActionPerformed
        RoomSearchGUI roomSearch = new RoomSearchGUI(this);
        this.setVisible(false);
        roomSearch.setVisible(true);
    }//GEN-LAST:event_roomListingButtonActionPerformed

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed
        BillingGUI bill = new BillingGUI(this);
        this.setVisible(false);
        bill.setVisible(true);
    }//GEN-LAST:event_billingButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.setVisible(false);
        welcome.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    public ArrayList<Room> getMasterRoomList() {
        return masterRoomList;
    }

    public ArrayList<Reservation> getMasterReservationList() {
        return masterReservationList;
    }

    public ArrayList<User> getMasterUserList() {
        return masterUserList;
    }

    public WelcomeGUI getWelcome() {
        return welcome;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }    

    public User getCurrentUser() {
        return currentUser;
    }
    
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billingButton;
    private javax.swing.JLabel closeResLabel;
    private javax.swing.JLabel createResLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton makeResButton;
    private javax.swing.JButton modifyResButton;
    private javax.swing.JLabel modifyResLabel;
    private javax.swing.JButton roomListingButton;
    private javax.swing.JButton userAccountButton;
    private javax.swing.JLabel viewModifyLabel;
    private javax.swing.JLabel viewRoomLabel;
    // End of variables declaration//GEN-END:variables
}