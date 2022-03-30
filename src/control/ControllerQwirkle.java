package control;

import gamifier.control.Controller;
import gamifier.model.Model;
import gamifier.view.View;

public class ControllerQwirkle extends Controller {

    public ControllerQwirkle(Model model, View view) {
        super(model, view);
        setControlKey(new ControllerQwirkleKey(model, view, this));
        setControlMouse(new ControllerQwirkleMouse(model, view, this));
        setControlAction (new ControllerQwirkleAction(model, view, this));
    }

    public void nextPlayer() {
        /* What must be done :
          - compute the id of the next player
          - set the model to this id
          - if this id corresponds to a computer :
             - instantiate a Decider,
             - instantiate an ActionPlayer to play what the Decider guesses.
         */
    }
}
