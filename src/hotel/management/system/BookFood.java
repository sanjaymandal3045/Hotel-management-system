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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class BookFood extends javax.swing.JFrame {

    /**
     * Creates new form BookFood
     */
    public BookFood() {
        setLocation(300, 100);
        initComponents();
        jPanel2.setBackground(new Color(100,100,100,90));
        roomfield.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        book_button = new javax.swing.JButton();
        roomfield = new javax.swing.JTextField();
        itemfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        book_button.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        book_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/20200910_115344_copy_120x100.png"))); // NOI18N
        book_button.setText("BOOK FOOD");
        book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(book_button);
        book_button.setBounds(670, 440, 260, 50);

        roomfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        roomfield.setOpaque(false);
        roomfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roomfieldKeyPressed(evt);
            }
        });
        jPanel1.add(roomfield);
        roomfield.setBounds(350, 190, 480, 40);

        itemfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 0, 0)));
        itemfield.setOpaque(false);
        jPanel1.add(itemfield);
        itemfield.setBounds(350, 290, 480, 40);

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("ITEM NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 300, 150, 30);

        Back.setBackground(new java.awt.Color(0, 0, 51));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(153, 153, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/go_back_50px.png"))); // NOI18N
        Back.setText("GO BACK");
        Back.setOpaque(true);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackMousePressed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(840, 0, 160, 60);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("ROOM NUMBER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(627, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 90, 860, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/cheff.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        // TODO add your handling code here:
        String room,item;
        room=roomfield.getText();
        item = itemfield.getText();
        if(room.equals("")||item.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the details");
            return;
        }
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","");
            Statement stmt;
            stmt=con.createStatement();
            stmt.executeUpdate("USE hotelmanagementsystem");
            ResultSet rs = stmt.executeQuery("select * from room;");        //room table niye kaj korbo
            
            int flag=0,flag2=0;                           
            while(rs.next()){
                String id = rs.getString("id");
                String occupied = rs.getString("occupied");
                if(room.equals(id)){                                        //jodi Input dewa room number jodi database er id/room number er soman hoy
                    flag2=1;
                    if(occupied.equals("0"))
                    {
                        JOptionPane.showMessageDialog(null, "Room is Vacant");  
                        flag=0;                                                 //Room khali thakle flag=0 else flag=1
                    }
                else
                    flag=1;
                break;
                }
            }
            if(flag2==0) 
                    JOptionPane.showMessageDialog(null, "Room no. not available");  //jodi input er sathe database er room id na mile Error msg dekhai
            rs.close();                                                             //room er query close kori
            
            ResultSet rs1 = stmt.executeQuery("select * from restitem;");           //restitem or restaurant item select kortesi
            int flag3=0;
            while(rs1.next()){
                String input_name = rs1.getString("item_name");                     //database theke item name nichhi
                if(item.equals(input_name)){                                        //dekhtesi Input item name Database e exist kore kina                                      
                    flag3=1;                                                        //exist korle flag3=1
                    break;
                }
            }
            if(flag3==0) 
                    JOptionPane.showMessageDialog(null, "Food Item not available");
            
            if(flag==1 && flag3==1){                                                //flag=1 mane room vacant na && flag3=1 mane Food item exist kore
                stmt.executeUpdate("insert into bookfood values('"+room+"','"+item+"');");    //bookfood Database Table e insert kortesi room ar Food item
                ResultSet rs2 = stmt.executeQuery("select * from restitem where item_name='"+item+"';");//arekta Resultset nilam karon arekta table er query result rakhbo
                rs2.next();                                                                 //rs2 oi row ta select kore jekhane Food item name ache
                String price = rs2.getString("item_price");                                 //oi Food item er price ta initialize kori
                int Itemprice = Integer.parseInt(price);                                
         
                rs2 = stmt.executeQuery("select * from bookings where room='"+room+"' and checkout is null;");
                rs2.next();                                                         //rs2 ekhon Bookings er oi input room ke select kore and dekhe checkout kora ache kina
                int ExistingPrice = Integer.parseInt(rs2.getString("amount"));             //oi room er ekhon porjonto khoroch ney
                String id = rs2.getString("id");
                ExistingPrice+=Itemprice;                                                     //khoroch er sathe notun book kora khabar add korchi
                stmt.executeUpdate("update bookings set amount='"+ExistingPrice+"' where id='"+id+"';");   //database e Bookings e price update kori
                
                JOptionPane.showMessageDialog(null, "Food Booked");
                new Restmenu().setVisible(true);
                this.setVisible(false);
            }
            else{
                roomfield.setText("");
                itemfield.setText("");
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
    }//GEN-LAST:event_book_buttonActionPerformed

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        // TODO add your handling code here:
        new Restmenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMousePressed

    private void roomfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            itemfield.requestFocus();
    }//GEN-LAST:event_roomfieldKeyPressed

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
            java.util.logging.Logger.getLogger(BookFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton book_button;
    private javax.swing.JTextField itemfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField roomfield;
    // End of variables declaration//GEN-END:variables
}
