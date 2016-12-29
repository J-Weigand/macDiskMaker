package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static java.lang.System.out;

public class Controller {
    @FXML
    private Button Sierra, Yosemite, ElCapitan, Mavericks;

    @FXML
    private void Choice(ActionEvent event) {
        Button btn = (Button) event.getSource();
        switch(btn.getId())
        {
            case "Sierra":
                out.println("Sierra - Clicked");
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
