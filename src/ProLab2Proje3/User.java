/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProLab2Proje3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class User {

    private int userId;
    private String userName;
    private String userType;
    private Boolean payChecked;
    private ArrayList<Integer> userPlaylistIds = new ArrayList<Integer>();
    private ArrayList<Integer> userFollowingIds = new ArrayList<Integer>();

    public User() {
    }

    public User(int userId, String userName, String userType, Boolean payChecked) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.payChecked = payChecked;
        this.playlistIdBulma();
        this.takipEdilenleriBulma();

    }

    public void takipEdilenleriBulma() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritabanına Bağlandı.");

            String query = "SELECT following_Id FROM following WHERE follower_Id ='" + this.getUserId() + "'";
            Statement ifade = conn.createStatement();
            ifade.execute(query);
            ResultSet rs = ifade.executeQuery(query);

            while (rs.next()) {
                String a = rs.getString("following_Id");
                userFollowingIds.add(Integer.parseInt(a));

            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritabanına Bağlanamadı." + e);

        }
    }

    public void playlistIdBulma() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzikdosyam", "root", "");
            System.out.println("Veritabanına Bağlandı.");

            String query = "SELECT playlistId FROM playlists WHERE playlistOwnerId ='" + this.getUserId() + "'";
            Statement ifade = conn.createStatement();
            ifade.execute(query);
            ResultSet rs = ifade.executeQuery(query);

            while (rs.next()) {
                String a = rs.getString("playlistId");
                userPlaylistIds.add(Integer.parseInt(a));

            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Veritabanına Bağlanamadı." + e);

        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getPayChecked() {
        return payChecked;
    }

    public void setPayChecked(Boolean payChecked) {
        this.payChecked = payChecked;
    }

    public ArrayList<Integer> getUserPlaylistIds() {
        return userPlaylistIds;
    }

    public void setUserPlaylistIds(ArrayList<Integer> userPlaylistIds) {
        this.userPlaylistIds = userPlaylistIds;
    }

    public ArrayList<Integer> getUserFollowingIds() {
        return userFollowingIds;
    }

    public void setUserFollowingIds(ArrayList<Integer> userFollowingIds) {
        this.userFollowingIds = userFollowingIds;
    }

}
