/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Putri Usriyatul
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField Nama;
    @FXML
    private TextField Absen;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Telepon;
    @FXML
    private Button btnProses;
    @FXML
    private TextArea Hasil;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        String telepon = Telepon.getText();
        
        Hasil.setText("Nama Anda : "+Nama+" Absen "+Absen+" Alamat Rumah Anda "+Alamat+" Nomor telepon "+Telepon);
    }
    
}
