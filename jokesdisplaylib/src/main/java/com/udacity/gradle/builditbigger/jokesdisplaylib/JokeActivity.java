package com.udacity.gradle.builditbigger.jokesdisplaylib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import edu.nku.annekenl.jokesdisplaylib.R;


public class JokeActivity extends AppCompatActivity {

    //public static final String JOKES_SETUP_KEY = "jokesSetup";
    //public static final String JOKES_PUNCHLINE_KEY = "jokesPunchline";

    public static final String JOKE_TO_SHOW_KEY = "jokeKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        //ArrayList<String> jokesP1 = getIntent().getStringArrayListExtra(JOKES_SETUP_KEY);
        //ArrayList<String> jokesP2  = getIntent().getStringArrayListExtra(JOKES_PUNCHLINE_KEY);

        //show a joke
       /* Toast setupToast = Toast.makeText(this, jokesP1.get(1), Toast.LENGTH_SHORT); //test
        setupToast.setGravity(Gravity.CENTER,0,0);
        setupToast.show();

        Toast punchlineToast = Toast.makeText(this, jokesP2.get(1), Toast.LENGTH_SHORT);
        punchlineToast.setGravity(Gravity.CENTER,0,0);
        punchlineToast.show();

        /*Toast setupToast = Toast.makeText(this, getIntent().getStringExtra(JOKE_TO_SHOW_KEY), Toast.LENGTH_SHORT); //single string
        setupToast.setGravity(Gravity.CENTER,0,0);
        setupToast.show();  */

        ((TextView) findViewById(R.id.joketextView)).setText(getIntent().getStringExtra(JOKE_TO_SHOW_KEY));
    }
}
