/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet_bank;

import com.jfoenix.controls.JFXPasswordField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author sheva
 */
public class FXMLDocumentController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnc;

    @FXML
    private Button btn0;

    @FXML
    private Button btnok;
    
    @FXML
    private JFXPasswordField editpin;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

      @FXML
    void tekan0(ActionEvent event) {
        pin += "0";
        editpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }
    
     @FXML
    void tekan3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }

    @FXML
    void tekanc(ActionEvent event) {
        pin = "";
        editpin.setText(pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
        if (pin.equals(PIN)){
            try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("penarikan.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 489);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Moklet Bank");
            stage.show();
            } 
            catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa"+kesempatan+"Kesempatan Lagi!");
            editpin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    
}
