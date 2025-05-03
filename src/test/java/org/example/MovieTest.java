package org.example;

import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private Movie movie;
    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("Harry Potter");
        movie.setDescription("The Harry Potter");
        movie.setCountry("United States");
        movie.setLanguage("English");
        movie.setRating(8);
        movie.setOfficialSite(new URL("https://www.moviesofamerica.com"));
        movie.setId(1L);
    }
    @org.junit.jupiter.api.Test
    void getId() {
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
    }

    @org.junit.jupiter.api.Test
    void setId() {
        assertNotNull(movie);
        movie.setId(2L);
        assertEquals(2L, movie.getId());
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        assertNotNull(movie);
        assertEquals("Harry Potter", movie.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        assertNotNull(movie);
        movie.setTitle("Harry Potter2");
        assertEquals("Harry Potter2", movie.getTitle());
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        assertNotNull(movie);
        assertEquals("The Harry Potter", movie.getDescription());
    }

    @org.junit.jupiter.api.Test
    void setDescription() {
        assertNotNull(movie);
        movie.setDescription("The Harry Potter2");
        assertEquals("The Harry Potter2", movie.getDescription());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertNotNull(movie);
        assertEquals("United States", movie.getCountry());
    }

    @org.junit.jupiter.api.Test
    void setCountry() {
        assertNotNull(movie);
        movie.setCountry("France");
        assertEquals("France", movie.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getRating() {
        assertNotNull(movie);
        assertEquals(8, movie.getRating());
    }

    @org.junit.jupiter.api.Test
    void setRating() {
        assertNotNull(movie);
        movie.setRating(10);
        assertEquals(10, movie.getRating());
    }

    @org.junit.jupiter.api.Test
    void getOfficialSite() {
        assertNotNull(movie);
        assertEquals("https://www.moviesofamerica.com", movie.getOfficialSite().toString());
    }

    @org.junit.jupiter.api.Test
    void setOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        movie.setOfficialSite(new URL("https://www.moviesofamerica.fr"));
        assertEquals("https://www.moviesofamerica.fr", movie.getOfficialSite().toString());
    }

    @org.junit.jupiter.api.Test
    void getLanguage() {
        assertNotNull(movie);
        assertEquals("English", movie.getLanguage());
    }

    @org.junit.jupiter.api.Test
    void setLanguage() {
        assertNotNull(movie);
        movie.setLanguage("french");
        assertEquals("french", movie.getLanguage());
    }
}