package views;

import dao.DaoImpl;
import java.awt.Color;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    DaoImpl dbService = new DaoImpl();

    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        logoLabel1 = new javax.swing.JLabel();
        side_banner = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        buttonEnter = new javax.swing.JPanel();
        labelEnter = new javax.swing.JLabel();
        closeButton = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        createAccountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo ALF.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 90, 280, -1));

        logoLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel2.setText("Fútbol");
        logoLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(logoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 290, -1));

        logoLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel1.setText("Administración de Ligas de");
        logoLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(logoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 290, -1));

        side_banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        side_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nike ball.png"))); // NOI18N
        side_banner.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bg.add(side_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        loginLabel.setBackground(new java.awt.Color(51, 51, 51));
        loginLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginLabel.setText("Inicia sesión");
        bg.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        userLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("Usuario");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Ingresa tu nombre de usuario");
        usernameField.setBorder(null);
        bg.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 410, 40));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 410, 10));

        passwordLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Contraseña");
        bg.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 410, 10));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        passwordField.setText("Contraseña");
        passwordField.setBorder(null);
        bg.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 410, 40));

        buttonEnter.setBackground(new java.awt.Color(41, 35, 92));
        buttonEnter.setForeground(new java.awt.Color(255, 255, 255));

        labelEnter.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        labelEnter.setForeground(new java.awt.Color(255, 255, 255));
        labelEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnter.setText("ENTRAR");
        labelEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEnterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonEnterLayout = new javax.swing.GroupLayout(buttonEnter);
        buttonEnter.setLayout(buttonEnterLayout);
        buttonEnterLayout.setHorizontalGroup(
            buttonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        buttonEnterLayout.setVerticalGroup(
            buttonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(buttonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 50));

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        closeLabel.setBackground(new java.awt.Color(51, 51, 51));
        closeLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(204, 204, 204));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.add(closeLabel);

        bg.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        createAccountLabel.setFont(new java.awt.Font("Roboto Slab Light", 0, 14)); // NOI18N
        createAccountLabel.setForeground(new java.awt.Color(51, 51, 51));
        createAccountLabel.setText("Crear una cuenta");
        createAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountLabelMouseClicked(evt);
            }
        });
        bg.add(createAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButton.setBackground(Color.RED);
        closeLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setBackground(Color.WHITE);
        closeLabel.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_closeButtonMouseExited

    private void labelEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEnterMouseClicked
        String email = usernameField.getText();
        String password = (passwordField.getText());
        if (!email.isBlank() && !password.isBlank()) {
            if (dbService.login(email, password) >= 0) {
                Dashboard dashboard = new Dashboard();
                this.setVisible(false);
                dashboard.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
        }
    }//GEN-LAST:event_labelEnterMouseClicked

    private void createAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLabelMouseClicked
        CreateUserForm createUserForm = new CreateUserForm();
        this.setVisible(false);
        createUserForm.setVisible(true);
    }//GEN-LAST:event_createAccountLabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buttonEnter;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelEnter;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel side_banner;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
