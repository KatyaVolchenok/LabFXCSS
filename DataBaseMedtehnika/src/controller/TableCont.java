/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DataBase;
import model.Medtehnika;
import setting.Setting;
import stage.Note;

/**
 *
 * @author HoziainKompa365
 */
public class TableCont implements Initializable {
    
    @FXML
    TableView table;
    @FXML
    TableColumn<Medtehnika, Integer> id;
    @FXML
    TableColumn<Medtehnika, String> medname;
    @FXML
    TableColumn<Medtehnika, String> model;
    @FXML
    TableColumn<Medtehnika, String> sernumber;
    @FXML
    TableColumn<Medtehnika, String> manufact;
    @FXML
    TableColumn<Medtehnika, String> department;
    
    
    @FXML
    private void buttonActionUpdate(ActionEvent event) {
        updateTable();
    }
    
    @FXML
    private void buttonActionNote(ActionEvent event) {
        try {
            
            Note note = new Note();
        } catch (IOException ex) {
            Logger.getLogger(TableCont.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
     @FXML
    private void buttonOut(ActionEvent event) {
        exit();
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    private void updateTable(){
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        medname.setCellValueFactory(new PropertyValueFactory<>("medname"));
        model.setCellValueFactory(new PropertyValueFactory<>("model"));
        sernumber.setCellValueFactory(new PropertyValueFactory<>("sernumber"));
        manufact.setCellValueFactory(new PropertyValueFactory<>("manufact"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
        table.setItems(DataBase.getMedtehnikaList()); 
    }  
    
}
