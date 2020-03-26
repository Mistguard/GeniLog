package nc.univ;

import java.util.ArrayList;

public class Etat {

    protected ArrayList<Transition> transitions;

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public boolean traiterMot(String mot){
        int i=0;

        if(mot.length()==0){
            return false;
        }else{
            boolean reconnu = false;
            while(!reconnu && i<transitions.size()){
                if(transitions.get(i).getArrivee().traiterMot(mot.substring(1)) == true && transitions.get(i).getSymbole() == mot.charAt(0)){
                    reconnu = true;
                }
                i++;
            }
            return reconnu;
        }
    }

    public Etat(){
        this.transitions = new ArrayList<Transition>();
    }

}
