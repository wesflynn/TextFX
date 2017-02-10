/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFX;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author wes_4
 */
public class FXMLDocumentController implements Initializable {
    
@FXML
    private TextArea areatext;
    
        @FXML
    private void onNew(ActionEvent event) {
        areatext.clear();
    }
    
        @FXML
    private void onOpen(ActionEvent event) throws FileNotFoundException {
            processor write = new processor();
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");
            File file2 = fileChooser.showOpenDialog(new Stage());
            areatext.setText(write.load(file2));

    }
    
        @FXML
    private void onSave(ActionEvent event) {
            FileChooser fileChooser = new FileChooser();
            processor write = new processor();
            fileChooser.setTitle("Open File");
            //Set extension filter
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);
            File file =fileChooser.showSaveDialog(new Stage());
            if(file != null)
                write.SaveFile(areatext.getText(), file);
    }
    
    @FXML
    private void onAbout(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
