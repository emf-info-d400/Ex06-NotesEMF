package notesemf.models;

/**
 * Application "Branche".
 *
 * Classe qui représente une branche "Scola".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 0.1
 */
public class Branche {

    /**
     * Les notes de cette branche.
     */
    // VOTRE CODE ICI...

    /**
     * Le nom de cette branche.
     */
    // VOTRE CODE ICI...

    /**
     * Constructeur de la classe Branche. Vu qu'il n'y a pas encore de notes dans
     * cette branche, une liste de notes de
     * taille nulle est créée.
     *
     * @param nom le nom de la branche
     */
    public Branche(String nom) {
        // VOTRE CODE ICI...
    }

    /**
     * Ajoute une nouvelle note dans la liste des notes de cette branche. Vu qu'un
     * tableau ne peut plus grossir après
     * avoir été créé, une nouvelle liste de notes de taille suffisante est d'abord
     * créée, puis les notes actuelles y
     * sont copiées avant d'y mettre la nouvelle note et, pour terminer, cette
     * nouvelle liste de notes deviendra LA
     * liste des notes de cette branche.
     *
     * @param note la note à ajouter
     */
    public void ajouterNote(Note note) {
        // VOTRE CODE ICI...
    }

    /**
     * Calcule la note de cette branche, c'est-à-dire la moyenne des notes obtenues.
     *
     * @return la note de la branche s'il y en a, 0 s'il n'y en a pas
     */
    public double calculerMoyenneDeLaBranche() {
        // VOTRE CODE ICI...
    }

    /**
     * Calcule la note de cette branche arrondie au 0.25. Pour faire cela on
     * commence par calculer la moyenne de cette
     * branche, ensuite on la multiplie par 4, on l'arrondit à l'aide de
     * Math.round(), on la transforme ensuite en un
     * nombre réel que pour terminer on divise par 4.
     *
     * @return la note de la branche arrondie au 0.25 à l'aide de la méthode décrite
     */
    public double calculerMoyenneArrondie() {
        // VOTRE CODE ICI...
    }

    /**
     * Produit une chaîne de caractères contenant toutes les informations de cette
     * branche. La chaîne commence par le
     * nom de la branche, suivie par " =&gt; ", suivie par la moyenne de cette
     * branche arrondie à 0.25, suivie par " (",
     * suivie par la liste de toutes les notes réalisées séparées par des virgule
     * espace, suivie par ")". Pour la
     * moyenne de la branche arrondie à 0.25 et pour la liste des notes, on appelle
     * simplement nos méthodes
     * calculerMoyenneArrondie() et listeDesNotesDeLaBranche() qui font justement
     * cela.<br>
     * Voici un exemple :<br>
     * 
     * <pre>
     * Physique =&gt; 5.0 (5.00, 4.90, 4.90)
     * </pre>
     * 
     * <br>
     *
     * @return une chaîne de caractères avec les informations précitées
     */
    @Override
    public String toString() {
        // VOTRE CODE ICI...
    }

    /**
     * Produit une chaîne de caractères contenant toutes les notes séparées par une
     * virgule espace.
     *
     * @return une chaîne de caractères contenant toutes les notes réalisées,
     *         formatées comme précité
     */
    public String listeDesNotesDeLaBranche() {
        // VOTRE CODE ICI...
    }

    /**
     * Affiche le détail de cette branche sur la console. Le détail est affiché dans
     * le format suivant (exemple) :<br>
     * 
     * <pre>
     * Détails de la branche : Physique
     * Moyenne               : 4.93
     * Moyenne arrondie      : 5.00
     * Notes effectuées      :
     * - 22.11.2015 5.00
     * - 14.12.2015 4.90
     * - 07.01.2016 4.90
     * </pre>
     * 
     * <br>
     * Attention : tant la moyenne que la moyenne arrondie sont affichées à deux
     * chiffres après la virgule (avec rajout
     * de zéros au besoin).
     */
    public void afficherDetails() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter des notes de cette branche.
     *
     * @return les notes de cette branche
     */
    public Note[] getNotes() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter du nom de cette branche.
     *
     * @return le nom de cette branche
     */
    public String getNom() {
        // VOTRE CODE ICI...
    }
}
