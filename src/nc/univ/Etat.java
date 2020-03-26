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

        if(mot.length()<=0){
            return false;
        }else{
            boolean reconnu = false;
            while(!reconnu && i<mot.length()-1){
                if(transitions.get(i).getArrivee().traiterMot(mot.substring(1)) == true){
                    reconnu = true;
                }
                i++;
            }
            return transitions.get(i).getArrivee().traiterMot(mot.substring(1));
        }
    }

    public Etat(){
        this.transitions = new ArrayList<Transition>();
    }

}
