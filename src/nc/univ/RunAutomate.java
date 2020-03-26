package nc.univ;

public class RunAutomate {
    public static void main(String[] args){
        Etat etat1 = new Etat();
        Etat etat2 = new Etat();
        Etat etat3 = new Etat();
        Etat etat4 = new Etat();

        Automate auto = new Automate(etat1);

        auto.creerTransition(etat1, etat2, 'a');
        auto.creerTransition(etat2, etat2, 'a');
        auto.creerTransition(etat2, etat3, 'b');
        auto.creerTransition(etat3, etat3, 'b');
        auto.creerTransition(etat3, etat4, 'b');

        boolean reconnu = false;
        reconnu = auto.analyseMot("abb");
        if(reconnu){
            System.out.println("Le mot abb : reconnu par l'automate");
        }else {
            System.out.println("Le mot abb: NON reconnu !");
        }

        reconnu = false;
        reconnu = auto.analyseMot("aaabbbbb");
        if(reconnu){
            System.out.println("Le mot aaabbbbb : reconnu par l'automate");
        }else {
            System.out.println("Le mot aaabbbbb: NON reconnu !");
        }

        reconnu = false;
        reconnu = auto.analyseMot("abab");
        if(reconnu){
            System.out.println("Le mot abab : reconnu par l'automate");
        }else {
            System.out.println("Le mot abab: NON reconnu !");
        }

    }
}
