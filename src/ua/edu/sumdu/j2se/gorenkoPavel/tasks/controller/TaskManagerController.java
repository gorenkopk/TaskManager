package ua.edu.sumdu.j2se.gorenkoPavel.tasks.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ua.edu.sumdu.j2se.gorenkoPavel.tasks.model.Task;
import ua.edu.sumdu.j2se.gorenkoPavel.tasks.view.RootView;

import java.util.Date;

public class TaskManagerController extends RootView {


    @FXML public void onActionBtnAdd() {
    //    System.out.println("Add");
        listView.add(new Task("newA", new Date()));
    //      displayRows();
    //    System.out.println(taskList.size());
        System.out.println(listView);
    }
}
