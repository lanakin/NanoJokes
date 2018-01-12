package com.udacity.gradle.builditbigger.jokeslib;

import java.util.ArrayList;

public class JokeTeller
{
    ArrayList<String> jokesSetup = new ArrayList<>();
    ArrayList<String> jokesPunchline = new ArrayList<>();

    public JokeTeller()
    {
        //create jokes
        jokesSetup.add("Why did the coffee file a police report?");
        jokesPunchline.add("Because it was mugged.");

        jokesSetup.add("A prisoner was told he'll be executed.");
        jokesPunchline.add("Needless to say, he was shocked.");

        jokesSetup.add("What happened when the semicolon broke grammar laws?");
        jokesPunchline.add("It was given two consecutive sentences.");

        jokesSetup.add("The past, the present, and the future walk into a bar…");
        jokesPunchline.add("It was tense.");

        jokesSetup.add("6:30 is the best time on a clock…");
        jokesPunchline.add("hands down.");
    }

    public String getJokeSetup(int id) { return jokesSetup.get(id); }

    public String getJokePunchline(int id) { return jokesPunchline.get(id); }

    public ArrayList<String> getJokesSetup() { return jokesSetup; }

    public ArrayList<String> getJokesPunchline() { return jokesPunchline; }
}
