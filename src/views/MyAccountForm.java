package views;

import common.Common;
import dao.DaoImpl;
import javax.swing.JOptionPane;
import model.User;
import util.FileCreator;

public class MyAccountForm extends javax.swing.JFrame {

    DaoImpl dbService = new DaoImpl();
    Dashboard dashboard = new Dashboard();
    FileCreator fileCreator = new FileCreator();
    LoginForm loginForm = new LoginForm();
    User user = new User();

    public MyAccountForm() {
        initComponents();
        setLocationRelativeTo(null);
        getUserData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        agregarUsuarioLabel = new javax.swing.JLabel();
        tipoSangreComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        backToDashboardLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        printLabel = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        apellidosField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        birthdayField = new javax.swing.JFormattedTextField();
        jSeparator7 = new javax.swing.JSeparator();
        buttonDelete = new javax.swing.JPanel();
        deleteAccountLabel = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        celularField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de Ligas de Fútbol");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(0, 103, 91));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarUsuarioLabel.setFont(new java.awt.Font("Roboto Slab", 0, 36)); // NOI18N
        agregarUsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        agregarUsuarioLabel.setText("Mi perfil");
        leftPanel.add(agregarUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        tipoSangreComboBox.setBackground(new java.awt.Color(248, 255, 215));
        tipoSangreComboBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tipoSangreComboBox.setForeground(new java.awt.Color(51, 51, 51));
        tipoSangreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -" }));
        tipoSangreComboBox.setBorder(null);
        tipoSangreComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(tipoSangreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecciona tu tipo de sangre");
        leftPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        backToDashboardLabel.setFont(new java.awt.Font("Roboto Slab Light", 0, 14)); // NOI18N
        backToDashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        backToDashboardLabel.setText("Regresar al dashboard");
        backToDashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToDashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToDashboardLabelMouseClicked(evt);
            }
        });
        leftPanel.add(backToDashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jPanel1.setBackground(new java.awt.Color(194, 206, 219));

        printLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        printLabel.setForeground(new java.awt.Color(51, 51, 51));
        printLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        printLabel.setText("Imprimir información");
        printLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(printLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        leftPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 170, 50));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");
        rightPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("Escribe tu nombre");
        nameField.setBorder(null);
        rightPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 38));

        jSeparator3.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator3.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");
        rightPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        apellidosField.setBackground(new java.awt.Color(255, 255, 255));
        apellidosField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        apellidosField.setForeground(new java.awt.Color(102, 102, 102));
        apellidosField.setText("Escribe tu apellidos");
        apellidosField.setBorder(null);
        rightPanel.add(apellidosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 150, 38));

        jSeparator4.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator4.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");
        rightPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(102, 102, 102));
        emailField.setText("Escribe tu correo electrónico");
        emailField.setBorder(null);
        rightPanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 38));

        jSeparator5.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator5.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 370, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Número de celular");
        rightPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator6.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de nacimiento");
        rightPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        birthdayField.setBackground(new java.awt.Color(255, 255, 255));
        birthdayField.setBorder(null);
        birthdayField.setForeground(new java.awt.Color(153, 153, 153));
        birthdayField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        birthdayField.setText("Ej. 2021-11-29");
        birthdayField.setToolTipText("año - mes - día");
        birthdayField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthdayFieldFocusLost(evt);
            }
        });
        rightPanel.add(birthdayField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, 38));

        jSeparator7.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator7.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 180, 10));

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setForeground(new java.awt.Color(51, 51, 51));
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseClicked(evt);
            }
        });

        deleteAccountLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        deleteAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAccountLabel.setText("ELIMINAR CUENTA");
        deleteAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonDeleteLayout = new javax.swing.GroupLayout(buttonDelete);
        buttonDelete.setLayout(buttonDeleteLayout);
        buttonDeleteLayout.setHorizontalGroup(
            buttonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonDeleteLayout.setVerticalGroup(
            buttonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        buttonUpdate.setBackground(new java.awt.Color(0, 96, 100));
        buttonUpdate.setForeground(new java.awt.Color(51, 51, 51));
        buttonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonUpdateMouseClicked(evt);
            }
        });

        updateLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLabel.setText("ACTUALIZAR");
        updateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonUpdateLayout = new javax.swing.GroupLayout(buttonUpdate);
        buttonUpdate.setLayout(buttonUpdateLayout);
        buttonUpdateLayout.setHorizontalGroup(
            buttonUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonUpdateLayout.setVerticalGroup(
            buttonUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Dirección");
        rightPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        direccionField.setBackground(new java.awt.Color(255, 255, 255));
        direccionField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        direccionField.setForeground(new java.awt.Color(102, 102, 102));
        direccionField.setText("Escribe tu dirección");
        direccionField.setBorder(null);
        rightPanel.add(direccionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 370, 38));

        jSeparator8.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator8.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 370, -1));

        celularField.setBackground(new java.awt.Color(255, 255, 255));
        celularField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        celularField.setForeground(new java.awt.Color(102, 102, 102));
        celularField.setText("Escribe tu número teléfonico");
        celularField.setBorder(null);
        rightPanel.add(celularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 38));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Contraseña");
        rightPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("jPasswordField1");
        passwordField.setBorder(null);
        rightPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 38));

        jSeparator9.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator9.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 370, -1));

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birthdayFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthdayFieldFocusLost
        birthdayField.setText(birthdayField.getText());
    }//GEN-LAST:event_birthdayFieldFocusLost

    private void buttonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseClicked
    }//GEN-LAST:event_buttonDeleteMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        updateUser();
    }//GEN-LAST:event_updateLabelMouseClicked

    private void buttonUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateMouseClicked

    private void deleteAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountLabelMouseClicked
        deleteAccount();
    }//GEN-LAST:event_deleteAccountLabelMouseClicked

    private void backToDashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToDashboardLabelMouseClicked
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_backToDashboardLabelMouseClicked

    private void printLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printLabelMouseClicked
        imprimirInformacion();
    }//GEN-LAST:event_printLabelMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarUsuarioLabel;
    private javax.swing.JTextField apellidosField;
    private javax.swing.JLabel backToDashboardLabel;
    private javax.swing.JFormattedTextField birthdayField;
    private javax.swing.JPanel buttonDelete;
    private javax.swing.JPanel buttonUpdate;
    private javax.swing.JTextField celularField;
    private javax.swing.JLabel deleteAccountLabel;
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel printLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JComboBox<String> tipoSangreComboBox;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables

    private User setUserData() {
        user.setNombre(nameField.getText());
        user.setApellidos(apellidosField.getText());
        user.setEmail(emailField.getText());
        user.setDireccion(direccionField.getText());
        user.setPassword((passwordField.getText()));
        user.setN_celular(celularField.getText());
        user.setF_nacimiento(birthdayField.getText());
        user.setTipo_sangre(tipoSangreComboBox.getSelectedItem().toString());
        return user;
    }

    private void imprimirInformacion() {
        if (fileCreator.createFile(setUserData())) {
            JOptionPane.showMessageDialog(null, "Operación exitosa");
            fileCreator.openDirectory();
        }
    }

    private void updateUser() {
        if (setUserData() != null) {
            dbService.updateUser(Common.userID, setUserData());
            this.setVisible(false);
            dashboard.setVisible(true);
        }
    }

    private void getUserData() {
        user = dbService.getUserById(Common.userID);
        switch (user.getTipo_sangre()) {
            case "O +" ->
                tipoSangreComboBox.setSelectedIndex(0);
            case "O -" ->
                tipoSangreComboBox.setSelectedIndex(1);
            case "A +" ->
                tipoSangreComboBox.setSelectedIndex(2);
            case "A -" ->
                tipoSangreComboBox.setSelectedIndex(3);
        }
        nameField.setText(user.getNombre());
        apellidosField.setText(user.getApellidos());
        emailField.setText(user.getEmail());
        passwordField.setText(user.getPassword());
        celularField.setText(user.getN_celular());
        birthdayField.setText(user.getF_nacimiento());
        direccionField.setText(user.getDireccion());
    }

    private void deleteAccount() {
        dbService.deleteUser(Common.userID);
        this.setVisible(false);
        loginForm.setVisible(true);
    }
}
