public class Enseignant extends Personne{


private String grade;
    public static int nbEns;

        public Enseignant(){
        nbEns++;
        id=nbEns;
    }
        public Enseignant(String Prenom,String Nom,String grade){
        super( Nom, Prenom) ;
        nbEns++;
        id=nbEns;
        this.grade=grade;

    }

        public String getGrade(){
    
        return grade;
    }
    
    public void setGrade(String grade){
        
        this.grade=grade;
    }
    Override
    public String affiche(){
    return super.affiche() +"Grade: "+grade;
    }
}






