/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProLab2Proje3;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class takipUser extends javax.swing.JFrame {

    private int takipUserId;
    private ArrayList<Integer> takipUserPlaylistIds = new ArrayList<Integer>();
    private String takipUserName;
    private User user = null;

    /**
     * Creates new form NewJFrame
     */
    public takipUser() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        calmaListeneEkle = new javax.swing.JMenu();
        kendiPop = new javax.swing.JMenuItem();
        kendiJazz = new javax.swing.JMenuItem();
        kendiKlasik = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jazzButon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        popButon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        klasikButon = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();

        calmaListeneEkle.setText("Kendi ??alma Listene Ekle");

        kendiPop.setText("Pop");
        kendiPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendiPopActionPerformed(evt);
            }
        });
        calmaListeneEkle.add(kendiPop);

        kendiJazz.setText("Jazz");
        kendiJazz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendiJazzActionPerformed(evt);
            }
        });
        calmaListeneEkle.add(kendiJazz);

        kendiKlasik.setText("Klasik");
        kendiKlasik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendiKlasikActionPerformed(evt);
            }
        });
        calmaListeneEkle.add(kendiKlasik);

        popUpMenu.add(calmaListeneEkle);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("M??zik Dosyam");

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jazzButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jazzButonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jazz");

        javax.swing.GroupLayout jazzButonLayout = new javax.swing.GroupLayout(jazzButon);
        jazzButon.setLayout(jazzButonLayout);
        jazzButonLayout.setHorizontalGroup(
            jazzButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jazzButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jazzButonLayout.setVerticalGroup(
            jazzButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jazzButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        popButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popButonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pop");

        javax.swing.GroupLayout popButonLayout = new javax.swing.GroupLayout(popButon);
        popButon.setLayout(popButonLayout);
        popButonLayout.setHorizontalGroup(
            popButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        popButonLayout.setVerticalGroup(
            popButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        klasikButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klasikButonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Klasik");

        javax.swing.GroupLayout klasikButonLayout = new javax.swing.GroupLayout(klasikButon);
        klasikButon.setLayout(klasikButonLayout);
        klasikButonLayout.setHorizontalGroup(
            klasikButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(klasikButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        klasikButonLayout.setVerticalGroup(
            klasikButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(klasikButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kullan??c??s??n??n ??alma Listeleri");

        userLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("UserName");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jazzButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(klasikButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(popButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(popButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jazzButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(klasikButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabloMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popButonMouseClicked
        DefaultTableModel model = new DefaultTableModel(new String[]{"#", "??ark?? Ad??", "Sanat????", "Alb??m", "T??r", "Tarih", "S??re"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritaban??na Ba??land??.");

            String query = "SELECT sarkilar.sarkiId, sarkilar.sarkiAdi, sanatcilar.sanatciAdi,  albumler.albumAdi,sarkilar.sarkiTur,sarkilar.sarkiTarih ,sarkilar.sarkiSure "
                    + "FROM sarkilar,albumler,sanatcilar "
                    + "WHERE sarkilar.albumId = albumler.albumId && sarkilar.sarkiciId = sanatcilar.sanatciId && sarkilar.sarkiId IN(SELECT playlistsongs.songId "
                    + "FROM playlists,playlistsongs "
                    + "WHERE playlists.playlistId = playlistsongs.playlistId && playlists.playlistOwnerId =" + this.takipUserId + " && playlists.playlistId = " + this.getTakipUserPlaylistIds().get(0) + ")";

            Statement ifade = conn.createStatement();
            ResultSet rs = ifade.executeQuery(query);
            while (rs.next()) {
                String q = rs.getString("sarkilar.sarkiId");
                String a = rs.getString("sarkilar.sarkiAdi");
                String b = rs.getString("sanatcilar.sanatciAdi");
                String c = rs.getString("albumler.albumAdi");
                String c2 = rs.getString("sarkilar.sarkiTur");
                String d = rs.getString("sarkilar.sarkiTarih");
                String e = rs.getString("sarkilar.sarkiSure");

                model.addRow(new Object[]{q, a, b, c, c2, d, e});

            }
            tablo.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritaban??na Ba??lanamad??." + e);
        }
    }//GEN-LAST:event_popButonMouseClicked

    private void jazzButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzButonMouseClicked
        DefaultTableModel model = new DefaultTableModel(new String[]{"#", "??ark?? Ad??", "Sanat????", "Alb??m", "T??r", "Tarih", "S??re"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritaban??na Ba??land??.");

            String query = "SELECT sarkilar.sarkiId, sarkilar.sarkiAdi, sanatcilar.sanatciAdi,  albumler.albumAdi,sarkilar.sarkiTur,sarkilar.sarkiTarih ,sarkilar.sarkiSure "
                    + "FROM sarkilar,albumler,sanatcilar "
                    + "WHERE sarkilar.albumId = albumler.albumId && sarkilar.sarkiciId = sanatcilar.sanatciId && sarkilar.sarkiId IN(SELECT playlistsongs.songId "
                    + "FROM playlists,playlistsongs "
                    + "WHERE playlists.playlistId = playlistsongs.playlistId && playlists.playlistOwnerId =" + this.takipUserId + " && playlists.playlistId = " + this.getTakipUserPlaylistIds().get(1) + ")";

            Statement ifade = conn.createStatement();
            ResultSet rs = ifade.executeQuery(query);
            while (rs.next()) {
                String q = rs.getString("sarkilar.sarkiId");
                String a = rs.getString("sarkilar.sarkiAdi");
                String b = rs.getString("sanatcilar.sanatciAdi");
                String c = rs.getString("albumler.albumAdi");
                String c2 = rs.getString("sarkilar.sarkiTur");
                String d = rs.getString("sarkilar.sarkiTarih");
                String e = rs.getString("sarkilar.sarkiSure");

                model.addRow(new Object[]{q, a, b, c, c2, d, e});

            }
            tablo.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritaban??na Ba??lanamad??." + e);
        }
    }//GEN-LAST:event_jazzButonMouseClicked

    private void klasikButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klasikButonMouseClicked
        DefaultTableModel model = new DefaultTableModel(new String[]{"#", "??ark?? Ad??", "Sanat????", "Alb??m", "T??r", "Tarih", "S??re"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritaban??na Ba??land??.");

            String query = "SELECT sarkilar.sarkiId, sarkilar.sarkiAdi, sanatcilar.sanatciAdi,  albumler.albumAdi,sarkilar.sarkiTur,sarkilar.sarkiTarih ,sarkilar.sarkiSure "
                    + "FROM sarkilar,albumler,sanatcilar "
                    + "WHERE sarkilar.albumId = albumler.albumId && sarkilar.sarkiciId = sanatcilar.sanatciId && sarkilar.sarkiId IN(SELECT playlistsongs.songId "
                    + "FROM playlists,playlistsongs "
                    + "WHERE playlists.playlistId = playlistsongs.playlistId && playlists.playlistOwnerId =" + this.takipUserId + " && playlists.playlistId = " + this.getTakipUserPlaylistIds().get(2) + ")";

            Statement ifade = conn.createStatement();
            ResultSet rs = ifade.executeQuery(query);
            while (rs.next()) {
                String q = rs.getString("sarkilar.sarkiId");
                String a = rs.getString("sarkilar.sarkiAdi");
                String b = rs.getString("sanatcilar.sanatciAdi");
                String c = rs.getString("albumler.albumAdi");
                String c2 = rs.getString("sarkilar.sarkiTur");
                String d = rs.getString("sarkilar.sarkiTarih");
                String e = rs.getString("sarkilar.sarkiSure");

                model.addRow(new Object[]{q, a, b, c, c2, d, e});

            }
            tablo.setModel(model);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritaban??na Ba??lanamad??." + e);
        }
    }//GEN-LAST:event_klasikButonMouseClicked

    private void tabloMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && tablo.getSelectedRowCount() != 0) {
                popUpMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tabloMouseReleased

    private void kendiPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendiPopActionPerformed
        int userPopPlaylistId = user.getUserPlaylistIds().get(0);
        int row = tablo.getSelectedRow();
        int songId = Integer.parseInt(tablo.getModel().getValueAt(row, 0).toString());
        if (tablo.getModel().getValueAt(row, 4).toString().equals("Pop")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
                System.out.println("Veritaban??na Ba??land??.");

                String query = "INSERT INTO playlistsongs(playlistId,songId) "
                        + "VALUES('" + userPopPlaylistId + "','" + songId + "')";

                Statement ifade = conn.createStatement();
                ifade.execute(query);

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Veritaban??na Ba??lanamad??." + e);

            }
        } else {
            System.out.println("M??zik t??r?? ile playlist t??r?? ayn?? olmal??");
        }
    }//GEN-LAST:event_kendiPopActionPerformed

    private void kendiJazzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendiJazzActionPerformed
        int userPopPlaylistId = user.getUserPlaylistIds().get(1);
        int row = tablo.getSelectedRow();
        int songId = Integer.parseInt(tablo.getModel().getValueAt(row, 0).toString());
        if (tablo.getModel().getValueAt(row, 4).toString().equals("Jazz")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
                System.out.println("Veritaban??na Ba??land??.");

                String query = "INSERT INTO playlistsongs(playlistId,songId) "
                        + "VALUES('" + userPopPlaylistId + "','" + songId + "')";

                Statement ifade = conn.createStatement();
                ifade.execute(query);

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Veritaban??na Ba??lanamad??." + e);

            }
        } else {
            System.out.println("M??zik t??r?? ile playlist t??r?? ayn?? olmal??");
        }
    }//GEN-LAST:event_kendiJazzActionPerformed

    private void kendiKlasikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendiKlasikActionPerformed
        int userPopPlaylistId = user.getUserPlaylistIds().get(2);
        int row = tablo.getSelectedRow();
        int songId = Integer.parseInt(tablo.getModel().getValueAt(row, 0).toString());
        if (tablo.getModel().getValueAt(row, 4).toString().equals("Klasik")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
                System.out.println("Veritaban??na Ba??land??.");

                String query = "INSERT INTO playlistsongs(playlistId,songId) "
                        + "VALUES('" + userPopPlaylistId + "','" + songId + "')";

                Statement ifade = conn.createStatement();
                ifade.execute(query);

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Veritaban??na Ba??lanamad??." + e);

            }
        } else {
            System.out.println("M??zik t??r?? ile playlist t??r?? ayn?? olmal??");
        }
    }//GEN-LAST:event_kendiKlasikActionPerformed

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTakipUserId() {
        return takipUserId;
    }

    public void setTakipUserId(int takipUserId) {
        this.takipUserId = takipUserId;
    }

    public ArrayList<Integer> getTakipUserPlaylistIds() {
        return takipUserPlaylistIds;
    }

    public void setTakipUserPlaylistIds(ArrayList<Integer> takipUserPlaylistIds) {
        this.takipUserPlaylistIds = takipUserPlaylistIds;
    }

    public String getTakipUserName() {
        return takipUserName;
    }

    public void setTakipUserName(String takipUserName) {
        userLabel.setText(takipUserName);
        this.takipUserName = takipUserName;
    }

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
            java.util.logging.Logger.getLogger(takipUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(takipUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(takipUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(takipUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new takipUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu calmaListeneEkle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jazzButon;
    private javax.swing.JMenuItem kendiJazz;
    private javax.swing.JMenuItem kendiKlasik;
    private javax.swing.JMenuItem kendiPop;
    private javax.swing.JPanel klasikButon;
    private javax.swing.JPanel popButon;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTable tablo;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
