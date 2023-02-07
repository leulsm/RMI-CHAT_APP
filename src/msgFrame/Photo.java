package msgFrame;


import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Photo extends javax.swing.JPanel {
      public ImageIcon image;

    public Photo(ImageIcon image,String username) {
        initComponents();
        this.image=image;
        setPhoto(username);
    }

    
    public void setPhoto(String username) {
        Image img;
        user.setText(username.toUpperCase()+":");
        if (image.getIconHeight() > 130 || image.getIconWidth() > 130) {
            if (image.getIconWidth() > image.getIconHeight()) {
                img = image.getImage().getScaledInstance(300, -1, Image.SCALE_SMOOTH);
            } else {
                img = image.getImage().getScaledInstance(-1, 300, Image.SCALE_SMOOTH);
            }
            ImageIcon icon = new ImageIcon(img);
            lb.setIcon(icon);
        } else {
            lb.setIcon(image);
            this.setPreferredSize(new Dimension(600, image.getIconHeight() + 12));
            this.setMaximumSize(new Dimension(600, image.getIconHeight() + 12));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(300, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setBackground(new java.awt.Color(153, 153, 255));
        user.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        user.setText("Username");
        user.setOpaque(true);
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 290, 260));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
