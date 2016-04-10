package com.com220.sli.simonsays;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button play, score, aboutUs;

        play = (Button)findViewById(R.id.MainActivity);
        score = (Button)findViewById(R.id.ScorePage);
        aboutUs = (Button)findViewById(R.id.AboutPage);

        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent playPage = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(playPage);
            }
        });
        score.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent scorePage = new Intent(getApplicationContext(), ScorePage.class);
                startActivity(scorePage);
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent aboutPage = new Intent(getApplicationContext(), AboutPage.class);
                startActivity(aboutPage);
            }
        });
    }
}
