package nc.univ;

public class Transition {
    private char symbole;

    private Etat arrivee;

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }

    public Etat getArrivee() {
        return arrivee;
    }

    public void setArrivee(Etat arrivee) {
        this.arrivee = arrivee;
    }

    public Transition(char symbole, Etat arrivee) {
        this.symbole = symbole;
        this.arrivee = arrivee;
    }
}
