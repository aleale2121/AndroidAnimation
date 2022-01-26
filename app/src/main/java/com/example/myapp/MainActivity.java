package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView bart=findViewById(R.id.bart);
        ImageView homer=findViewById(R.id.homer);
        bart.animate().
                translationXBy(1000f).
                translationYBy(1000f).
                rotation(3600f).
                setDuration(2000);

       homer.animate().alpha(0f).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart=findViewById(R.id.bart);
        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

    }
}