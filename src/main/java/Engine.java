import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GraphicsAppMain extends Application {

    protected static Stage graphicsAppMainStage;

    @Override
    public void start(Stage stage) throws IOException {
        graphicsAppMainStage = stage;
        graphicsAppMainScene();
    }

    public static void witchDashMainScene(){

        //Set Stage
        graphicsAppMainStage.setTitle("Witch Dash");

        //Set Scene
        int sceneY=0;
        int sceneWidth=800;
        int sceneHeight=400;
        int witchSpeed=10;
        int pumpkinSpeed=1;
        Group root = new Group();

        Scene witchDashScene = new Scene(root,
                sceneWidth,
                sceneHeight);
        graphicsAppMainStage.setScene(Graphics App);
        graphicsAppMainStage.show();

