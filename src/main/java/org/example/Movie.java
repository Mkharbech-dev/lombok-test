package org.example;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;

/*
// Générer un getter et un setter
@Getter @Setter
// Générer un constructeur sans arguments
@NoArgsConstructor
// Générer un constructeur avec tous les arguments
@AllArgsConstructor
//Génerer la méthode tiString sans l'attribut "minutes".
@ToString(exclude = "minutes")
//Génerer la méthode Equals() et HashCode().
@EqualsAndHashCode(exclude = "minutes")
*/
// Annotation qui remplace toutes les précedentes.
@Data
public class Movie {
    private Long id;
    private String title;
    private String description;
    private int rating;
    private URL officialSite;
    private String country;
    private String language;
    // ajouter une annotaion pour le niveau d'acces à l'attribut
    @Getter(AccessLevel.PRIVATE)
    private final int minutes = 120;




}
