/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import setting.Setting;
import stage.Table;

/**
 *
 * @author HoziainKompa365
 */
public class AutorizationCont implements Initializable {
    
    @FXML
    Label infoLabel;
    @FXML
    TextField urlField;
    @FXML
    TextField useField;
    @FXML
    PasswordField passField;
    @FXML
    TableView table;
    
    
    
    @FXML
    private void buttonAction(ActionEvent event) {
        Setting setting = new Setting();
        boolean invalidUse = !useField.getText().equals(setting.getValue(Setting.USE));
        boolean invalidPass = !passField.getText().equals(setting.getValue(Setting.PASS));
        if(invalidUse || invalidPass)
                {infoLabel.setText("Введенные данные неверны!!!");
        }else {
                try {
                Table table = new Table();
                } catch (IOException ex) {
                Logger.getLogger(AutorizationCont.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            System.out.println("База подключена");
    }
    
    @FXML
    private void buttonOut(ActionEvent event) {
        exit();
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }  
}
