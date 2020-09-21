/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import AppPackage.AnimationClass;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public final class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    
     AnimationClass ANIME = new AnimationClass();
    public MainScreen() {
        setLocation(300, 100);
        initComponents();
        slideShow();
    }
    
    public void slideShow()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                try {
                    while (true) {
                        switch (count) {
                            case 0:
                                ImageIcon II0 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_2.jpg"));
                                Background1.setIcon(II0);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 1 ;
                                break ;
                            case 1:
                                ImageIcon II1 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_1.jpg"));
                                Background2.setIcon(II1);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 2 ;
                                break ;
                            case 2:
                                ImageIcon II2 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_3.jpg"));
                                Background1.setIcon(II2);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 3;
                                break ;
                           case 3:
                                ImageIcon II3 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_4.jpg"));
                                Background2.setIcon(II3);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 4 ;
                                break ;
                            case 4:
                                ImageIcon II4 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_5.jpg"));
                                Background1.setIcon(II4);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 5 ;
                                break ;
                            case 5:
                                ImageIcon II5 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_6.jpg"));
                                Background2.setIcon(II5);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 6 ; 
                                break ;
                            case 6:
                                ImageIcon II6 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_8.jpg"));
                                Background1.setIcon(II6);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 7 ;
                                break ;
                            case 7:
                                ImageIcon II7 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_8.jpg"));
                                Background2.setIcon(II7);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 8 ; 
                                break ;
                             case 8:
                                ImageIcon II8 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_9.jpg"));
                                Background1.setIcon(II8);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 9 ;
                                break ;
                             case 9:
                                ImageIcon II9 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_10.jpg"));
                                Background2.setIcon(II9);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 10 ; 
                                break ;
                             case 10:
                                ImageIcon II10 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_11.jpg"));
                                Background1.setIcon(II10);
                                Thread.sleep(3000);
                                ANIME.jLabelXLeft(0,-900,20,10,Background1);
                                ANIME.jLabelXLeft(900,0,20,10,Background2);
                                count = 11 ;
                                break ; 
                             case 11:
                                ImageIcon II11 = new ImageIcon(MainScreen.this.getClass().getResource("/Backgrounds/Mainscreen_13.jpg"));
                                Background2.setIcon(II11);
                                Thread.sleep(3000);
                                ANIME.jLabelXRight(-900,0,20,10,Background1);
                                ANIME.jLabelXRight(0,900,20,10,Background2);
                                count = 0 ; 
                                break ;
                            
                        }
                    }
                }catch(Exception ex){            
                    
                }
            }
        }).start(); 
    }
// 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RoomsAvailable = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CustomerList = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        StaffInformation = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        AddStaff = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Resturant = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Background2 = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/management_40px.png"))); // NOI18N
        jLabel1.setText("MANAGEMENT");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        RoomsAvailable.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        RoomsAvailable.setForeground(new java.awt.Color(51, 51, 255));
        RoomsAvailable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/r_40px.png"))); // NOI18N
        RoomsAvailable.setText("ROOMS AVAILABLE");
        RoomsAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RoomsAvailableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(RoomsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoomsAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        CustomerList.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        CustomerList.setForeground(new java.awt.Color(51, 51, 255));
        CustomerList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/bulleted_list_40px.png"))); // NOI18N
        CustomerList.setText("CUSTOMER LIST");
        CustomerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomerListMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerList, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        StaffInformation.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        StaffInformation.setForeground(new java.awt.Color(51, 51, 255));
        StaffInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/employee_40px.png"))); // NOI18N
        StaffInformation.setText("STAFF INFORMATION");
        StaffInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StaffInformationMousePressed(evt);
            }
        });
        jPanel3.add(StaffInformation);
        StaffInformation.setBounds(30, 10, 250, 40);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);

        AddStaff.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        AddStaff.setForeground(new java.awt.Color(51, 51, 255));
        AddStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/add_user_male_40px.png"))); // NOI18N
        AddStaff.setText("ADD STAFF");
        AddStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddStaffMousePressed(evt);
            }
        });
        jPanel4.add(AddStaff);
        AddStaff.setBounds(70, 10, 190, 40);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);

        Resturant.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        Resturant.setForeground(new java.awt.Color(51, 51, 255));
        Resturant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/restaurant_40px.png"))); // NOI18N
        Resturant.setText("RESTURANT");
        Resturant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResturantMousePressed(evt);
            }
        });
        jPanel5.add(Resturant);
        Resturant.setBounds(70, 10, 170, 50);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(null);

        Logout.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(51, 51, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/sign_out_40px.png"))); // NOI18N
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });
        jPanel6.add(Logout);
        Logout.setBounds(80, 10, 170, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);

        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/1_900x600.jpg"))); // NOI18N
        jPanel7.add(Background2);
        Background2.setBounds(900, 0, 900, 600);

        Background1.setBackground(new java.awt.Color(204, 0, 0));
        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Mainscreen_2.jpg"))); // NOI18N
        jPanel7.add(Background1);
        Background1.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomsAvailableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsAvailableMousePressed
        // TODO add your handling code here:
        
        new RoomList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RoomsAvailableMousePressed

    private void CustomerListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerListMousePressed
        // TODO add your handling code here:
        new CustomerList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustomerListMousePressed

    private void StaffInformationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffInformationMousePressed
        // TODO add your handling code here:
        
        new StaffInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StaffInformationMousePressed

    private void AddStaffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStaffMousePressed
        // TODO add your handling code here:
        new AddStaff().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddStaffMousePressed

    private void ResturantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResturantMousePressed
        // TODO add your handling code here:
        
         new Restmenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ResturantMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        // TODO add your handling code here:
         new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMousePressed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddStaff;
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel CustomerList;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Resturant;
    private javax.swing.JLabel RoomsAvailable;
    private javax.swing.JLabel StaffInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

    private String List(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
