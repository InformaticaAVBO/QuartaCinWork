
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        PlayerView f1 = new PlayerView();
        f1.setVisible(true);
        
        PlayersModel r = new PlayersModel(new File("data/players.csv"));
        
        @SuppressWarnings("unused")
        PlayersController c = new PlayersController(r, f1);

    }
}
