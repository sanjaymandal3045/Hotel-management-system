/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AddStaff extends javax.swing.JFrame {

    /**
     * Creates new form AddStaff
     */
    public AddStaff() {
        setLocation(300, 100);
        initComponents();
        jPanel2.setBackground(new Color(100,100,100,90));
        namefield.requestFocus();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        NIDfield = new javax.swing.JTextField();
        contactfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        userfield = new javax.swing.JTextField();
        workfield = new javax.swing.JTextField();
        GoBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AddStaff = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("NID Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 220, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Contact Number");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 150, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 80, 150, 50);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 280, 140, 50);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 350, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Type of Work");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 410, 150, 30);

        namefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        namefield.setOpaque(false);
        namefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namefieldKeyPressed(evt);
            }
        });
        jPanel1.add(namefield);
        namefield.setBounds(360, 90, 370, 30);

        NIDfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        NIDfield.setOpaque(false);
        NIDfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NIDfieldKeyPressed(evt);
            }
        });
        jPanel1.add(NIDfield);
        NIDfield.setBounds(360, 210, 370, 40);

        contactfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        contactfield.setOpaque(false);
        contactfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contactfieldMousePressed(evt);
            }
        });
        contactfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactfieldKeyPressed(evt);
            }
        });
        jPanel1.add(contactfield);
        contactfield.setBounds(360, 150, 370, 30);

        passfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        passfield.setOpaque(false);
        passfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passfieldKeyPressed(evt);
            }
        });
        jPanel1.add(passfield);
        passfield.setBounds(360, 350, 370, 30);

        userfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        userfield.setOpaque(false);
        userfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userfieldKeyPressed(evt);
            }
        });
        jPanel1.add(userfield);
        userfield.setBounds(360, 280, 370, 40);

        workfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 0, 102)));
        workfield.setOpaque(false);
        workfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workfieldActionPerformed(evt);
            }
        });
        jPanel1.add(workfield);
        workfield.setBounds(360, 400, 370, 40);

        GoBack.setBackground(new java.awt.Color(0, 0, 51));
        GoBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GoBack.setForeground(new java.awt.Color(204, 204, 255));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back_50px.png"))); // NOI18N
        GoBack.setText("GO BACK");
        GoBack.setOpaque(true);
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GoBackMousePressed(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(860, 0, 140, 50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(140, 60, 700, 450);

        AddStaff.setBackground(new java.awt.Color(0, 0, 102));
        AddStaff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddStaff.setForeground(new java.awt.Color(153, 153, 255));
        AddStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/add_70px.png"))); // NOI18N
        AddStaff.setText("ADD STAFF");
        AddStaff.setOpaque(true);
        AddStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddStaffMousePressed(evt);
            }
        });
        jPanel1.add(AddStaff);
        AddStaff.setBounds(790, 520, 190, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/staff.jpg"))); // NOI18N
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(4, -6, 1000, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void workfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workfieldActionPerformed

    private void GoBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMousePressed
        // TODO add your handling code here:
        
        new MainScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoBackMousePressed

    private void AddStaffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStaffMousePressed
        // TODO add your handling code here:
        
        String name,contact,nid,usr,pass,designation;
        name=namefield.getText();
        pass = new String(passfield.getPassword());             //passfield theke string e convert kore pass e rakhtesi
        contact = contactfield.getText();
        nid = NIDfield.getText();;
        usr = userfield.getText();
        designation = workfield.getText();
        if(name.equals("")||pass.equals("")||contact.equals("")||nid.equals("")||usr.equals("")||designation.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the details");
            return;
        }
        int l =contact.length();
        for(int i=0;i<l;i++){
            if(contact.charAt(i)>'9'||contact.charAt(i)<'0'||l!=11){
                JOptionPane.showMessageDialog(this, "Invalid contact");         //Dekhtesi Contact er sob digit kina && 11 digit ase kina...na thakle error msg
                return;
            }
        }
        l =nid.length();
        for(int i=0;i<l;i++){
            if(nid.charAt(i)>'9'||nid.charAt(i)<'0'||l!=10){
                JOptionPane.showMessageDialog(this, "Invalid NID Number");      //Dekhtesi NID er sob digit kina && 10 digit ase kina...na thakle error msg
                return;
            }
        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate("USE hotelmanagementsystem");
            stmt.executeUpdate("insert into login(name,contact,NID,username,password,work) values('"+name+"','"+contact+"','"+nid+"','"+usr+"','"+pass+"','"+designation+"');");
            JOptionPane.showMessageDialog(this, "New Staff Added");     //Login table e insert kortesi notun employee ke.
            new MainScreen().setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }//GEN-LAST:event_AddStaffMousePressed

    private void namefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            contactfield.requestFocus();
    }//GEN-LAST:event_namefieldKeyPressed

    private void contactfieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactfieldMousePressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_contactfieldMousePressed

    private void contactfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            NIDfield.requestFocus();
    }//GEN-LAST:event_contactfieldKeyPressed

    private void NIDfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIDfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            userfield.requestFocus();
    }//GEN-LAST:event_NIDfieldKeyPressed

    private void userfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            passfield.requestFocus();
    }//GEN-LAST:event_userfieldKeyPressed

    private void passfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
         workfield.requestFocus();
    }//GEN-LAST:event_passfieldKeyPressed

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
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddStaff;
    private javax.swing.JLabel GoBack;
    private javax.swing.JTextField NIDfield;
    private javax.swing.JTextField contactfield;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namefield;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField userfield;
    private javax.swing.JTextField workfield;
    // End of variables declaration//GEN-END:variables
}
