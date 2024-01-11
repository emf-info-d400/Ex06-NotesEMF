package notesemf.models;

/**
 * Application "Note".
 *
 * Classe qui représente une note réalisée à une certaine date.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 0.1
 */
public class Note {

    /**
     * L'attribut date de la note.
     */
    // VOTRE CODE ICI...

    /**
     * L'attribut valeur de la note.
     */
    // VOTRE CODE ICI...

    /**
     * Constructeur de la classe Note.
     *
     * @param date la date à laquelle la note a été reçue
     * @param note la valeur de la note
     */
    public Note(String date, double note) {
        // VOTRE CODE ICI...
    }

    /**
     * Constructeur de la classe Note. Cette version ne reçoit que la note et pas la
     * date à laquelle la note a été
     * reçue. On part dès lors du principe que cette note vient d'être reçue et donc
     * on prend la date actuelle au format
     * "JJ.MM.AAAA" comme date pour cette note.
     *
     * @param note la valeur de la note
     */
    public Note(double note) {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de la date de la note.
     *
     * @return la date à laquelle la note a été reçue
     */
    public String getDate() {
        // VOTRE CODE ICI...
    }

    /**
     * Getter de la valeur de la note.
     *
     * @return la valeur de la note
     */
    public double getNote() {
        // VOTRE CODE ICI...
    }

    /**
     * Retourne une chaîne de caractères contenant la valeur de la note formatée
     * avec deux chiffres après la virgule.
     *
     * @return une chaîne de caractères contenant la valeur de la note formatée
     *         comme précité.
     */
    public String getNoteFormatee() {
        // VOTRE CODE ICI...
    }

    /**
     * Retourne une représentation complète de la note sous forme de chaîne de
     * caractères.
     * 
     * @return chaîne de caractères contenant la date suivie par un espace et par la
     *         note formatée avec deux chiffres après la virgule
     */
    @Override
    public String toString() {
        // VOTRE CODE ICI...
    }

}
