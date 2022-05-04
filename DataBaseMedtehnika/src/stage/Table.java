/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HoziainKompa365
 */
public class Table extends Stage{
    
    public Table() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/FX/TableFX.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Список оборудования");
        setScene(scene);
        show();
    }   
}
