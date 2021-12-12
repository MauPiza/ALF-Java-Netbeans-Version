package views;

import common.Common;
import dao.DaoImpl;
import java.util.ArrayList;
import java.util.List;
import model.League;

public class Read_Update_Delete_LeaguesForm extends javax.swing.JFrame {

    DaoImpl dbService = new DaoImpl();
    League league = new League();
    List<League> leagues = new ArrayList();
    Dashboard dashboard = new Dashboard();

    public Read_Update_Delete_LeaguesForm() {
        initComponents();
        setLocationRelativeTo(null);
        refreshComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaEventos = new javax.swing.JComboBox<>();
        bottomPanel = new javax.swing.JPanel();
        buttonUpdate = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();
        nombreLigaLabel1 = new javax.swing.JLabel();
        nombreLigaField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombreLigaLabel2 = new javax.swing.JLabel();
        cupoComboBox = new javax.swing.JComboBox<>();
        separador = new javax.swing.JPanel();
        backToDashboardLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(0, 54, 58));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mis eventos deportivos");
        topPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bg.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Selecciona un evento para ver más detalles");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        listaEventos.setBackground(new java.awt.Color(255, 255, 255));
        listaEventos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        listaEventos.setForeground(new java.awt.Color(51, 51, 51));
        listaEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno" }));
        listaEventos.setBorder(null);
        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });
        bg.add(listaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 40));

        bottomPanel.setBackground(new java.awt.Color(250, 250, 250));
        bottomPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonUpdate.setBackground(new java.awt.Color(66, 142, 146));
        buttonUpdate.setLayout(new java.awt.BorderLayout());

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
        buttonUpdate.add(updateLabel, java.awt.BorderLayout.CENTER);

        bottomPanel.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 5, 110, 40));

        buttonDelete.setBackground(new java.awt.Color(250, 250, 250));
        buttonDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 96, 100), 1, true));
        buttonDelete.setLayout(new java.awt.BorderLayout());

        deleteLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        deleteLabel.setForeground(new java.awt.Color(0, 96, 100));
        deleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLabel.setText("ELIMINAR");
        deleteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
        });
        buttonDelete.add(deleteLabel, java.awt.BorderLayout.CENTER);

        bottomPanel.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 5, 110, 40));

        bg.add(bottomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 50));

        nombreLigaLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreLigaLabel1.setForeground(new java.awt.Color(51, 51, 51));
        nombreLigaLabel1.setText("Nombre de la liga");
        bg.add(nombreLigaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        nombreLigaField.setBackground(new java.awt.Color(255, 255, 255));
        nombreLigaField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nombreLigaField.setForeground(new java.awt.Color(102, 102, 102));
        nombreLigaField.setText("Nombre de la liga o torneo");
        nombreLigaField.setBorder(null);
        bg.add(nombreLigaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 370, 38));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 370, 10));

        nombreLigaLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombreLigaLabel2.setForeground(new java.awt.Color(51, 51, 51));
        nombreLigaLabel2.setText("Límite de equipos inscritos");
        bg.add(nombreLigaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        cupoComboBox.setBackground(new java.awt.Color(255, 255, 255));
        cupoComboBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        cupoComboBox.setForeground(new java.awt.Color(51, 51, 51));
        cupoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "24", "32" }));
        cupoComboBox.setBorder(null);
        bg.add(cupoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 370, 40));

        separador.setBackground(new java.awt.Color(0, 96, 100));
        separador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 2, 290));

        backToDashboardLabel.setFont(new java.awt.Font("Roboto Slab Light", 0, 14)); // NOI18N
        backToDashboardLabel.setForeground(new java.awt.Color(51, 51, 51));
        backToDashboardLabel.setText("Regresar al dashboard");
        backToDashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToDashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToDashboardLabelMouseClicked(evt);
            }
        });
        bg.add(backToDashboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        if (listaEventos.getSelectedIndex() != 0) {
            deleteLeague();
        }
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        getLeagueByName(listaEventos.getSelectedItem().toString());
    }//GEN-LAST:event_listaEventosActionPerformed

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        if (listaEventos.getSelectedIndex() != 0) {
            updateLeague();
        }
    }//GEN-LAST:event_updateLabelMouseClicked

    private void backToDashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToDashboardLabelMouseClicked
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_backToDashboardLabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read_Update_Delete_LeaguesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backToDashboardLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel buttonDelete;
    private javax.swing.JPanel buttonUpdate;
    private javax.swing.JComboBox<String> cupoComboBox;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JTextField nombreLigaField;
    private javax.swing.JLabel nombreLigaLabel1;
    private javax.swing.JLabel nombreLigaLabel2;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables

    private void updateLeague() {
        league.setNombre(nombreLigaField.getText());
        league.setCupo(Integer.valueOf(cupoComboBox.getSelectedItem().toString()));
        dbService.updateLeague(listaEventos.getSelectedItem().toString(), league);
        this.setVisible(false);
        dashboard.setVisible(true);
    }

    private void refreshComboBox() {
        leagues = dbService.getLeaguesByOwner(Common.userID);
        leagues.forEach(element -> {
            String nombreLiga = element.getNombre();
            listaEventos.addItem(nombreLiga);
        });
    }

    private void getLeagueByName(String leagueName) {
        if (listaEventos.getSelectedIndex() != 0) {
            nombreLigaField.setText("");
            league = dbService.getLeagueByName(leagueName);
            nombreLigaField.setText(league.getNombre());
            int cupoObtenido = league.getCupo();
            switch (cupoObtenido) {
                case 8 ->
                    cupoComboBox.setSelectedIndex(0);
                case 16 ->
                    cupoComboBox.setSelectedIndex(1);
                case 24 ->
                    cupoComboBox.setSelectedIndex(2);
                case 32 ->
                    cupoComboBox.setSelectedIndex(3);
            }
        } else {
            nombreLigaField.setText("");
            cupoComboBox.setSelectedIndex(0);
        }
    }

    private void deleteLeague() {
        league = dbService.getLeagueByName(nombreLigaField.getText());
        dbService.deleteLeague(league.getNombre());
        nombreLigaField.setText("");
        listaEventos.setSelectedIndex(0);
        Dashboard dashboard = new Dashboard();
        this.setVisible(false);
        dashboard.setVisible(true);
    }

}
