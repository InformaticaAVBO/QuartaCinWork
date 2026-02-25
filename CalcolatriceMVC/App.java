import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// --- 1. IL MODELLO (MODEL) ---
// Gestisce i dati e la logica (il calcolo)
class CalcolatriceModel {
    private int risultato;

    public void sommaNumeri(int numero1, int numero2) {
        this.risultato = numero1 + numero2;
    }

    public int getRisultato() {
        return risultato;
    }
}

// --- 2. LA VISTA (VIEW) ---
// Gestisce l'interfaccia grafica. Non contiene logica di calcolo.
class CalcolatriceView extends JFrame {
    private JTextField primoNumero = new JTextField(10);
    private JLabel labelPiu = new JLabel("+");
    private JTextField secondoNumero = new JTextField(10);
    private JButton bottoneCalcola = new JButton("Calcola");
    private JTextField soluzione = new JTextField(10);

    public CalcolatriceView() {
        // Setup del pannello e dei componenti
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 100);
        this.setTitle("Calcolatrice MVC");

        calcPanel.add(primoNumero);
        calcPanel.add(labelPiu);
        calcPanel.add(secondoNumero);
        calcPanel.add(bottoneCalcola);
        calcPanel.add(soluzione);

        this.add(calcPanel);
    }

    // Metodi per permettere al Controller di accedere ai dati della View
    public int getPrimoNumero() {
        return Integer.parseInt(primoNumero.getText());
    }

    public int getSecondoNumero() {
        return Integer.parseInt(secondoNumero.getText());
    }

    public void setSoluzione(int soluzione) {
        this.soluzione.setText(Integer.toString(soluzione));
    }

    // Metodo per collegare il listener al bottone (il Controller lo userà)
    public void addCalcolaListener(ActionListener listenForCalcButton) {
        bottoneCalcola.addActionListener(listenForCalcButton);
    }

    // Metodo per mostrare messaggi di errore
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}

// --- 3. IL CONTROLLER ---
// Coordina le interazioni tra View e Model
class CalcolatriceController {
    private CalcolatriceView theView;
    private CalcolatriceModel theModel;

    public CalcolatriceController(CalcolatriceView theView, CalcolatriceModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Diciamo alla View che quando viene premuto il bottone, 
        // deve eseguire il codice definito qui sotto (nel Listener)
        this.theView.addCalcolaListener(new CalcolaListener());
    }

    // Classe interna per gestire l'evento del click
    class CalcolaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numero1, numero2 = 0;

            try {
                // 1. Prende i dati dalla View
                numero1 = theView.getPrimoNumero();
                numero2 = theView.getSecondoNumero();

                // 2. Chiede al Model di fare il calcolo
                theModel.sommaNumeri(numero1, numero2);

                // 3. Prende il risultato dal Model e aggiorna la View
                theView.setSoluzione(theModel.getRisultato());

            } catch (NumberFormatException ex) {
                // Gestisce il caso in cui l'utente non inserisca numeri
                theView.displayErrorMessage("Per favore, inserisci due numeri interi validi.");
            }
        }
    }
}

// --- CLASSE PRINCIPALE (MAIN) ---
public class App {
    public static void main(String[] args) {
        // Istanziamo la View
        CalcolatriceView theView = new CalcolatriceView();
        
        // Istanziamo il Model
        CalcolatriceModel theModel = new CalcolatriceModel();
        
        // Istanziamo il Controller collegando i due precedenti
        @SuppressWarnings("unused")
        CalcolatriceController theController = new CalcolatriceController(theView, theModel);

        // Rendiamo visibile la View
        theView.setVisible(true);
    }
}
