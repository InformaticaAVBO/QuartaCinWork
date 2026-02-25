public class App {
    public static void main(String[] args) throws Exception {

        Player p1 = new Player("Tizio");
        Player p2 = new Player("Caio");
        p2.setValore(150);
        System.out.println(p1);
        System.out.println(p2);
        p1.save();
        p2.save();

        // salva un array di players
        Player[] pl = new Player[10];
        pl[0] = p1;
        pl[1] = p2;
        





    }
}
