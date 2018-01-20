package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;


//import com.udacity.gradle.builditbigger.backend.myApi.MyApi; //errors with this in editor for Android Studio 3.0; app will work though

/**
 * Created by annekenl1 on 1/16/18.
 *
 */

//public class JokesAsyncTask  extends AsyncTask<Pair<Context, String>, Void, String>
//public class JokesAsyncTask  extends AsyncTask<Context, Void, String>
public class JokesAsyncTask  extends AsyncTask<Void, Void, String>
{
    private static MyApi myApiService = null;
    private Context context;
    private final OnJokeReceived jokeListener;

    public interface OnJokeReceived
    {
        void onJokeReceived(String theJoke);
    }

    public JokesAsyncTask(OnJokeReceived jokeListener)
    {
        this.jokeListener = jokeListener;
    }

    @Override
    //protected String doInBackground(Pair<Context, String>... params)
    //protected String doInBackground(Context... params)
    protected String doInBackground(Void... params)
    {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)

                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")  //android emulator  //-works from emulator :)

                    //.setRootUrl("local_machine:8080/_ah/api/")  //working also needed to add appengine { httpAddress = "0.0.0.0" } in build.gradle & same network~
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

       /* context = params[0].first;
        String name = params[0].second;

        try {
            return myApiService.sayHi(name).execute().getData(); //"MyBean" object is returned & calls its getData() which returns a string "Hi, name"
        } catch (IOException e) {
            return e.getMessage();
        }*/

       //context = params[0];

       //random number - apiservice getjokes - toast string
        try {
            return myApiService.getJokesData().execute().getData(); //"MyBean" object is returned & calls its getData() which returns a string "Hi, name"
        } catch (IOException e) {
            Log.e("jokesasynctask",e.getMessage());
            return e.getMessage();
        }

    }

    @Override
    protected void onPostExecute(String result)
    {
       // Toast.makeText(context, result, Toast.LENGTH_LONG).show();

        jokeListener.onJokeReceived(result);
    }
}

