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
public class Autorization extends Stage{
    
    public Autorization() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/FX/AutorizationFX.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Соединение с базой данных");
        setScene(scene);
        show();
    }
}
