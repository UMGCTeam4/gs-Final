/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package res.hotel;

import architecture.hotel.Room;
import enums.hotel.PetFriendly;
import enums.hotel.Smoking;
import gui.hotel.MainGUI;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Skrabanek
 */
public class ModifyReservationGUI extends javax.swing.JFrame {

    private int x, y, xx, yy;
    private MainGUI main;
    private Reservation res;
    private Smoking smoke;
    private PetFriendly pet;

    /**
     * Creates new form ModifyReservationGUI
     */
    public ModifyReservationGUI(MainGUI main) {
        this.main = main;
        initComponents();
        fillComboBoxes();
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
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        searchResLabel = new javax.swing.JLabel();
        byRoomLAbel = new javax.swing.JLabel();
        byNameLabel = new javax.swing.JLabel();
        byNameBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        numOfGuestLabel = new javax.swing.JLabel();
        numOfGuestsField = new javax.swing.JTextField();
        smokePrefLabel = new javax.swing.JLabel();
        smokePrefBox = new javax.swing.JComboBox<>();
        petsLabel = new javax.swing.JLabel();
        petsBox = new javax.swing.JComboBox<>();
        lengthStayLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        toLabel = new javax.swing.JLabel();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        roomLabel = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        searchRoomButton = new javax.swing.JButton();
        commitChangesButton = new javax.swing.JButton();
        byRoomBox = new javax.swing.JComboBox<>();
        byRoomButton = new javax.swing.JButton();
        byNameButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(1, 107, 181));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setText("Modify Reservation");

        searchResLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        searchResLabel.setText("Search for Reservation:");

        byRoomLAbel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        byRoomLAbel.setText("By Room #:");

        byNameLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        byNameLabel.setText("By Name:");

        byNameBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        firstNameLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        firstNameLabel.setText("First Name:");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lastNameLabel.setText("Last Name:");

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        numOfGuestLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        numOfGuestLabel.setText("Number of Guests:");

        smokePrefLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        smokePrefLabel.setText("Smoking Preference:");

        smokePrefBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        petsLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        petsLabel.setText("Pets:");

        petsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lengthStayLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lengthStayLabel.setText("Length of Stay:");

        fromLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        fromLabel.setText("From:");

        toLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        toLabel.setText("To:");

        roomLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        roomLabel.setText("Room:");

        searchRoomButton.setText("Modify Room");
        searchRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRoomButtonActionPerformed(evt);
            }
        });

        commitChangesButton.setText("Commit Changes");
        commitChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitChangesButtonActionPerformed(evt);
            }
        });

        byRoomBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        byRoomButton.setText("Select");
        byRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byRoomButtonActionPerformed(evt);
            }
        });

        byNameButton.setText("Select");
        byNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthStayLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(fromLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lastNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(toLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchResLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(byNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(byNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(byNameButton))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(byRoomLAbel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(byRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(byRoomButton))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numOfGuestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOfGuestsField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(smokePrefLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(smokePrefBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(petsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(petsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchRoomButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(commitChangesButton)
                        .addGap(18, 18, 18)
                        .addComponent(backButton)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchResLabel)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(byRoomLAbel)
                    .addComponent(byRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byRoomButton))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(byNameLabel)
                    .addComponent(byNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(byNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOfGuestsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfGuestLabel))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokePrefLabel)
                    .addComponent(smokePrefBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petsLabel)
                    .addComponent(petsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lengthStayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel)
                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomLabel)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchRoomButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commitChangesButton)
                    .addComponent(backButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brandon Skrabanek\\Documents\\NetBeansProjects\\GoodStaysHotelApp\\images\\exit.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(5, 10, 46));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBoxes() {
        byRoomBox.removeAllItems();
        byNameBox.removeAllItems();
        smokePrefBox.removeAllItems();
        petsBox.removeAllItems();
        for (Reservation r : main.getMasterReservationList()) {
            byRoomBox.addItem(r.getRoom().getRoomNumber());
            byNameBox.addItem(r.getBoxName());
        }
        smokePrefBox.addItem(String.valueOf(Smoking.SMOKING));
        smokePrefBox.addItem(String.valueOf(Smoking.NONSMOKING));
        petsBox.addItem(String.valueOf(PetFriendly.YES));
        petsBox.addItem(String.valueOf(PetFriendly.NO));
    }

    public void setRoomField(String value) {
        roomField.setText(value);
    }

    private void fillReservation() {
        firstNameField.setText(res.getFirstName());
        lastNameField.setText(res.getLastName());
        numOfGuestsField.setText(String.valueOf(res.getNumOfGuests()));
        smokePrefBox.setSelectedItem(String.valueOf(res.getSmoke()));
        petsBox.setSelectedItem(String.valueOf(res.getPet()));
        fromDateChooser.setDate(res.getStayStart());
        toDateChooser.setDate(res.getStayEnd());
        roomField.setText(res.getRoom().getRoomNumber());
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        numOfGuestsField.setText("");
        fromDateChooser.setDate(null);
        toDateChooser.setDate(null);
        roomField.setText("");
    }

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void searchRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRoomButtonActionPerformed
        String smokeStr = null, petStr = null;

        smokeStr = smokePrefBox.getItemAt(smokePrefBox.getSelectedIndex());
        smoke = getSmokingType(smokeStr);
        petStr = petsBox.getItemAt(petsBox.getSelectedIndex());
        pet = getPetType(petStr);

        this.setVisible(false);
        RoomSearchGUI search = new RoomSearchGUI(main, this, smoke, pet);
        search.setVisible(true);
    }//GEN-LAST:event_searchRoomButtonActionPerformed

    private void byRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byRoomButtonActionPerformed
        String roomNum = byRoomBox.getItemAt(byRoomBox.getSelectedIndex());
        for (Reservation r : main.getMasterReservationList()) {
            if (r.getRoom().getRoomNumber().equals(roomNum)) {
                res = r;
            }
        }
        fillReservation();
    }//GEN-LAST:event_byRoomButtonActionPerformed

    private void byNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byNameButtonActionPerformed
        String name = byNameBox.getItemAt(byNameBox.getSelectedIndex());

        for (Reservation r : main.getMasterReservationList()) {
            if (r.getBoxName().equals(name)) {
                res = r;
            }
        }
        fillReservation();
    }//GEN-LAST:event_byNameButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.setVisible(false);
        main.getWelcome().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void commitChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitChangesButtonActionPerformed
        String first = "", last = "", smoke = "", pet = "", roomNum = "";
        int numOfGuests = 0;
        Date start = null, end = null;
        Room room = null;

        try {
            first = firstNameField.getText();
            last = lastNameField.getText();
            numOfGuests = Integer.parseInt(numOfGuestsField.getText());
            if (numOfGuests > 5) {
                JOptionPane.showMessageDialog(null, "5 is the maximum number of guests per reservation."
                        + " If there are more than 5 in a party, please create"
                        + " an additional reservation.");
                return;
            } else if (numOfGuests == 0) {
                JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for "
                        + "number of guests.");
                return;
            }
            start = fromDateChooser.getDate();
            end = toDateChooser.getDate();
            if (start.after(end)) {
                JOptionPane.showMessageDialog(null, "Please choose a ending date that is after"
                        + " the start date.");
                return;
            }

            roomNum = roomField.getText();
            smoke = smokePrefBox.getItemAt(smokePrefBox.getSelectedIndex());
            pet = petsBox.getItemAt(petsBox.getSelectedIndex());

            // Get Room
            for (Room r : main.getMasterRoomList()) {
                if (r.getRoomNumber().equals(roomNum)) {
                    room = r;
                }
            }

            //Remove reservation from MasterReservationList            
            for (int i = 0; i < main.getMasterReservationList().size(); i++) {
                if (main.getMasterReservationList().get(i).getBoxName().equals(res.getBoxName())) {
                    main.getMasterReservationList().remove(i);
                }
            }

            // Set new values on reservation
            res.setFirstName(first);
            res.setLastName(last);
            res.setNumOfGuests(numOfGuests);
            res.setStayStart(start);
            res.setStayEnd(end);
            res.setSmoke(getSmokingType(smoke));
            res.setPet(getPetType(pet));
            res.setRoom(room);

            //Add reservation to masterArrayList
            main.getMasterReservationList().add(res);

            JOptionPane.showMessageDialog(null, "Reservation Successfully Modified");
            clearFields();
            fillComboBoxes();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please complete all entries.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number greater than 0 for "
                    + "number of guests.");
        }
    }//GEN-LAST:event_commitChangesButtonActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        xx = evt.getXOnScreen();
        yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private Smoking getSmokingType(String smoke) {
        if (smoke.equals("SMOKING")) {
            return Smoking.SMOKING;
        }

        return Smoking.NONSMOKING;
    }

    private PetFriendly getPetType(String pet) {
        if (pet.equals("YES")) {
            return PetFriendly.YES;
        }

        return PetFriendly.NO;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> byNameBox;
    private javax.swing.JButton byNameButton;
    private javax.swing.JLabel byNameLabel;
    private javax.swing.JComboBox<String> byRoomBox;
    private javax.swing.JButton byRoomButton;
    private javax.swing.JLabel byRoomLAbel;
    private javax.swing.JButton commitChangesButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lengthStayLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel numOfGuestLabel;
    private javax.swing.JTextField numOfGuestsField;
    private javax.swing.JComboBox<String> petsBox;
    private javax.swing.JLabel petsLabel;
    private javax.swing.JTextField roomField;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel searchResLabel;
    private javax.swing.JButton searchRoomButton;
    private javax.swing.JComboBox<String> smokePrefBox;
    private javax.swing.JLabel smokePrefLabel;
    private com.toedter.calendar.JDateChooser toDateChooser;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}
