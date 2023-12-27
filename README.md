# Exercice 06 : Notes EMF
## Durée : 120'
## Objectifs visés :
Maîtriser les diagrammes de séquence et devenir familier des diagrammes de classes et avec la Javadoc.

## Travail à réaliser
Lisez avec attention le diagramme de classe ci-après ainsi que la Javadoc qui est fournie afin de créer et d’implémenter le projet Java « NotesEMF ».
Vous trouverez les détails d’implémentation du main() de l’application dans le diagramme de séquence.

## Résultat à obtenir
Si votre code est correctement implémenté selon les directives reçues, vous devriez obtenir le résultat suivant sur la console :
```
Maths => 5.25 (5.20, 5.40)
Maths => 5.25 (5.20, 5.40)
Physique => 5.0 (5.00, 4.90, 4.90)
Détails de la branche : Physique
Moyenne               : 4.93
Moyenne arrondie      : 5.00
Notes effectuées      : 
 - 22.10.2023 5.00
 - 14.12.2023 4.90
 - 07.01.2024 4.90
```

### Diagramme de classes

```mermaid
classDiagram

class NotesEMF {
    main(String[] args) void$
}

class Branche {
    -String nom
    -Note[] notes
    +Branche(String nom)
    +afficherDetails() void
    +ajouterNote(Note note) void
    +calculerMoyenneArrondie() double
    +calculerMoyenneDeLaBranche() double
    +getNom() String
    +getNotes() Notes[]
    +listeDesNotesDeLaBranche() String
    +toString() String
}

class Note {
    -String date
    -double note
    +Note(double note)
    +Note(String date, double note)
    +getDate() String
    +getNote() double
    +getNoteFormatee() String
    toString() String
}
Branche o--> "0..*" Note : -notes
```
### Structure des packages Java
Voici la structure des packages pour chaque classe du projet
```mermaid
classDiagram
namespace notesemf {
    class app
    class models
}
namespace app {
    class NotesEMF
}
namespace models {
    class Branche
    class Note 
}
```
### Diagramme de séquence
Voici le diagramme de séquence de la méthode de la méthode `main()` de la classe `NotesEMF` du package `app` :
```mermaid
sequenceDiagram
    participant main
    create participant branchePhysique
    main->>branchePhysique: new Branche("Physique")
    create participant brancheMath
    main->>brancheMath: new Branche("Math")
    create participant n1
    main->>n1: new Note("17.09.2023",5.2)
    main->>brancheMath: ajouteNote(n1)
    create participant n2
    main->>n2: new Note(5.4)
    main->>brancheMath: ajouteNote(n2)
    create participant n3
    main->>n3: new Note("22.10.2023",5.0)
    main->>branchePhysique: ajouteNote(n3)
    create participant n4
    main->>n4: new Note("14.12.2023",4.9)
    main->>branchePhysique: ajouteNote(n4)
    create participant n5
    main->>n5: new Note("07.01.2024",4.9)
    main->>branchePhysique: ajouteNote(n5)
    main->>System.out: println(brancheMath)
    System.out->>brancheMath: toString()
    main->>System.out: println(brancheMath.toString())
    main->>System.out: println(branchePhysique.toString())
    main->>branchePhysique: afficherDetails()
```
### Javadoc
Vous pouvez cliquer sur [ce lien pour obtenir la JavaDoc en HTML](javadoc/index.html) de l'application NotesEMF.
