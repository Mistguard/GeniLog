package nc.univ;

import java.util.ArrayList;

public class Etat {

    private ArrayList<Transition> transitions;

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public boolean traiterMot(String mot){

        boolean find = false;
        int i;
        for (i = 0; i<transitions.size(); i++) {
            if(transitions.get(i).getSymbole()==mot.charAt(0)){
                find = true;
                break;
            }
        }

        if(find){
            return transitions.get(i).getArrivee().traiterMot(mot);
        }else{
            return false;
        }
    }

    public Etat(){
        this.transitions = new ArrayList<Transition>();
    }

}
