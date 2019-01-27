package ua.edu.sumdu.j2se.gorenkoPavel.tasks.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ua.edu.sumdu.j2se.gorenkoPavel.tasks.MainApp;
import ua.edu.sumdu.j2se.gorenkoPavel.tasks.model.*;

import java.util.ArrayList;
import java.util.Date;


public class RootView {

    @FXML private TableView<Task> tableView;
    @FXML private TableColumn<Task, String> firstNameColumn;

    private MainApp mainApp;

    public ArrayList taskList = new ArrayList();
    public ObservableList listView = FXCollections.observableArrayList(taskList);

    public RootView() {
        /*ArrayTaskList r = new ArrayTaskList();
        r.add(new Task("D", new Date()));
        listView.addAll(r);*/
        // Если разкоментить верхний блок - ошибка компиляции
        //Caused by: java.lang.ClassCastException: ua.edu.sumdu.j2se.gorenkoPavel.tasks.model.ArrayTaskList cannot be cast to ua.edu.sumdu.j2se.gorenkoPavel.tasks.model.Task

        listView.add(new Task("A", new Date()));
        listView.add(new Task("B", new Date()));

        System.out.println(taskList);
    }

    @FXML private void initialize() {
        firstNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));
        firstNameColumn.setText("Title");
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        tableView.setItems(listView);
    }
}
