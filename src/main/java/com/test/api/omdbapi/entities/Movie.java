package com.test.api.omdbapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie extends MainContent {

    private String dvd;
    private String boxOffice;
    private String production;
    private String website;

    public Movie(
            @JsonProperty("Title")
            String title,
            @JsonProperty("Year")
            String year,
            @JsonProperty("Rated")
            String rated,
            @JsonProperty("Released")
            String released,
            @JsonProperty("Runtime")
            String runtime,
            @JsonProperty("Genre")
            String genre,
            @JsonProperty("Director")
            String director,
            @JsonProperty("Writer")
            String writer,
            @JsonProperty("Actors")
            String actors,
            @JsonProperty("Plot")
            String plot,
            @JsonProperty("Language")
            String language,
            @JsonProperty("Country")
            String country,
            @JsonProperty("Awards")
            String awards,
            @JsonProperty("Poster")
            String poster,
            @JsonProperty("Ratings")
            Rating[] ratings,
            @JsonProperty("Metascore")
            String metascore,
            @JsonProperty("imdbRating")
            String imdbRating,
            @JsonProperty("imdbVotes")
            String imdbVotes,
            @JsonProperty("imdbID")
            String imdbID,
            @JsonProperty("Type")
            String type,
            @JsonProperty("Response")
            String response,
            @JsonProperty("DVD")
            String dvd,
            @JsonProperty("BoxOffice")
            String boxOffice,
            @JsonProperty("Production")
            String production,
            @JsonProperty("Website")
            String website
    ) {
        super(
                title,
                year,
                rated,
                released,
                runtime,
                genre,
                director,
                writer,
                actors,
                plot,
                language,
                country,
                awards,
                poster,
                ratings,
                metascore,
                imdbRating,
                imdbVotes,
                imdbID,
                type,
                response
        );
        this.dvd = dvd;
        this.boxOffice = boxOffice;
        this.production = production;
        this.website = website;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
