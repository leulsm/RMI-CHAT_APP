package msgFrame;

public class Message extends javax.swing.JPanel {

    public Message(String ms,String username) {
        initComponents();
        String u=username;
        SetMessage(ms,u);
    }

    public void SetMessage(String ms,String username){
    user.setText(username.toUpperCase());
        txt.setText(ms);
        txt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new java.awt.Dimension(600, 45));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 45));

        user.setBackground(new java.awt.Color(255, 204, 153));
        user.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("USERNAME");
        user.setAlignmentY(0.0F);
        user.setAutoscrolls(true);
        user.setMinimumSize(new java.awt.Dimension(0, 0));
        user.setName(""); // NOI18N
        user.setOpaque(true);
        user.setPreferredSize(new java.awt.Dimension(20, 10));

        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txt;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
