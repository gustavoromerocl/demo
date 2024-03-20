package com.example.demo;

public class Movie {
  private int id;
  private String title;
  private String year;
  private String director;
  private String gender;
  private String synopsis;


  public Movie(int id, String title, String year, String director, String gender, String synopsis) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.director = director;
    this.gender = gender;
    this.synopsis = synopsis;
  }

  //Getters & Setters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return this.title;
  }

  public String getYear() {
    return this.year;
  }

  public String getDirector() {
    return this.director;
  }

  public String getGender() {
    return this.gender;
  }

  public String getSynopsis() {
    return this.synopsis;
  }
}
