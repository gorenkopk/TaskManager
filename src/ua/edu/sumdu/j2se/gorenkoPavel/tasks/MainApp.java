package ua.edu.sumdu.j2se.gorenkoPavel.tasks;
/*
 * это основной запускаемый модуль программы
 * */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.edu.sumdu.j2se.gorenkoPavel.tasks.controller.TaskManagerController;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/RootView.fxml"));

        Parent root = loader.load();
        Scene scene = new Scene(root, 700, 500);

        TaskManagerController controller = loader.getController();
        controller.setMainApp(this);

        primaryStage.setTitle("Task Manager");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
