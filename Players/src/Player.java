import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Player {

    private String name;
    private int valore;

    public Player( String name ) {
        this.name = name;
        valore = 0;
    }

    public void setValore( int valore ) {
        this.valore = valore;
    }

    public void save() {
        File f = new File("data/" + name + ".dat");
        PrintWriter pw;
        try {
            pw = new PrintWriter(f);
            pw.print(valore);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", valore=" + valore + "]";
    }

    

}
