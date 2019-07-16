package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button button_user_profile;

    public void init() {
        button_user_profile = (Button)findViewById(R.id.button_user_profile);

        button_user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent show = new Intent(MainActivity.this, User_profile.class);

                startActivity(show);
            }
        });

    }


    public Button button_alc;

    public void display() {
        button_alc = (Button)findViewById(R.id.button_alc);

        button_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent take = new Intent(MainActivity.this, Alc_page.class);

                startActivity(take);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        display();


    }

}
