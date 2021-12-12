package views;

import common.Common;
import dao.DaoImpl;

public class Dashboard extends javax.swing.JFrame {

    DaoImpl dao = new DaoImpl();
    
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        welcomeUserGreeting();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        accountPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createLeaguePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        viewLeagues = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(0, 54, 58));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú principal");
        topPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 30));

        welcomeLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(204, 204, 204));
        welcomeLabel.setText("Bienvenido");
        topPanel.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Administrador de Ligas de Fútbol");
        topPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 270, 70));

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountPanel.setBackground(new java.awt.Color(0, 150, 136));
        accountPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountPanelMouseClicked(evt);
            }
        });
        accountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jLabel4.setToolTipText("");
        accountPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mi cuenta");
        accountPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 140, -1, -1));

        bodyPanel.add(accountPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 215));

        createLeaguePanel.setBackground(new java.awt.Color(0, 103, 91));
        createLeaguePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createLeaguePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLeaguePanelMouseClicked(evt);
            }
        });
        createLeaguePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        createLeaguePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear liga");
        createLeaguePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        bodyPanel.add(createLeaguePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 215));

        logoutPanel.setBackground(new java.awt.Color(128, 226, 126));
        logoutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cerrar sesión");
        logoutPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        bodyPanel.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 215, 400, 215));

        viewLeagues.setBackground(new java.awt.Color(76, 175, 80));
        viewLeagues.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewLeagues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLeaguesMouseClicked(evt);
            }
        });
        viewLeagues.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soccer.png"))); // NOI18N
        viewLeagues.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mis ligas");
        viewLeagues.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 140, -1, -1));

        bodyPanel.add(viewLeagues, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 400, 215));

        getContentPane().add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseClicked
        MyAccountForm myAccountView = new MyAccountForm();
        this.setVisible(false);
        myAccountView.setVisible(true);
    }//GEN-LAST:event_accountPanelMouseClicked

    private void createLeaguePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLeaguePanelMouseClicked
        CreateLeagueForm createLeagueView = new CreateLeagueForm();
        this.setVisible(false);
        createLeagueView.setVisible(true);
    }//GEN-LAST:event_createLeaguePanelMouseClicked

    private void viewLeaguesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLeaguesMouseClicked
        Read_Update_Delete_LeaguesForm myLeagues = new Read_Update_Delete_LeaguesForm();
        this.setVisible(false);
        myLeagues.setVisible(true);
    }//GEN-LAST:event_viewLeaguesMouseClicked

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        LoginForm loginForm = new LoginForm();
        this.setVisible(false);
        loginForm.setVisible(true);
        Common.userID = -1; //<-- se coloca -1 para indicar que no existe ningun usuario logueado (ver logica en dao.DaoImpl)
    }//GEN-LAST:event_logoutPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel createLeaguePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel viewLeagues;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void welcomeUserGreeting() {
        String nombre = dao.getUserById(Common.userID).getNombre();
        welcomeLabel.setText("Bienvenido, " + nombre);
    }
}
