
public class Coppia<PE,SE> {

    private PE x;
    private SE s;

    public Coppia(PE x, SE s) {
        this.x = x;
        this.s = s;
    }

    public String toString() {
        return s.toString() + x.toString();
    }

}
