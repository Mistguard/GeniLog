package nc.univ;

import java.util.ArrayList;

public class Automate {
    private Etat etatDepart;

    public Transition creerTransition(Etat depart, Etat arrivee, char s){
        Transition t = new Transition(s, arrivee);
        depart.getTransitions().add(t);
        return t;
    }

    public boolean analyseMot(String mot){

        return etatDepart.traiterMot(mot);
    }

    public Automate() {
        this.etatDepart = new Etat();
    }

}
