package com.schoolproject.admin_movierental;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class admin_loginController {

    @FXML
    private Pane admin_NavBar;

    @FXML
    private Pane OutputPane;

    @FXML
    private void initialize() {
        // Initialize your controller
    }

    @FXML
    private void handleStatusButtonClicked() {

    }

    @FXML
    private void handleUserDataButtonClicked() {

    }

    @FXML
    private void handleDatabaseButtonClicked() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin_databaseNavBar.fxml"));
        Pane databaseNavBar  = loader.load();

        admin_databaseNavBarController controller = loader.getController();
        controller.setOutputPane(OutputPane);

        admin_NavBar.getChildren().setAll(databaseNavBar);
    }

    @FXML
    private void handleLogoutButtonClicked() {
        System.exit(0);
    }

}
