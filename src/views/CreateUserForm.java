package views;

import dao.DaoImpl;
import model.User;

public class CreateUserForm extends javax.swing.JFrame {

    User user = new User();
    DaoImpl dbService = new DaoImpl();
    Dashboard dashboard = new Dashboard();
    
    public CreateUserForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        agregarUsuarioLabel = new javax.swing.JLabel();
        seleccionaUsuario = new javax.swing.JLabel();
        tipoSangreComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rolComboBox1 = new javax.swing.JComboBox<>();
        haveAccountLabel = new javax.swing.JLabel();
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
        buttonCreate = new javax.swing.JPanel();
        createLabel = new javax.swing.JLabel();
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
        agregarUsuarioLabel.setText("Regístrate");
        leftPanel.add(agregarUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        seleccionaUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        seleccionaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        seleccionaUsuario.setText("Selecciona un rol de usuario");
        leftPanel.add(seleccionaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        tipoSangreComboBox.setBackground(new java.awt.Color(248, 255, 215));
        tipoSangreComboBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tipoSangreComboBox.setForeground(new java.awt.Color(51, 51, 51));
        tipoSangreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O +", "O -", "A +", "A -" }));
        tipoSangreComboBox.setBorder(null);
        tipoSangreComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(tipoSangreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 350, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selecciona tu tipo de sangre");
        leftPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        rolComboBox1.setBackground(new java.awt.Color(248, 255, 215));
        rolComboBox1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        rolComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        rolComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Árbitro", "Director técnico / dueño del equipo" }));
        rolComboBox1.setBorder(null);
        rolComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(rolComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 350, 40));

        haveAccountLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 14)); // NOI18N
        haveAccountLabel.setText("Tengo una cuenta");
        haveAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haveAccountLabelMouseClicked(evt);
            }
        });
        leftPanel.add(haveAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

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

        buttonCreate.setBackground(new java.awt.Color(0, 96, 100));
        buttonCreate.setForeground(new java.awt.Color(51, 51, 51));
        buttonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreateMouseClicked(evt);
            }
        });

        createLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        createLabel.setForeground(new java.awt.Color(255, 255, 255));
        createLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel.setText("CONFIRMAR");
        createLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonCreateLayout = new javax.swing.GroupLayout(buttonCreate);
        buttonCreate.setLayout(buttonCreateLayout);
        buttonCreateLayout.setHorizontalGroup(
            buttonCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        buttonCreateLayout.setVerticalGroup(
            buttonCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        rightPanel.add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

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

    private void buttonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateMouseClicked
    }//GEN-LAST:event_buttonCreateMouseClicked

    private void createLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseClicked
        createUser();
    }//GEN-LAST:event_createLabelMouseClicked

    private void haveAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveAccountLabelMouseClicked
        LoginForm loginForm = new LoginForm();
        this.setVisible(false);
        loginForm.setVisible(true);
    }//GEN-LAST:event_haveAccountLabelMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarUsuarioLabel;
    private javax.swing.JTextField apellidosField;
    private javax.swing.JFormattedTextField birthdayField;
    private javax.swing.JPanel buttonCreate;
    private javax.swing.JTextField celularField;
    private javax.swing.JLabel createLabel;
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel haveAccountLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel rightPanel;
    private javax.swing.JComboBox<String> rolComboBox1;
    private javax.swing.JLabel seleccionaUsuario;
    private javax.swing.JComboBox<String> tipoSangreComboBox;
    // End of variables declaration//GEN-END:variables

    private void createUser(){
        user.setIdRol(tipoSangreComboBox.getSelectedIndex() + 1);
        user.setNombre(nameField.getText());
        user.setApellidos(apellidosField.getText());
        user.setEmail(emailField.getText());
        user.setDireccion(direccionField.getText());
        user.setPassword((passwordField.getText()));
        user.setN_celular(celularField.getText());
        user.setF_nacimiento(birthdayField.getText());
        user.setTipo_sangre(tipoSangreComboBox.getSelectedItem().toString());
        if(dbService.createUser(user)){
            LoginForm loginForm = new LoginForm();
            this.setVisible(false);
            loginForm.setVisible(true);
        }
    }
}
