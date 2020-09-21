/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RoomBooking extends javax.swing.JFrame {

    /**
     * Creates new form RoomBooking
     */
    public RoomBooking() {
        setLocation(300, 100);
        initComponents();
        jPanel2.setBackground(new Color(100,204,204,70));
        namef.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namef = new javax.swing.JTextField();
        NIDf = new javax.swing.JTextField();
        contactf = new javax.swing.JTextField();
        addressf = new javax.swing.JTextField();
        nationf = new javax.swing.JTextField();
        inhabf = new javax.swing.JTextField();
        roomf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BookNow = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        GoHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Customer  Name");
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 80, 290, 60);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("NID Number");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 150, 290, 50);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 210, 280, 50);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Contact Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 260, 280, 60);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Nationality");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 320, 280, 50);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Number of Inhabitants");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 380, 340, 50);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Room Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 440, 290, 50);

        namef.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        namef.setOpaque(false);
        namef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                namefMousePressed(evt);
            }
        });
        namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefActionPerformed(evt);
            }
        });
        namef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namefKeyPressed(evt);
            }
        });
        jPanel1.add(namef);
        namef.setBounds(290, 90, 480, 40);

        NIDf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        NIDf.setOpaque(false);
        NIDf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDfActionPerformed(evt);
            }
        });
        NIDf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NIDfKeyPressed(evt);
            }
        });
        jPanel1.add(NIDf);
        NIDf.setBounds(290, 150, 480, 40);

        contactf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        contactf.setOpaque(false);
        contactf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactfKeyPressed(evt);
            }
        });
        jPanel1.add(contactf);
        contactf.setBounds(290, 210, 480, 40);

        addressf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        addressf.setOpaque(false);
        addressf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressfKeyPressed(evt);
            }
        });
        jPanel1.add(addressf);
        addressf.setBounds(290, 270, 480, 40);

        nationf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        nationf.setOpaque(false);
        nationf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationfActionPerformed(evt);
            }
        });
        nationf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nationfKeyPressed(evt);
            }
        });
        jPanel1.add(nationf);
        nationf.setBounds(290, 330, 480, 40);

        inhabf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        inhabf.setOpaque(false);
        inhabf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inhabfKeyPressed(evt);
            }
        });
        jPanel1.add(inhabf);
        inhabf.setBounds(290, 380, 480, 40);

        roomf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        roomf.setOpaque(false);
        roomf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomfActionPerformed(evt);
            }
        });
        jPanel1.add(roomf);
        roomf.setBounds(290, 450, 290, 40);

        BookNow.setBackground(new java.awt.Color(0, 51, 51));
        BookNow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BookNow.setForeground(new java.awt.Color(153, 255, 153));
        BookNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/room_30px.png"))); // NOI18N
        BookNow.setText("BOOK NOW");
        BookNow.setOpaque(true);
        BookNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BookNowMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(658, Short.MAX_VALUE)
                .addComponent(BookNow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(BookNow)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 70, 810, 470);

        LogOut.setBackground(new java.awt.Color(153, 153, 255));
        LogOut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 0, 102));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/exit_30px.png"))); // NOI18N
        LogOut.setText("LOGOUT");
        LogOut.setOpaque(true);
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogOutMousePressed(evt);
            }
        });
        jPanel1.add(LogOut);
        LogOut.setBounds(780, 10, 110, 30);

        GoBack.setBackground(new java.awt.Color(0, 0, 102));
        GoBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GoBack.setForeground(new java.awt.Color(153, 153, 255));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/system/back_to_30px.png"))); // NOI18N
        GoBack.setText("GO BACK");
        GoBack.setOpaque(true);
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GoBackMousePressed(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(650, 10, 110, 30);

        GoHome.setBackground(new java.awt.Color(51, 0, 0));
        GoHome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GoHome.setForeground(new java.awt.Color(204, 204, 255));
        GoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home_page_30px.png"))); // NOI18N
        GoHome.setText("GO HOME");
        GoHome.setOpaque(true);
        GoHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GoHomeMousePressed(evt);
            }
        });
        jPanel1.add(GoHome);
        GoHome.setBounds(0, 0, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/room.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefActionPerformed

    private void NIDfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDfActionPerformed
        // TODO  your handling code here:
    }//GEN-LAST:event_NIDfActionPerformed
    
    private void nationfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationfActionPerformed

    private void roomfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomfActionPerformed

    private void BookNowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookNowMousePressed

        String name = namef.getText();
        String contact = contactf.getText();
        String address = addressf.getText();
        String nation = nationf.getText();
        String NID = NIDf.getText();
        String inhab = inhabf.getText();
        String room = roomf.getText();                                          //sob field theke input niye initialize korlam
        

        if(name.equals("")||contact.equals("")||address.equals("")||nation.equals("")||NID.equals("")||inhab.equals("")||room.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the details");     //Form faka thakle error msg
            return;
        }
        int l =NID.length();
        for(int i=0;i<l;i++){
            if(contact.charAt(i)>'9'||contact.charAt(i)<'0'||l!=10){
                JOptionPane.showMessageDialog(this, "Invalid NID");             //NID 10 digit na hole error msg
                return;
            }
        }
        l=contact.length();
        for(int i=0;i<l;i++){
            if(contact.charAt(i)>'9'||contact.charAt(i)<'0'||l!=11){
                JOptionPane.showMessageDialog(this, "Invalid contact");         //Contact 11 digit na hole error msg
                return;
            }
        }
        Date date = new Date();
        long time = date.getTime();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate("use hotelmanagementsystem;");
            ResultSet rs = stmt.executeQuery("select * from room where id="+room+";");  //room DB table er je id room er soman sei room select korbo
            rs.next();
            int maxCapacity = Integer.parseInt(rs.getString("capacity"));
            int occ = Integer.parseInt(rs.getString("occupied"));
            if(occ==1){                                                                 //jodi room occupied hoy tahole return korbe
                JOptionPane.showMessageDialog(this, "Room is already occupied");
                return;
            }
            int inhabs = Integer.parseInt(inhab);
            if(inhabs>maxCapacity){
                JOptionPane.showMessageDialog(this, "Person limit exceeding... \nMax: "+maxCapacity);   //jodi DharaonKhomotar beshi hoy taholeo return korbe.
                return;
            }
            
            
            /*
            Book korar somoy:
            1.customer DB Table e sob information insert korbo
            2.Bookings DB Table e Time soho jabotio Data insert korbo
            3.room DB Table e oi room er occupied status change kore 1 dibo.
            **************/
            
            stmt.executeUpdate("insert into customer values('"+NID+"','"+name+"','"+contact+"','"+address+"','"+nation+"');");
            stmt.executeUpdate("insert into bookings(NID,number_of_persons,room,checkin) values('"+NID+"',"+inhab+","+room+",'"+time+"');");
            stmt.executeUpdate("update room set occupied=1 where id="+room+";");
            JOptionPane.showMessageDialog(this, "Room Booked");
            new CustomerList().setVisible(true);
            this.setVisible(false);
            con.close();
            stmt.close();           
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }//GEN-LAST:event_BookNowMousePressed

    private void GoBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMousePressed
        // TODO add your handling code here:
        new RoomList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoBackMousePressed

    private void namefMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefMousePressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_namefMousePressed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void namefKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
         NIDf.requestFocus();
    }//GEN-LAST:event_namefKeyPressed

    private void NIDfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDfKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
         contactf.requestFocus();
    }//GEN-LAST:event_NIDfKeyPressed

    private void contactfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactfKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            addressf.requestFocus();
    }//GEN-LAST:event_contactfKeyPressed

    private void addressfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressfKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
         nationf.requestFocus();
    }//GEN-LAST:event_addressfKeyPressed

    private void nationfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nationfKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
         inhabf.requestFocus();
    }//GEN-LAST:event_nationfKeyPressed

    private void inhabfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inhabfKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            roomf.requestFocus();
    }//GEN-LAST:event_inhabfKeyPressed

    private void GoHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoHomeMousePressed
        // TODO add your handling code here:
        new MainScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoHomeMousePressed

    private void LogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMousePressed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutMousePressed

    void setTextField(String room){
        roomf.setText(room);
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
            java.util.logging.Logger.getLogger(RoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookNow;
    private javax.swing.JLabel GoBack;
    private javax.swing.JLabel GoHome;
    private javax.swing.JLabel LogOut;
    private javax.swing.JTextField NIDf;
    private javax.swing.JTextField addressf;
    private javax.swing.JTextField contactf;
    private javax.swing.JTextField inhabf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namef;
    private javax.swing.JTextField nationf;
    private javax.swing.JTextField roomf;
    // End of variables declaration//GEN-END:variables
}
