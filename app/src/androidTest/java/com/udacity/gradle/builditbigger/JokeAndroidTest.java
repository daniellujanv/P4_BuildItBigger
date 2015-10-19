package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import dlv.and.udacity.Joke;

/**
 * Created by daniellujanvillarreal on 10/16/15.
 */
public class JokeAndroidTest extends AndroidTestCase {

    public void testJoke(){
        assertNotNull(new Joke().getJoke());
    }
}
