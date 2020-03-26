package nc.univ;

public class EtatFinal extends Etat {

    public boolean traiterMot(String mot){
        int i=0;

        if(mot.length()==0){
            return true;
        }else{
            boolean reconnu = false;
            while(!reconnu && i < transitions.size()){
                if(transitions.get(i).getArrivee().traiterMot(mot.substring(1)) == true && transitions.get(i).getSymbole() == mot.charAt(0)){
                    reconnu = true;
                }
                i++;
            }
            return reconnu;
        }
    }

}
