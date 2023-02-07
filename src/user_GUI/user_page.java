
package user_GUI;

import msgFrame.Photo;
import Client.C_Chat;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import javax.swing.filechooser.FileFilter;


public class user_page extends javax.swing.JFrame   {
 
    String[] noClientsYet = {"No  new users"};
    
    public user_page() throws SQLException, RemoteException {
        initComponents();
     
        send.setEnabled(true);
         PM.setEnabled(false);
         setClientPanel(noClientsYet);
         message.setText("Type your message here...");
        // new Function.Scrolling(messagearea);
 
    }

    
    
  public void Profile(String username) throws RemoteException{
        name=username;
        
        setTitle(name.toUpperCase()+" CHAT ACCOUNT");
    getConnected(name);
    PreparedStatement ps; 
   ResultSet rs;

    }
   
public String name,message1;
private C_Chat chatClient;
    public DefaultListModel<String> listModel;
    private final Font meiryoFont = new Font("Meiryo", Font.PLAIN, 14);
    private static final long serialVersionUID = 1L;	

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp_emoji = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jlname = new javax.swing.JLabel();
        jage = new javax.swing.JLabel();
        jsex = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        send = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        spchat = new javax.swing.JScrollPane();
        messagearea = new javax.swing.JDesktopPane();
        online = new javax.swing.JPanel();
        Listscroll = new javax.swing.JScrollPane();
        listuser = new javax.swing.JList<>();
        sendpicture = new javax.swing.JButton();
        PM = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        popUp_emoji.setBackground(new java.awt.Color(0,0,0,0));
        popUp_emoji.setMaximumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setMinimumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setPreferredSize(new java.awt.Dimension(504, 355));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainpage"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                WindowClosing(evt);
            }
        });

        home.setBackground(new java.awt.Color(255, 204, 153));
        home.setName(""); // NOI18N
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 380, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("        HU_ONLINE CHAT");

        jLabel4.setText("Enter unique username to check profile");

        jButton2.setText("Go");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PROFILE:-");

        jLabel6.setText("F.Name:");

        jLabel7.setText("L.Name:");

        jLabel8.setText("Age:");

        jLabel9.setText("Sex:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jsex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jsex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 380));

        message.setColumns(20);
        message.setFont(new java.awt.Font("Monospaced", 2, 13)); // NOI18N
        message.setRows(5);
        message.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                messageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                messageFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(message);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 280, 50));

        send.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        send.setText("Send");
        send.setBorder(null);
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        home.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 90, 51));

        logout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        logout.setText("Log Out");
        logout.setBorder(null);
        logout.setOpaque(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        home.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 100, 30));

        spchat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        spchat.setAlignmentX(0.0F);
        spchat.setAlignmentY(0.0F);
        spchat.setDoubleBuffered(true);
        spchat.setFocusCycleRoot(true);
        spchat.setFocusTraversalPolicyProvider(true);
        spchat.setInheritsPopupMenu(true);
        spchat.setMaximumSize(new java.awt.Dimension(380, 80));
        spchat.setMinimumSize(new java.awt.Dimension(230, 77));

        messagearea.setBackground(new java.awt.Color(255, 255, 255));
        messagearea.setForeground(new java.awt.Color(0, 0, 0));
        messagearea.setAlignmentY(0.0F);
        messagearea.setAutoscrolls(true);
        messagearea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        messagearea.setDoubleBuffered(true);
        messagearea.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        messagearea.setMaximumSize(new java.awt.Dimension(343, 66));
        messagearea.setMinimumSize(new java.awt.Dimension(333, 55));
        messagearea.setOpaque(false);
        messagearea.setLayout(new javax.swing.BoxLayout(messagearea, javax.swing.BoxLayout.Y_AXIS));
        spchat.setViewportView(messagearea);

        home.add(spchat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 400, 270));

        Listscroll.setViewportView(listuser);

        sendpicture.setBackground(new java.awt.Color(255, 204, 153));
        sendpicture.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        sendpicture.setText("Img");
        sendpicture.setBorder(null);
        sendpicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendpictureActionPerformed(evt);
            }
        });

        PM.setBackground(new java.awt.Color(255, 204, 153));
        PM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PM.setText("private msg");
        PM.setBorder(null);
        PM.setMaximumSize(new java.awt.Dimension(53, 79));
        PM.setMinimumSize(new java.awt.Dimension(43, 69));
        PM.setPreferredSize(new java.awt.Dimension(50, 70));
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onlineLayout = new javax.swing.GroupLayout(online);
        online.setLayout(onlineLayout);
        onlineLayout.setHorizontalGroup(
            onlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineLayout.createSequentialGroup()
                .addComponent(sendpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Listscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onlineLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        onlineLayout.setVerticalGroup(
            onlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineLayout.createSequentialGroup()
                .addComponent(Listscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(sendpicture))
        );

        home.add(online, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 230, 330));
        home.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 900, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("About");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        home.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ONLINE USER'S");
        home.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 130, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("BY MAFI'S HU SWE STUENT'S GROUP");
        home.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowClosing
                                   if(chatClient != null){
			    	try {
			        	sendMessage("Bye all, I am leaving",name);
			        	chatClient.serverIF.leaveChat(name);
					} catch (RemoteException e) {
						e.printStackTrace();
					}		        	
		        }
		        System.exit(0); 
    }//GEN-LAST:event_WindowClosing

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

          if(chatClient != null){
			    	try {
			        	sendMessage("Bye all, I am leaving",name);
			        	chatClient.serverIF.leaveChat(name);
                                        
                                        this.dispose();  
        login_page mf = new login_page();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
					} catch (RemoteException e) {
						e.printStackTrace();
                                                System.exit(0);
					}		        	
		        }
    }//GEN-LAST:event_logoutActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        try {
            message1 = message.getText();
            
            if(message1!=""){
            message.setText("");
            sendMessage(message1,name.toUpperCase());
           message.setText("Type your message here...");
             messagearea.revalidate();
             messagearea.repaint();
            System.out.println("Sending message : " + message1);
            }
            else{
           JOptionPane.showMessageDialog(this,"Please write the message");
            
            }
        } catch (RemoteException ex) {
            Logger.getLogger(user_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendActionPerformed

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed

        try {
            int[] privateList = listuser.getSelectedIndices();
            
            for(int i=0; i<privateList.length; i++){
                System.out.println("selected index :" + privateList[i]);
            }
            message1 = message.getText();
            message.setText("");
            sendPrivate(privateList,name.toUpperCase());
        } catch (RemoteException ex) {
            Logger.getLogger(user_page.class.getName()).log(Level.SEVERE, null, ex);
        }
                                
    }//GEN-LAST:event_PMActionPerformed

    private void sendpictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendpictureActionPerformed

                setImage(name.toUpperCase());

    }//GEN-LAST:event_sendpictureActionPerformed

    private void messageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageFocusGained

   if(message.getText().equals("Type your message here...")){
       message.setText("");
     
   }


        // TODO add your handling code here:
    }//GEN-LAST:event_messageFocusGained

    private void messageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messageFocusLost
 if(message.getText().equals("")){
       message.setText("Type your message here...");
     
   }

        // TODO add your handling code here:
    }//GEN-LAST:event_messageFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String uname = jTextField1.getText(); 
        try {
            String query = "SELECT * FROM signup WHERE username='"+uname+"'";            

            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3325/ds_chat","root","");
            Statement smnt=conn.prepareStatement(query);
            ResultSet rs=smnt.executeQuery(query);

 if(rs.next())
  {
     String pfn=rs.getString(1);
     String pln=rs.getString(2);
     String pu=rs.getString(3);
     String pe=rs.getString(4);
     jname.setText(pfn);
     jlname.setText(pln);
     jage.setText(pu);
     jsex.setText(pe);

     
  }else{
                     JOptionPane.showMessageDialog(null,"INCORRECT USER NAME");

     
 }
        } catch (SQLException ex) {
            Logger.getLogger(user_page.class.getName()).log(Level.SEVERE, null, ex);
        }


        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        about_us_page ab = new about_us_page();
 ab.setVisible(true);
  ab.pack();
 
    }//GEN-LAST:event_jButton1ActionPerformed
public void setClientPanel(String[] currClients) {  	
    
        listModel = new DefaultListModel<String>();
        
        for(String s : currClients){
            
               listModel.addElement(s);
           
             
        }
        if(currClients.length > 1){
        	PM.setEnabled(true);
        }

        listuser.setModel(listModel);
        listuser.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listuser.setVisibleRowCount(8);
        listuser.setFont(meiryoFont);
        

    }


   private void sendMessage(String chatMessage,String username) throws RemoteException {
		chatClient.serverIF.updateChat(username,chatMessage);
                messagearea.revalidate();
                messagearea.repaint();
                 scrollToBottom(spchat);
	}

	private void sendPrivate(int[] privateList,String username) throws RemoteException {
		String privateMessage =  message1;
		chatClient.serverIF.sendPrivate(privateList, privateMessage,username);
                
	}
	
	private void getConnected(String userName) throws RemoteException{
		//remove whitespace and non word characters to avoid malformed url
		String cleanedUserName = userName.replaceAll("\\s+","_");
		cleanedUserName = userName.replaceAll("\\W+","_");
		try {		
			chatClient = new C_Chat(this, cleanedUserName);
			chatClient.startClient();
		} catch (RemoteException e) {
                    System.exit(0);
			e.printStackTrace();
		}
	}
        
        
      public void setImage(String username) {
        JFileChooser ch = new JFileChooser();
        FileChooser preview = new FileChooser();
        ch.setAccessory(preview);
        ch.addPropertyChangeListener(preview);
        ch.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name = file.getName();
                return file.isDirectory() || name.endsWith(".png") || name.endsWith(".PNG") || name.endsWith("jpg") || name.endsWith("JPG");
            }

            @Override
            public String getDescription() {
                return "png,jpg";
            }
        });
        int c = ch.showOpenDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            ImageIcon image = new ImageIcon(ch.getSelectedFile().getAbsolutePath());
            try {
                chatClient.serverIF.imageserver(image,name.toUpperCase());
                messagearea.revalidate();
                messagearea.repaint();
                 scrollToBottom(spchat);

            } catch (Exception e) {
            }
        }
    }
      
      private void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("hu".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                try {
                    new user_page().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(user_page.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(user_page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Listscroll;
    public javax.swing.JButton PM;
    public javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jage;
    private javax.swing.JLabel jlname;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel jsex;
    public javax.swing.JList<String> listuser;
    public javax.swing.JButton logout;
    public javax.swing.JTextArea message;
    public javax.swing.JDesktopPane messagearea;
    public javax.swing.JPanel online;
    private javax.swing.JPopupMenu popUp_emoji;
    public javax.swing.JButton send;
    private javax.swing.JButton sendpicture;
    private javax.swing.JScrollPane spchat;
    // End of variables declaration//GEN-END:variables

   
}
