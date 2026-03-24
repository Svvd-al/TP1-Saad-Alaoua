class Salarie {
    String nom;
    double salaire;

    public Salarie(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Salaire : " + salaire);
    }

    public void augmenter(double montant) {
        salaire += montant;
    }
}