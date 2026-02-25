

public class PlayersController {

    public PlayersModel model;
    public PlayerView view;

    public PlayersController(PlayersModel model, PlayerView view) {
        this.model = model;
        this.view = view;
        
        this.view.showPlayer(model.getCurrentPlayer());
        
        this.view.addForwardHook(e -> forward_hook());
        this.view.addBackHook(e -> back_hook());
    }
    
    private void forward_hook() {
        model.forward_player();
        view.showPlayer(model.getCurrentPlayer());
    }
    
    private void back_hook() {
        model.back_player();
        view.showPlayer(model.getCurrentPlayer());
    }
    
}
