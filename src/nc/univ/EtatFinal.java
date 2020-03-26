package nc.univ;

public class EtatFinal extends Etat {

    public boolean traiterMot(String mot){
        int i=0;

        if(mot.length()<=0){
            return true;
        }else{
            boolean reconnu = false;
            while(!reconnu && i<mot.length()){
                if(transitions.get(i).getArrivee().traiterMot(mot.substring(1)) == true){
                    reconnu = true;
                }
                i++;
            }
            return transitions.get(i-1).getArrivee().traiterMot(mot.substring(1));
        }
    }

}
