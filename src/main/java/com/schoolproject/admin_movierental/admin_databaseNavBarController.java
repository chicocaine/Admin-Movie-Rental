package com.schoolproject.admin_movierental;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class admin_databaseNavBarController {

    private Pane OutputPane;

    public void setOutputPane(Pane outputPane){
        this.OutputPane = outputPane;
    }

    @FXML
    private Button databaseNavBar_AccountDetails;

    @FXML
    private Button databaseNavBar_AccountStatus;

    @FXML
    private AnchorPane databaseNavBar_Panel;

    @FXML
    private void handleDatabaseAccountDetails() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin_databaseAccountDetailsPanel.fxml"));
        Pane databasePanel =loader.load();

        OutputPane.getChildren().setAll(databasePanel);
    }

}
