package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.udacity.gradle.builditbigger.jokesdisplaylib.JokeActivity;


public class MainActivity2 extends AppCompatActivity implements JokesAsyncTask.OnJokeReceived
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        //Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();  //setup

        //using java library
        /*Toast jokeP1 = Toast.makeText(this, jokester.getJokeSetup(1), Toast.LENGTH_SHORT); //test with first joke
        jokeP1.setGravity(Gravity.CENTER,0,0);
        jokeP1.show(); //test

        Toast jokeP2 = Toast.makeText(this, jokester.getJokePunchline(1), Toast.LENGTH_SHORT);
        jokeP2.setGravity(Gravity.CENTER,0,0);
        jokeP2.show(); //test*/

        //using android library
       /* JokeTeller jokester = new JokeTeller();

        Intent intent = new Intent(this, JokeActivity.class);
        intent.putStringArrayListExtra(JokeActivity.JOKES_SETUP_KEY, jokester.getJokesSetup());
        intent.putStringArrayListExtra(JokeActivity.JOKES_PUNCHLINE_KEY, jokester.getJokesPunchline());

        startActivity(intent);*/

       //new JokesAsyncTask().execute(new Pair<Context, String>(this, "Manfred")); //test GCE
        //new JokesAsyncTask(this).execute(this);
        new JokesAsyncTask(this).execute();

    }

    public void onJokeReceived(String theJoke)
    {
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_TO_SHOW_KEY,theJoke);

        startActivity(intent);
    }


}
