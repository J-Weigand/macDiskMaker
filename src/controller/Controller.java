package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

import static java.lang.System.out;

public class Controller {
    public static String workingDir = System.getProperty("user.dir");
    @FXML
    private Button Sierra, Yosemite, ElCapitan, Mavericks;

    @FXML
    private void Choice(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        switch(btn.getId())
        {
            case "Sierra":
                out.println("Sierra - Clicked");
                Runtime.getRuntime().exec("open -a Terminal");
                break;
            case "Capitan":
                out.println("El Capitan - Clicked");
                break;
            case "Yosemite":
                out.println("Yosemite - Clicked");
                break;
            case "Mavericks":
                out.println("Mavericks - Clicked");
                break;
        }
    }
}
