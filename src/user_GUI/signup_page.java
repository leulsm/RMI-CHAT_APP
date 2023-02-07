package user_GUI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import server_side.S_ChatIF;


public class signup_page extends javax.swing.JFrame {

    public signup_page() {
        initComponents();
        setTitle("SIGNUP");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        Tname = new javax.swing.JTextField();
        Tlname = new javax.swing.JTextField();
        Tusername = new javax.swing.JTextField();
        Tsex = new javax.swing.JTextField();
        upassword = new javax.swing.JPasswordField();
        cupassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Tage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First_Name: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        Tname.setPreferredSize(new java.awt.Dimension(22, 22));
        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });
        getContentPane().add(Tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 30));

        Tlname.setPreferredSize(new java.awt.Dimension(22, 22));
        Tlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TlnameActionPerformed(evt);
            }
        });
        getContentPane().add(Tlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 142, 150, 30));

        Tusername.setPreferredSize(new java.awt.Dimension(22, 22));
        Tusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TusernameActionPerformed(evt);
            }
        });
        getContentPane().add(Tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 150, 30));

        Tsex.setPreferredSize(new java.awt.Dimension(22, 22));
        Tsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsexActionPerformed(evt);
            }
        });
        getContentPane().add(Tsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 150, 30));

        upassword.setPreferredSize(new java.awt.Dimension(22, 22));
        upassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upasswordActionPerformed(evt);
            }
        });
        getContentPane().add(upassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 30));

        cupassword.setPreferredSize(new java.awt.Dimension(22, 22));
        cupassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupasswordActionPerformed(evt);
            }
        });
        getContentPane().add(cupassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Last_Name: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Age:");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Sex:");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Username:");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password:");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Confirm Password:");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SIGN_UP");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("LOG_IN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 130, 30));

        Tage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TageActionPerformed(evt);
            }
        });
        getContentPane().add(Tage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SIGN_UP");
        jLabel1.setPreferredSize(new java.awt.Dimension(124, 34));
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnameActionPerformed

    private void TlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TlnameActionPerformed

    private void TusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TusernameActionPerformed

    private void TsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TsexActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     try{
           //Class.forName("com.mysql.cj.jdbc.Driver");
           //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ds_chat","root","");
           //Statement st=(Statement) conn.createStatement();
           String fname=Tname.getText();
        String lname=Tlname.getText();
        int age=Integer.parseInt(Tage.getText());
        String sex=Tsex.getText();
        String username=Tusername.getText();
        String pass=upassword.getText();
        String cpass=cupassword.getText();
        
        if(pass.equals(cpass)){
        
        S_ChatIF jdbcs=(S_ChatIF)Naming.lookup("rmi://localhost/HuChatService"); 
        String msg=""+fname;
        msg =msg + "\n";
        String result=jdbcs.JDBCsignup(fname,lname,age,sex,username,pass,cpass);
        JOptionPane.showMessageDialog(jButton3, "WELCOME,"+msg+"YOUR ACCOUNT IS SUCESSFULLY CREATED.");
        }else{
        JOptionPane.showMessageDialog(jButton3, "INCORRECT,YOUR PASSWORD DID NOT MATCH, \nCHECK AND TRY AGAIN PLEASE.");
        }
     //   } catch (ClassNotFoundException ex) {
       //     Logger.getLogger(signup_page.class.getName()).log(Level.SEVERE, null, ex);
        //} catch (SQLException ex) {
          //  Logger.getLogger(signup_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(signup_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(signup_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(signup_page.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login_page mf = new login_page();
        mf.setVisible(true);
       mf.pack();
       mf.setLocationRelativeTo(null);

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void upasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upasswordActionPerformed

    private void cupasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cupasswordActionPerformed

    private void TageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TageActionPerformed

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
            java.util.logging.Logger.getLogger(signup_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tage;
    private javax.swing.JTextField Tlname;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tsex;
    private javax.swing.JTextField Tusername;
    private javax.swing.JPasswordField cupassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField upassword;
    // End of variables declaration//GEN-END:variables
}
