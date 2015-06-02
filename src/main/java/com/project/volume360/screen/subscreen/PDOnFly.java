package com.project.volume360.screen.subscreen;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.project.volume360.screen.Screen;
import com.project.volume360.screen.annotation.FXMLLocation;
import com.project.volume360.screen.factory.ScreenFactory;

@FXMLLocation(location = "/fxml/PDOnFly.fxml")
public class PDOnFly extends Screen {

	private StackPane pdOnFlyHolder;

	@FXML
	private MenuItem closeMenuItem;
	@FXML
	private MenuButton pdOnflyMenu;

	@FXML
	private TextField projectCode;
	@FXML
	private TextField projectName;
	@FXML
	private TextField creatorName;
	@FXML
	private TextField projectLocation;
	@FXML
	private TextField projectType;
	@FXML
	private TextField totalWorker;
	@FXML
	private TextField dailyExpendOnWorker;
	@FXML
	private TextField dailyExpendOnProject;
	@FXML
	private TextField projectBudget;
	@FXML
	private Text projectDetails;

	@FXML
	private DatePicker projectTakenDate;
	@FXML
	private DatePicker projectCompleteDate;

	public PDOnFly() {
	}

	public static PDOnFly getPDOnFly(Stage primaryStage) {
		ScreenFactory screenFactory = new ScreenFactory();
		PDOnFly pdOnFly = (PDOnFly) screenFactory.getScreen(primaryStage,
				PDOnFly.class);
		return pdOnFly;
	}

	public void setHolder(StackPane pdOnFlyHolder) {
		this.pdOnFlyHolder = pdOnFlyHolder;

	}

	private Object pdOnFlyMenuObserver(
			ObservableValue<? extends Boolean> observer, Boolean oldValue,
			Boolean newValue) {
		return null;
	}

	@FXML
	private void initialize() {
		pdOnflyMenu.focusedProperty().addListener(
				(observer, oldValue, newValue) -> pdOnFlyMenuObserver(observer,
						oldValue, newValue));

	}

	@FXML
	private void onMenuItemClicked(ActionEvent actionEvent) {
		MenuItem clickedMenuItem = (MenuItem) actionEvent.getSource();
		switch (clickedMenuItem.getId()) {
		case "closeMenuItem":
			pdOnFlyHolder.getChildren().remove(0);
			pdOnFlyHolder.setVisible(false);
			pdOnFlyHolder.getParent().setVisible(false);
			System.out.println("closeMenuItem clicked");
			break;
		case "editMenuItem":
			editMode();
			System.out.println("editMenuItem clicked");
			break;
		default:
			break;
		}
	}

	private void editMode() {
		projectCode.setEditable(true);
		projectName.setEditable(true);
		creatorName.setEditable(true);
		projectLocation.setEditable(true);
		projectType.setEditable(true);
		totalWorker.setEditable(true);
		dailyExpendOnWorker.setEditable(true);
		dailyExpendOnProject.setEditable(true);
		projectBudget.setEditable(true);
	}

	public StackPane getHolder() {
		return this.pdOnFlyHolder;
	}

}
