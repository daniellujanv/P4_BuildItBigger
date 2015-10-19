package com.udacity.gradle.builditbigger.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Spinner;

import dlv.and.udacity.Joke;
import dlv.and.udacity.jokelibrary.JokeActivity;

/**
 * Created by daniellujanvillarreal on 10/16/15.
 */
public class JokeTask extends AsyncTask<Void, Void, String> {

    private Context mContext;
    private ProgressBar mSpinner;

    public JokeTask(Context context, ProgressBar spinner){
        mContext = context;
        mSpinner = spinner;
    }

    @Override
    protected void onProgressUpdate(Void... nothing){

        Log.i("Task", "Showing spinner progress bar");
        mSpinner.setVisibility(View.VISIBLE);
    }

    @Override
    protected String doInBackground(Void... params) {
        publishProgress(null);
        return new Joke().getJoke();
    }

    @Override
    protected void onPostExecute(String result){
        Intent intent = new Intent(mContext, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_INDEX, result);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
        mSpinner.setVisibility(View.INVISIBLE);
    }
}
