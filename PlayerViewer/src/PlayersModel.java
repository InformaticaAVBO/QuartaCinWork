

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PlayersModel {
    public File _f;
    public Player[] p;
    public int current;
    
    public PlayersModel(File f) {
        _f = f;
        parse();
    }
    
    public void forward_player() {
        current = (current+1)%p.length;
    }
    
    
    public void back_player() {
        current = (current-1);
        if (current < 0) current = p.length - 1;
    }
    
    public Player getCurrentPlayer() {
        return p[current];
    }
    
    private void parse() {    
        try {
            Scanner slen = new Scanner(new FileReader(_f));
            int len;
            for(len=0;slen.hasNextLine();++len) slen.nextLine();
            p = new Player[len];
            current = 0;
            slen.close();
            Scanner s = new Scanner(new FileReader(_f));
            for (int i = 0; s.hasNextLine(); ++i) {
               p[i] = new Player(s.nextLine());
            }
            s.close();
        } catch (IOException e) {
            System.out.println("kill the developer");
        }
    }
}
