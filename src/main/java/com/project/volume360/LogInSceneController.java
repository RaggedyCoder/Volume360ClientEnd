package com.project.volume360;

import javax.swing.SwingUtilities;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class LogInSceneController {

	@FXML
	private ImageView imageView;

	public LogInSceneController() {
	}

	@FXML
	public void initialize() {
		final Circle clip = new Circle();
		clip.setRadius(imageView.getLayoutBounds().getWidth() / 2);
		clip.setTranslateX(imageView.getLayoutBounds().getWidth() / 2);
		clip.setTranslateY(imageView.getLayoutBounds().getWidth() / 2);
		System.err.println("ok1");
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				imageView
						.setImage(new Image(
								"https://fbcdn-sphotos-e-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10891870_865266643525240_802936034075979196_n.jpg?oh=5ad890fbacc9b79a9d525db06f151456&oe=55B3652A&__gda__=1437970923_76a9ee79a373de16c834cee39ff1c8cc"));

			}
		});
		System.err.println("ok2");
		imageView.setClip(clip);
		imageView
				.setStyle("-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.5), 10, 0.0, 0, 6)");
	}

	@FXML
	public void onHover(MouseEvent mouseEvent) {
		System.out.println("ok");
	}

	@FXML
	public void onClick(ActionEvent actionEvent) {
		System.out.println("ok");
	}

	@FXML
	public void onClickImage(MouseEvent mouseEvent) {
		System.out.println("ok");
	}

}