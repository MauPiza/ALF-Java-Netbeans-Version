package views;

import common.Common;
import dao.DaoImpl;
import model.League;

public class CreateLeagueForm extends javax.swing.JFrame {

    DaoImpl dbService = new DaoImpl();
    League league = new League();
    Dashboard dashboard = new Dashboard();

    public CreateLeagueForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backToDashboardLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreLigaField = new javax.swing.JTextField();
        nombreLigaLabel1 = new javax.swing.JLabel();
        nombreLigaLabel2 = new javax.swing.JLabel();
        crearLigaBtn = new javax.swing.JPanel();
        crearLigaLabel = new javax.swing.JLabel();
        cupoComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador de Ligas de Fútbol");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(0, 103, 91));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear una liga");
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

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

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 380, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 370, 10));

        nombreLigaField.setBackground(new java.awt.Color(255, 255, 255));
        nombreLigaField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nombreLigaField.setForeground(new java.awt.Color(102, 102, 102));
        nombreLigaField.setText("Nombre de la liga o torneo");
        nombreLigaField.setBorder(null);
        jPanel1.add(nombreLigaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 38));

        nombreLigaLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreLigaLabel1.setForeground(new java.awt.Color(51, 51, 51));
        nombreLigaLabel1.setText("Nombre de la liga");
        jPanel1.add(nombreLigaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        nombreLigaLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreLigaLabel2.setForeground(new java.awt.Color(51, 51, 51));
        nombreLigaLabel2.setText("Límite de equipos inscritos");
        jPanel1.add(nombreLigaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        crearLigaBtn.setBackground(new java.awt.Color(0, 96, 100));
        crearLigaBtn.setLayout(new java.awt.BorderLayout());

        crearLigaLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        crearLigaLabel.setForeground(new java.awt.Color(255, 255, 255));
        crearLigaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearLigaLabel.setText("CREAR LIGA");
        crearLigaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearLigaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearLigaLabelMouseClicked(evt);
            }
        });
        crearLigaBtn.add(crearLigaLabel, java.awt.BorderLayout.CENTER);

        jPanel1.add(crearLigaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 130, 60));

        cupoComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cupoComboBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        cupoComboBox.setForeground(new java.awt.Color(51, 51, 51));
        cupoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "24", "32" }));
        cupoComboBox.setBorder(null);
        jPanel1.add(cupoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 420, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearLigaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearLigaLabelMouseClicked
        createLeague();
    }//GEN-LAST:event_crearLigaLabelMouseClicked

    private void backToDashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToDashboardLabelMouseClicked
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_backToDashboardLabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateLeagueForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backToDashboardLabel;
    private javax.swing.JPanel crearLigaBtn;
    private javax.swing.JLabel crearLigaLabel;
    private javax.swing.JComboBox<String> cupoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField nombreLigaField;
    private javax.swing.JLabel nombreLigaLabel1;
    private javax.swing.JLabel nombreLigaLabel2;
    // End of variables declaration//GEN-END:variables

    private void createLeague() {
        league.setNombre(nombreLigaField.getText());
        league.setCupo(Integer.valueOf(cupoComboBox.getSelectedItem().toString()));
        league.setId_user(Common.userID);
        dbService.createLeague(league);
    }

}
