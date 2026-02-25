
public class Player {
    private String nome;
    private String ruolo;
    private int gare;
    private int goal;
    private int assist;

    public Player(String name, String ruolo, int gare, int goal, int assist) {
        this.nome = name;
        this.ruolo = ruolo;
        this.gare = gare;
        this.goal = goal;
        this.assist = assist;
    }
    
    public Player(String csv) {
        String[] s = csv.split(",");
        nome = s[0];
        ruolo = s[1];
        gare = Integer.parseInt(s[2]);
        goal = Integer.parseInt(s[3]);
        assist = Integer.parseInt(s[4]);
    }

    public String getNome() {
        return nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getGare() {
        return gare;
    }

    public int getGoal() {
        return goal;
    }

    public int getAssist() {
        return assist;
    }
    
    
    @Override
    public String toString() {
        return "sono " + nome + ", " + ruolo + ". in " + gare + " partite ho fatto " + goal + " goal e " + assist + " assist.";
    }
}
