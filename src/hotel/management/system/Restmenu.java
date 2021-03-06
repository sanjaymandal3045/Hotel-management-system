/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Restmenu extends javax.swing.JFrame {

    /**
     * Creates new form Restmenu
     */
    public Restmenu() {
        setLocation(300, 100);
        initComponents();
        showDetails();
        jPanel2.setBackground(new Color(100,204,204,70));
    }
    
    public void showDetails(){
        DefaultTableModel dtm = (DefaultTableModel)table.getModel();        //Table ke dtm e initialize korchi
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate("use hotelmanagementsystem;");               //for statement execution use hotelmanagementsystem database
            ResultSet rs=stmt.executeQuery("select * from restitem;");      //restitem table er sob column niye execute korbe SQL query
            int itemNumber=1;
            while(rs.next()){
                String itemName=rs.getString("item_name");
                String itemPrice=rs.getString("item_price");        
                dtm.addRow(new Object[]{itemNumber,itemName,itemPrice});    //Table e ekta kore row add korchi and database theke table e show korchi
                itemNumber++;                                               //Next row e gele itemNumber increment korchi
            }
            rs.close();  
            con.close();
            stmt.close();           
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        table.setModel(dtm);                                                //data set korche   
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        GoHome = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        additem_button = new javax.swing.JButton();
        bookfood_button = new javax.swing.JButton();
        removeitem_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setLayout(null);

        table.setBackground(new java.awt.Color(255, 204, 204));
        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(51, 0, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Item Name", "Price per serving"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 90, 630, 230);

        GoHome.setBackground(new java.awt.Color(0, 0, 51));
        GoHome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GoHome.setForeground(new java.awt.Color(102, 102, 255));
        GoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home_50px.png"))); // NOI18N
        GoHome.setText("GO HOME");
        GoHome.setOpaque(true);
        GoHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GoHomeMousePressed(evt);
            }
        });
        jPanel1.add(GoHome);
        GoHome.setBounds(0, 0, 160, 50);

        Logout.setBackground(new java.awt.Color(51, 0, 51));
        Logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(153, 153, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout_rounded_up_50px.png"))); // NOI18N
        Logout.setText("LOGOUT");
        Logout.setOpaque(true);
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(760, 0, 120, 50);

        GoBack.setBackground(new java.awt.Color(0, 0, 102));
        GoBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GoBack.setForeground(new java.awt.Color(153, 153, 255));
        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/go_back_50px.png"))); // NOI18N
        GoBack.setText("GO BACK");
        GoBack.setOpaque(true);
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GoBackMousePressed(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(620, 0, 130, 50);

        jLabel7.setText("jLabel7");

        additem_button.setText("ADD ITEM");
        additem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additem_buttonActionPerformed(evt);
            }
        });

        bookfood_button.setText("BOOK FOOD");
        bookfood_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookfood_buttonActionPerformed(evt);
            }
        });

        removeitem_button.setText("REMOVE ITEM");
        removeitem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitem_buttonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/20200910_125154_copy_50x50.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/20200910_125103_copy_50x50.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/20200910_125004_copy_50x50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(additem_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(bookfood_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(removeitem_button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(168, 168, 168)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additem_button)
                    .addComponent(bookfood_button)
                    .addComponent(removeitem_button))
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 60, 720, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/Mainscreen_4.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additem_buttonActionPerformed
        // TODO add your handling code here:
        new AddItem().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_additem_buttonActionPerformed

    private void bookfood_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookfood_buttonActionPerformed
        // TODO add your handling code here:
        new BookFood().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookfood_buttonActionPerformed

    private void removeitem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitem_buttonActionPerformed
        // TODO add your handling code here:
        new RemoveItem().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_removeitem_buttonActionPerformed

    private void GoHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoHomeMousePressed
        // TODO add your handling code here:
        
        new MainScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoHomeMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        // TODO add your handling code here:
        
         new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutMousePressed

    private void GoBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMousePressed
        // TODO add your handling code here:
         new MainScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoBackMousePressed

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
            java.util.logging.Logger.getLogger(Restmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoBack;
    private javax.swing.JLabel GoHome;
    private javax.swing.JLabel Logout;
    private javax.swing.JButton additem_button;
    private javax.swing.JButton bookfood_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeitem_button;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
