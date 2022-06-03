package com.example.assigment5;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {

    int score1=0;
    int score2=0;
    Rectangle image = new Rectangle(100,100);
    TranslateTransition translateTransition;
    TranslateTransition translateTransition2;
    TranslateTransition translateTransition3;
    TranslateTransition translateTransition4;
    TranslateTransition translateTransition5;
    TranslateTransition translateTransition6;
    TranslateTransition translateTransition7;
    Rectangle image4 = new Rectangle(100,110);
    Rectangle image2 = new Rectangle(100,110);
    Rectangle imageOne = new Rectangle(100,110);
    Rectangle image7 = new Rectangle(50,50);
    Rectangle image3 = new Rectangle(100,110);
    Rectangle image6 = new Rectangle(50,50);
    Rectangle image5 = new Rectangle(50,50);
    Label scoreChange = new Label("0");
    Pane root = new Pane();
    Scene scene = new Scene(root, 800, 600);
    @Override
    public void start(Stage stage) throws IOException {



        Rectangle imageView= createPlane(scene);
        Rectangle imageViewOne=createClouds(scene);
        Rectangle imageViewTwo= createCloud2(scene);
        Rectangle imageViewThree= createCloud3(scene);
        Rectangle imageViewFour= createCloud4(scene);
        Rectangle imageViewFive= createCloud5(scene);
        Rectangle imageViewSix= createCloud6(scene);
        Rectangle imageViewSeven= createCloud7(scene);
        Label score = new Label("SCORE");
        score.setFont(Font.font("Bauhaus 93", 50));
        score.setTextFill(Color.LIGHTSKYBLUE);
        score.setLayoutX(20);
        score.setLayoutY(20);

        scoreChange.setLayoutY(40);
        scoreChange.setLayoutX(180);
        scoreChange.setFont(Font.font("Bauhaus 93", 30));
        scoreChange.setTextFill(Color.HOTPINK);


        root.getChildren().addAll(imageView,imageViewOne,imageViewTwo,imageViewThree,imageViewFour,score,scoreChange,imageViewFive,imageViewSix,imageViewSeven);
        imageOne.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (image.getBoundsInParent().intersects(imageOne.getBoundsInParent())){

                } else if (image.getBoundsInParent().intersects(image5.getBoundsInParent())) {

                    score1+=5;
                    scoreChange.setText(score1+"");
                }

                else if (image.getBoundsInParent().intersects(image6.getBoundsInParent())) {

                    score1+=10;
                    scoreChange.setText(score1+"");
                }
                else if (image.getBoundsInParent().intersects(image7.getBoundsInParent())) {

                    score1+=160;
                    scoreChange.setText(score1+"");

                    //pause

                }
                else if (image.getBoundsInParent().intersects(imageOne.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }

                else if (image.getBoundsInParent().intersects(imageViewTwo.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }
                else if (image.getBoundsInParent().intersects(imageViewSix.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }
                else if (image.getBoundsInParent().intersects(imageViewThree.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }

                else if (image.getBoundsInParent().intersects(imageViewSeven.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }
                else if (image.getBoundsInParent().intersects(imageViewFour.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }

                else if (image.getBoundsInParent().intersects(imageViewFive.getBoundsInParent())) {

                    translateTransition.pause();
                    translateTransition2.pause();
                    translateTransition3.pause();
                    translateTransition4.pause();
                    translateTransition5.pause();
                    translateTransition6.pause();
                    translateTransition7.pause();
                    GameOver();
                }

            }
        });

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            //double vertical = imageView.getY();
            double x = imageView.getX();
            double y = imageView.getY();
            //imageView.setX(100);
            switch (event.getCode()){
                case RIGHT -> imageView.setX(x + 10);
                case LEFT -> imageView.setX(x - 10);
                case UP -> imageView.setY(y - 10);
                case DOWN -> imageView.setY(y + 10);
            }
        });
        stage.setTitle("Assignment3");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    private Rectangle createCloud7(Scene scene) {

        String icon= getClass().getResource("/dollar.png").toExternalForm();
        Image patter=new Image(icon);
        image7.setY(0);
        image7.setX(500);
        image7.setFill(new ImagePattern(patter));
        translateTransition6 = new TranslateTransition(Duration.millis(5000), image7);
        translateTransition6.setByY(1200f);
        translateTransition6.setCycleCount(600);
        translateTransition6.setAutoReverse(false);
        translateTransition6.play();
        return image7;
    }

    private Rectangle createCloud6(Scene scene) {

        String icon= getClass().getResource("/dollar.png").toExternalForm();
        Image patter=new Image(icon);
        image6.setY(0);
        image6.setX(300);
        image6.setFill(new ImagePattern(patter));

        translateTransition5 = new TranslateTransition(Duration.millis(5000), image6);
        translateTransition5.setByY(800f);
        translateTransition5.setCycleCount(600);
        translateTransition5.setAutoReverse(false);

        translateTransition5.play();

        return image6;
    }

    private Rectangle createCloud5(Scene scene) {

        String icon= getClass().getResource("/dollar.png").toExternalForm();
        Image patter=new Image(icon);
        image5.setY(0);
        image5.setX(100);
        image5.setFill(new ImagePattern(patter));

        translateTransition4 = new TranslateTransition(Duration.millis(5000), image5);
        translateTransition4.setByY(1000f);
        translateTransition4.setCycleCount(600);
        translateTransition4.setAutoReverse(false);

        translateTransition4.play();

        return image5;
    }
    public void GameOver(){
        ImageView gameOver =new ImageView(getClass().getResource("/gameover.png").toExternalForm());
        gameOver.setLayoutX(40);
        gameOver.setLayoutY(10);
        gameOver.setFitWidth(720);
        gameOver.setFitHeight(600);
        root.getChildren().addAll(gameOver);
        score1+=120;
        scoreChange.setText(score1+"");
    }
    private Rectangle createCloud4(Scene scene) {

        String icon= getClass().getResource("/cloud.png").toExternalForm();
        Image patter=new Image(icon);
        image4.setY(130);
        image4.setX(1500);
        image4.setFill(new ImagePattern(patter));

        translateTransition3 = new TranslateTransition(Duration.millis(5000), image4);
        translateTransition3.setByX(-1200f);
        translateTransition3.setCycleCount(6000);
        translateTransition3.setAutoReverse(false);
        translateTransition3.play();

        return image4;
    }

    private Rectangle createCloud3(Scene scene) {

        String icon= getClass().getResource("/cloud.png").toExternalForm();
        Image patter=new Image(icon);
        image3.setY(130);
        image3.setX(1200);
        image3.setFill(new ImagePattern(patter));

        translateTransition7 = new TranslateTransition(Duration.millis(5000), image3);
        translateTransition7.setByX(-1200f);
        translateTransition7.setCycleCount(6000);
        translateTransition7.setAutoReverse(false);

        translateTransition7.play();
        return image3;
    }

    private Rectangle createCloud2(Scene scene) {

        String icon= getClass().getResource("/cloud.png").toExternalForm();
        Image patter=new Image(icon);
        image2.setY(320);
        image2.setX(1000);
        image2.setFill(new ImagePattern(patter));

        translateTransition2 = new TranslateTransition(Duration.millis(8000), image2);
        translateTransition2.setByX(-1900f);
        translateTransition2.setCycleCount(7000);
        translateTransition2.setAutoReverse(false);

        translateTransition2.play();
        return image2;
    }

    private Rectangle createClouds(Scene scene) {

        String icon= getClass().getResource("/cloud.png").toExternalForm();
        Image patter=new Image(icon);
        imageOne.setY(320);
        imageOne.setX(320);
        imageOne.setFill(new ImagePattern(patter));

        translateTransition = new TranslateTransition(Duration.millis(8000), imageOne);
        translateTransition.setByX(-1900f);
        translateTransition.setCycleCount(7000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return imageOne;
    }

    private Rectangle createPlane(Scene scene) {


        String icon= getClass().getResource("/plane.png").toExternalForm();
        Image patter=new Image(icon);
        image.setY(130);
        image.setX(130);
        image.setFill(new ImagePattern(patter));

        return image;
    }

    public static void main(String[] args) {
        launch();
    }
}