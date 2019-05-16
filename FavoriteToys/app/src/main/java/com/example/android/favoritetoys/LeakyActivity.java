package com.example.android.favoritetoys;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;


public class LeakyActivity extends AppCompatActivity  {



    // default onCreate given by Udacity tutorial
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_name);
    }// end protected void onCreate(Bundle savedInstanceState)






    /*
        Create an intent, get the contents of get_name.xml field and write them to DB.
        https://www.vogella.com/tutorials/AndroidIntent/article.html
     */
    protected void testLeakyIntent(){

        Intent i = new Intent(this, LeakyActivity.class);
        startActivity(i);

        Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vogella.com/"));
        startActivity(j);
    }// end protected void testLeakyIntent(this)




}// end public class LeakyActivity extends AppCompatActivity
