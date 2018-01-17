package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    //setup
    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    //jokes modification
   /* private ArrayList<String> jokesSetupData;
    private ArrayList<String> jokesPunchlineData;

    public ArrayList<String> getJokesSetupData() { return jokesSetupData; }

    public void setJokesSetupData(ArrayList<String> jokesSetupData) {
        this.jokesSetupData = jokesSetupData;
    }

    public ArrayList<String> getJokesPunchlineData() {
        return jokesPunchlineData;
    }

    public void setJokesPunchlineData(ArrayList<String> jokesPunchlineData) {
        this.jokesPunchlineData = jokesPunchlineData;
    }*/
}