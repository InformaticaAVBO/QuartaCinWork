

public class PlayersController {

    public PlayersModel model;
    public PlayerView view;

    public PlayersController(PlayersModel model, PlayerView view) {
        this.model = model;
        this.view = view;
        
        this.view.showPlayer(model.getCurrentPlayer());
        
        this.view.addForwardHook(e -> forward());
        this.view.addBackHook(e -> back());
    }
    
    private void forward() {
        model.forward();
        view.showPlayer(model.getCurrentPlayer());
    }
    
    private void back() {
        model.bach();
        view.showPlayer(model.getCurrentPlayer());
    }
    
}
