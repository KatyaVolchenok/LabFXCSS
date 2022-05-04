/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import setting.Setting;

/**
 *
 * @author HoziainKompa365
 */
public class DataBase {
    public static ObservableList<Medtehnika> getMedtehnikaList(){
        List<Medtehnika> medteh = new ArrayList<>();
        Setting settings = new Setting();
        
        try (Connection connection = DriverManager.getConnection(settings.getValue(Setting.URL),
                    settings.getValue(Setting.USE),
                    settings.getValue(Setting.PASS));){
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT*FROM Medtehnika2");
            Medtehnika med = null;
            while (rs.next()) {
                med = new Medtehnika(
                        rs.getInt(1),  
                        rs.getString(2),  
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                medteh.add(med);   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return FXCollections.observableArrayList(medteh);
    }
}
