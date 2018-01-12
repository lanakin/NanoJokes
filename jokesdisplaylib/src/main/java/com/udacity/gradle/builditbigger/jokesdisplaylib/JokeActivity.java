package com.udacity.gradle.builditbigger.jokesdisplaylib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import java.util.ArrayList;

import edu.nku.annekenl.jokesdisplaylib.R;


public class JokeActivity extends AppCompatActivity {

    public static final String JOKES_SETUP_KEY = "jokesSetup";
    public static final String JOKES_PUNCHLINE_KEY = "jokesPunchline";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        ArrayList<String> jokesP1 = getIntent().getStringArrayListExtra(JOKES_SETUP_KEY);
        ArrayList<String> jokesP2  = getIntent().getStringArrayListExtra(JOKES_PUNCHLINE_KEY);

        //show a joke
        Toast setupToast = Toast.makeText(this, jokesP1.get(1), Toast.LENGTH_SHORT); //test with first joke
        setupToast.setGravity(Gravity.CENTER,0,0);
        setupToast.show(); //test

        Toast punchlineToast = Toast.makeText(this, jokesP2.get(1), Toast.LENGTH_SHORT);
        punchlineToast.setGravity(Gravity.CENTER,0,0);
        punchlineToast.show(); //test
    }
}
