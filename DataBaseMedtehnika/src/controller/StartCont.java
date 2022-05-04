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
import stage.Autorization;

/**
 *
 * @author HoziainKompa365
 */
public class StartCont implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void buttonAction(ActionEvent event) {
        try {
            Autorization auto = new Autorization();
            System.out.println("Подключение");
        } catch (IOException ex) {
            Logger.getLogger(StartCont.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Вход");

}
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
