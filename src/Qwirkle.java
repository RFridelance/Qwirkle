import control.ControllerQwirkle;
import gamifier.view.PaneView;
import gamifier.view.SimpleTextView;
import gamifier.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import view.BasicView;


public class Qwirkle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the global model
        Model model = new Model();
        // add some players
        // use model.addComputerPlayer(...) to add a computer player
        // or model.addHumanPlayer(...) to add a computer player
        // e.g. model.addHumanPlayer("player1");

        // ... TO FULFILL ...

        // register the game stage, with a name corresponding to the complete class name of the stage
        // MUST register the model & view for each stage. For example :
        //    StageFactory.registerModel("mystage", "model.BoardGameStageModel");
        //    StageFactory.registerView("mystage", "view.BoardGameStageView");

        // ... TO FULFILL ...

        // create the global view.
        BasicView view = new BasicView(model, stage);
        // create a pane view for the introduction panel
        SimpleTextView introView = new SimpleTextView(600,100, "intro", "playing my board game");
        // create a pane view for the game itself
        PaneView paneView = new PaneView("gamepane");
        // add pane views to the global view.
        view.addPaneView(introView);
        view.addPaneView(paneView);
        // create the controllers.
        ControllerQwirkle control = new ControllerQwirkle(model,view);
        // set the name of the first pane view to use when the game is started
        control.setGamePaneViewName("gamepane");
        // set the name of the stage to create when the game is started
        // e.g. with something like: control.setFirstStageName("mystage");

        // ... TO FULFILL ...

        // show the JavaFx main stage
        stage.show();
        // set the current view to display the intro pane view.
        // In this case, no gamestageview is given since all visual elements are created directly in SimpleTextView.
        view.setView(introView.getName(), null);
    }
}
