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
public class Note extends Stage{
    
    public Note() throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("/FX/NoteFX.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Новые данные");
        setScene(scene);
        show();
    }
}
