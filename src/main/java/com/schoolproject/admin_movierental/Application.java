package com.schoolproject.admin_movierental;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader admin_loginLOADER = new FXMLLoader(Application.class.getResource("admin_loginMain.fxml"));
        Scene admin_loginSCENE = new Scene(admin_loginLOADER.load());
        stage.setTitle("Admin Movie Rental");
        stage.setScene(admin_loginSCENE);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}