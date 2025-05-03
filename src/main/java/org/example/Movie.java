package org.example;

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

public class Movie {
    private Long id;
    private String title;
    private String description;
    private int rating;
    private URL officialSite;
    private String country;
    private String language;
    // ajouter une annotaion pour le niveau d'acces à l'attribut
    // @Getter(AccessLevel.PRIVATE)
    //private final int minutes = 120;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public URL getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
