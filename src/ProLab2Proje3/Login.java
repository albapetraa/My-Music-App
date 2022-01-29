/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProLab2Proje3;

import java.sql.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
        String[] x = getAllCountries();
        for (String q : x) {
            ulkeComboBox.addItem(q);
        }
        ulkeComboBox.setSelectedIndex(-1);
    }
    User kullanici = null;

    public String[] getAllCountries() {
        String[] countries = new String[Locale.getISOCountries().length];
        String[] countryCodes = Locale.getISOCountries();
        for (int i = 0; i < countryCodes.length; i++) {
            Locale obj = new Locale("", countryCodes[i]);
            countries[i] = obj.getDisplayCountry();
        }
        return countries;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        girisPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kullaniciAdiBolumu = new javax.swing.JTextField();
        girisButon = new javax.swing.JButton();
        kullaniciSifreBolumu = new javax.swing.JPasswordField();
        kayitPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kullaniciAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullaniciMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ulkeComboBox = new javax.swing.JComboBox<>();
        kayitButon = new javax.swing.JButton();
        kullaniciSifre = new javax.swing.JPasswordField();
        adminPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        adminSifre = new javax.swing.JTextField();
        adminButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");

        jLabel5.setText("Kullanıcı Adı");

        jLabel6.setText("Şifre");

        girisButon.setText("Giriş");
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout girisPanelLayout = new javax.swing.GroupLayout(girisPanel);
        girisPanel.setLayout(girisPanelLayout);
        girisPanelLayout.setHorizontalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(girisButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kullaniciAdiBolumu)
                    .addComponent(kullaniciSifreBolumu, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        girisPanelLayout.setVerticalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kullaniciAdiBolumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kullaniciSifreBolumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(girisButon)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Giriş", girisPanel);

        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setText("Şifre");

        jLabel3.setText("Email Adresi");

        jLabel4.setText("Ülke");

        kayitButon.setText("Üye Ol");
        kayitButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kayitPanelLayout = new javax.swing.GroupLayout(kayitPanel);
        kayitPanel.setLayout(kayitPanelLayout);
        kayitPanelLayout.setHorizontalGroup(
            kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kayitButon, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(kullaniciAdi)
                    .addComponent(kullaniciMail)
                    .addComponent(ulkeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kullaniciSifre))
                .addGap(79, 79, 79))
        );
        kayitPanelLayout.setVerticalGroup(
            kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayitPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kullaniciMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ulkeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayitButon)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üye Ol", kayitPanel);

        jLabel7.setText("Admin token");

        adminButon.setText("Giriş");
        adminButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminButon, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(adminSifre))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(adminSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminButon)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin Giriş", adminPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void otomatikKullaniciListeleriOlustur() {
        User kullanici2 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritabanına Bağlandı.");

            String query4 = "SELECT kullaniciId, kullaniciAdi, kullaniciTipi, kullaniciOdemeKontrolu"
                    + " FROM kullanicilar WHERE kullaniciAdi='" + kullaniciAdi.getText()
                    + "'";

            Statement ifade4 = conn.createStatement();
            ResultSet rs4 = ifade4.executeQuery(query4);
            while (rs4.next()) {
                String a = rs4.getString("kullaniciId");
                String b = rs4.getString("kullaniciAdi");
                String c = rs4.getString("kullaniciTipi");
                String d = rs4.getString("kullaniciOdemeKontrolu");
                Boolean odemeKontrol = false;
                if (Integer.parseInt(d) == 1) {
                    odemeKontrol = true;
                }
                kullanici2 = new User(Integer.parseInt(a), b, c, odemeKontrol);
            }

            String query = "INSERT INTO playlists(playlistName,playlistOwnerId) "
                    + "VALUES('" + kullanici2.getUserName() + " Pop Playlist" + "','" + kullanici2.getUserId() + "')";
            Statement ifade = conn.createStatement();
            ifade.execute(query);

            String query2 = "INSERT INTO playlists(playlistName,playlistOwnerId) "
                    + "VALUES('" + kullanici2.getUserName() + " Jazz Playlist" + "','" + kullanici2.getUserId() + "')";

            Statement ifade2 = conn.createStatement();
            ifade.execute(query2);

            String query3 = "INSERT INTO playlists(playlistName,playlistOwnerId) "
                    + "VALUES('" + kullanici2.getUserName() + " Klasik Playlist" + "','" + kullanici2.getUserId() + "')";
            Statement ifade3 = conn.createStatement();
            ifade.execute(query3);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritabanına Bağlanamadı." + e);

        }
    }

    private void kayitButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitButonActionPerformed

        String userName = kullaniciAdi.getText();
        String userPass = new String(kullaniciSifre.getPassword());
        String userMail = kullaniciMail.getText();
        String userUlke = ulkeComboBox.getSelectedItem().toString();
        Boolean bilgiDogrulugu = true;
        if (!userMail.contains("@")) {
            JOptionPane.showMessageDialog(null, "Lütfen mailinizi doğru girin.");
            bilgiDogrulugu = false;
        }
        if (bilgiDogrulugu) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
                System.out.println("Veritabanına Bağlandı.");

                String query = "INSERT INTO kullanicilar(kullaniciAdi,kullaniciSifre,kullaniciMail,kullaniciUlke,kullaniciTipi,kullaniciOdemeKontrolu) "
                        + "VALUES('" + userName + "','" + userPass + "','" + userMail + "','" + userUlke + "','Normal','0')";

                Statement ifade = conn.createStatement();
                ifade.execute(query);
                otomatikKullaniciListeleriOlustur();
                JOptionPane.showMessageDialog(kayitPanel, "Kaydınız Başarıyla Oluşturuldu Giriş Yapabilirsiniz.");

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Veritabanına Bağlanamadı." + e);

            }
        }
    }//GEN-LAST:event_kayitButonActionPerformed

    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritabanına Bağlandı.");

            String query = "SELECT * FROM kullanicilar WHERE kullaniciAdi='" + kullaniciAdiBolumu.getText()
                    + "' && kullaniciSifre='" + new String(kullaniciSifreBolumu.getPassword()) + "'";

            Statement ifade = conn.createStatement();
            ResultSet rs = ifade.executeQuery(query);

            if (rs.next()) {
                String query2 = "SELECT kullaniciId, kullaniciAdi, kullaniciTipi, kullaniciOdemeKontrolu"
                        + " FROM kullanicilar WHERE kullaniciAdi='" + kullaniciAdiBolumu.getText()
                        + "'";

                Statement ifade2 = conn.createStatement();
                ResultSet rs2 = ifade2.executeQuery(query2);
                while (rs2.next()) {
                    String a = rs.getString("kullaniciId");
                    String b = rs.getString("kullaniciAdi");
                    String c = rs.getString("kullaniciTipi");
                    String d = rs.getString("kullaniciOdemeKontrolu");
                    Boolean odemeKontrol = false;
                    if (Integer.parseInt(d) == 1) {
                        odemeKontrol = true;
                    }
                    kullanici = new User(Integer.parseInt(a), b, c, odemeKontrol);
                }

                UserDashboard UserDashboard = new UserDashboard();
                UserDashboard.userKullanma(kullanici);
                UserDashboard.show();
                dispose();
                JOptionPane.showMessageDialog(null, "Başarıyla giriş yaptınız.");
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre hatalı.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritabanına Bağlanamadı." + e);

        }

    }//GEN-LAST:event_girisButonActionPerformed

    private void adminButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButonActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritabanına Bağlandı.");

            String query = "SELECT * FROM admintoken WHERE token='" + adminSifre.getText() + "'";

            Statement ifade = conn.createStatement();
            ResultSet rs = ifade.executeQuery(query);

            if (rs.next()) {
//                dispose();//ekranı kapatır
                JOptionPane.showMessageDialog(null, "Başarıyla giriş yaptınız.");
                AdminDashboard adminDashboard = new AdminDashboard();
                adminDashboard.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Admin token geçersiz.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritabanına Bağlanamadı." + e);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adminButonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButon;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTextField adminSifre;
    private javax.swing.JButton girisButon;
    private javax.swing.JPanel girisPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayitButon;
    private javax.swing.JPanel kayitPanel;
    private javax.swing.JTextField kullaniciAdi;
    private javax.swing.JTextField kullaniciAdiBolumu;
    private javax.swing.JTextField kullaniciMail;
    private javax.swing.JPasswordField kullaniciSifre;
    private javax.swing.JPasswordField kullaniciSifreBolumu;
    private javax.swing.JComboBox<String> ulkeComboBox;
    // End of variables declaration//GEN-END:variables
}