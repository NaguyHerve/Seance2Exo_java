public class Etudiant extends Personne{

    private String encadreur;
        public static int etudiant;
            public Etudiant(String Prenom,String Nom,String encadreur){
                 super( Nom, Prenom) ;
    etudiant++;
    id=etudiant;

    this.encadreur=encadreur;

 }
                    public Etudiant(){
    etudiant++;
    id=etudiant;
}

                        public String getEncadreur(){

    return encadreur;
}


@Override
                            public String affiche(){
    return super.affiche() +"Encadreur: "+encadreur;
}

}

