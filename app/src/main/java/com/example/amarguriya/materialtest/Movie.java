package com.example.amarguriya.materialtest;

/**
 * Created by AmaRguRiyA on 17-11-2016.
 */

public class Movie {

    private String title,gen,year;

    public Movie(){}
    public Movie(String title, String gen, String year)
    {
        this.title=title;
        this.gen=gen;
        this.year=year;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



}
