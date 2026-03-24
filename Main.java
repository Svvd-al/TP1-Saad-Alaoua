public class Main{
    public static void main(String[] args) {
        Salarie s1 = new Salarie("Ali", 3000);

        s1.afficher();

        s1.augmenter(500);

        System.out.println("Après augmentation :");
        s1.afficher();
    }
}