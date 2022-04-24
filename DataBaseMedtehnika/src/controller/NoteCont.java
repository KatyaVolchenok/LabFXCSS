/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DataBase;
import model.Medtehnika;
import setting.Setting;

/**
 *
 * @author HoziainKompa365
 */
public class NoteCont implements Initializable {
    
    Label infoLabel;
    @FXML
    public TextField mednameField;
    @FXML
    public TextField modelField;
    @FXML
    public TextField sernumberField;
    @FXML
    public TextField manufactField;
    @FXML
    public TextField departmentField;
    
    
    
    
    @FXML
    private void buttonAction(ActionEvent event) {
        String mednameText = mednameField.getText();
        String modelText = modelField.getText();
        String sernumberText = sernumberField.getText();
        String manufactText = manufactField.getText();
        String departmentText = departmentField.getText();
        
        
        if(mednameText.trim().isEmpty()
                    || modelText.trim().isEmpty()
                    || sernumberText.trim().isEmpty()
                    || manufactText.trim().isEmpty()
                    || departmentText.trim().isEmpty())
            {infoLabel.setText("Заполните все поля");}
        else{
            Setting setting = new Setting();
        try (Connection connection = DriverManager.getConnection(
                    setting.getValue(Setting.URL),
                    setting.getValue(Setting.USE),
                    setting.getValue(Setting.PASS));){
            Statement stm = connection.createStatement();
            String sql = "INSERT INTO Medtehnika2 "
                    + "(medname, model, sernumber, manufact, department) "
                    + "VALUES ('" + mednameText + "', '"
                                  + modelText + "', '"
                                  + sernumberText + "', '"
                                  + manufactText + "', '"
                                  + departmentText + "')";

            stm.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
            infoLabel.setText("OK");}
            System.out.println("Добавлено");
    }

   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    
    
}
